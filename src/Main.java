public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {1,2,3,4,5};
        int[] arrayTwo = {0,34,43};


        boolean equalResult = equalArray(arrayOne,arrayTwo);


        if (equalResult == true){
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы не равны");
        }


    }

    public static boolean equalArray (int[] arrayOne, int[] arrayTwo){
        boolean result = true;
        for (int i = 0; i < arrayOne.length; i++){
            if (arrayOne[i] != arrayTwo[i]){
                result = false;
                break;
            }
        } return result;
    }
}