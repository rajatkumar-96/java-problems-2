class member{
    private String Name;
    private int Age;
    private int Salary;
    member(String Name,int Age,int Salary){
        this.Name=Name;
        this.Age=Age;
        this.Salary=Salary;

    }
    public  void display1(){
        System.out.println("Name:"+this.Name+ " Age:"+this.Age+ "  Salary:"+this.Salary);
    }
}

    class membervariable{
        public static void main(String[] args) {
           member new1= new member("rajat",21,32000);
                new1.display1();

        }
        

    }