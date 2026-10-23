/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Renato
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double var1 = Math.pow(4, 3);
        double var2 = Math.sqrt(81);
        int var3 = 70;
        int var4 = 50;
        double var5 = 2.0;
        int var6 = 25;
        int var7 = 18;
        int var8 = 12;
        int var9 = 25;
        double var10 = Math.pow(7, 2);
        int var11 = 40;
        
        boolean resultado = ((var1 + var2 > var3) && (var4 / var5 == var6)) || ((var7 + var8 <= var9) && !(var10 > var11));
        
        System.out.println(resultado);
        

    }
    
}
