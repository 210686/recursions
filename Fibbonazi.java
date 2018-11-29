public class Fibbonazi{
    public static void main(){
        System.out.print("\f");
        System.out.print(Fibbonazi(12));
    }
    public static int Fibbonazi (int n){
        if(n==0){return 0;}
        else if(n==1){return 1;}
        else{return Fibbonazi(n-1)+Fibbonazi(n-2);}
    }
}