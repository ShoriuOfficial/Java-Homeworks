public class ArraysDemoHome {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40};

       
        int sum = 0;

       
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }


        System.out.println("Toplam: " + sum);

      
        System.out.println("Dizinin elemanları:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
