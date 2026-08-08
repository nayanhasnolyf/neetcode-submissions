class Solution {
    public boolean isValidSudoku(char[][] board) {
    HashSet<Character> []rows = new HashSet[9];
    HashSet<Character> []columns = new HashSet[9];
    HashSet<Character> []box = new HashSet[9];
    for(int i =0; i<9; i++)
    {
       rows[i] = new HashSet<>();
    }
    for(int i =0; i<9; i++)
    {
       columns[i] = new HashSet<>();
       
    }
    for(int i =0; i<9; i++)
    {
       box[i] = new HashSet<>();
    }
    for(int i =0; i<9; i++)
    {
        for(int j=0;j<9;j++)
        {
            if(board[i][j]=='.')
            { continue;
            }
            if(rows[i].contains(board[i][j]))
            return false;
            else
            {
                rows[i].add(board[i][j]);
            }
        }
    }
    for(int i =0; i<9; i++)
    {
        for(int j=0;j<9;j++)
        {
            if(board[i][j]=='.')
            { continue;
            }
            if(columns[j].contains(board[i][j]))
            return false;
            else
            {
                columns[j].add(board[i][j]);
            }
        }
    }
    for(int i =0; i<9; i++)
    {
        for(int j=0; j<9; j++)
        {
            if(board[i][j]=='.')
            { continue;
            }
            int boxrow = i/3;
            int boxcolumn = j/3;
            int boxnumber = boxrow * 3 + boxcolumn;
            if(box[boxnumber].contains(board[i][j]))
            return false;
            else
            {
            box[boxnumber].add(board[i][j]);
            }
        }
    }
    return true;
    }
}
