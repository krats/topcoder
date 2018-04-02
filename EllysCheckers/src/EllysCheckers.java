import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class EllysCheckers {

    public String getWinner(String board) {
        HashMap<String, Boolean> map = new HashMap<>();
        return getWinnerAux(board, map) ? "YES" : "NO";
    }

    public boolean getWinnerAux(String board, HashMap<String, Boolean> map) {
        if(map.containsKey(board)) {
            return map.get(board);
        }
        char[] checkedBoard = board.toCharArray();
        boolean ans = false;
        for (int i = 0; i < checkedBoard.length - 1; i++) {
            if (checkedBoard[i] == 'o') {
                if (checkedBoard[i + 1] == '.' || i+1 == checkedBoard.length -1) {
                    checkedBoard[i] = '.';
                    checkedBoard[i + 1] = 'o';
                    ans = !getWinnerAux(new String(checkedBoard), map);
                    checkedBoard[i] = 'o';
                    checkedBoard[i + 1] = '.';
                } else if (i + 3 < checkedBoard.length - 1 && checkedBoard[i + 1] == 'o' && checkedBoard[i + 2] == 'o' && checkedBoard[i+3] == '.') {
                    checkedBoard[i] = '.';
                    checkedBoard[i + 3] = 'o';
                    ans = !getWinnerAux(new String(checkedBoard), map);
                    checkedBoard[i] = 'o';
                    checkedBoard[i + 3] = '.';
                } else if (i + 3 == checkedBoard.length - 1 && checkedBoard[i + 1] == 'o' && checkedBoard[i + 2] == 'o') {
                    checkedBoard[i] = '.';
                    ans = !getWinnerAux(new String(checkedBoard), map);
                    checkedBoard[i] = 'o';
                }
                if (ans)
                    break;
            }
        }
        map.put(board, ans);
        return ans;
    }
}
