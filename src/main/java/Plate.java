public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }
    public void desreaseFood (int appetite) {
        //this.food -= appetite;
         if (itsOkforFood(appetite)) {
             System.out.println("Еды в тарелке не хватает");
         }
         else {
             food = food - appetite;
         }
    }
    public boolean itsOkforFood (int appetite) {
        return appetite < food;
    }
    public void increaseFood (int countOfFood)
    {
        food += countOfFood;
    }
}

