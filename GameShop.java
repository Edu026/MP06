import java.util.*;

public class GameShop {

    private TreeMap llistaJocs = new TreeMap();
    Scanner sc =  new Scanner(System.in);

    public static void main(String args[]){
        GameShop tenda = new GameShop();
        tenda.llistaJocs.put("Zelda Twilight Princes", 30);
        tenda.llistaJocs.put("CyberPunk 2077", 69);
        tenda.llistaJocs.put("Red Dead Redemption 2", 40);

        //Exemple de inserir joco
        tenda.insertGame("Persona 3", 49.00 );
        
        //Exemple de mostrar jocs
        tenda.mostrarAgenda(tenda.llistaJocs);

        //Modificar_preu 
        tenda.modificarPreu("Red Dead Redemption 2",20.00);


     }

     //Mostra els elements 
     public static void mostrarAgenda(Map m){
          for(Iterator i=m.keySet().iterator(); i.hasNext();){
            String k=(String)i.next();
            Double v=(Double)m.get(k);
            System.out.println("  "+k+ " : " +v);
        }
    }

    //Inserta elements
    public void insertGame(String nom,Double preu){
        if (this.llistaJocs.get(nom) == null) {
            this.llistaJocs.put(nom,preu);
        }
        else {
            System.out.println("  "+"El producte ja existeix");
        }
        
    }
    
    //Modificar el preu
    public void modificarPreu(String nom, Double preu){
        if (this.llistaJocs.get(nom) != null) {
            this.llistaJocs.put(nom,preu);
            System.out.println("\n"+"  "+"Preu de "+ nom +" ha sigut modificat");
        }        
        else System.out.println("  "+"Producte desconegut”");
    }

    //Eliminar un producte
        public void eliminarProducte(String nom){
        if (this.llistaJocs.get(nom) != null) {
            String resposta = sc.nextLine();
            System.out.println("Escriu yes per esborrar el producte");
            if (resposta.equals("yes")){
                this.llistaJocs.remove(nom);
            }else System.out.println("Producte no eliminat");
        }else System.out.println("No s'ha trobat el producte. ");
    }
} 
