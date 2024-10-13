public class countstrictlygreater {
    static int greaterstrictly(int[]arr, int x){

        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>x){
                count ++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,5,2,3,6};
        System.out.println(greaterstrictly(arr, 5));
    }
}
