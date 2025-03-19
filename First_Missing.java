public class First_Missing {
        public void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
       }
        public int firstMissingPositive(int[] arr) {
            int n =arr.length;
            for(int i =0;i<n;i++){
                while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1]!=arr[i])
                swap(arr,i,arr[i]-1);
           }
            for(int i=0;i<n;i++){
               if( arr[i]!=i+1)
                return i+1;
            }
            return n+1;
        }
        public static void main(String[] args) {
            First_Missing m =new First_Missing();
            int[] arr ={3,4,-1,1};
            int missing = m.firstMissingPositive(arr);
            System.out.println(missing);
        }
    }
