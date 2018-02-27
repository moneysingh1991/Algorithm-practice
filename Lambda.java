/*
 * Lamda expression 
 */
package coding_practice;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Maninderpal Singh
 * Email: Maninderpal.singh@sjsu.edu
 */

interface LamdaInterface1
{
    //Simple abstract method function
    int compute(int n);
    
}

interface LamdaInterface2<T>
{
    //Simple abstract method function
    T compute(T t);
    
}

public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this lambda expression will return integer * 2
        LamdaInterface1 mul2 = (n)-> n *2;
        
        // this lambda expression will return sqaure of given integer
        LamdaInterface2<Integer> mul4 = (Integer str) -> { 
            return str * str; 
        };
        
        // this expression will repeat given string
        LamdaInterface2<String> str2 = (String str) -> { 
           
            
            return str.concat(str); 
        };
        
        
        System.out.println(mul2.compute(2));
        System.out.println(mul4.compute(4));
        System.out.println(str2.compute("Hello"));
    }
    
}
