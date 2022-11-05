import java.util.Scanner;
class Number{
    private double number;
    
    Number(double x){
        number=x;
    }
    boolean isZero() { return number==0; }
    boolean isPositive() { return number>0; }
    boolean isNegative() { return number<0; }
    boolean isOdd() { return number%2==1||number%2==-1; }
    boolean isEven() { return number%2==0; }
    boolean isPrime(){
        int x=(int)number;
        if(x!=number) return false; //fractional numbers are not prime
        if(x<0||x==1) return false; //negative numbers are not prime
        for(int i=2;i<Math.sqrt(x);i++){
             if(x%i==0) return false;
        }
        return true;
    }

    int power(int x,int y){
        if(y==0) return 1;
        if(y%2==0) return power(x,y/2)*power(x,y/2);
        return x*power(x,y/2)*power(x,y/2);
    }
    boolean isAmstrong(){
        int temp=(int)number;
        if(temp!=number) return false; //fractional numbers are not amstrong
        int x=0; //number of digits
        while(temp>0){ x++; temp=temp/10; }
        temp=(int)number;
        int sum=0;
        while(temp!=0){
            int r=temp%10;
            sum=sum+power(r,x);
            temp=temp/10;
        }
        return (sum==number); // If satisfies Armstrong condition
    }

    double getFactorial(){
        int temp=(int)number;
        if(temp!=number||temp<0) return 0.0; //factorial not defined for fractional numbers
        if(temp<=1) return temp;
        double ans=1.0;
        while(temp>0){
            ans*=temp;
            temp--;
        }
        return ans;
    }

    double getSqrt(){
        return Math.sqrt(number);
    }

    double getSqr(){
        return number*number;
    }

    double sumDigits(){
        double x=number;
        while(x!=Math.floor(x)){
            x*=10.0;
        }
        double sum=0.0;
        while(x!=0.0){
            sum+=x%10;
            x/=10.0;
        }
        return sum;
    }
 
   double reverse(){
    int temp=0,x=(int)number;
    while(x!=0){
        temp=temp*10+x%10;
        x=x/10;
    }
    return temp;
   }

   void listFactor(){
     for(int i=1;i<=Math.sqrt(number);i++){
        if(number%i==0) System.out.print(i+" ");
     }
   }

   void dispBinary(){
    System.out.println(Integer.toBinaryString((int)number));
   }
}
public class Q3 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     double d=sc.nextDouble();
     Number n=new Number(d);
     sc.close();
    }
}