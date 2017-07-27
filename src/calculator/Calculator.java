/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author jake
 */
public class Calculator {
    
    private double numberOne;
    private double numberTwo;
    private double result;
    
    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;        
    }
    
    public double getNumberOne() {
        return numberOne;        
    }
    
    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;        
    }
    
    public double getNumberTwo() {
        return numberTwo;
    }
    
    public double sum() {
        result = 0;
        result = numberOne + numberTwo;
        return result;
    }
    
    public double subtraction() {
        result = 0;
        result = numberOne - numberTwo;
        return result;
    }
    
    public double multiplication() {
        result = 0;
        result = numberOne * numberTwo;
        return result;
    }
    
    public double division() {
        result = 0;
        if(numberOne != 0) {
            result = numberOne / numberTwo;   
        } else {
            System.out.println("Caso no valido");
            result = 0;
        }               
        return result;
    }
    
    public Calculator() {
        numberOne = 0;
        numberTwo = 0;
    }
    
    public Calculator(Double numOne, Double numTwo) {
        this.numberOne = numOne;
        this.numberTwo = numTwo;
    }
}
