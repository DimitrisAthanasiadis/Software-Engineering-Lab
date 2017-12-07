/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erg_7.Controllers;

import erg_7.Syndromitis;

/**
 *
 * @author SHAQ
 */
public class RegisterController {
    String username, password;
    Syndromitis syn = new Syndromitis();

    public RegisterController(String username, String password) {
        this.username = username;
        this.password = password;
        Syndromitis syn = new Syndromitis(username, password);
    }
    
    

    //exei ginei eisagwgh twn stoixeiwn apo ton xrhsth
    public boolean checkUsername(String username) {

        //elegxos toy username analoga me toys periorismoys mesw ths bashs dedomenwn
        //parallhla elegxos kai gia diploeggrafes
        
        if (syn.checkUsername()) {
            return true;
        } else {
            return false;
        }

    }

    public int checkPassStrength(String username, String password) {
        //elegxos dynamhs password analoga me periorismoys
        
        int dynami = syn.checkPasswordStrength(password);
        return dynami;

    }
}
