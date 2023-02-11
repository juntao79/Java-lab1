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
 *This file implement from Interface ConverterBehaviour, give a mileage value of Miles equivalent to Kilometer.
 * 
 * file name: KMconverterBehaviour.java
 * @author Juntao Zhang
 * @since java 1.8
 * @version 20230127-1
 * 
 */

public class KMconverterBehaviour implements ConverterBehaviour{
       private final double convFactor=1.61;
        
    	/**
         * 
         * override abstract class.
	 * @param mileage value in mileage to be converted
	 * @return equivalent in Kilometer
	 */    
    @Override
    public double convert(double mileage) {
      
       return mileage*convFactor;
       
    }
}
