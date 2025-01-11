import java.util.Scanner;
public class studentGradeCalc {

	public static void main(String[] args) {
		  Scanner std = new Scanner(System.in);
		  
		  // input number of subjects and marks
		  System.out.print("Enter the Number of Subject: ");
		  int n = std.nextInt();
		  int total = 0;
		  System.out.println("Enter marks for each subjects");
		  for(int i = 1; i<=n; i++)
		  {
			  System.out.print(i+" Subject Number: ");
			  total+=std.nextInt();
		  }
		  
		  //Calculate average percentage
		  double avg = total/n;
		  
		    String grade;
		  if(avg>=90)
		  {
			  grade = "A+";
		  }else if(avg>=80)
		  {
			  grade = "A";
		  }else if(avg>=70)
		  {
			  grade = "B";
		  }else if(avg>=60)
		  {
			  grade = "C";
		  }else if(avg>=50)
		  {
			  grade = "D";
		  }else{
			  grade = "F";
		  }
		  
		  //Result Display
		  
		  System.out.println("Total marks is: "+total);
		  System.out.println("Average Percentage is: "+avg+"%");
		  System.out.println("Grade is :"+grade);
    
	}

}
