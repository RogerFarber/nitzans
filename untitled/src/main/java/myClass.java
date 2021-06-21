import java.util.ArrayList;
import java.util.List;

public class myClass {
    public String printMe(){
        return "Hello worls";
    }
    public static void main(String[] args) {
        myClass obj = new myClass();
        
        System.out.println(obj.printMe());
    }
}
