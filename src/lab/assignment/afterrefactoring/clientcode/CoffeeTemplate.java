package lab.assignment.afterrefactoring.clientcode;

public abstract class CoffeeTemplate {
    public final void makeCoffee(){
        boilWater();
        brewCoffee();
        addIngredients();
        addFinalTouch();
        System.out.println(">>Serving coffee");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewCoffee(){System.out.println("Brewing espresso");}

    protected abstract void addIngredients();

    protected abstract void addFinalTouch();
}
