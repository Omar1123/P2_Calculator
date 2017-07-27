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
    
    public void userInputOneResult() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        calculator.setNumberOne(scan.nextDouble());        
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
        System.out.println("5) Raiz cuadrada");
        System.out.println("6) Raiz cubica");
        System.out.println("7) Cos");
        System.out.println("8) Cos hiperbolico");
        System.out.println("9) Exponente");
        System.out.println("10) Log base 10");
        System.out.println("11) Maximo entre dos numeros");
        System.out.println("12) Minimo entre dos numeros");
        System.out.println("13) Sen");
        System.out.println("14) Sen hiperbolico");
        decition = scan.nextInt();
        
        if(decition > 14) {
            System.out.println("Resultado no valido");
        }
        
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
        
        if(decition == 5) {
            userInputOneResult();
            result = calculator.squareRoot();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 6) {
            userInputOneResult();
            result = calculator.cubeRoot();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 7) {
            userInputOneResult();
            result = calculator.cos();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 8) {
            userInputOneResult();
            result = calculator.hyperbolicCos();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 9) {
            userInputOneResult();
            result = calculator.exp();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 10) {
            userInputOneResult();
            result = calculator.log10();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 11) {
            userInputOneResult();
            result = calculator.max();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 12) {
            userInputOneResult();
            result = calculator.min();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 13) {
            userInputOneResult();
            result = calculator.sin();
            System.out.println("El resultado es: " + result);
        }
        
        if(decition == 14) {
            userInputOneResult();
            result = calculator.sinh();
            System.out.println("El resultado es: " + result);
        }
    }    
}
