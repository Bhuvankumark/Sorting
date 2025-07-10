package sjb.Timecomplexity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     int[] ar= {10,20,30,40};
     int ele=23;
     LinearSearch l = new LinearSearch();
     int res=l.LinearSearch(ar, ele);
     System.out.println(res);
    }
    
}
