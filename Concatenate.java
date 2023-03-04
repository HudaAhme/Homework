import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by DELL on 25/01/2023.
 */
public class Concatenate {


    public static void main(String[] args) {



        int a[]={10,20,30};
        int b[]={40,50,60};

        int alen=a.length;
        int blen=b.length;
        int[] result=new int[alen+blen];

        System.arraycopy(a,0,result,0,alen);
        System.arraycopy(b,0,result,alen,blen);


        System.out.println(Arrays.toString(result));

    }
}
