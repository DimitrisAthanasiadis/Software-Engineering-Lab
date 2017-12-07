package erg_7;

public class Synedria {

    private ProgrammataGym progGr;
    private String time;
    private String hmera;

    public Synedria(ProgrammataGym progGr, String time, String hmera) {
        this.progGr = progGr;
        this.time = time;
        this.hmera = hmera;
    }
    //methods

    public String getHmera() {
        return hmera;
    }

    public void setHmera(String hmera) {
        this.hmera = hmera;
    }

    public ProgrammataGym getProgGr() {
        return progGr;
    }

    public void setProgGr(ProgrammataGym progGr) {
        this.progGr = progGr;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
