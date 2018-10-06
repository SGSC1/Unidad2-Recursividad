
package palindromo;
import java.util.Scanner;

public class Palindromo {
    
    public static boolean Palindromo(String Palabra)
    {
    for(int i=0; i < Palabra.length(); i++)
    {
        if (Palabra.charAt(i) != Palabra.charAt(Palabra.length()-i -1))
        {
            return false;
        }
      }
        return true;
    }

    
    public static void main(String[] args) {
        String Palabra;
        Scanner Teclado =new Scanner(System.in);
        System.out.println("Teclea la palabra(que sea sin espacios)" );
        Palabra = Teclado.next();
        
        if (Palindromo(Palabra)==true)
        {
            System.out.printf("La frase  si es un palindromo", Palabra );
        } else
        {
            System.out.printf("La frase  no es un palindromo", Palabra);
        }       
            
    }
    
}
