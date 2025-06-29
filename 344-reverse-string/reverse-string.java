class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        // char[]ans=new char[n];
        // for(int i=0;i<n;i++){
        //     ans[i]=s[n-1-i];
        // }
        // for(int i=0;i<n;i++){
        //     // s[i]=ans[i];
        //     ans[i]=s[i];
        // }

        // int i=0,j=n-1;
        // while(i<=j){
        //     char temp=s[i];
        //     s[i]=s[j];
        //     s[j]=temp;
        //     i++;
        //     j--;
        // }
         List<Character> list = IntStream.range(0, s.length)
            .mapToObj(i -> s[i])
            .collect(Collectors.toList());

        Collections.reverse(list); // Reverse using Collections API

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            s[i] = list.get(i);
    }
    }
}