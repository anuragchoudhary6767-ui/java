// public class print_num {
//         public static void main(String[] args){
//             printnumber(-5);
//             printnumber1(-5);
//         }

//     static void printnumber(int n){
//         if(n>0){
//             return;
//         }
//         System.out.println(n);
//         printnumber(n+1);
//     }
//     static void printnumber1(int n){
//         if(n>0){
//             return;
//         }
//         printnumber1(n+1);
//         System.out.println(n);
//     }
    
// }



public class print_num {

        public static void main(String[] args){
            print_num(1);
        }
    public static void printnumber(int n){
        if (n>10){
            return;

        }
        System.out.println(n);
        printnumber(n+1);

       
    }
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void print_num(int n){
        printnumber(1);
        System.out.println(fact(5));
    }
}    