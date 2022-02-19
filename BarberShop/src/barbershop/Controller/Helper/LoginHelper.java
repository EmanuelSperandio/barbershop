package barbershop.Controller.Helper;

import barbershop.Model.User;
import barbershop.View.Login;

public class LoginHelper implements Helper {

    private final Login view;

    public LoginHelper(Login view){
        this.view = view;
    }

    public User getModel(){
        String usern;
        String passw;

        usern = view.getjUsername().getText();
        passw = view.getjPassword().getText();

        User model = new User(0,usern, passw);
        return model;
    }

    public void setModel(User model){
        String name = model.getName();
        String password = model.getPassw();

        view.getjUsername().setText(name);
        view.getjPassword().setText(password);
    }

    public void cleanScreen(){
        view.getjUsername().setText("");
        view.getjPassword().setText("");
    }


}
