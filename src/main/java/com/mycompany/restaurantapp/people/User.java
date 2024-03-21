
package com.mycompany.restaurantapp.people;
import com.mycompany.restaurantapp.values.UserTypes;  // OJO CON IMPORTAR 
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
        
        System.out.println("Ingrese su nombre de usuario");
        Scanner read = new Scanner(System.in);
        this.name = read.nextLine();
        System.out.println("Ingrese su código");
        Scanner leer = new Scanner(System.in);    //ojo, ahí me dí cuenta que un scanner solo tiene un nombre, o sea, debes ir cambiando los nombres, tengo read y leer 
        this.id= leer.nextLine(); 
        System.out.println("Escriba si es estudiante, docente o administrativo");
        Scanner lectura = new Scanner(System.in);
        String option = lectura.nextLine();
        
        if(option.equals("Estudiante")) {
            user.setType(UserTypes.STUDENT); 
        } else if (option.equals("Docente")){
            user.setType(UserTypes.TEACHER);   
        } else if (option.equals("Administrativo")){
            user.setType(UserTypes.ADMINISTRATIVE);  
        }
        
        //tenes que crear la instancia para eso 
        
        
        
        
        
        
        
        // this.type= lectura.nextLine(); 
        // UserTypes option = UserTypes.valueOf(lectura);    
    }
    
    
    
    
    

    public UserTypes getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setType(UserTypes type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
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
