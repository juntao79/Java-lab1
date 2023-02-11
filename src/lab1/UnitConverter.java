/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
*
* Student Name: Juntao Zhang
* Student Number: 041058759
* Course & Section #: 23W_CST8288_301
* Professor: Dr. Rama Thavasinadar
* Declaration:
* This is my own original work and is free from plagiarism.
* 
* 
* 
*/
package lab1;
/**
 *class that represents  in the Strategy Design Pattern
 * 
 * file name: UnitConverter.java
 * @author Juntao Zhang
 * @since java 1.8
 * @version 20230127-1
 * 
 */

public class UnitConverter {
    //private double convert;
    private ConverterBehaviour converterBehaviour;
    
    /**
     * no-arg constructor initializes converter behaviour/strategy to that of a
     * temperature convert.
     */       
    public UnitConverter(){
        this.converterBehaviour = new FCconverterBehaviour();        
    }

    /**
     * constructor for convert unit
     * 
     * @param args
     * @return 
     */
    public double convert(double args){
         return this.converterBehaviour.convert(args);
    }    
    
    /**
     *for change converter behaviour.
     * @param accountBehaviour
     */
    public void changeBehaviourTo(ConverterBehaviour converterBehaviour){
        this.converterBehaviour=converterBehaviour;
    }
    
}
