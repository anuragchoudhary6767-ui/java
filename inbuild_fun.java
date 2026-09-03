// class main{
//     public static void main(String[] args) {
//         // is string ko change kr sakte hai
//         StringBuilder str = new StringBuilder(str:"hello");
//         str.append(str" world");
//         str.insert(2,"qq");
//         str.reverse();
//         str .delete(2,4);
//         str.replace(2,4,"yy");
//         System.out.println(str.length());
//         System.out.println(str.capicity());
//         System.out.println(str);

//     }
// }
// class inbuild_fun{
//     public static void main(String[] args) {
//         String str = "hello world";
//         System.out.println(str.toUpperCase());
//         System.out.println(str.toLowerCase());
//         System.out.println(str.replace("world","java"));
//         System.out.println(str.substring(0,5));
//         System.out.println(str.indexOf("o"));
//         System.out.println(str.charAt(4));
//         System.out.println(str.contains("hello"));
//     }
// }


// class main{
//     public  static void main(String[] args){
//     String str1=" i love java ";
//     String a[]=str1.split(" ");
//     StringBuilder result=new StringBuilder();
//     for(String i :a)
//     {
//         StringBuilder data= new StringBuilder(i);
//         result.append(data.reverse()).append(" ");
        
//     }
//     System.out.println(result);
//     }
// }

// class main{
//     public  static void main(String[] args){
//     String str=" aabbcc ";
//     StringBuilder result=new StringBuilder();
//     int count=1;
//     for(int i=1;i<str.length();i++)
//     {
//         if(str.charAt(i)==str.charAt(i-1))
//         {
//             count++;
//         }
//         else{
//             result.append(str.charAt(i-1).append(count));
//             count=1;

//         }
//     }
//     System.out.println(result);
//     }
// } 


class Main {
    public static void main(String[] args) {
        String str = " aabbcc ";
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        // आखिरी character और उसकी गिनती जोड़ना न भूलें
        result.append(str.charAt(str.length() - 1));
        result.append(count);

        System.out.println(result);
    }
}








