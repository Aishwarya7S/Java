public class TCExceptions {   
    public static void main(String[] args) {
        //catch - common  E (eg: Exception e)
        try{
            int[]  arr = {1,2,3};
            System.out.println(arr[7]);
        }
        catch(Exception e) {
            System.out.println("Not found");
        }

        System.out.println("-------");

        // catch - mention specific E (eg: ArithmeticException e)
        try{
            int num = 15 / 0;
            System.out.println(num);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot able to divide");
        }
    }
}
