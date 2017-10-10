/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioslp2.Exercicio;

/**
 *
 * @author Edson
 */
public class main {
    
    
    public static void main(String Args[]){
    Utilizador p = new Utilizador("luis","Alvarez","ed_xocolate@hotmail.com");
    
    Utilizador u  = new Utilizador();
    p.primeiroNome =  "Luiz";
    p.ultimoNome = "Alvarez";
    p.email = "ed_xocolate@hotmail.com";
    
    
    p.mostrar();
    u.mostrar();
    
    System.out.println("u1 tem email?" + u.teEmail());
    System.out.println("u2 tekm email?" + p.teEmail());
    
    u.username = "xpto";
    u.password = "olamundo";
    
    boolean r1 = u.verificarCredenciais("xpto", "olamundo100");
    System.out.println("Res 1:" +r1);
    
    boolean r2 = u.verificarCredenciais("xpto", "");
    System.out.println("Res" +r2);
    }
    
}
