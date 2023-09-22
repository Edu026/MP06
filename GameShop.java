import java.util.*;

public class GameShop {

    private TreeMap llistaJocs = new TreeMap();
    Scanner sc =  new Scanner(System.in);

    public static void main(String args[]){
        GameShop tenda = new GameShop();
        Scanner sc2 = new Scanner (System.in);
        boolean flag = true;

        tenda.llistaJocs.put("Zelda Twilight Princes", 30.00);
        tenda.llistaJocs.put("CyberPunk 2077", 69.00);
        tenda.llistaJocs.put("Red Dead Redemption 2", 40.00);

        //Menu
        while (flag == true){
            System.out.println("  "+"---------------GAME---------------");
            tenda.mostrarJocs(tenda.llistaJocs);
            System.out.println("\n");
            System.out.println("  "+"---------------MENU---------------");
            System.out.println("  "+"1)Introduir elements");
            System.out.println("  "+"2)Modificar preu");
            System.out.println("  "+"3)Eliminar un producte");
            System.out.println("  "+"4)Mostrar productes alfabeticament");
            System.out.println("  "+"5)Sortir");        
    
            System.out.println("  "+"Opcio:");
            System.out.print("  ");  
            
            String resposta = sc2.nextLine();

            switch(resposta){
                case "1":
                    try {
                        System.out.println("  "+"-----Introduir Joc-----"+"\n");
                        System.out.print("  "+"Nom: ");
                        String nomNouJoc = sc2.nextLine();
                        System.out.print("  "+"Preu: ");
                        Double preuNouJoc = sc2.nextDouble();
                        sc2.nextLine();
                        tenda.insertGame(nomNouJoc, preuNouJoc);
                    } catch (InputMismatchException  e) {
                        System.out.println("\n"+"  "+"El Preu introduit ha de ser un numero!");
                    }
             
                    break;
                case "2":
                    try {
                        System.out.println("  "+"-----Modificar Joc-----"+"\n");
                        System.out.print("  "+"Nom: ");
                        String nomNouJoc = sc2.nextLine();
                        System.out.print("  "+"Preu: ");
                        Double preuNouJoc = sc2.nextDouble();
                        sc2.nextLine();
                        tenda.modificarPreu(nomNouJoc, preuNouJoc);
                    } catch (InputMismatchException  e) {
                        System.out.println("\n"+"  "+"El Preu introduit ha de ser un numero!");
                    }
                    break;
                case "3":
                        System.out.println("  "+"-----Eliminar Joc-----"+"\n"); 
                        System.out.print("  "+"Nom: ");
                        String nomNouJoc = sc2.nextLine();
                        System.out.println( nomNouJoc);
                        tenda.eliminarProducte(nomNouJoc);
                    break;
                case "4":
                    System.out.println("  "+"-----Mostrar Jocs-----"+"\n");
                    tenda.mostrarJocs(tenda.llistaJocs);
                    break;
                case "5":
                    System.out.println("Adeu!!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcio Incorrecta !");
            }

        }   
            
        }

     

     //Mostra els elements 
     public static void mostrarJocs(Map m){
          for(Iterator i=m.keySet().iterator(); i.hasNext();){
            String k=(String)i.next();
            Double v=(Double)m.get(k);
            System.out.println("  "+k+ " : " +v);
        }
    }

    //Inserta elements
    public void insertGame(String nom,Double preu){
 
        if (this.llistaJocs.get(nom) == null) {
            if (nom.equals("")) {
                System.out.println("  "+"El nom no pot ser vuit");
            }else this.llistaJocs.put(nom,preu);
        }
        else {
            System.out.println("  "+"El producte ja existeix");
        }
        
    }
    
    //Modificar el preu
    public void modificarPreu(String nom, Double preu){
         if (this.llistaJocs.get(nom) != null) {
            if (nom.equals("")) {
                System.out.println("  "+"El nom no pot ser vuit");
                sc.nextLine();
            }else {
                this.llistaJocs.put(nom,preu);
                System.out.println("\n"+"  "+"Preu de "+ nom +" ha sigut modificat");       
            }
        }
        else System.out.println("  "+"Producte desconegut”");
    }

    //Eliminar un producte
        public void eliminarProducte(String nom){
        if (this.llistaJocs.get(nom) != null) {
            if (nom.equals("")) {
                System.out.println("  "+"El nom no pot ser vuit");
                sc.nextLine();
            }else{
                System.out.println("  "+"Estàs segur d’esborrar el producte "+ nom); 
                System.out.println("  "+"Escriu yes per esborrar el producte");
                String resposta = sc.nextLine();
                if (resposta.equals("yes")){
                    this.llistaJocs.remove(nom);
                }else System.out.println("Producte no eliminat");}
        }else System.out.println("  "+"No s'ha trobat el producte. ");
    }
} 
