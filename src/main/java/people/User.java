
package people;
import values.UserTypes;  // OJO CON IMPORTAR 
import java.util.Scanner; 



public class User {
    private UserTypes type; //importa para que no salga error, lo puse privado para que no haya problema (averiguar bien eso) 
    String name;
    String id; 

    public User(UserTypes type, String name, String id) {
        this.type = type;
        this.name = name;
        this.id = id;
    }
    
    
    
    public void buy (){
        
        System.out.println("Ingresa tu nombre de usuario");
        Scanner read = new Scanner(System.in);
        this.name = read.nextLine();
        System.out.println("Ingresa tu código");
        Scanner leer = new Scanner(System.in);    //ojo, ahí me dí cuenta que un scanner solo tiene un nombre, o sea, debes ir cambiando los nombres, tengo read y leer 
        this.id= leer.nextLine(); 
    }
    public void sell (){
        if(this.type != UserTypes.ADMINISTRATIVE){   //si el tipo de usuario no es administrativo no puede vender 
            System.out.println ("Usted no está autorizado para vender");
        }
        
        // if(this.type = UserTypes.ADMINISTRATIVE){
        //    System.out.println ("Persona Autorizada");
        // }       //hacer eso sería redundante?        
    }
    public void SellingAdmin (){
        if(this.type == UserTypes.ADMINISTRATIVE){   //ahí como estás comparando un valor tienes que poner doble igual, porque sino el computador va a leer que estás asignando un valor y noooo 
            System.out.println("Persona Autorizada"); 
            
        }
    }
    
    
    
    
    
    
}
