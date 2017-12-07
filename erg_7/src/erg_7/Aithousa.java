
package erg_7;


public class Aithousa {
    
    private Synedria[] synedries;
    private int xwritikothta;

    public Aithousa(Synedria[] synedries, int xwritikothta) {
        this.synedries = synedries;
        this.xwritikothta = xwritikothta;
    }

    public Synedria[] getSynedries() {
        return synedries;
    }

    public void setSynedries(Synedria[] synedries) {
        this.synedries = synedries;
    }

    public int getXwritikothta() {
        return xwritikothta;
    }

    public void setXwritikothta(int xwritikothta) {
        this.xwritikothta = xwritikothta;
    }
    
    public String toString(){
        String s = "\nXwritikothta = "+xwritikothta;
        return s;
    }
}
