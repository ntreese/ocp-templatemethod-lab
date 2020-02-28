package lab.assignment.afterrefactoring.clientcode;

public class Americano extends CoffeeTemplate {
    @Override
    protected void addIngredients(){
        System.out.println("Adding more hot water");
    }

    @Override
    protected  void addFinalTouch(){
        System.out.println("Add sugar and cream");
    }
}
