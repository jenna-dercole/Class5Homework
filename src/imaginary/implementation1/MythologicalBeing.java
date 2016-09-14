
package imaginary.implementation1;


public abstract class MythologicalBeing implements ImaginaryBeing {
    private String cultureOfOrigin;

    public String getCultureOfOrigin() {
        return cultureOfOrigin;
    }

    public void setCultureOfOrigin(String cultureOfOrigin) {
        this.cultureOfOrigin = cultureOfOrigin;
    }
    
    @Override
    public void inspireStories() {
        //utilize cultureOfOrigin in culturally-specific imaginative context
    };
}
