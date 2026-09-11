public class arrays {
    // public static int linearSearch(int num[],int key){
    //     for(int i=0;i<num.length;i++){
    //         if(num[i]==key){return i;}
    //     }
    //     return -1;
    // }
    // public static void main(String args[]){
    //     int num[]={10,20,30,40,50};
    //     int key=30;
    //     int index=linearSearch(num,key);
    //     if(index==-1){
    //         System.out.print("Not found");
    //     }
    //     else{
    //         System.out.print("key found at index"+" "+index);
    //     }
    // }
    //  public static int getLargest(int num[]){
    //     int largest=Integer.MIN_VALUE;
    //     int smallest=Integer.MAX_VALUE;
    //     for(int i=0;i<num.length;i++){
    //         if(largest<num[i]){largest=num[i];}
    //         if(smallest>num[i]){smallest=num[i];}
    //     }
    //     System.out.println("smallest number is"+" "+smallest);
    //     return largest;
    // }
    // public static void main(String args[]){
    //     int num[]={10,20,30,40,50};
    //     System.out.println("largest number is"+getLargest(num));
    // }
    // public static int binarySearch(int num[],int key){
    //     int start=0;
    //     int end=num.length-1;
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(num[mid]==key){return mid;}
    //         if(num[mid]<key){start=mid+1;}
    //         else{end=mid-1;}
    //     }
    //     return -1;
    // }
    // public static void main(String args[]){
    //     int num[]={10,20,30,40,50,60,70,80};
    //     int key=60;
    //     int index=binarySearch(num,key);
    //     if(index==-1){
    //         System.out.print("Not found");
    //     }
    //     else{
    //         System.out.print("Key found at index "+index);
    //     }
    // }
    // public static int reverse(int num[]){
    //     int first=0,last=num.length-1;
    //     while(first<last){
    //         int temp=num[last];
    //         num[last]=num[first];
    //         num[first]=temp;
    //         first++;
    //         last--;
    //     }
    //     return 0;
    // }
    // public static void main(String args[]){
    //   int num[]={10,20,30,40,50}; 
    //   reverse(num);
    //   for(int i=0;i<num.length;i++){
    //       System.out.print(num[i]+" ");
    //   }
    // }
    // public static void printPairs(int num[]){
    //     int totalPairs=0;
    //     for(int i=0;i<num.length;i++){
    //         int curr=num[i];
    //         for(int j=i+1;j<num.length;j++){
    //             System.out.print("("+curr+","+num[j]+")");
    //             totalPairs++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total pairs: " + totalPairs);
    // }
    // public static void main(String args[]){
    //     int num[]={2,4,6,8,10};
    //     printPairs(num);
    // }
    // public static void printSubarrays(int num[]){
    //     int totalSubarrays=0;
    //     for(int i=0;i<num.length;i++){
    //         int start=i;
    //         for(int j=i;j<num.length;j++){
    //             int end=j;
    //             for(int k=start;k<=end;k++){
    //                 System.out.print(num[k]+" ");
    //             }
    //             totalSubarrays++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total subarrays: " + totalSubarrays);
    // }
    // public static void main(String args[]){
        
    //     int num[]={2,4,6,8,10};
    //     printSubarrays(num);
    // }
//      public static void maxSubarrays(int num[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<num.length;i++){
//             int start=i;
//             for(int j=i;j<num.length;j++){
//                 int end=j;
//                 currSum=0;
//                 for(int k=start;k<=end;k++){
//                     currSum+=num[k];
//                 }
//             System.out.println(currSum+"");

//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }

//         }
//     }
//     System.out.println("Maximum sum is: "+maxSum);
// }
//     public static void main(String args[]){
        
//         int num[]={2,4,6,8,10};
//         maxSubarrays(num);
//     }
//      public static void maxSubarrays(int num[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefixSum[]=new int[num.length];
//         prefixSum[0]=num[0];
//         for(int i=1;i<prefixSum.length;i++){
//             prefixSum[i]=prefixSum[i-1]+num[i];
//         }
//         for(int i=0;i<num.length;i++){
//             int start=i;
//             for(int j=i;j<num.length;j++){
//                 int end=j;
//                 currSum=start==0?prefixSum[end]:prefixSum[end]-prefixSum[start-1];
//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }

//         }
//     }
//     System.out.println("Maximum sum is: "+maxSum);
// }
//     public static void main(String args[]){
        
//         int num[]={2,4,6,8,10};
//         maxSubarrays(num);
//     }
// public static void kadane(int num[]){
//     int currSum=0;
//     int maxSum=Integer.MIN_VALUE;
//     for(int i=0;i<num.length;i++){
//         currSum+=num[i];
//         if(currSum<0){
//             currSum=0;
//         }
//         maxSum=Math.max(currSum,maxSum);
//     }
//     System.out.println("Maximum sum is: "+maxSum);
// }
//     public static void main(String args[]){
        
//         int num[]={-2,-3,4,-1,-2,1,5,-3};
//         kadane(num);
//     }
// public static int trappedRainwater(int height[]){
//     int n=height.length;
//     int leftMax[]=new int[n];
//     leftMax[0]=height[0];
//     for(int i=1;i<n;i++){
//         leftMax[i]=Math.max(height[i],leftMax[i-1]);
//     }
//     int rightMax[]=new int[n];
//     rightMax[n-1]=height[n-1];
//     for(int i=n-2;i>=0;i--){
//         rightMax[i]=Math.max(height[i],rightMax[i+1]);
//     }
//     int trappedWater=0;
//     for(int i=0;i<n;i++){
//         int waterLevel=Math.min(leftMax[i],rightMax[i]);
//         trappedWater+=waterLevel-height[i];
//     }
//     return trappedWater;
// }
// public static void main(String args[]){
//     int heigth[]={4,2,0,6,3,2,5};
//     System.out.println("Trapped rainwater: "+trappedRainwater(heigth));
// }
public static int buyAndSellStock(int prices[]){
    int buy=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<prices.length;i++){
        if(buy<prices[i]){
            int profit=prices[i]-buy;
            maxProfit=Math.max(maxProfit,profit);
        }
        else{
            buy=prices[i];
                }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum profit is: "+buyAndSellStock(prices));
    }
}
