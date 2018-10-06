
package cambiodinero;
import java.util.Scanner;


public class CambioDinero {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float a,b, total;
        System.out.println("Ingrese la cantidad de dinero pagada");
        a=lector.nextFloat();
        System.out.println("Ingrese el precio del producto:");
        b=lector.nextFloat();
        vuelto(a,b);
          }
    
    public static void vuelto (double num1, double num2){
    double cambio=1, res, cien=0, cincuenta=0, veinte=0, diez=0,cinco=0,uno=0;
    if (cambio>=(num1-num2))
        num2 = num2 - 0.01;
    if ((num1>1)&&(num2<1))
        num2 = num2 - 0.01;
       cambio = num1 - num2;
     if(num1<num2)
            System.out.println("Valores Erroneos Ingresados: ");
     else{
     for (int i=1; i<=num1; i++){
         res = cambio/100;
         if (res>=1){
         cien++;
         cambio = cambio - 100;
         
         }else{
             res = cambio/50;
         if (res>=1){
             cincuenta++;
             cambio=cambio-50;
         }else{
         res= cambio/20;
         if(res >=1){
             veinte++;
             cambio=cambio-20;
         }else{
         res=cambio/10;
            if(res>=1){
                diez++;
                cambio=cambio-10;
            }
            else{
            res=cambio/5;
            if(res>=1){
                cinco++;
                cambio=cambio-5;
            }else{
            res=cambio/1;
            if(res>=1){
                uno++;
                cambio=cambio-1;
            }
         }
     }
    }
       
  }
}
}

        System.out.println("Billetes de 100:" +cien);
        System.out.println("Billetes de 50:" +cincuenta);
        System.out.println("Billetes de 20:" +veinte);
        System.out.println("Monedas de 10:" +diez);
        System.out.println("Monedas de 5:" +cinco);
        System.out.println("Monedas de 1:" +uno);
    }
    double cincuentaCents=0, veinteCents=0,diezCents=0,cincoCents=0, unCents=0;
    for (double j=0.00; j<=num1;j=j+0.01) {
        res=cambio/0.50;
        if(res>=1){
        cincuentaCents++;
        cambio=cambio-0.50;
            }else{
        res=cambio/0.20;
        if(res>=1){
            veinteCents++;
            cambio=cambio-0.20;
        }else{
        res=cambio/0.10;
        if(res>=1){
            diezCents++;
            cambio=cambio-0.10;
        }else{
        res=cambio/0.05;
        if(res>=1){
            cincoCents++;
            cambio=cambio-0.05;
        }else{
        res=cambio/0.01;
        if(res>=1){
            unCents++;
            cambio=cambio-0.01;
        }
        
        }
         }
        }
       }
}

            System.out.println("Monedas de cincuenta centavos " +cincuentaCents);  
            System.out.println("Monedas de veinte centavos " +veinteCents); 
            System.out.println("Monedas de diez centavos " +diezCents);
            System.out.println("Monedas de  cinco centavos " +cincoCents); 
            System.out.println("Monedas de un centavos " +unCents);
}
}
