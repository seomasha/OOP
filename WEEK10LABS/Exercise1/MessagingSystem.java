package OOP.WEEK10LABS.Exercise1;

import java.lang.reflect.Method;

class MessagingSystem {

    private User user;

    public MessagingSystem(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @CanSendMessage
    @RequiresPermission(value = "Admin")
    public void sendMessage(String message) {
        try {
            Method sendMessageMethod = this.getClass().getMethod("sendMessage", String.class);

            if (sendMessageMethod.isAnnotationPresent(RequiresPermission.class)) {
                RequiresPermission annotation = sendMessageMethod.getAnnotation(RequiresPermission.class);
                if (user.getPermission().equals(annotation.value())) {
                    System.out.println(this.user.getName() + " sent a message: " + message);
                } else {
                    System.out.println("You are not permitted.");
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User adminUser = new User("Admin", "Admin");
        User regularUser = new User("Regular", "Regular");

        MessagingSystem admin = new MessagingSystem(adminUser);
        MessagingSystem user = new MessagingSystem(regularUser);

        admin.sendMessage("Message");
        user.sendMessage("Porukica");
    }
}

class User {
    private String name;
    private String permission;

    public User(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
