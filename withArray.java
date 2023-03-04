/**
 * Created by DELL on 05/02/2023.
 */
public class withArray {
    public static void main(String[] args) {


        int Array1[]={100,200,300,400,500};
        int Array2[]=new  int  [6];

        System.arraycopy(Array1,0,Array2,0,6);
        System.out.println("Array 2=");

        for (int i = 0; i <Array2.length ; i++) {

            System.out.println(Array2[i]+"   ");

        }
    }
}
