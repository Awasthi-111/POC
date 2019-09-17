package com.poc.hashcode;

import java.util.HashMap;
import java.util.Map;

class GFG  
{ 
    public static void main (String[] args)  
    { 
          
        // creating two Objects with  
        // same state 
        Geek g1 = new Geek("aditya", 1); 
        Geek g3=g1;
        Geek g2 = new Geek("aditya", 1); 
         
        System.out.println("Has code of G1="+g1.hashCode());
        for(int i=0;i<=5;i++)
        {
        	System.out.println("Has code of G1="+g3.hashCode());
        }
        System.out.println("Has code of G2="+g2.hashCode());
        Map<Geek, String> map = new HashMap<Geek, String>(); 
        map.put(g1, "CSE"); 
        map.put(g2, "IT"); 
          
        for(Geek geek : map.keySet()) 
        { 
            System.out.println(map.get(geek).toString()); 
        } 
  
    } 
} 