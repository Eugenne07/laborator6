//1. Creati o clasa Animal cu metodele eat() si sound().
//        Creati 3 subclase: Lion, Tiger, Panther.
//        Suprascrieti metoda eat() in fiecare subclasa care
//        sa descrie ce mananca fiecare animal. Suprascrieti
//        metoda sound() care sa descrie sunetul fiecarui animal.
//        In clasa Main creati o instanta din fiecare subclasa si apelati metodele.
package ex1;
public class Animal{
    public void eat(){};
    public void sound(){};

    public static class Lion extends Animal{
        @Override
        public void eat() {
            System.out.println("Nom Nom");
        }
        @Override
        public void sound() {
            System.out.println("Meow");
        }
    }
    public static class Tiger extends Animal{
        @Override
        public void eat() {
            System.out.println("Nyom Nyom");
        }
        @Override
        public void sound() {
            System.out.println("Mrrr");
        }
    }
    public static class Panther extends Animal{
        @Override
        public void eat() {
            System.out.println("Noooom Nooom");
        }
        @Override
        public void sound() {
            System.out.println("Grrrr");
        }
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Panther panther = new Panther();
        tiger.eat();
        tiger.sound();
        lion.eat();
        lion.sound();
        panther.eat();
        panther.sound();
        Animal animal = new Animal();
    }
}