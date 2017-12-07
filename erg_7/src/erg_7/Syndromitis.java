package erg_7;

public class Syndromitis extends Xristis {

    private String username;
    private String password;
    private Syndromi syn;

    public Syndromitis() {
        this("", "", null,null);
    }

    public Syndromitis(String username) {
        this.username = username;
    }

    public Syndromitis(String username, String passwrod) {
        this.username = username;
        this.password = password;
    }

    public Syndromitis(String username, String password, Xristis user,Syndromi syn) {
        super(user.onoma, user.eponymo, user.tilefono, user.email);
        this.username = username;
        this.password = password;
        this.syn = syn;
    }

    public boolean check_Login_Info(String username, String password) {
        //anigw connection me thn vasi kai trexw erwtimata , an vrethei o xristis tote girnaw True , alliws False
        return true;
    }

    public boolean checkUsername() {
        username = this.username;
        //anigw sindesi me vasi kai elegxw ean yparxei ayto to username
        //ean yparxei stelnw true alliws false
        return true;
    }

    public int checkPasswordStrength(String password) {
        //elegxw me regex , gia mikra kefalea noumera symbola, kai alaloga me to ti exei stelnw , ligo , mesea ,poly , 
        int strength = 0;
        return strength;
    }

    public boolean ananewshSyndromis() {

        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        String s = super.toString() + "username" + username + "password" + password;
        return s;
    }
}
