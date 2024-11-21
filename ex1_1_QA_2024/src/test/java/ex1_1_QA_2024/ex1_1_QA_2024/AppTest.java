package ex1_1_QA_2024.ex1_1_QA_2024;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	question4 tester = new question4();
    /**
     * Rigorous Test :-)
     */
	
	/* Test Regular Comparison (2 Positive Cases)*/
	
    @Test
    public void Test_case_1(){
    	String Expected_result = "A";
    	int a = 974, b = 244;
    	String mod = "Regular";
    	String actual_result = tester.Compare(a, b, mod);
    	assertEquals(Expected_result, actual_result);
    }
    
    @Test
    public void Test_case_2() {
    	String Expected_result = "B";
    	int a = -30, b = -1;
    	String mod = "Regular";
    	String actual_result = tester.Compare(a, b, mod);
    	assertEquals(Expected_result, actual_result);
    }
    
    
    /* Test Negative Comparison (2 Positive Cases) */
    
    @Test
    public void Test_Case_3() {
    	String Expected_result = "B";
    	int a = 100, b = 50;
    	String mod = "Negative";
    	String actual_result = tester.Compare(a, b, mod);
    	assertEquals(Expected_result, actual_result);
    }
    
    @Test
    public void Test_Case_4() {
    	String Expected_result = "A";
    	int a = -99, b = -56;
    	String mod = "Negative";
    	String actual_result = tester.Compare(a, b, mod);
    	assertEquals(Expected_result, actual_result);
    }
    
    /* Test Reciprocal Comparison (2 Positive Cases, 1 Negative Case) */
    
    @Test
    public void Test_Case_5() {
    	String Expected_result = "B";
    	int a = 2, b = 1;
    	String mod = "Reciprocal";
    	String actual_result = tester.Compare(a, b, mod);
    	assertEquals(Expected_result, actual_result);
    }
    
    @Test
    public void Test_Case_6() {
    	String Expected_result = "A";
    	int a = -17, b = -74;
    	String mod = "Reciprocal";
    	String actual_result = tester.Compare(a, b, mod);
    	assertEquals(Expected_result, actual_result);
    }
    
    @Test
    public void Test_case_7() {
    	int a = 0, b = 47;
    	String mod = "Reciprocal";
    	assertThrows(ArithmeticException.class, () -> // A Lambda Expression That Includes Method Call Expected To Throw The Exception
    	{
    		tester.Compare(a, b, mod); 
    	});
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
