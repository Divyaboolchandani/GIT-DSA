import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            set.add(b[j]);
        }
        Iterator<Integer> it =set.iterator();
        while(it.hasNext()){
            al.add(it.next());
        }
        return al;
    }
}
