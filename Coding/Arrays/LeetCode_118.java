class LeetCode_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>(numRows);

        List<Integer> prev = null;
        for (int i = 0; i < numRows; i++) {
            List<Integer> current = new ArrayList<>(i + 1);
            current.add(1); 
            
            for (int j = 1; j < i; j++) {
                current.add(prev.get(j - 1) + prev.get(j));
            }
            if (i > 0) current.add(1); 
            rows.add(current);
            prev = current; 
        }
        return rows;
    }
}

// class Solution {
//     public static List<Integer> generateRows(int row) {
//         List<Integer> ansRow = new ArrayList<>();
//         long ans = 1;
//         ansRow.add(1);
//         for(int col = 1; col < row; col++) {
//             ans = (ans * (row - col))/col;
//             ansRow.add(ans);
//         }
//         return ansRow;
//     }

//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ans = new ArrayList<>();
//         for(int row = 1; row <= numRows; row++) {
//             ans.add(generateRows(row));
//         }
//         return ans;
//     }
// }

