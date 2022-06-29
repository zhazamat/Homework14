public class Ex2 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] C = new int[A.length];
        System.out.println("A elements:");

        for (int i = 0; i < A.length; i++) {

            System.out.println( A[i]);

        }
        System.out.println();
        System.out.println("C elements:");
        System.out.println();
        for (int i = 0; i < C.length; i++) {
             C[i]=-A[i];
            System.out.println( C[i]);

        }
        System.out.println();
    }
}
