import java.util.ArrayList;

/**
 * Created by oleh on 11.09.16.
 */
public class Test {
    public  static ArrayList ramuvarMethod (int [] arr, int a){
        ArrayList retArr = new ArrayList();
        for (int i = 0; i<arr.length; i++){
            if (arr[i] != a){
                retArr.add(arr[i]);
            }
        }
        return retArr;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(ramuvarMethod(array ,4));
    }
}

