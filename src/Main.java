/**
 * @author tatek on 9/19/2023
 */
public class Main {
    public static void main(String[] args) {
        
        int []a ={1,2,3,5};
        int missing = getMissing(a);

        if (missing == a[0])
            System.out.println("No Missing Number!");
        else
            System.out.println("Missing Number is: "+missing);
    }

    private static int getMissing(int[] a) {
        int previous = a[0];
        int missing = a[0];

        for (int i = 1; i < a.length; i++) {
            if (previous +1 != a[i]) {
                missing = a[i] -1;
            }
            previous = a[i];
        }
        return missing;
    }
}