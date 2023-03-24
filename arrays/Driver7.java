// Find Intersection of 3 sorted arrays

import java.util.ArrayList;
class ArrayIntersection{
    public static ArrayList<Integer> findIntersection(Integer a[],Integer b[],Integer c[]){
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length && k<c.length){
            if((a[i]==b[j]) && a[i]==c[k]){
                ans.add(a[i]);
                i++;
                j++;
                k++;
            }else if(a[i]<b[j] || a[i]<c[k]){
                i++;
            }else if(b[j]<a[i] || b[j]<c[k]){
                j++;
            }else{
                k++;
            }
        }

        return ans;
    }
}

public class Driver7 {
    public static void main(String[] args) {
        Integer a[] = {10,30};
        Integer b[] = {10,15,20,25, 40};    
        Integer c[] = {20,40,60,80};

        ArrayList<Integer> ans = ArrayIntersection.findIntersection(a, b, c);
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }
}
