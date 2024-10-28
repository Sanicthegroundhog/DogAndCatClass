public class Main {
    public static void main(String[] args) {
        Dog robert = new Dog("Robert", "Yorkie", 12);
        Dog snoopy = new Dog("Snoopy", "Beagle", 14);

        robert.displayAnimalInfo();
        snoopy.displayAnimalInfo();

        Cat orange = new Cat("Orange", "Orange", 6);
        Cat shadow = new Cat("Shadow", "Black", 4);

        orange.displayAnimalInfo();
        shadow.displayAnimalInfo();
    }
}
