package v1ch02.Welcome;
/**
 * This program displays a greeting for the reader.
 * @version 1.0 2020-06-29
 * @author Forrest Lyu
 */
public class Welcome 
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting); 
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }

}
