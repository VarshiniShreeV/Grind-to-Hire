class LeetCode_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rows = new ArrayList<>();
        rows.add(1);
        for(int i=1;i<=rowIndex;i++){
            for(int j=i-1;j>0;j--){
                rows.set(j, rows.get(j-1) + rows.get(j));
            }
            rows.add(1);
        }
        return rows;
    }
}