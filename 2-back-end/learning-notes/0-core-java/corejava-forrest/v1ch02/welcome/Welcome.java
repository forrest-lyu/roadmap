package v1ch02.welcome;
/**
 * This program displays a greeting for the reader.
 * @version 1.0 2020-07-14
 * @author Forrest Lyu <forrest.lyu.dev@gmail.com>
 */
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Hi, bro. Welcome to learn Java.";
        System.out.println(greeting);
        for(int i = 0; i < greeting.length(); ++i)
        {
            System.out.print("=");
        }
        System.out.println();
    }
}
