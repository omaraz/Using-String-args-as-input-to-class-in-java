import java.util.Scanner; //to use scanner to get data from the user

/* our objective is to pass data 
while call the code to runusing cmd
*/

//the class name with the main must be the same as file name
class Example1{
	public static void main(String args[]){ 
		//create a new scanner
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Omar Aziz");
		//String name = scan.nextLine();
		
		if(args != null){//check if the array of strings is not empty
			System.out.println("The name you entered: "+ args[0]); //print Firststring
			int userint = Integer.parseInt(args[1]); //we use the second string as integer so change its type to integer
			for(int i = 0 ; i<userint ; i++){ //loop with it to print empty line to print the third input after these number of lines 
			System.out.print("\n");				

			}
			System.out.printf("You enter number = %d \n %s",userint ,args[2]); //print the third argument
		}else
			System.out.println("The input is empty!!");//if it called and no parameters passed
		
	}
}
