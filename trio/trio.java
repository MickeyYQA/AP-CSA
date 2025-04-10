public class Trio extends MenuItem{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    private String name;

    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        super(sandwich, salad, drink);
    }

    @Override
    String getName(){
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }
}