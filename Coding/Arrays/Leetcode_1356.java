class Leetcode_1356 {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] bits = new int[n];
        for(int i=0;i<n;i++){
            String bit = Integer.toBinaryString(arr[i]);
            bits[i] = findOnes(bit);
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                int a = bits[j];
                int b = bits[j+1];
                if(a>b || (a==b && arr[j+1]<arr[j])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    int tempBits = bits[j];
                    bits[j] = bits[j+1];
                    bits[j+1] = tempBits;
                }
            }
        }
        return arr; 
    }
    public int findOnes(String s){
        int count = 0;
        for(char c:s.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}