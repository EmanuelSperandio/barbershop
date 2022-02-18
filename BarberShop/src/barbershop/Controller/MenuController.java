package barbershop.Controller;

import barbershop.View.Menu;
import barbershop.View.Schedule;

public class MenuController {

    private final Menu menuView;

    public MenuController(Menu view){
        this.menuView = view;
    }

    public void navigateToScheduling(){
        Schedule schedule = new Schedule();
        schedule.setVisible(true);

    }
    
}
