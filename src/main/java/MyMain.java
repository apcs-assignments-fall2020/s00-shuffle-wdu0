public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int half = arr.length / 2;
        int[] arr1 = new int[half];
        int[] arr2 = new int[half];
        int[] newarr = new int[arr.length];

        for (int a=0; a<half; a++) {
            arr1[a] = arr[a];
        }
        for (int b=0; b<half; b++) {
            arr2[b] = arr[b+half];
        }

        for (int i=0; i<half; i++) {
            int temp1 = arr1[i];
            int temp2 = arr2[i];
            newarr[i*2] = temp1;
            newarr[i*2+1] = temp2;
        }

        return newarr;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        
        for (int i=0; i<arr.length; i++) { 
            int randInt = (int) (Math.random() * arr.length);
            int temp1 = arr[i];
            int temp2 = arr[randInt];
            arr[i] = temp2;
            arr[randInt] = temp1;
        }

        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        int[] arr1 = {1, 2, 3, 101, 102, 103};
        int[] arr2 = {1, 4, 5, 14, 60, 81, 101, 200};

        int[] re1 = perfectShuffle(arr1);
        int[] re2 = selectionShuffle(arr2);
        
        for (int i=0; i<re1.length; i++) {
            System.out.print(re1[i] + ", ");
        }
        System.out.println();
        for (int i=0; i<re2.length; i++) {
            System.out.print(re2[i] + ", ");
        }
    }
}
