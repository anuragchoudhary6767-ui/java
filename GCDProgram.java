// import java.util.Scanner;

// public class GCDProgram {
//     // Method to compute GCD using Euclidean Algorithm
//     public static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;  // remainder
//             a = temp;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input two numbers
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         // Compute and display GCD
//         int result = gcd(num1, num2);
//         System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

//         sc.close();
//     }
// }




static int gcd (int a,int b){
    if (b==0){
        return a;
    }
    return gcd(b,a%b);
}
public static void main(String[] args){
    int a=12;
    int b=18;
    System.out.println(gcd(a,b));
}
