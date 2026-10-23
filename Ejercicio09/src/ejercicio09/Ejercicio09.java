/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Renato
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double var1 = Math.sqrt(225);
        double var2 = Math.pow(5, 2);
        int var3 = 50;
        int var4 = 120;
        double var5 = 4.0;
        int var6 = 30;
        
        boolean resultado = !((var1 + var2 < var3) && (var4 / var5 == var6));  
        
        System.out.println(resultado);
        

    }
    
}
