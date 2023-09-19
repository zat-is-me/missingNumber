/**
 * @author tatek on 9/19/2023
 */
public class Main {
    public static void main(String[] args) {
        
        int []a ={1,2,3,5};
        int missing = getMissing(a);

        //There is no missing value if the value of missing variable equals
        // with the first value of the array
        if (missing == a[0])
            System.out.println("No Missing Number!");
        else
            System.out.println("Missing Number is: "+missing);
    }

    private static int getMissing(int[] a) {
        //Take the first element
        int previous = a[0];
        //placeholder for the missing number
        int missing = a[0];

        //start looping from second elements and
        for (int i = 1; i < a.length; i++) {
            //check the next elements are equals to previous +1
            if (previous +1 != a[i]) {
                //the missing value must be the current value at index i minus 1
                missing = a[i] -1;
            }
            //repositioning the previous value to the current index
            previous = a[i];
        }
        return missing;
    }
}