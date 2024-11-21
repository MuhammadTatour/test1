package ex1_1_QA_2024.ex1_1_QA_2024;

// מוחמד טאטור 212017156
// פארס עאנק 324008796

public class question4 {
	
	public static String Compare(int a, int b, String mod)
	{
		double aVal = a;
		double bVal = b;
		
		switch(mod) {
			//Regular Comparison If a Smaller Than b Return B Else Return A 
			case("Regular"):
				if(a < b)
					return "B";
				else 
					return "A";
			//Negative Comparison If -a Smaller Than -b Return B Else Return A
			case("Negative"):
				if(-a < -b)
					return "B";
				else
					return "A";
			
			case("Reciprocal"):
				//Error!, Division By Zero Is Not Allowed => Throw An Exception 
				if((a == 0) || (b == 0)) {
					throw new ArithmeticException("Error: Division By Zero Is Not Allowed.!");
				}
				//Insert The Numbers Into Double Variables
				else {
					aVal = 1/a;
					bVal = 1/b;
				}
			
				break;
			//Another Case, Just Break The Switch Case Function
			default:
				break;
		
		}
		
		//Check The Larger Number Between 1/a And 1/b, If They Are The Same Return A
		
		if(aVal < bVal)
			return "B";
		
		else if(aVal > bVal)
			return "A";
		
		else
			return "A";
			
	}
}
