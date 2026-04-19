



// import java.util.ArrayList;

// import java.util.Iterator;
// import java.util.ListIterator;

// public class hello
// {
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         ListIterator<Integer> it = list.listIterator();
//         while (it.hasNext()){
//             Integer x=it.next();
//             System.out.println(x);
//         }
//          System.out.println();


       
//     }
       
       
    
// };






// import java.util.ArrayList;

// import java.util.Iterator;
// import java.util.ListIterator;

// public class hello{
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);

//         Iterator<Integer> iterator = list.iterator();
//         while (iterator.hasNext()) {
//         System.out.println(iterator.next());
//         if(iterator.next() == 6) {
//             iterator.remove();
//         }
//     }
//     System.out.println("After removal:");
// }
// };




// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.ListIterator;
// // import ArrayList;

// public class hello{
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(6);
//         list.add(7);
//         list.add(8);
     
//         ListIterator<Integer> it = list.listIterator();
//         while (it.hasNext()){
//             Integer x=it.next();
//             if(x==7){
//                 // it.add(7);
//                 it.set(10);
//             }
//             System.out.println(x);
//         }
//          System.out.println(list);
//     }
// }









// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.ListIterator;

// public class hello{
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(-1);
//         list.add(4);
//         list.add(-7);
//         list.add(9);
     
//         ListIterator<Integer> it = list.listIterator();
//         while (it.hasNext()){
//             Integer a=it.next();
//             if(a<0){

//                 int value=a*(-1);
//                 it.set (value);
//                 // it.add(10);
//                 // it.remove();

//             }
//             System.out.println(a);
//         }
//          System.out.println(list);
//     }
// }








// public class hello{
//     public static void main(String[]args){
//         StringBuilder sb=new StringBuilder("Hello");
//         sb.append(" World");
//         System.out.println(sb);
        
//     }


// }





// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.ListIterator;
// // import ArrayList;

// public class hello{
//     public static void main(String[] args) {
//       listIterator<Integer> list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         list.add(9);
//         list.add(10);

     
//         ListIterator<Integer> it = list.listIterator();
//         while (it.hasNext()){
//             Integer x=it.next();
//             if(x==7){
//                 // it.add(7);
//                 it.set(10);
//             }
//             System.out.println(x);
//         }
//          System.out.println(list);
//     }
// }







// class hello{
//     public static void main(String[]args){
//         System.out.println("hello");
//         try{
//             int a=5;
//             int b=0;
//             int c=a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("buyye");
//         }
//     }
// }



// import java.util.Arrays;
// class hello{
//     public static void main(String[]args){
//         System.out.println("hello");
//         int arr[5]={1,2,3,4,5};
//         try{
//             arr [3]=5;
//             System.out.println(arr[3]);
//         }
//         catch(ArithmeticException e){
//             System.out.println("buyye");
//         }
//     }
// }




// public class hello {
//     public static void main(String[]args){
//         System.out.println("hello");
// try{
// String str=null;
// System.out.println(str);
// }catch(NullPointerException e){
//     System.out.println("byee");
// }finally{
//     System.out.println("I am always executed");
//    }
//   }
// }



// class hello
// {
//     public static void main(String[]args)
//     {
//         System.out.println("hello");
//        try{
//         voteAge(19);
//        }catch(Exception e){
//         System.out.println(e);
//        }
//         try{
//             voteAge(15);
//            }catch(Exception e){
//             System.out.println(e);
//            };
//         }

//      static void voteAge(int age){
//     System.out.println("Your age is ");
//     if(age<18){
//         throw new ArithmeticException("You are not eligible to vote");
//     }else{
//         System.out.println("You are eligible to vote");
//     }
// }
 
// };



// class slidingWindow{
//     public static void main(String[]args){
//         int arr[]={1,2,3,4,5};
//         int k=3;
//         int n=arr.length;
//         int maxSum=0;
//         for(int i=0;i<k;i++){
//             maxSum+=arr[i];
//         }
//         int windowSum=maxSum;
//         for(int i=k;i<n;i++){
//             windowSum+=arr[i]-arr[i-k];
//             maxSum=Math.max(maxSum,windowSum);
//         }
        
            
// }
// };





// public class hello{
//     public static void main(String[]args){
//         try{
//             riskyMethod();

//         }catch (Exception e){
//             System.out.println("Exception caught in main: "+e.getMessage());
//         }
//         System.out.println("Program continues...");
//     }
//     static void riskyMethod() throws Exception{
//         System.out.println(" riskyMethod start");
//         int result=10/0;
//         System.out.println("result: "+result);
        
//         throw new Exception("Something went wrong in riskyMethod");
//     }
// }




// import java.io.*;

// public class filecreation {
//     public static void main(String[] args) {
//         File file = new File("try.py");//code file banane ke liaa is code ka use hota hai
//         try {
//             if(file.createNewFile()){//createnewfile() se hi file create hoti hai
//                 System.out.println("file crreated ");
//             }else{
//                 System.out.println("file already created ");
//                 System.out.println(file.getPath());
//             }
//         } catch (Exception e) {
            
//             System.out.println(e);
//         }
//     }
   


// }






// import java.io.FileWriter;

// public class hello {
    
//     static void writedata(String data) {
//         try {
//             FileWriter writer = new FileWriter("New.txt");
//             writer.write(data);
//             writer.close();
            
//         } catch (Exception e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }





// import java.io.FileReader;

// public class hello {
// static void FileRead(){
//     try{
//         FileReader reader=new FileReader("New.txt");
//         int ch;
//         while((ch=reader.read())!=-1){
//             System.out.print((char)ch);
//         }
//         // reader.close();
//     }catch(Exception e){
//         System.out.println(e);
//     }
// }
// };






// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         // input array
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         int currentSum = nums[0];
//         int maxSum = nums[0];

//         // traverse from second element
//         for (int i = 1; i < n; i++) {

//             // either extend previous subarray or start new
//             if (currentSum + nums[i] > nums[i]) {
//                 currentSum = currentSum + nums[i];
//             } else {
//                 currentSum = nums[i];
//             }

//             // update maximum sum found so far
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//         }

//         System.out.println(maxSum);
//     }
// }





// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         int low = 0, mid = 0, high = n - 1;

//         while (mid <= high) {
//             if (nums[mid] == 0) {
//                 // swap nums[low] and nums[mid]
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             } else if (nums[mid] == 1) {
//                 mid++;
//             } else { // nums[mid] == 2
//                 // swap nums[mid] and nums[high]
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }





// import java.util.Scanner;
// import java.util.HashMap;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         // array input
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         int target = sc.nextInt();

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < n; i++) {

//             int required = target - nums[i];

//             // agar required number pehle aa chuka hai
//             if (map.containsKey(required)) {
//                 System.out.println(map.get(required) + " " + i);
//                 return;
//             }

//             // current number ko map me store karo
//             map.put(nums[i], i);
//         }
//     }
// }



// import java.lang.reflect.Array;
// import java.util.ArrayList;

// class MargeSortTempArrayList{
//     static void mergesort(int arr[],int l,int r){
//        if (l>=r) return;
//         int mid=(l+r)/2;
//         mergesort(arr,l,mid);
//         mergesort(arr,mid+1,r);
//         merge(arr,l,mid,r);
//     }
    
//     static void merge(int arr[],int l ,int m,int r){
//     ArrayList<Integer> temp=new ArrayList<>();
//     int i=l;
//     int j=m+1;
//     while(i<=m && j<=r){
//         if(arr[i]<=arr[j]){
//             temp.add(arr[i]);
//             i++;
//         }else{
//             temp.add(arr[j]);
//             j++;
//         }
//       }
//     }

// };


// public static void main(string[]args)[

// ]



class hello{
   static   int N=4;
     static void  draw(){
        char arr[][]=new char[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]='.';
            }

        }
        solve(arr,0);

    }

    static void print(char arr[][]){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j] );
            }
            System.out.println();
        }
        System.out.println();


    }
    static  void    solve(char arr[][],int row){
        if(N==row){
            print(arr);
            return;
        }
        for(int col=0;col<N;col++){
            if(isSafe(arr,row,col)){
                arr[row][col]='Q';
                solve(arr, row+1);
                arr[row][col]='.';
                
            }
        }

    }
     static  boolean  isSafe(char arr[][],int row,int col){
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q'){
                return  false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return  false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<N;i--,j++){
            if(arr[i][j]=='Q'){
                return  false;
            }
        }
        return  true;
     }


    public static void main(String[] args) {
        draw();
        
    }
}