public class Main {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int a[]=sortingByBits(arr);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println();



    }
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }
    public static int[] sortingByBits(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                int countBitsj=countSetBits(arr[j]);
                int countBitsNext=countSetBits(arr[j+1]);
                if(countBitsj>countBitsNext){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                if((countBitsj==countBitsNext)&& (arr[j]>arr[j+1])){
                    int counter=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=counter;
                }
            }
        }
        return arr;
    }

    
}