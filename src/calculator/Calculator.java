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
    
    public double squareRoot() {
        result = 0;
        result = Math.sqrt(numberOne);
        return result;
    }
    
    public double cubeRoot() {
        result = 0;
        result = Math.cbrt(numberOne);
        return result;
    }
    
    public double cos() {
        result = 0;
        result = Math.cos(numberOne);
        return result;
    }     

    public double hyperbolicCos() {
        result = 0;
        result = Math.cosh(numberOne);
        return result;
    }    
    
    public double exp() {
        result = 0;
        result = Math.exp(numberOne);
        return result;
    }
    
    public double log10() {
        result = 0;
        result = Math.log10(numberOne);
        return result;
    }       
    
    public double max() {
        result = 0;
        result = Math.max(numberOne,numberTwo);
        return result;
    }       
    
    public double min() {
        result = 0;
        result = Math.min(numberOne,numberTwo);
        return result;
    }
    
    public double sin() {
        result = 0;
        result = Math.sin(numberOne);
        return result;
    }    
    
    public double sinh() {
        result = 0;
        result = Math.sinh(numberOne);
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
