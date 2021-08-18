public class Cat extends Animal{
    Cat (String name, int runDist, int swimDist) {
        super(name, runDist, swimDist);
    }
    void run () {
        if (runDist >= 200) {
            System.out.println(name + " " + "не может пробежать более 200 метров");
        }
    else {
                System.out.println(name + " " + "пробежал" + " " + runDist + " " + " " + "метров");
            }
        }
    void swim ()
        {
            System.out.println(name + " " + "это кот, а коты плавать не умеют");
        }
    }
