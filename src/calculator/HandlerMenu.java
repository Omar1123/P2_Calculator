/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author jake
 */
public class HandlerMenu {
    
    private Calculator calculator;
    private double decition;
    private double result;
    
    public HandlerMenu() {
        calculator = new Calculator();
    }
    
    public void userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        calculator.setNumberOne(scan.nextDouble());
        System.out.println("Ingrese el segundo numero");
        calculator.setNumberTwo(scan.nextDouble());
    } 
    
    public void menu() {
        
        Scanner scan = new Scanner(System.in);
        decition = 0;
        
        System.out.println("Calculadora");
        System.out.println("Seleccione que opcion desea realizar");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");              
        decition = scan.nextInt();
        
        if(decition == 1) {
            userInput();
            result = calculator.sum();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 2) {
            userInput();
            result = calculator.subtraction();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 3) {
            userInput();
            result = calculator.multiplication();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 4) {
            userInput();
            result = calculator.division();
            System.out.println("El resultado es: " + result);
        }
    }    
}
