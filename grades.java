import java.util.*;
public class grades{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of students");
        int numofstu= input.nextInt();
        int[] grades= new int[numofstu];
        for(int i=0;i<numofstu;i++){
            System.out.println("Enter the grade of student"+i+":");
            grades[i]=input.nextInt();

        }
        Arrays.sort(grades);
        maximum(grades,numofstu);
        minimum(grades,numofstu);
        average(grades,numofstu);

    }
        
        public static void maximum(int[] a,int b){
            System.out.println("Maximum marks"+a[b-1]);
        }
        public static void minimum(int[] a, int b){
            System.out.println("Minimum marks"+a[0]);
        }
        public static void average(int[] a, int b){
            float sum=0;
            for(int j=0;j<b;j++){
              sum=sum+a[j];  
            }
            System.out.println("Average marks"+ (sum/b));
        }
    
}