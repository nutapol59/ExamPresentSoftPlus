package JAVA.Assignment;


public class PassBy {

    public static void main(String[] args) {
        int i = 9; //keepvalue when change in other method it's not change
        int[] arr = new int[]{1,2,4,5,3};  //keep memory when change it change

        System.out.println("Before I: "+i);
        passByValue(i);
        System.out.println("After I: "+i);

        System.out.println("Before Arr[2]: "+arr[2]);
        passByRef(arr);
        System.out.println("After Arr[2]: "+arr[2]);

    }

    private static void passByValue(int i) {
        i = 300;

    }

    private static void passByRef(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i;
        }
    }

}
