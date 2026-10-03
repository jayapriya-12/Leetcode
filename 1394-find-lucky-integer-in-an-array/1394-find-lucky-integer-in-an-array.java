class Solution {
    public int findLucky(int[] arr) {

        int answer = -1;

        for (int i = 1; i <= 500; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    count++;
                }
            }

            if (count == i) {
                answer = i;
            }
        }

        return answer;
    }
}