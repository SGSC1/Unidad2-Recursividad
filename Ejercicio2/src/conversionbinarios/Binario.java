/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionbinarios;

/**
 *
 * @author Santos
 */
public class Binario {
     public static void conversion(int decimal){
        if (decimal <2){
            System.out.print(decimal);
            return; 
        }else{
        conversion(decimal/2);
            System.out.print(decimal%2);
        return;
        }
}
}
