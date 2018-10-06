

package Palindromo;

/**
 *
 * @author Santos
 */
public class Clase {
   
    
    public static boolean Clase(String Palabra)
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
    
}
