package class10;

public class parent {
    int x=10;
    parent(){
        
        System.out.println("parent class a"+" "+x);
    }
    
}



class child extends parent{
    int x=20;
    child(){
        
        System.out.println("child class b"+" "+this.x);
        System.out.println("child class b"+" "+super.x);
    }
    


void show(){
    int x=30;
    System.out.println("local x="+x);
    System.out.println("parent a="+this.x);
    System.out.println("super.x="+super.x);
}


    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}

