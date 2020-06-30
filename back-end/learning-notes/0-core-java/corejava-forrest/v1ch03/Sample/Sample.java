package v1ch03.Sample;

/**
 * A sample for demonstrating the anatomy of java source code.
 * @version 1.0 2020-06-30
 * @author Forrest Lyu <forrest.lyu.dev@gmail.com>
 */
/*
 * public: an access modifier
 * class: everything in a java program lives inside a class
 *
 * Variables' name rules:
 * - must begin with a letter
 * - can have any combination of letters and digits
 * - the length is essentially unlimited
 * - cannot use a java reserved word (such as public or class)
 *
 * The standard naming convention:
 * - class name are nouns that start with an uppercase letter
 * - If a name consists of multiple words, use an initial uppercase letter in each of words.
 * 
 * According to the 'Java Language Specification', the 'main' method must be declared 'public'.
 *
 */ 
public class Sample
{
    /**
     * Just to say, every java application must have a main method that is declared in the following way.
     */
    public static void main(String[] args)
    {
        // In java, every statement must end with a semicolon
        // the general syntax:
        // object.method(parameters)
        System.out.println("We will not use 'Hello, World!'");
    }
}
