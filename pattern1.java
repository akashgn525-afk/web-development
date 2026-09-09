public class pattern1 {
    // public static void main(String args[])
    // { pattern(10);
    // }
    // static void pattern(int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[])
    // { pattern(5);
    // }
    // static void pattern(int n)
    // {
    //     for(int i=1;i<=n;i++)
    //     {  int noOfSpaces=n-i;
    //         for(int s=1;s<=noOfSpaces;s++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();

    //     }
    //     for(int i=n;i>=1;i--)
    //     {  int noOfSpaces=n-i;
    //         for(int s=1;s<=noOfSpaces;s++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[])
    // { pattern(5);
    // }
    // static void pattern(int n)
    // {   int k=1;
    //     for(int i=1;i<=n;i++)
    //     { 
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print(k+" ");
    //             k++;
    //         }
    //         System.out.println();
    //     }
    // }
    //  public static void main(String args[])
    // { pattern(4);
    // }
    // static void pattern(int n)
    // {  char ch='A';
       
    //     for(int i=1;i<=n;i++)
    //     {   int noOfSpaces=n-i;
    //         for(int s=1;s<=noOfSpaces;s++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print(ch+" ");
    //             ch++;
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void hollow_rectangle(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n;j++){
    //             for(int s=1;s<=n-i;s++){
    //                 System.out.print(" ");
    //             }

    //             if(i==1 || i==n || j==1 || j==n ){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print("");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[]){
    //     hollow_rectangle(4);
    // }
//     static void pattern1(int n)
// {   
//     for(int i=1;i<=n;i++)
//     { 
//         for(int s=1;s<=n-i;s++)
//         {
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("* ");
//         }
//         System.out.println();

// }
// }
//  public static void main(String args[])
//     { pattern1(4);
//     }
// public static void pattern1(int n){
   
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             if((i+j)%2==0)
//               System.out.print("1 ");
//             else
//               System.out.print("0 ");
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){
//     pattern1(5);
// } 
// public static void butterfly_pattern(int n){

//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     for(int i=n;i>=1;i--){ for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();

//     }
    
// }
//  public static void main(String args[]){
//     butterfly_pattern(10);
//  }
}