public class Ex1 {
    public static void main(String[] args) {
        int[] A = {1, 2, 13, 4, 5, 6, 7, 8, 9, 10};
        int max;
        max=A[0];
        for (int i = 0; i < A.length; i++) {

            if(max<A[i])
                max=A[i];

        }
        System.out.println("Maximum : " + max);
        float [] B = {1.2f, 2.5f, 1.3f};
        float maximum;
        maximum=B[0];
        for (int j = 0; j < B.length; j++) {

            if(maximum < B[j])
                maximum=B[j];

        }
        System.out.println("Maximum : " + maximum);
    }
}
