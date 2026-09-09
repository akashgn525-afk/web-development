public class binarySearch {
    public static int element_Index(int[] nums,int key){
       int start=0,end=nums.length-1;
        while(start<=end){
           int mid=(start+end)/2;
            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]<key)
            {
                 start=mid+1;
            }
            else{
                 end=mid-1;
            }
            return -1;

        }
    }
        public static void main(String args[]){
            int nums[]={4,5,6,7,0,1,2};
            int key=4;
           System.out.println(element_Index(nums,key));
        }



    }
    
    
}
