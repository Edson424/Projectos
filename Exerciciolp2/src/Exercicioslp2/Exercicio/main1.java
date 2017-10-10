package Exercicioslp2.Exercicio;

/**
 *
 * @author Edson
 */

 class Utilizador{
     String primeiroNome;
     String ultimoNome;
     String email;
     String username;
     String password;
     
     public Utilizador(String primeiroNome, String ultimoNome, String email, String username, String password){
         this.primeiroNome = primeiroNome;
         this.ultimoNome = ultimoNome;
         this.email = email;
         this.username = username;
         this.password = password;
     
     }

   

    
  
   void mostrar(){
        String temp = "";
       
        System.out.println(primeiroNome);
        System.out.println(ultimoNome);
        System.out.println(email);
           
        if(email == null){
            temp = "";
        }
    System.out.println("Email: " +email);
}    
   boolean teEmail(){
       return !(email == null || email.equals(""));
   }
   
   boolean verificarCredenciais(String username, String password){
       if(this.username.equals(username) && this.password.equals(password)){
           return true;
       }
       else{
           return false;
       }
    
   }
   
  
  
   
   
       
    

    Utilizador() {
        
    }
     
                 
             
    
 
 
 }
public class main1 {
       
    public static void main(String Args[]){
        
    
    
    }
}
