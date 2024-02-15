public class Arrays {

    /**
     * Ex 2
     */
    public static void ArrayEx2(){
        int[] intArray = {1, 0, 2, 3, 7, 1, 1, 9, 10, 108};
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println(sum);
    }
}
