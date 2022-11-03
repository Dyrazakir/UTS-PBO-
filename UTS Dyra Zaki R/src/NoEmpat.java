/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dyra Zaki R
 */
public class NoEmpat {
    public static void main(String[] args) {
      
        for(int counter = 1; counter <= 100; counter++){
           if(counter % 2 != 0){
               continue;
           }
          
            System.out.println("Perulangan genap " + counter);
        }
    }
}