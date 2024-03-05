import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("Enter the Student ID:");
            String istudentID=scanner.nextLine();

            System.out.println("Enter the Student name:");
            String studentName=scanner.nextLine();

            System.out.println("Enter the number of extra activities:");
            int numExtraActivities=scanner.nextInt();
            scanner.nextLine();
            
            Student student=new Student(istudentID, studentName, numExtraActivities);

            for(int i=0;i<numExtraActivities;i++){
                System.out.println("Enter extra activities"+(i+1)+":");
                String activity=scanner.nextLine();
                student.addExtraActivities(i, activity);
            }

            System.out.println("Student details:"+student);
            System.out.println("Do you want to enter another student?");
            String continuelnput=scanner.nextLine().toLowerCase();
            
            if(!continuelnput.equals("yes")){
                break;
            }
        }

        scanner.close();
    }
}
