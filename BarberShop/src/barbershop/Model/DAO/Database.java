package barbershop.Model.DAO;

import barbershop.Model.Scheduling;
import barbershop.Model.Client;
import barbershop.Model.Service;
import barbershop.Model.User;
import java.util.ArrayList;

public class Database {
    
    public static ArrayList<User> user;
    public static ArrayList<Client> client;
    public static ArrayList<Service> service;
    public static ArrayList<Scheduling> scheduling;
      
    public static void start(){
    
        //Instancia os Objetos
        user = new ArrayList<User>();
        client = new ArrayList<Client>();
        service = new ArrayList<Service>();
        scheduling = new ArrayList<Scheduling>();
        
        //criando elementos
        
        User user1 = new User(1, "admin", "M", "30212121", "barbeiro@barbershop.com", 521454123, "admin", 1);
        User user2 = new User(2, "estagiario", "M", "30212122", "estagiario@barbershop.com", 451244123, "estagiario", 2);
         
        Client client1 = new Client(1, "Alan Figueiredo", "M", "30212126", "tiagoluz.h607@gmail.com", 514287, "30/08/1994", "Rua jaboti 35 Canudos NH");
        Client client2 = new Client(2, "Judite Oliveira", "F", "30212127", "juditeoliveirapet@gmail.com", 514485, "30/08/1994", "Rua campo bom 78 Centro NH");
        Client client3 = new Client(3, "Paulo Ricado", "M", "30212128", "pauloricardopet@gmail.com", 451458, "24/04/1997", "Rua Tres Irmaos 30 Vila Nova - NH");
        Client client4 = new Client(4, "Neymar Santos", "M", "30212130", "neymarsantospet@gmail.com", 74548, "20/08/1995", "Rua Lombardi 40 Canudos NH");
        Client client5 = new Client(5, "Debruine Pipoqueiro", "M", "0212131", "debruinepet@gmail.com", 474248, "13/09/1992", "Rua pedro quaresma 784 Canudos Belgica");
        Client client6 = new Client(6, "Matuidi Pareira", "M", "302122324", "matuidipet@gmail.com", 785127, "17/08/1994", "Rua champions 10 Kephas Franca");
        Client client7 = new Client(7, "Marta de Souza", "F", "3021292", "martasouzapet@gmail.com", 4658314, "25/03/1993", "Rua tesla 215 Canudos NH");
        Client client8 = new Client(8, "Aline Ferrari", "F", "302121451", "alineferraripet@gmail.com", 5123687, "04/03/1990", "Rua hyrule 32 Canudos NH");
        Client client9 = new Client(9, "Samuel Coltinho", "M", "302121189", "samuelcoltinhopet@gmail.com", 1424, "09/02/1998", "Rua floresta 12 Canudos NH");
        Client client10 = new Client(10, "Felipe Luis", "M", "3021212478", "felipeluispet@gmail.com", 57136, "12/06/1999", "Rua marechal 1023 Canudos NH");
        
        Service service1 = new Service(1, "Corte Simples", 18);
        Service service2 = new Service(2, "Corte Degrade", 30);
        Service service3 = new Service(3, "Barba Simples", 15);
        Service service4 = new Service(4, "Barba Desenhada", 25);
        Service service5 = new Service(5, "Sombrancelhas", 10);
        Service service6 = new Service(6, "Penteados", 3);

        Scheduling scheduling1 = new Scheduling(1, client1, service2, "14/07/2022 09:30");
        Scheduling scheduling2 = new Scheduling(2, client3, service4, "15/07/2022 10:00");
        Scheduling scheduling3 = new Scheduling(3, client4, service1, "16/07/2022 10:30");
        
        //Adiciona Elementos na lista
        user.add(user1);
        user.add(user2);
        
        client.add(client1);
        client.add(client2);
        client.add(client3);
        client.add(client4);
        client.add(client5);
        client.add(client6);
        client.add(client7);
        client.add(client8);
        client.add(client9);
        client.add(client10);
        
        service.add(service1);
        service.add(service2);
        service.add(service3);
        service.add(service4);
        service.add(service5);
        service.add(service6);
        
        scheduling.add(scheduling1);
        scheduling.add(scheduling2);
        scheduling.add(scheduling3);
        
    }
        
}
