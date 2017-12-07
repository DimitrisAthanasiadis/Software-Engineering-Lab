package erg_7;

public class ProgrammataGym {

    private String epipedo_diskolias;
    private String diarkeia;
    private String kostos;
    private String onoma;

    public ProgrammataGym(String epipedo_diskolias, String diarkeia, String kostos, String onoma) {
        this.epipedo_diskolias = epipedo_diskolias;
        this.diarkeia = diarkeia;
        this.kostos = kostos;
        this.onoma = onoma;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getDiarkeia() {
        return diarkeia;
    }

    public void setDiarkeia(String diarkeia) {
        this.diarkeia = diarkeia;
    }

    public String getEpipedo_diskolias() {
        return epipedo_diskolias;
    }

    public void setEpipedo_diskolias(String epipedo_diskolias) {
        this.epipedo_diskolias = epipedo_diskolias;
    }

    public String getKostos() {
        return kostos;
    }

    public void setKostos(String kostos) {
        this.kostos = kostos;
    }

    public String toString() {
        String s = "Epipedo Diskolias = " + epipedo_diskolias + "\nDiarkeia = " + diarkeia + "\nKostos = " + kostos;
        return s;
    }
}
