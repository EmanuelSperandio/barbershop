package barbershop.Model.DAO;

import barbershop.Model.Client;
import java.util.ArrayList;

public class ClientDAO {
        
    /**
     * Insere um cliente dentro do banco de dados
     * @param cliente exige que seja passado um objeto do tipo cliente
     */
    public void insert(Client client){
        Database.client.add(client);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param cliente
     * @return 
     */
    public boolean update(Client client){
        
        for (int i = 0; i < Database.client.size(); i++) {
            if(idAreEqual(Database.client.get(i),client)){
                Database.client.set(i, client);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param cliente
     * @return 
     */
    public boolean delete(Client client){
        for (Client clientList : Database.client) {
            if(idAreEqual(clientList,client)){
                Database.client.remove(clientList);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Client> selectAll(){
        return Database.client;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param cliente
     * @param clienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idAreEqual(Client client, Client clientCompare) {
        return client.getId() ==  clientCompare.getId();
    }
    
}