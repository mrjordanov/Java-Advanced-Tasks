public class Demo {
    public static void main(String[] args) {

        int[] arr = new int[]{13, 42, 69, 73};


        int sum = findSum(arr, 0);
        System.out.print(sum);
    }

    private static int findSum(int[] arr, int index) {

        if (index == arr.length) {
            return 0;
        }
        return arr[index] + findSum(arr, index + 1);
    }

}
