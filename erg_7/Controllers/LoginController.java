
package erg_7.Controllers;


public class LoginController
{
    private String username;
    private String password;
    
    public LoginController()
    {
        
    }
    
    public LoginController(String username,String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public void insert_Credentials(String username,String password)
    {
       //saves credentials
    }
    
    public boolean Forgot_Password()
    {
        //email = insertEmail();
        //kai meta stelnw ena email gia na ginei setup to password
        //true ean ta kataferame , alliws false kai grafw kai sto log ti phge strava
        return true;
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
    
}
