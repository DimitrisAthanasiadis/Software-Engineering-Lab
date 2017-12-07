
package erg_7.Controllers;


public class MenuController
{
    private String options[];
    
    public MenuController()
    {
        
    }
    
    public MenuController(String[] options)
    {
        this.options = options;
    }

    public void Show(MenuController menu)
    {
        //prints options of menu
    }
    public String[] getOptions()
    {
        return options;
    }

    public void setOptions(String[] options)
    {
        this.options = options;
    }
    
}
