package chess;

public class Chess {
    static Figure[][] board = {{new Figure("T", 0, 0, true), new Figure("P", 1, 0, true), new Figure("L", 0, 2, true), new Figure("D", 0, 3, true), new Figure("K", 0, 4, true), new Figure("L", 0, 5, true), new Figure("F", 0, 6, true), new Figure("T", 0, 7, true)},
            {new Figure("B", 1, 0, true), new Figure("B", 1, 1, true), new Figure("B", 1, 2, true), new Figure("B", 1, 3, true), new Figure("B", 1, 4, true), new Figure("B", 1, 5, true), new Figure("B", 1, 6, true), new Figure("B", 1, 7, true)},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null}, // Hier das Schachfeld halt weiter einfügen :)
            {null, null, null, null, null, null, null, null},
            {new Figure("B", 6, 0, false), new Figure("B", 6, 1, false), new Figure("B", 6, 2, false), new Figure("B", 6, 3, false), new Figure("B", 6, 4, false), new Figure("B", 6, 5, false), new Figure("B", 6, 6, false), new Figure("B", 6, 7, false)},
            {new Figure("T", 7, 0, true), new Figure("P", 7, 0, true), new Figure("L", 7, 2, true), new Figure("D", 7, 3, true), new Figure("K", 7, 4, true), new Figure("L", 7, 5, true), new Figure("F", 7, 6, true), new Figure("T", 7, 7, true)}};

    public static void print_board() { // Des wird noch besser, ist nur zum testen ob das game so klappt :)
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {
                if (board[i][k] != null) {
                    System.out.print(board[i][k].name);
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.print("\n");
        }
    }
}
