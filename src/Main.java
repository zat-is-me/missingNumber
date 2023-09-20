/**
 * @author tatek on 9/19/2023
 */
public class Main {
    public static void main(String[] args) {
        
        int []a ={1,2,4,5};//,6,7,9,11,13,14,18,20};
        int missing = getMissingNumber(a);

        //if the value of missing variable equals
        // with the first value of the array, There is no missing value
        if (missing == a[0])
            System.out.println("No Missing Number!");
        else
            System.out.println("Missing Number is: "+missing);

        int[] missingNumbers = getMissingNumbers(a);

        System.out.print("Missing number: ");
        for (int i : missingNumbers){
            System.out.print(i);
        }

    }

    //if multiple or single numbers are missing from arrays
    private static int[] getMissingNumbers(int[]a){
        // to finding how many numbers are missing
        // do this the value of the last array minus the size of the array
        int missingSize = a[a.length-1] - a.length;
        System.out.println("The missing numbers are: "+missingSize);
        int[]missingNumbers = new int[missingSize];
        //trucking the index of the missing value
        int index = 0;
        int previous = a[0];
        for (int i = 1; i < a.length ; i++) {
            if (previous +1 != a[i]){
                //checking how money numbers missing
                if (a[i]-1 != previous){
                    //find how many times to loop
                    int size = a[i] - previous;

                    missingNumbers[index] = previous;
                    //loop through for the missing number
                    for (int j = 1; j < size; ++j) {
                        missingNumbers[index] = previous+1;
                        previous = previous+1 ;
                        index++;
                    }
                }else {
                    missingNumbers[index] = previous;
                    index++;
                }
            }
            previous = a[i];
        }
        return missingNumbers;
    }

    //missing one number
    private static int getMissingNumber(int[] a) {
        //Take the first element
        int previous = a[0];
        //placeholder for the missing number
        int missing = a[0];

        //start looping from second elements and
        for (int i = 1; i < a.length; i++) {
            //check the next elements are equals to previous +1
            if (previous +1 != a[i]) {
                //the first missing value must be the current value at index i minus 1
               return missing = a[i] -1;
            }
            //repositioning the previous value to the current index
            previous = a[i];
        }
        return missing;
    }
}