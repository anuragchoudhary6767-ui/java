public class numeric_cher {
    public static void main(String[] args){
        String str1="12345abc";
        
        boolean isNum=true;
        for (int i=0;i<str1.length();i++){
            if (str1.charAt(i)<'0' || str1.charAt(i)>'9'){
                isNum=false;
                break;
            }
        }
        if (isNum){
            System.out.println(str1+" is a numeric string.");
        } else {
            System.out.println(str1+" is not a numeric string.");
        }
    }
}