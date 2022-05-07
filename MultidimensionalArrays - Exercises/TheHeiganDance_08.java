import java.util.Scanner;

public class TheHeiganDance_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double playerPoints = 18500;
        double heiganPoints = 3000000;
        int playerColPosition = 7;
        int playerRowPosition = 7;
        boolean isPlayerHits;
        boolean cantMoveUp;
        boolean cantMoveRight;
        boolean cantMoveDown;
        boolean cantMoveLeft;
        int cloudCount = 0;
        double heiganDamagingPointsPerTurn = Double.parseDouble(in.nextLine());
        String[] command = in.nextLine().split("\\s+");
        while (playerPoints >= 0 && heiganPoints >= 0) {
            if (cloudCount == 2) {
                cloudCount = 0;
            }
            if (cloudCount == 1) {
                playerPoints -= 3500;
                cloudCount++;
            }
            String spell = command[0];
            int hitRow = Integer.parseInt(command[1]);
            int hitCol = Integer.parseInt(command[2]);

            heiganPoints -= heiganDamagingPointsPerTurn;

            if (heiganPoints <= 0) {
                continue;
            }

            isPlayerHits = hitsCells(hitRow, hitCol, playerRowPosition, playerColPosition);

            if (!isPlayerHits && playerRowPosition >= 0 && playerRowPosition < 15 && playerColPosition >= 0 && playerColPosition < 15) {
                command = in.nextLine().split("\\s+");
                continue;
            }


            if (isPlayerHits) {
                int upRow = playerRowPosition - 1;
                int upCol = playerColPosition;
                int rightRow = playerRowPosition;
                int rightCol = playerColPosition + 1;
                int downRow = playerRowPosition + 1;
                int downCol = playerColPosition;
                int leftRow = playerRowPosition;
                int leftCol = playerColPosition - 1;
                if (playerRowPosition >= 0 && playerRowPosition < 15 && playerColPosition >= 0 && playerColPosition < 15) {
                    cantMoveUp = hitsCells(hitRow, hitCol, upRow, upCol);
                    if (!cantMoveUp) {
                        playerRowPosition = upRow;
                        playerColPosition = upCol;
                        command = in.nextLine().split("\\s+");
                        continue;
                    }

                    cantMoveRight = hitsCells(hitRow, hitCol, rightRow, rightCol);
                    if (!cantMoveRight) {
                        playerColPosition = rightCol;
                        command = in.nextLine().split("\\s+");
                        continue;
                    }
                    cantMoveDown = hitsCells(hitRow, hitCol, downRow, downCol);
                    if (!cantMoveDown) {
                        playerRowPosition = downRow;
                        command = in.nextLine().split("\\s+");
                        continue;
                    }
                    cantMoveLeft = hitsCells(hitRow, hitCol, leftRow, leftCol);
                    if (!cantMoveLeft) {
                        playerColPosition = leftCol;
                        command = in.nextLine().split("\\s+");
                        continue;
                    }
                }
                if (spell.equals("Cloud")) {
                    playerPoints -= 3500;
                    cloudCount = 1;
                }

                if (spell.equals("Eruption")) {
                    playerPoints -= 6000;
                }
            }
            if (playerPoints >= 0 && heiganPoints >= 0) {
                command = in.nextLine().split("\\s+");
            }
        }

        if (heiganPoints <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", heiganPoints);
        }

        if (playerPoints <= 0) {
            if (command[0].equals("Eruption")) {
                System.out.println("Player: Killed by " + command[0]);
            } else {
                System.out.println("Player: Killed by Plague Cloud");
            }
        } else {
            System.out.printf("Player: %.0f%n", playerPoints);
        }
        System.out.println("Final position: " + playerRowPosition + ", " + playerColPosition);
    }

    private static boolean hitsCells(int hitRow, int hitCol, int playerRowPosition, int playerColPosition) {
        for (int row = hitRow - 1; row <= hitRow + 1; row++) {
            for (int col = hitCol - 1; col <= hitCol + 1; col++) {
                if (row >= 0 && row <= 15 && col >= 0 && col <= 15) {
                    if (playerRowPosition == row && playerColPosition == col) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
