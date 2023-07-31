package level0.character_xy_coordinate;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120861
 */
public class CharacterXYCoordinate {

    public static void main(String[] args) {
        int[] solution = solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11});
        System.out.println("solution = " + solution[0] + ", " + solution[1]);
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int boardX = board[0] / 2;
        int boardY = board[1] / 2;
        int x = 0;
        int y = 0;
        for(String key : keyinput) {
            int tempx = x;
            int tempy = y;
            switch(key) {
                case "left"  : tempx = tempx - 1; break;
                case "right" : tempx = tempx + 1; break;
                case "down"  : tempy = tempy - 1; break;
                case "up"    : tempy = tempy + 1; break;
            }
            boolean isRangeX = tempx <= boardX && tempx >= - boardX;
            boolean isRangeY = tempy <= boardY && tempy >= - boardY;
            if(isRangeX & isRangeY) {
                x = tempx;
                y = tempy;
            }
        }

        int[] answer = {x, y};
        return answer;
    }
}
