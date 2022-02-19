package barbershop.Controller;

import barbershop.Controller.Helper.ScheduleHelper;
import barbershop.Model.Client;
import barbershop.Model.DAO.ClientDAO;
import barbershop.Model.DAO.SchedulingDAO;
import barbershop.Model.DAO.ServiceDAO;
import barbershop.Model.Scheduling;
import barbershop.Model.Service;
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

    public void updateClient(){
        ClientDAO clientDAO = new ClientDAO();
        ArrayList<Client> clients = clientDAO.selectAll();
        scheduleHelper.fillComboBoxClient(clients);

    }

    public void updateService(){
        ServiceDAO serviceDAO = new ServiceDAO();
        ArrayList<Service> services = serviceDAO.selectAll();
        scheduleHelper.fillComboBoxService(services);
    }

    public void updateServicePrice(){
        Service service = scheduleHelper.getService();
        scheduleHelper.setServiceValue(service.getValue());
    }

    public void addNewSchedule(){
        Scheduling scheduling = scheduleHelper.getModel();
        new SchedulingDAO().insert(scheduling);
        updateTable();
        scheduleHelper.cleanScreen();
    }

}
