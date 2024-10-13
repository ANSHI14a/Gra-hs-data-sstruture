public class checkIfArrayIsSorted {

    static boolean sortedornot(int[]arr){
        boolean check=true;
        //start tha value of i from 1 because -1 index doesnt exist
        
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
            //notsorted
            check = false;
            break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int[]arr={1,2,30,6,5,7,8};
        System.out.println(sortedornot(arr));


    }
}
