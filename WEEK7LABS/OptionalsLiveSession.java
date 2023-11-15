package OOP.WEEK7LABS;

import java.util.Optional;

class OptionalsLiveSession {

    public static void main(String[] args) {
        Optional<Donkey> mojeMagare = getDonkey();

        if(mojeMagare.isPresent()) {
            System.out.println(mojeMagare.get().name()); //extracted from optional
        }
        else{
            System.out.println("nema magareta zvanog Fikret Zajmović");
        }

        Donkey donkey = getDonkey().orElse(new Donkey("Novo magare zvano Zajim Fikretovic"));
        System.out.println(donkey);

        Donkey donkey1 = getDonkey().orElseThrow(ClassCastException::new);
        System.out.println(donkey1);
    }
    private static Optional<Donkey> getDonkey() {
        return Optional.ofNullable(null);
    }
}

record Donkey(String name) {

}
