package assertion;

import org.testng.Assert;

public class Testcalculator {

    public static void main(String[] args) {

        Calculator calculator =new Calculator();
         int value = calculator.addition(10,20);

         Assert.assertEquals(value,32,"calculator failed");

         int value2 = calculator.addition(6,9);
         int value3 = calculator.addition(3,7);
         int value4 = calculator.addition(8,5);

         //Assert the value2, value3,value4 using softAssert

    }
}
