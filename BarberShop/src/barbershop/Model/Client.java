package barbershop.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends Person{

    protected Date birthday;
    protected String address;

    public Client(int id, String name, String gender, String telefone, String email, int cpf, String birthday, String address) {
        super(id, name, gender, telefone, email, cpf);
        try{
            this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        } catch (ParseException ex){
        Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.address = address;
    }

    /*public Client() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    
}
