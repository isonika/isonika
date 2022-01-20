public class Method {
	
	public static void MyMethod(){   //create method with name MyMethod followed by parantheses ()
		System.out.println("Printed Successfully");
		}
//Passing Parameter to the method		
    public static void MyName(String fName){
	System.out.println(fName+ "Poudel");
	}
    
//passing multiple parameter to the method
    static void MyNameAge(String Name ,int age){
	System.out.println("Name is " + Name + " & Age is " +age );
	}
//Return value instead of void use primitive data type
    static int Age(int x){
		return 5+x;
		}
//Return sum of methods two parameter
    static int num(int x , int y ){
		return x+y;
		}
//method with if..else 
	static void CheckNum(int age){
		if(age < 18)
	 { 
      System.out.println("Sorry You are not old enough");
	 }
		else
		{
	      System.out.println("Access Granted");
	    }
		
	}
//Method Overloading
	static int addNum(int x,int y){
		return x+y;
		}
	static double addNum(double x, double y){
		return x+y;
		}


	public static void main(String[] args)
	{
		MyMethod();  //calling a method 
		MyMethod();  //method can be called multiple times
		MyMethod();
		MyName(" Prabhat ");
		MyName(" Sonika ");
		MyName(" Anvi ");
		MyNameAge("Prabhat" , 33);
		MyNameAge("Sonika", 31);
		MyNameAge("Anvi", 2);
		
		System.out.println("Age will be " + Age(2) + " in 5 years");  
		
		System.out.println(num(13,15));  //sum of 13 and 14
		
		CheckNum(19); //if else 
		
		 System.out.println("int: " + addNum(12,13));    
		 System.out.println("Double: " + addNum(12.12, 13.13));
		}
	
		
}
