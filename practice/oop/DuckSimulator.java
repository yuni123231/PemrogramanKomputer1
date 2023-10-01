

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DuckSimulator {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilihan nomor bebek :");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Rubber Duck");
        System.out.println("3. Decoy Duck");
        System.out.println("4. Model Duck");
        int pilihan_bebek = scanner.nextInt();
        
        
        Duck duck = null;
        
       if (pilihan_bebek ==1){
            duck = new MallardDuck();
        } else if (pilihan_bebek ==2){
            duck = new RubberDuck();
        } else if (pilihan_bebek ==3){
            duck = new DecoyDuck();
        } else if (pilihan_bebek ==4){
            duck = new ModelDuck();
        } else {
            System.out.println("Pilihan anda tidak valid");
            return;
        }
        
        
        System.out.println("Anda telah memilih " + duck.getClass().getSimpleName());
        
        duck.performQuack();
        duck.performFly();
    }
}
