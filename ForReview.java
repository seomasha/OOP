package OOP;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage{}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RequiresPermission{
    String value();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission{
    String value();
}

@UserPermission(value = "User")
class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@UserPermission(value = "Admin")
class Admin{
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MessagingSystem <T extends Admin>{ // ovdje se desi error kada dodam & User
    private T guy;

    public MessagingSystem(T guy) {
        this.guy = guy;
    }

    public T getGuy() {
        return guy;
    }

    public void setGuy(T guy) {
        this.guy = guy;
    }

    @CanSendMessage
    @RequiresPermission(value = "Admin")
    public void sendMessage(String msg) {
        try{
            Method m = this.getClass().getMethod("sendMessage", String.class);

            if(guy.getClass().getAnnotation(UserPermission.class).value().equals(m.getAnnotation(RequiresPermission.class).value())) {
                System.out.println(this.guy.getName() + ": " + msg);
            }
            else{
                System.out.println("You are not permitted.");
            }
        }
        catch(NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Admin user = new Admin("Fikret");

        MessagingSystem<Admin> userMessagingSystem = new MessagingSystem<>(user);

        userMessagingSystem.sendMessage("Sead");
    }
}