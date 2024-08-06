public class wrapper_classes {
    public static void main(String [] args){

        // Autoboxing : primitive datatype to wrapper class
        int a = 25;
        Integer b = a;

        // unboxing : wrapper class to primitive, additional functionality lost
        Integer x = 22;
        int c = x;

        Integer y = 128;
        Integer d = 128;
        System.out.println(y==d);
        
    }
    
}
