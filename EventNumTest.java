class EventNumTest{
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        int number =53;
        boolean ans= isEven(number);
        if(ans==true){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is not even");
        }
    }
}