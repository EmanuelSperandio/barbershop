package barbershop.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Scheduling {

    private int id;
    private Client client;
    private Service service;
    private Date data;
    private String observation;

    public Scheduling(int id, Client client, Service service, String data) {
        this.id = id;
        this.client = client;
        this.service = service;
        try{
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex){
        Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Scheduling(int id, Client client, Service service, float value, String data, String observation) {
        this.id = id;
        this.client = client;
        this.service = service;
        try{
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex){
            Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.observation = observation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
 
    
}
