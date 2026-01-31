class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs= new HashSet<>();
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char sum= board[row][col];
                if(sum=='.')continue;
                String rowKey=sum+"inrow"+row;
                String colKey=sum+"incol"+col;
                 String boxKey = sum + " in box " + (row / 3) * 3 + (col / 3);

                
                if (!hs.add(rowKey) ||
                    !hs.add(colKey) ||
                    !hs.add(boxKey)) {
                    return false;
                }
            }
        }
        return true;
            
    }
}