package lab.assignment.afterrefactoring;

public abstract class CoffeeMaker {
    
    //template method, final so subclasses can't override
    public final void makeCoffee() {
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }
    
    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    protected abstract void addIngredients();
    protected abstract void finalTouch();

}