public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void eat(Plate plate) {
       if (plate.itsOkforFood(appetite) && !fullness)
       {
           System.out.println(name + " " + "кушает");
           plate.desreaseFood(appetite);
           fullness = true;
       }
       else if (!plate.itsOkforFood(appetite))
       {
           System.out.println(name + " " + "не смог поесть, еды в тарелке очень мало");
       }
       else if (fullness)
       {
           System.out.println(name + " "+  "уже сыт");
       }
    }
}
