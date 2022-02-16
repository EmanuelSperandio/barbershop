package barbershop.Controller;

import barbershop.Controller.Helper.LoginHelper;
import barbershop.Model.DAO.UserDAO;
import barbershop.Model.User;
import barbershop.View.Login;
import barbershop.View.Menu;

public class LoginController {

    private final Login loginView;
    private LoginHelper helper;

    public LoginController (Login view){
        this.loginView = view;
        this.helper = new LoginHelper (view);
    }

    public void signIn(){
        User user = helper.getModel();
        UserDAO userDAO = new UserDAO();
        User userAuthenticated = userDAO.selectNameAndPassword(user);

        if(userAuthenticated != null){
            Menu menu = new Menu();
            menu.setVisible(true);
            this.loginView.dispose();
        }else
            loginView.showMessage("ID/Password wrong!");

    }

    public void showMessageLogin(String msg){
        this.loginView.showMessage(msg);
    }
    
}
