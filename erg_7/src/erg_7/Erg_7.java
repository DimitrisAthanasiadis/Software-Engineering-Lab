package erg_7;

import erg_7.Controllers.CostController;
import erg_7.Controllers.LoginController;
import erg_7.Controllers.MenuController;
import erg_7.Controllers.RegisterController;
import java.util.*;

public class Erg_7 {

    public static void main(String[] args) {
        //erg7
        String[] s = new String[5];
        s[0] = "1: Login";
        s[1] = "2: Register";
        s[2] = "3: Ananewsh Syndromis";
        s[3] = "4: Kati allo";
        s[4] = "5: Eksodos";


        MenuController menu = new MenuController(s);
        menu.Show(menu);

        System.out.println("\nDwse epilogi : ");

        Scanner sc = new Scanner(System.in);
        int epilogi = sc.nextInt();
        while(epilogi != 5){
            switch (epilogi) {
                case 1:
                    //arxizw me login
                    //px , login();, pou tha einai mesa sthn main , pou tha ginete olh h doulia me loginControllers ...
                    login();
                    break;
                case 2:
                    //arxizw me register
                    register();
                    break;
                case 3:
                    //arxizw me login , kai meta me CostController
                    //ean den exei kanei logi tote kanw prota login kai meta me CostController
                    renewSubscription();
                    break;
                case 5:
                break;
                default:
                    System.out.println("Eksodos apo to menoy");
                break;
            }
            
            epilogi = sc.nextInt();
        }
        
    }

    public static void login() {

        System.out.println("\nStarting Login...");
        String username = askUsername();
        String password = askPassword();
        
        LoginController lc = new LoginController(username, password);
        lc.insert_Credentials(username, password);
    }

    public static void register() {
        System.out.println("\nRegister!!");
        RegisterController reg = null;
        String username;
        do{
            username = askUsername();
            if(!reg.checkUsername(username))
                System.out.println("Existing username. Give a new one.");
        }while(!reg.checkUsername(username));

        String password;
        do{
            password = askPassword();
            if(reg.checkPassStrength(username, password) < 2)
                System.out.println("Password is weak. Give a new one.");
        }while(reg.checkPassStrength(username, password) < 2);
    }

    public static void renewSubscription() {
        System.out.println("\nRenewing Subscription!!");
        CostController cc = new CostController();
        String[] sss= cc.Show_Programs();
        for(int i=0;i<sss.length;i++){
            System.out.println(sss[i]);
        }
        
        
    }

    
    
    
    public static String askUsername() {
        System.out.println("\nGive me a username : ");
        Scanner sc = new Scanner(System.in);
        String username = (String) sc.nextLine();
        return username;
    }

    public static String askPassword() {
        System.out.println("\nGive me a password : ");
        Scanner sc = new Scanner(System.in);
        String passwd = (String) sc.nextLine();
        return passwd;
    }
}
