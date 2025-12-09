



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




public class hello {
    public static void main(String[]args){
        System.out.println("hello");
try{
String str=null;
System.out.println(str);
}catch(NullPointerException e){
    System.out.println("byee");
}finally{
    System.out.println("I am always executed");}

    
    }
}


