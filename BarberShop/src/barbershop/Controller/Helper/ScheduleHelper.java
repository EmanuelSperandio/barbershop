package barbershop.Controller.Helper;

import barbershop.Model.Scheduling;
import barbershop.View.Schedule;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ScheduleHelper {

    private final Schedule view;

    public ScheduleHelper(Schedule view){
        this.view = view;
    }

    public void fillTable(ArrayList<Scheduling> schedulings) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableScheduling().getModel();
        tableModel.setNumRows(0);
        for (Scheduling scheduling : schedulings){
            tableModel.addRow(new Object[]{
                scheduling.getId(),
                scheduling.getClient().getName(),
                scheduling.getService().getDescription(),
                scheduling.getService().getValue(),
                scheduling.getDateFormat(),
                scheduling.getHourFormat(),
                scheduling.getObservation()

            });
        }
    }
    
}
