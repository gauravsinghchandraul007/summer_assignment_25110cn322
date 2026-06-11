package Day_15;

public class Question_59 {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[k];

        // Store last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Shift remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy stored elements to the beginning
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateRight(arr, k);

        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

