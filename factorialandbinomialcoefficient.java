public class factorialandbinomialcoefficient {
    static int fact(int n)
    {
      int f=1;
      for(int i=1;i<=n;i++)
      {
        f=f*i;

      }
      return f;
    }
    public static int binCoff(int n,int r)
    {
      int fact_n=fact(n);
      int fact_r=fact(r);
      int fact_n_r=fact(n-r);
      int binCoff=fact_n/(fact_r*fact_n_r);
      return binCoff;
    }                                    
    public static void main(String args[])
{
        
        System.out.println(binCoff(5,2));
}}
