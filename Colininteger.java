/**
 * Created by DELL on 25/01/2023.
 */
public class Colininteger {
    public static void main(String[] args) {

        int a[]={10,20,30,40,50};
        int b[]=new int[a.length];
        b=a;
        b[0]++;

        System.out.println("Orgaiztion array a[]");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"   ");

        }
        System.out.println("\n\nContent of b[]");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]+"  ");
        }
    }
}
