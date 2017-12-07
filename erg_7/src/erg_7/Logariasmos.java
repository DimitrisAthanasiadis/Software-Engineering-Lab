
package erg_7;


public class Logariasmos {
    private String username;
    private String password;
    private Xristis user;

    public Logariasmos(String username, String password,Xristis user) {
        this.username = username;
        this.password = password;
        this.user = user;  
    }
    //method
    public boolean check_Login_Info(String username,String password)
    {
        //anigw connection me thn vasi kai trexw erwtimata , an vrethei o xristis tote girnaw True , alliws False
        return true;
    }
    
            
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Xristis getUser() {
        return user;
    }

    public void setUser(Xristis user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String toString() {
        String s = "\nUsername = " + username +user.toString();
        return s;

    }
    
    
}
