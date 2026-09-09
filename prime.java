public class prime {
    // public static boolean isPrime(int n)
    // {
    //     for(int i=2;i<=n-1;i++)
    //     {
    //         if(n%i==0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String args[])
    // {
    //     System.out.println(isPrime(7));
    // }
    // public static boolean isPrime(int n)
    // { if(n==2)
    // {
    //     return true;
    // }
    //     for(int i=2;i<=Math.sqrt(n);i++)
    //     {
    //         if(n%i==0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void primesInRange(int n)
    // {
    //     for(int i=2;i<=n;i++)
    //     {
    //         if(isPrime(i))
    //         {
    //             System.out.print(i+" ");
    //         }
    //     }
    //     System.out.println();
    // }
    // public static void main(String args[])
    // {
        
    //     primesInRange(100);
    // }
//     public static void binToDec(int binNum)
//     {
//         int pow=0;
//         int decNUm=0;
//         while(binNum>0)
//         {
//             int lastDigiit=binNum%10;
//             decNUm=decNUm+(lastDigiit*(int)Math.pow(2,pow));
//             pow++;
//             binNum=binNum/10;
//         }
//         System.out.println(decNUm);
//     }
//     public static void main(String args[])
//     {
//         binToDec(10111);
    
    
// }
//   public static void decTOBin(int n)
//     {  int binNum=0;
//         int pow=0;
//         while(n>0)
//         {
//             int rem=n%2;
//             binNum=binNum+(rem*(int)Math.pow(10,pow));
//             pow++;
//             n=n/2;
//         }
//         System.out.println(binNum);    
// }
//  public static void main(String args[])
//     {
//         decTOBin(5);
//     }
}
