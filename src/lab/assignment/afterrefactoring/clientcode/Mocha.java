package lab.assignment.afterrefactoring.clientcode;

public class Mocha extends CoffeeTemplate{
    @Override
    protected void addIngredients(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected  void addFinalTouch(){
        System.out.println("Adding sugar");
    }
}
