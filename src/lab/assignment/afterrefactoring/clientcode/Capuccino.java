package lab.assignment.afterrefactoring.clientcode;

public class Capuccino extends CoffeeTemplate {

    @Override
    protected void addIngredients(){
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    @Override
    protected  void addFinalTouch(){
        System.out.println("Top with milk foam");
    }

}
