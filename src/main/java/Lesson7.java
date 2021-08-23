public class Lesson7 {
    public static void main (String[] args) {
        Cat [] cats = {
                new Cat ("Коша", 11),
                new Cat ("Кокоша", 13),
                new Cat("Кокош", 21)
        };

        Plate plate = new Plate ( 35);
        for (Cat cat : cats)
        {
            cat.eat (plate);
        }
        plate.increaseFood(100);
        for (Cat cat : cats)
        {
            cat.eat (plate);
        }
    }
}
