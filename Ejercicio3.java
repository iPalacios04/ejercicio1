public class Ejercicio3 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        
        int[] multiplesOf5 = getMultiplesOf5(begin, end);
        
        System.out.println("Multiples of 5:");
        for (int multiple : multiplesOf5) {
            System.out.println(multiple);
        }
        
        int sum = calculateSum(multiplesOf5);
        System.out.println("Sum of multiples of 5: " + sum);
    }
    
    public static int[] getMultiplesOf5(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        
        int[] multiples = new int[count];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiples[index] = i;
                index++;
            }
        }
        
        return multiples;
    }
    
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
