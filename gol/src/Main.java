import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int size = 20;

    char[][] screen = new char[size][size];

    for (char[] row: screen) {
      Arrays.fill(row, ' ');
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (Math.floor(Math.random() * 8) == 1) {
          screen[i][j] = 'X';
        }
      }
    }

    System.out.println(Arrays.deepToString(screen).replace("], ", "]\n").replace(",", ""));

    gameLoop(size, screen);
  }

  public static void gameLoop(int size, char[][] screen) {
    char[][] screen_buffer = nextFrame(size, screen);

    for (int i = 0; i < 5; ++i) System.out.println();
    System.out.println(Arrays.deepToString(screen_buffer).replace("], ", "]\n").replace(",", ""));
    for (int i = 0; i < 5; ++i) System.out.println();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    gameLoop(size, screen_buffer);
  }

  public static char[][] nextFrame(int size, char[][] screen) {
    char[][] screen_buffer = new char[size][size];

    for (char[] row: screen_buffer) {
      Arrays.fill(row, ' ');
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        int neighbours = 0;

        if (i - 1 != -1 && j - 1 != -1 && screen[i - 1][j - 1] == 'X') neighbours++;
        if (j - 1 != -1 && screen[i][j - 1] == 'X') neighbours++;
        if (i + 1 != size && j - 1 != -1 && screen[i + 1][j - 1] == 'X') neighbours++;

        if (i - 1 != -1 && screen[i - 1][j] == 'X') neighbours++;
        if (i + 1 != size && screen[i + 1][j] == 'X') neighbours++;

        if (i - 1 != -1 && j + 1 != size && screen[i - 1][j + 1] == 'X') neighbours++;
        if (j + 1 != size && screen[i][j + 1] == 'X') neighbours++;
        if (i + 1 != size && j + 1 != size && screen[i + 1][j + 1] == 'X') neighbours++;

        if (screen[i][j] == 'X' && (neighbours == 2 || neighbours == 3)) {
          screen_buffer[i][j] = 'X';
        } else if (screen[i][j] != 'X' && neighbours == 3) {
          screen_buffer[i][j] = 'X';
        } else {
          screen_buffer[i][j] = ' ';
        }
      }
    }

    return screen_buffer;
  }
}
