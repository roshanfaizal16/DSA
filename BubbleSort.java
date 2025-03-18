public class BubbleSort {
        public static void main(String[] args) {
            int[] arr = {5,6,1,3,7,2,5};
            int n = arr.length;
            System.out.println("sorted array:");
            sort(arr,n);
        }
        static void  sort(int[] arr,int n){
            int temp;
                for(int i = 0;i<n-1;i++){
                    for(int j = 0;j<n-1;j++){
                        if(arr[j]>arr[j+1]){
                            temp = arr[j];
                           arr[j] = arr[j+1];
                           arr[j+1] = temp;
                        }
                    }
                }
                for(int m:arr){
                    System.out.println(m);
                }
        }
    }
    

