import java.util.*;
public class powerof{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number");
        int user_num= input.nextInt();
        poweroffunc(user_num);
    }
    public static void poweroffunc(int a){
        int temp=a, flag=0;
        while(temp!=0 && temp!=1){
            if(temp%4 !=0){
                flag=1;
                break;
            }else{
                temp=temp/4;
            }
        }
        if(flag==0){
        System.out.println("The number is a power of 4");
        }else{
            System.out.println("The number is not a power of 4");
        }
    }
}