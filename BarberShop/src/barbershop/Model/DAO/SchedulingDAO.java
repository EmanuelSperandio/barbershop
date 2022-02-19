package barbershop.Model.DAO;

import barbershop.Model.Scheduling;
import java.util.ArrayList;

public class SchedulingDAO {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param agendamento exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Scheduling scheduling){
          
        if(scheduling.getId() == 0){
            scheduling.setId(nextId());
            Database.scheduling.add(scheduling);
        }
              
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param agendamento
     * @return 
     */
    public boolean update(Scheduling scheduling){
        
        for (int i = 0; i < Database.scheduling.size(); i++) {
            if(idAreEqual(Database.scheduling.get(i),scheduling)){
                Database.scheduling.set(i, scheduling);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param agendamento
     * @return 
     */
    public boolean delete(Scheduling scheduling){
        for (Scheduling schedulingList : Database.scheduling) {
            if(idAreEqual(schedulingList,scheduling)){
                Database.scheduling.remove(schedulingList);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Scheduling> selectAll(){
        return Database.scheduling;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param agendamento
     * @param agendamentoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idAreEqual(Scheduling scheduling, Scheduling schedulingCompare) {
        return scheduling.getId() ==  schedulingCompare.getId();
    }
    
    private int nextId(){
        
        int biggerId = 0;
        
        for (Scheduling scheduling : Database.scheduling) {           
           int id = scheduling.getId();
            
            if(biggerId < id){
                biggerId = id;
            }
            
        }
        
        return biggerId + 1;
    }


}
