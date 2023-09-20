import java.util.*;

public class GameShop {

    private TreeMap llista = new TreeMap();

    public static void main(String args[]){

            //We create a new GameShop
            GameShop gs = new GameShop();

            //We add some games to test
            gs.llista.put("Zelda 1", 50.2);

        gs.insertGames("Zeld 1", 20.0);
        gs.displayGames();

    }

    //We create a method to insert game into the shop
    public void insertGames(String name, Double preu){
        for (Iterator i=this.llista.keySet().iterator(); i.hasNext();){
            
            if (name.equals(i.next())){
                System.out.println(i.next()+" Exists");
            }
        }

        //Insert the new Game 
        this.llista.put(name, preu);

    }
    //We create a method to show the items 
    public void displayGames(){
        for(Iterator i=this.llista.keySet().iterator(); i.hasNext();){
            String k=(String)i.next();
            Double v=(Double)this.llista.get(k);
            System.out.println("  "+k+ " : " +v);
         }
     }
    
} 
