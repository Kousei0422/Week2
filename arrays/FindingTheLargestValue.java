package week2.arrays;

public class FindingTheLargestValue {
        public static void main(String[] args) {
            int[] array = new int[10];
            String str = "Array:";
            for (int i = 0; i < 10; i++) {
                double r = (Math.random() * 50 + 1);
                int random = (int) r;
                array[i] = random;
                str += random + " ";
            }
            System.out.println(str);

            int max = 0;
            for(int i = 0; i < array.length; i ++){
                if(max < array[i]){
                    max = array[i];
                }
            }
            System.out.println("The largest value is " + max);
        }
}

