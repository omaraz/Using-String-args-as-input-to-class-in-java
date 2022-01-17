import java.util.Scanner;

class Example1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Omar Aziz");
		//String name = scan.nextLine();
		
		if(args != null){
			System.out.println("The name you entered: "+ args[0]);
			int userint = Integer.parseInt(args[1]);
			for(int i = 0 ; i<userint ; i++){
			System.out.print("\n");				

			}
			System.out.printf("You enter number = %d \n %s",userint ,args[2]);
		}else
			System.out.println("The input is empty!!");
		/*System.out.print("Enter a word: ");
		String userinput = scan.nextLine();
		System.out.print("Enter the line differance = ");
		int userint = scan.nextInt();
		System.out.println("You entered : " + userinput);
		for(int i = 0 ; i<userint ; i++){
			System.out.print("\n");				

			}
		System.out.printf("You enter number = %d \n %s",userint ,userinput);*/
	}
}