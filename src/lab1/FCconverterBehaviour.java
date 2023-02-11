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
 *This file implement from Interface ConverterBehaviour, give a Fahrenheit value equivalent to Celsius.
 * 
 * file name: FCconverterBehaviour.java
 * @author Juntao Zhang
 * @since java 1.8
 * @version 20230127-1
 * 
 */
public class FCconverterBehaviour implements ConverterBehaviour{
	/**
         * give a Fahrenheit value, convert to Celsius.
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */     
    
    
    private final double convFactor=1.8;
    private final double convOrigin=32.0;
	
  /**
   * 
   * override abstract class.
   * @param fahrenheit 
   * @return return Celsius 
   */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
  
}
