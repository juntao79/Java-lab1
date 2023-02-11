//standard Algonquin header here

/**
*
* Student Name: Juntao Zhang
* Student Number: 041058759
* Course & Section #: 23W_CST8288_301
* Professor: Dr. Rama Thavasinadar
* Declaration:
* This is my own original work and is free from plagiarism.
* 
*/
package lab1;
/**
 *main class for unit converter test.
 * 
 * file name: UnitConverterTest.java
 * @author Juntao Zhang
 * @since java 1.8
 * @version 20230127-1
 * 
 */
import pkgUnitCoverter.*;
import pkgUnitCoverter.FCconverter;
import pkgUnitCoverter.CFconverter;
/**
 * simple class to test 2 classes for converting Fahrenheit to Celsius and the reverse
 * @author Juntao Zhang
 */
public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
	UnitConverter uc = new UnitConverter();
          
	//FCconverter FtoC = new FCconverter();
	System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, uc.convert(70));
	
        
        uc.changeBehaviourTo(new CFconverterBehaviour());
	//CFconverter CtoF = new CFconverter();
      	System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, uc.convert(20));
		
        
          uc.changeBehaviourTo(new KMconverterBehaviour());
	//CFconverter CtoF = new CFconverter();
      	System.out.printf("%5.2f in Miles is %5.2f Kilometer\n", 100.0, uc.convert(100));
		
        
         uc.changeBehaviourTo(new MKconverterBehaviour());
	//CFconverter CtoF = new CFconverter();
      	System.out.printf("%5.2f in Kilometer is %5.2f Miles\n", 100.0, uc.convert(100));
		
	}

}
