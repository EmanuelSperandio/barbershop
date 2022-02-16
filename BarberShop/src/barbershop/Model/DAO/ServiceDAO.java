package barbershop.Model.DAO;

import barbershop.Model.Service;
import java.util.ArrayList;

public class ServiceDAO {
        
    /**
     * Insere um servico dentro do banco de dados
     * @param servico exige que seja passado um objeto do tipo servico
     */
    public void insert(Service service){
        Database.service.add(service);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param servico
     * @return 
     */
    public boolean update(Service service){
        
        for (int i = 0; i < Database.service.size(); i++) {
            if(idAreEqual(Database.service.get(i),service)){
                Database.service.set(i, service);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servico
     * @return 
     */
    public boolean delete(Service service){
        for (Service serviceList : Database.service) {
            if(idAreEqual(serviceList,service)){
                Database.service.remove(serviceList);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Service> selectAll(){
        return Database.service;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idAreEqual(Service service, Service serviceCompare) {
        return service.getId() ==  serviceCompare.getId();
    }
    
}
