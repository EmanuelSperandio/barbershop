package barbershop.Controller.Helper;

import barbershop.Model.Client;
import barbershop.Model.Scheduling;
import barbershop.Model.Service;
import barbershop.View.Schedule;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ScheduleHelper implements Helper{

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
                scheduling.getService().getName(),
                scheduling.getService().getValue(),
                scheduling.getDateFormat(),
                scheduling.getHourFormat(),
                scheduling.getObservation()

            });
        }
    }

    public void fillComboBoxClient(ArrayList<Client> clients){
        DefaultComboBoxModel clientComboBox = (DefaultComboBoxModel) view.getjComboBoxClient().getModel();
        
        for (Client client : clients) {
            clientComboBox.addElement(client);            
        }

    }

    public void fillComboBoxService(ArrayList<Service> services){
        DefaultComboBoxModel serviceComboBox = (DefaultComboBoxModel) view.getjComboBoxService().getModel();

        for (Service service : services) {
            serviceComboBox.addElement(service);
        }
    }

    public Client getClient(){
        return (Client) view.getjComboBoxClient().getSelectedItem();
    }

    public Service getService(){
        return (Service) view.getjComboBoxService().getSelectedItem();
    }

    public void setServiceValue(float value) {
        view.getjTextFieldValue().setText(value + "");
    }

    @Override
    public void cleanScreen(){
        view.getjTextFieldID().setText("0");
        view.getjTextFieldDate().setText("");
        view.getjTextFieldHour().setText("");
        view.getjTextPaneObservation().setText("");
    }

    @Override
    public Scheduling getModel(){

        String idString = view.getjTextFieldID().getText();
        int id = Integer.parseInt(idString);
        Client client = getClient();
        Service service = getService();
        String valueString = view.getjTextFieldValue().getText();
        float value = Float.parseFloat(valueString);
        String date = view.getjTextFieldDate().getText();
        String hour = view.getjTextFieldHour().getText();
        String dateHour = date + " " + hour;
        String observation = view.getjTextPaneObservation().getText();
        Scheduling scheduling = new Scheduling(id, client, service, value, dateHour, observation);
        return scheduling;
    }
}
