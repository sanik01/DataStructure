public class boyce{
   
        class Solution {
            static int majorityElement(int a[], int size) {
               int count = 1;
                int maj_index = 0;
                for(int i=1;i<a.length;i++){
                    if(a[maj_index]==a[i]){
                        count++;
                    }
                    else{
                        count--;
                    }
                    if(count==0){
                        maj_index = i;
                        count = 1;
                    }
                }
                count = 0;
                for(int i=0;i<a.length;i++){
                    if(a[i]==a[maj_index]){
                        count++;
                    }
                }
                if(count>size/2){
                    return a[maj_index];
                }
                return -1;
            }
        
    }
    
}
