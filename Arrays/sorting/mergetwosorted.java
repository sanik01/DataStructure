package sorting;

public class mergetwosorted {
    static int[] merge2SortedArray(int[] a1, int[] a2) {
        //TimeComplexity = O(n+m)
        //Space = O(n+m)
        int size1 = a1.length;
        int size2 = a2.length;
        int p1 = 0;
        int p2 = 0;
        int k = 0;
        int[] ans = new int[ size1 + size2];//  O(n + m)
        while(p1 < size1 && p2 < size2){// O(n+m -k)
            if(a1[p1] <= a2[p2]){
                ans[k] = a1[p1];
                p1++;
            }else{
                ans[k] = a2[p2];
                p2++;
            }
            k++;
        }
        while(p1<size1){  //O(k)
            ans[k] = a1[p1];
            k++;
            p1++;
        }
        while(p2<size2){  //O(k)
            ans[k] = a2[p2];
            k++;
            p2++;
        }
        return ans;
    }
}
