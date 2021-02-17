
public class TestCalculator {

	public static void main(String[] args) {
		// use this as caller method
    showMessage();
    // call function with Argument 
    displayAuthor("Mahesh");
    // call add function
    add(100,200);
    
	}
	//Zero parameterized function
	public static void showMessage() {
		System.out.println("::Welcom to TestCalculator::");
	}
	
	// one paramaterised function ex string name
	public static void displayAuthor(String name) {
		System.out.println("::@Athor:-"+name+" @email:- madhu@gmail.com::");
	}
	
	// access modifier, return type, identifier, paranthes(),{ method body
		//Two Parameter function	
	public static void add(int num1, int num2) {
		float result = num1+num2;	
		System.out.println("Addition::"+result);
		
	}
	
	public static void sub(int num1, int num2, String action) {
		float result = num1-num2;
	System.out.println(action+"::"+result);
	}
	

}
