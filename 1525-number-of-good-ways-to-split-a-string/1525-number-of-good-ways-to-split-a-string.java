class Solution {
    public int numSplits(String s) {
        int [] left=new int[26];
        int [] right=new int[26];
        for(int i=0;i<s.length();i++){
            right[s.charAt(i)-'a']++;
        }
        int leftUnique=0;
        int rightUnique=0;
        for(int i=0;i<26;i++){
            if(right[i]>0){
                rightUnique++;
            }
        }
        int answer=0;
        for(int i=0;i<s.length()-1;i++){
            int index=s.charAt(i)-'a';
            if(left[index]==0){
                leftUnique++;
            }
            left[index]++;
            right[index]--;
            if(right[index]==0){
                rightUnique--;
            }
            if(leftUnique==rightUnique){
                answer++;
            }

        }
        return answer;

        
    }
}