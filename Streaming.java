/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author maninder
 */
public class Streaming {
     public static void main(String[] args) {
        
         List<Integer> list = new ArrayList<>();
       
         for(int i = 1; i <= 10; i++) {
             list.add(i);
            
         }
         
         for(int i : list) {
            // System.out.println(i);
         }
         
         // Simple for each loop
         list.forEach(System.out::println);
         
         System.out.print("-----------------");
         System.out.println();
         
         // Stream method to do for loop
         list.stream().forEach(System.out::println);
         
         System.out.print("-----------------");
         System.out.println();
         
         // for multithread purpos
         list.parallelStream().forEach(System.out::println);
       
         System.out.print("-----------------");
         System.out.println();
         
         // lazy evalution
         // just 
        
         System.out.println(list.stream().filter(i -> {
            System.out.println("hi");
             return true;
         }).findFirst());
         
         System.out.print("-----------------");
         System.out.println();
         
         Stream<Integer> s = list.stream();
         
         s.forEach(System.out::println); // this will work
         
         s.forEach(System.out::println); // this will give exception becuase stream can be use for once only
    }
}
