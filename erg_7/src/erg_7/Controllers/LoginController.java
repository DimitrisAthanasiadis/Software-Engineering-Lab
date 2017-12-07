package erg_7.Controllers;

import erg_7.Syndromitis;

public class LoginController {

    private String username;
    private String password;

    public LoginController() {
    }

    public LoginController(String username, String password) {
    }

    public void insert_Credentials(String username, String password) {
        //saves credentials
        Syndromitis syn = new Syndromitis(username, password);
        if (syn.check_Login_Info(username, password)) {
            System.out.println("username , password ok!");
        } else {
            System.out.println("username, password combination is wrong , Please try again!");
        }
    }

    public boolean insert_Email() {
        //Scanner sc = new Scanner(System.in);
        //String email = sc.nextLine();
        //sindesi me server kai stelnw ena email
        //stelnw true ean stalthike epitixws alliws false.
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
