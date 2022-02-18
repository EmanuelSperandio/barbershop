package barbershop.Controller;

import barbershop.Controller.Helper.ScheduleHelper;
import barbershop.Model.DAO.SchedulingDAO;
import barbershop.Model.Scheduling;
import barbershop.View.Schedule;
import java.util.ArrayList;

public class ScheduleController {
    
    private final Schedule scheduleView;
    private final ScheduleHelper scheduleHelper;

    public ScheduleController(Schedule scheduleView) {
        this.scheduleView = scheduleView;  
        this.scheduleHelper = new ScheduleHelper(scheduleView);  
    }


    public void updateTable(){
        SchedulingDAO schedulingDAO = new SchedulingDAO();
        ArrayList<Scheduling> schedulings = schedulingDAO.selectAll();
        scheduleHelper.fillTable(schedulings);
    }


}
