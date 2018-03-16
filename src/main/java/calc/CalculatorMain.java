package calc;

public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	}
	//missing function for subtraction test.
	public int sub(int a, int b){
		return a-b;
	}
        //function for multiplication
       public int mul(int a, int b){
    	return a*b; 
	}

        //function for div test and division exception for zero
       public int div(int a, int b){
    	   if(b!=0)
    			return a/b;
    	   else
    		   return 0;
	}
      //function for exponent
       public int pwr(int a, int b){
   		return (int)Math.pow(a,b);
   	}
      
}
