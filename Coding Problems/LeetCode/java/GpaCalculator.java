import java.util.Scanner;

public class GPACompute {
    public static void main(String[] args) {
        String[] course={"PF","OOP","Discrete","DSA","DB","CC","ST2"};
        String[] input = new String[7];
        int[] credit = {2,3,3,3,2,3,3};
        
        System.out.println("-----GPA Calculation-----");     
        Scanner kb = new Scanner(System.in);
        	
        java.text.DecimalFormat dfm = new java.text.DecimalFormat("0.00");
        
        double grade = 0;
        double total = 0;
        int sum = 0;
        for(int i=0; i<7;i++){
        	System.out.print(course[i] + ": ");
			input[i] = kb.nextLine();
		
			if(input[i].equalsIgnoreCase("A")){
				grade = 4;
			}else if(input[i].equalsIgnoreCase("B+")){
				grade = 3.5;
			}else if(input[i].equalsIgnoreCase("B")){
				grade = 3;
			}else if(input[i].equalsIgnoreCase("C+")){
				grade = 2.5;
			}else if(input[i].equalsIgnoreCase("C")){
				grade = 2;
			}else if(input[i].equalsIgnoreCase("D+")){
				grade = 1.5;
			}else if(input[i].equalsIgnoreCase("D")){
				grade = 1;
			}else{
				grade = 0;
			}		
			total = total + (grade * credit[i]);
			sum = sum+=credit[i];	
        }
			System.out.println("Your GPA : " + dfm.format(total/sum));
    }
}
