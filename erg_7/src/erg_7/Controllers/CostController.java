package erg_7.Controllers;

public class CostController {

    private double Kostos;
    private double dayCost, hourCost, groupCost;
    //oi epilegmenes hmeres
    private String days[];
    //einai h epilegmenh wra toy programmatos
    private int time;
    //epilegmeno group
    private int group;

    public CostController() {
    }

    public CostController(double Kostos, double dayCost, double hourCost, double groupCost, String[] days) {
        this.Kostos = Kostos;
        this.dayCost = dayCost;
        this.hourCost = hourCost;
        this.groupCost = groupCost;
        this.days = days;
    }

    //emfanish UI
    public void showUI() {
    }

    //elegxei an oi dothises meres yparxoyn sthn bash
    public boolean checkDays(String days[]) {
        boolean daysExist = false;
        int count = 0;

        //syndesh me thn bash dedomenwn kai elegxos twn hmerwn
        //estw pinakas String existingDays twn yparxontwn hmerwn ths bashs
        String existingDays[] = null;
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < existingDays.length; j++) {
                if (days[i].equals(existingDays[j])) {
                    count++;
                }
            }
        }


        if (count == days.length) {
            daysExist = true;
        }

        return daysExist;
    }

    //elegxei an to epilegmeno group yparxei/einai diathesimo
    public boolean checkGroup(int group) {
        boolean groupExists = false;
        //pinakas me ta antistoixa group toy kathe programamtos apo thn bash
        int[] groups = null;

        if (checkDays(days) == true) {
            for (int i = 0; i < groups.length; i++) {
                if (group == groups[i]) {
                    groupExists = true;
                }
            }
        }

        return groupExists;
    }

    public boolean checkTime(int time) {
        //estw enas pinakas me wres int availHours[] ths bashs me tis diathesimes wres
        int availHours[] = null;
        boolean availTime = false;

        if (checkGroup(group) == true) {
            for (int i = 0; i < availHours.length; i++) {
                if (time == availHours[i]) {
                    availTime = true;
                }
            }
        }

        return availTime;
    }
    
    

    public double totalCost() {
        return days.length * dayCost + groupCost + hourCost;
    }

    public void result() {
        if (checkTime(time) == true) {
            System.out.println("Reservation successful!!!");
            System.out.println("Total cost is " + totalCost() + "euros");
        } else {
            System.out.println("Reservation NOT successful!!!");
        }
    }
    
    public String[] Show_Programs(){
        String[] abc = new String[5];
        abc[0] = "1: cardio";
        abc[1] = "2: step";
        abc[2] = "3: aerobia";
        abc[3] = "4: 2w3w3";
        abc[4] = "5: lalalala";
        return abc;
    }
    
    public void epilogh_programmatos_kai_diarkeias(){
        System.out.println("dwse group");
    }
    
    //~~~~~~~~~~~~GET_SET~~~~~~~~~~~~~~

    public double getKostos() {
        return Kostos;
    }

    public void setKostos() {
        this.Kostos = Kostos;
    }

    public double getDayCost() {
        return dayCost;
    }

    public void setDayCost(double dayCost) {
        this.dayCost = dayCost;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getGroupCost() {
        return groupCost;
    }

    public void setGroupCost(double groupCost) {
        this.groupCost = groupCost;
    }

    public double getHourCost() {
        return hourCost;
    }

    public void setHourCost(double hourCost) {
        this.hourCost = hourCost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String toString() {
        String s = "kati";
        return s;
    }
}