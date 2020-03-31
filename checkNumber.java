public class checkNumber{
    
    public static void main(int numero){
        positiveNegative(numero);
    }
        public static void positiveNegative(int number){
        if (number > 0){
            System.out.println("The Number is a positive number : " + number);
        }
        else if (number < 0){
            System.out.println("The Number is a Negative number: " + number);
        }
        else {
            System.out.println("The Number is a Null!!");
        }
 

}
}
