public class getMaxOccuringCharacter {
     //Function to find the maximum occurring character in a string.
     public static char getMaxOccuringChar(String line)
     {
         // Your code here
         int arr[] = new int[26];
         for(int i=0;i<line.length();i++){
             char ch = line.charAt(i);
             int number = ch - 'a';
             arr[number]++;
         } 
         int maxi=-1,ans=0;
         for(int i=0;i<26;i++){
             if(maxi<arr[i]){
                 ans=i;
                 maxi=arr[i];
             }
         }
         return (char)('a' + ans);   
     }
}
