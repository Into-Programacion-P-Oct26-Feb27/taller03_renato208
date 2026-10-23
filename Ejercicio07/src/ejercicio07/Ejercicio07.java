/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Renato
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int var1 = 15;
        int var2 = 25;
        int var3 = 30;
        double var4 = Math.pow(8, 2);
        int var5 = 60;
        double var6 = Math.sqrt(144);
        int var7 = 12;
        
        boolean resultado = (var1 + var2 > var3) || (var4 < var5) && (var6 == var7);
        
        System.out.println(resultado);

    }
    
}
