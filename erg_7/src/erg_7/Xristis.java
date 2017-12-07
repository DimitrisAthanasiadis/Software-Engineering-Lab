package erg_7;

public abstract class Xristis {

    String onoma;
    String eponymo;
    String tilefono;
    String email;

    public Xristis()
    {
        this("","","","");
    }
    public Xristis(String onoma, String eponymo, String tilefono, String email) {
        this.onoma = onoma;
        this.eponymo = eponymo;
        this.tilefono = tilefono;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEponymo() {
        return eponymo;
    }

    public void setEponymo(String eponymo) {
        this.eponymo = eponymo;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getTilefono() {
        return tilefono;
    }

    public void setTilefono(String tilefono) {
        this.tilefono = tilefono;
    }
    
    @Override
    public String toString() {
        String s = "\nOnoma = " + onoma + "\nEpwnymo = " + eponymo + "\nTilefono = " + tilefono + "\nemail = " + email;
        return s;

    }
}
