public class Arrays{

    static void printArray(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
        
    
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        //copy arr to arr_2
        int[]arr_2=arr;
        printArray(arr_2);

        //changing some values of the new array we made arr_2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("Orginal array after changing arr_2");
        printArray(arr);

        System.out.println("Copied array after changing arr_2");
        printArray(arr_2);
    }
    //concluding that if we changed new array the orignal array was also changes
    
}