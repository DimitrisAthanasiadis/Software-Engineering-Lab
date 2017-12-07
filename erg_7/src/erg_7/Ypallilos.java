package erg_7;

public class Ypallilos extends Xristis
{

    private String username;
    private String password;

    public Ypallilos()
    {
        super();
        username = "";
        password = "";

    }

    public Ypallilos(String username, String password, Xristis user)
    {
        super(user.onoma, user.eponymo, user.email, user.tilefono);
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    
    private void diaxeirisiProvlimatwn(){
        
    }
    
    private void elegxosXristi(){
        
    }

    @Override
    public String toString()
    {
        return super.toString() + "username" + username + "password" + password;
    }
}
