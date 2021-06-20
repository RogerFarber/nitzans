public class my_Print {
    public String Printme(){
        return "Hello Word!";
    }

    public static void main(String[] args) {
        my_Print obj = new my_Print();
        System.out.println(obj.Printme());
    }
}
