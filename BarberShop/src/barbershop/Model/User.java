package barbershop.Model;

public class User extends Person {

    protected String passw;
    protected int accessLevel;

    public User(String passw, int accessLevel, int id, String name, String gender, String telefone, String email, int cpf) {
        super(id, name, gender, telefone, email, cpf);
        this.passw = passw;
        this.accessLevel = accessLevel;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

}
