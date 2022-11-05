import java.util.Vector;
import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
    System.out.print("Enter the size of vector: ");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    
    Vector<String> v=new Vector<String>(size);
    while(true){
        if(v.size()==v.capacity()) break;
    System.out.print("Enter 1 to add elemet or -1 to exit: ");
    int x1=sc.nextInt();
     if(x1==-1) break;
     System.out.print("Enter string: ");
     String s=sc.next(); 
    v.addElement(s);
    }
    sc.close();
    for(int i=0;i<v.size();i++) 
    System.out.println(v.elementAt(i));
    } 
}