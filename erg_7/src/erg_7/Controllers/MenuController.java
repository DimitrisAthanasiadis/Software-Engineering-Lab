package erg_7.Controllers;

public class MenuController {

    private String options[];

    public MenuController() {
    }

    public MenuController(String[] options) {
        this.options = options;
    }

    public void Show(MenuController menu) {
        //prints options of menu
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i] + "\n");
        }
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    //kanw overload to setOptions ean thelei kapios na valei ena option.
    public void setOptions(String option, int index) {
        this.options[index] = option;
    }

    public void delOption(String option, int index) {
        this.options[index] = option;
    }
}
