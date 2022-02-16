package barbershop.Model.DAO;

import barbershop.Model.User;
import java.util.ArrayList;

public class UserDAO {
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param usuario exige que seja passado um objeto do tipo usuario
     */
    public void insert(User user){
        Database.user.add(user);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuario
     * @return 
     */
    public boolean update(User user){
        
        for (int i = 0; i < Database.user.size(); i++) {
            if(idAreEqual(Database.user.get(i),user)){
                Database.user.set(i, user);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param usuario
     * @return 
     */
    public boolean delete(User user){
        for (User userList : Database.user) {
            if(idAreEqual(userList,user)){
                Database.user.remove(userList);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<User> selectAll(){
        return Database.user;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param usuario
     * @return Usuario encontrado no banco de dados
     */
    public User selectNameAndPassword(User user){
        for (User userList : Database.user) {
            if(nameAndPasswordAreEqual(userList,user)){
                return userList;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nameAndPasswordAreEqual(User user, User userToCheck) {
        return user.getName().equals(userToCheck.getName()) && user.getPassw().equals(userToCheck.getPassw());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idAreEqual(User user, User userCompare) {
        return user.getId() ==  userCompare.getId();
    }
            
}
