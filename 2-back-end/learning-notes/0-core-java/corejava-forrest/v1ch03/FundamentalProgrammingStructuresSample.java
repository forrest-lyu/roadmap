package v1ch03;

/**
 * This program shows the fundamental programming structures in Java.
 * @version 1.0
 * @author Forrest Lyu <forrest.lyu.dev@gmail.com>
 */
public class FundamentalProgrammingStructuresSample
{
    public static void main(String[] args)
    {
        System.out.println("This program shows the fundamental programming " + 
                "structures in Java");

        /*
         * 1. Comments:
         *  - Single comment
         *  - Multiple lines' comments
         *  - Documentation comment
         *
         * 2. Data types
         *  - Primitive data types:
         *      - byte (8 bits):    -128 ~ 127
         *      - short (16 bits):  -32768 ~ 32767
         *      - int (32 bits):    -2.1 billion ~ 2.1 billion (-2.1E9 ~ 2.1E9)
         *      - long (64 bits):   -9.2 billion billion ~ 9.2 billion billion
         *                          (-9.2E18 ~ 9.2E18)
         *      
         *      - float (4 bytes):
         *      - double (8 bytes):
         *
         *      - char (1 bytes):
         *
         *      - boolean:          true, false
         *                          (null, true, false is literals, not keywords) 
         *
         *  - Reference data types:
         *      - Objects: String, StringBuilder
         *
         * 3. Operators
         *  - Assignment statement
         *  - Arithmetic statement
         *  - Comparison statement
         *  - Logical statement
         *  - Bitwise statement
         *
         * 4. Strings
         * 5. Input and Output
         * 6. Big numbers
         * 7. Arrays
         * 
         * appendix A) literals
         *  - numeric
         *  - character
         *  - boolean (true, false)
         *  - string
         *  - null
         */
        
        double operator1 = 2.22;
        double operator2 = 222 / 100;   // 2

        double operator3 = 0x1.0p-3;

        System.out.println(operator1 == operator2);
        System.out.println(operator3);



    }
}

