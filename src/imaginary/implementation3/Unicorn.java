
package imaginary.implementation3;


public class Unicorn implements MythologicalBeing {
    private int age;
    private String magicPower;
    
    @Override
    public final void visitDreams() {
        
    }
    
    @Override
    public final void inspireStories() {
        
    }

    public final int getAge() {
        return age;
    }  

    public final String getMagicPower() {
        return magicPower;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final void setMagicPower(String magicPower) {
        this.magicPower = magicPower;
    }
    
    public final void counteractPoison() {
     //cure poisoned person
    }
    
}
