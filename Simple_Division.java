public class Simple_Division {
    public static void main(String[] args) {
        try{
            int a = 100;
            int b = 0;
            int result = a / b;
            System.out.println(result);


        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("rest of the code");

        }

    }
}