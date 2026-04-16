public class power_rec {
    public static void main(String[] args){
        int x=4;
        int n=2;
        System.out.println(power(x,n));
    }
    
    public static int power(int x,int n)
    
    {
        if (n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    
}
