
package best.solution;


public class Cactus implements Succulent {
    @Override
    public final void absorbSunlight() {
        //flex leaves, turn toward sun
    }
    
    @Override
    public final void grow() {
        //absorb sunlight and water, defend from predators
    }
    
    @Override
    public final void storeWater() {
        //stores water in its cactus-y way
    }
    
    @Override
    public final void absorbWater() {
        //absorbs water in its cactus-y way
    }
    
    public final void defendAgainstPredators() {
        growThorns();
    }
    
    private void growThorns() {
        //grow spiky, painful thorns
    }
}
