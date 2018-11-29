public class Factorial{
    public static void main(){
        System.out.print("\f");
        System.out.print(Factorial(12));
    }
    public static int Factorial (int n){
        if(n==0){return 1;}
        else{return n*Factorial(n-1);}
    }
}