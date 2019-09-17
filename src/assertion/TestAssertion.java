package assertion;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestAssertion {

    public static void main(String[] args) {

        int x =10;
        int z =8;

        int a =9;
        int b=12;

        //Hard Assert
        //( ActualValue,expectedValue)
        Assert.assertEquals(x,z,"assertion failed");


        //Soft Assert
        SoftAssert  softAssert =new SoftAssert();
        System.out.println("test");
        softAssert.assertEquals(a,b,"message failed");
        softAssert.assertAll();

        //if(x==z){
            //System.out.println("matched");
       // }else System.out.println("didn't matched");

    }
}
