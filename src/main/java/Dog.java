public class Dog extends Animal {
    Dog (String name, int runDist, int swimDist) {
        super(name, runDist, swimDist);
    }
    void run () {
        if (runDist >= 500) {
            System.out.println(name + " " + "не может пробежать более 500 метров");
        }
        else {
            System.out.println(name + " " + "пробежал" + " " + runDist + " " + " " + "метров");
        }
    }
    void swim () {
        if (swimDist >= 10) {
            System.out.println(name + " " + "не может проплыть более 10 метров");
        }
        else {
            System.out.println(name + " " + "проплыл" + " " + swimDist + " " + " " + "метров");
        }
    }
}
