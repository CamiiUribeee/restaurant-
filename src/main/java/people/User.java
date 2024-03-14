
package people;
import values.UserTypes;  // OJO CON IMPORTAR 
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
        
    }
    public void sell (){
        if(this.type != UserTypes.ADMINISTRATIVE){   //si el tipo de usuario no es administrativo no puede vender 
            System.out.println ("usted no està autorizado para vender");
        }
            
    }
}
