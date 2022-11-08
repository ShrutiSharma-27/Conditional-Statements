public class array_declare {
    public static void main(String[] args) {
        int [] arr = new int[5]; //array declaration & initialization together
        arr[0] = 23 ;
        arr[1] = 1 ;
        arr[2] = 100 ;
        arr[3] = 55 ;
        arr[4] = 66 ;

        for (int i=0 ; i < arr.length ; i++) //loop to access each element of an array
        {
            System.out.println(arr[i]) ;
        }
    }
}
