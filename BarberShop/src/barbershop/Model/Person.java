package barbershop.Model;

import java.util.Date;

public abstract class Person {
    protected int id;
    protected String name;
    protected String gender;
    protected String telefone;
    protected String email;
    protected int cpf;

    public Person(int id, String name, String gender, String telefone, String email, int cpf) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }




}
