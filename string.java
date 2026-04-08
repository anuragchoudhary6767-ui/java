// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();   
//         int m = sc.nextInt();             // size of matrix
//         int[][] arr = new int[n][n];       // declare matrix

//         // Input matrix elements
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         // Print matrix (optional)
//         System.out.println("Matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // Calculate sum of diagonal
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += arr[i][i];   // main diagonal
//         }

//         System.out.println("Sum of diagonal = " + sum);
        
//         int d=6;
//         boolean flag=false;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(arr[i][j]==d){
//                     flag=true;
//                     System.out.println("Element found at position: (" + i + ", " + j + ")");
//                     break;
//                 }
//             }
//         }
//         if (flag) {
//         System.out.println("Element found: " + flag);
//         }
//     }
// }




// import java.util.Scanner;

// Scanner sc = new Scanner(System.in);

// int [][]arr={
//     {1,2,3},
//     {4,5,6},
//     {7,8,9}
// };
// int top=0;
// int bottem=arr.length-1;
// int left=0;
// int right=arr[0].length-1;

// //stap 1  left to rigt

// while(top<=bottem && left<=right)
//     {
//     for(int i=left;i<=right;i++)
//         {
//         System.out.print(arr[top][i]+" ");
//         }
//     top++;
//     //stap 2 top to bottem
//     for(int i=top;i<=bottem;i++){
//         System.out.print(arr[i][right]+" ");
//     }
//     right--;
//     if(top<=bottem){
//         for(int i=right;i>=left;i--){
//             System.out.print(arr[bottem][i]+" ");
//         }
//         bottem--;
//     }
//     if(left<=right){
//         for(int i=bottem;i>=top;i--){
//             System.out.print(arr[i][left]+" ");
//         }
//         left++;
//     }
// }




public class string{
    public static void main(String[] args){
         String Str1= "hii";
         String Str2="hello";
         System.out.println(Str1);
        

    }
}


