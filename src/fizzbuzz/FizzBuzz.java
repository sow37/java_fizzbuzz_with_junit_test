package fizzbuzz;

public class FizzBuzz {
	public static boolean isMultipleOfThree(int n){
		//n is a multiple of 3 if the remainder of the integer division of n by 3 is 0
		if(n%3 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isMultipleOfFive(int n){
		//n is a multiple of 5 if the remainder of the integer division of n by 5 is 0
		if(n%5 == 0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		final int NUM = 100;
		for (int i = 1; i <= NUM; i++) {
			if(isMultipleOfThree(i) && isMultipleOfFive(i)){
				System.out.println("FizzBuzz");
			}else if(isMultipleOfThree(i)){
				System.out.println("Fizz");
			}else if(isMultipleOfFive(i)){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}

}
