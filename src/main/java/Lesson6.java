public class Lesson6 {
    public static void main (String[] args) {
        Cat cat = new Cat ( "Мурзик", 150, 10);
        Dog dog = new Dog ("Бродяга", 300, 10);
        cat.run();
        cat.swim();
        dog.run();
        dog.swim();
    }
}