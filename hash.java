import java.util.HashSet;
class hello  {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,2};
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(2); // Duplicate element, will not be added

        // System.out.println("HashSet elements: " + set);
    }
    
}
