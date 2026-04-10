public class remove_cher {
    public static void main (String[]args)
    {
        String str1="abc";
        char remove='a';
        String result ="";
        for (int i=0;i<str1.length();i++)
        { 
            if(str1.charAt(i)!=remove)
            {
                result+=str1.charAt(i);
            }
        // str1=str1.replace(remove,"");
        // System.out.println(str1);
       
        System.out.println(result);
       }
    }
}