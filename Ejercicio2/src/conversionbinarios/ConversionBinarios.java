
package conversionbinarios;
import java.util.Scanner;

public class ConversionBinarios {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int decimal;
        System.out.print("Introduce un numero de base decimal real");
        
        decimal = sc.nextInt();
        
        if(decimal>=0){
            System.out.println();
            System.out.print("El equibalente en binario de "+decimal+"es:");
            conversion(decimal);
        }else{
        decimal = decimal /-1;
            System.out.println("El equibalente en binario de "+decimal+"es:");
            conversion(decimal);
        }
    }
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
