
public class privious_grater_element {
    public static void main(String[] args) {
        System.out.println("This is a previous greater element class.");
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println("The previous greater element is:");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}