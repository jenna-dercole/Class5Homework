
package imaginary.implementation2;


public abstract class Unicorn {
    private int age;
    private final String magicPower;
    
    public Unicorn(int a, String mp) {
        this.age = a;
        this.magicPower = mp;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final String getMagicPower() {
        return magicPower;
    }
    
    public final void counteractPoison() {
        //counteracts poison
    }
}
