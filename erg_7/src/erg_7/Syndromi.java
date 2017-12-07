package erg_7;

public class Syndromi {

    private String troposPlirwmis;
    private String imerominiaEggrafis;
    private String imerominiaLixis;
    private ProgrammataGym progGr;

    public Syndromi(String troposPlirwmis, String imerominiaEggrafis, String imerominiaLixis, ProgrammataGym progGr) {
        this.troposPlirwmis = troposPlirwmis;
        this.imerominiaEggrafis = imerominiaEggrafis;
        this.imerominiaLixis = imerominiaLixis;
        this.progGr = progGr;
    }

    public String getImerominiaEggrafis() {
        return imerominiaEggrafis;
    }

    public void setImerominiaEggrafis(String imerominiaEggrafis) {
        this.imerominiaEggrafis = imerominiaEggrafis;
    }

    public String getImerominiaLixis() {
        return imerominiaLixis;
    }

    public void setImerominiaLixis(String imerominiaLixis) {
        this.imerominiaLixis = imerominiaLixis;
    }

    public ProgrammataGym getProgGr() {
        return progGr;
    }

    public void setProgGr(ProgrammataGym progGr) {
        this.progGr = progGr;
    }

    public String getTroposPlirwmis() {
        return troposPlirwmis;
    }

    public void setTroposPlirwmis(String troposPlirwmis) {
        this.troposPlirwmis = troposPlirwmis;
    }

    public String toString() {
        String s = "Imerominia Eggrafis = " + imerominiaEggrafis + "\nImerominia Lixis = " + imerominiaLixis
                + "\nProgramma details = " + progGr.toString() + "\nTropos Plirwmis = " + troposPlirwmis;
        return s;
    }
}
