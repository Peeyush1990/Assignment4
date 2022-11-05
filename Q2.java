class Employee{
    String name;
    int year;
    String address;
    
     void print(){
        System.out.println(name+"   "+year+"    "+address);
     }
    
     Employee(String name,int year,String address){
        this.year=year;
        this.name=name;
        this.address=address;
     }
    }
    
    public class Q2 {
        public static void main(String args[]){
        Employee e1=new Employee("Robert", 1994, "64C- WallsStreat");
        Employee e2=new Employee("Sam",2000, "68D- WallsStreat");
        Employee e3=new Employee("John", 1999, "26B- WallsStreat");
        System.out.println("Name"+"    "+"Year of joining"+"    "+"Address");
        e1.print();
        e2.print();
        e3.print();
        }
    }