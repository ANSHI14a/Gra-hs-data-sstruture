public class lastoccurence {
    public static void main(String[] args) {
       int arr[]={5,2,5,4,5,6,7};
        int x =5;
        //indexes on which 5 is present
        //ans =4
        int lastindx=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x){
                lastindx=i;
            }
        }

        System.out.println(lastindx);


    }
}
