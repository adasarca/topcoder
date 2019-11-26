/*
 * Created by AdelaSarca
 * Date: 11/26/2019
 */
package com.example.topcoder.matrix;

/*
* Bomb Man is trapped inside a maze shaped like a grid. You must help him find the exit as fast as possible. The maze will be given as a String[] where each element corresponds to a row in the grid and each character in an element corresponds to a cell in that row. '#' marks a wall, '.' an empty cell, 'B' the start position of Bomb Man and 'E' the exit. Below is an example of a maze in this format, given as a String[]:

{".....B.",
 ".#####.",
 ".#...#.",
 ".#E#.#.",
 ".###.#.",
 "......."}
In each time unit, Bomb Man can move one cell up, down, left or right. Thus, in the maze above, he can reach the exit in 14 time units by just walking.

To be able to reach the exit quicker, Bomb Man is in possession of a number of bombs, each of which can blow a hole in a wall and thus open up new passages. Instead of moving in any of the four cardinal directions, Bomb Man can (if he has bombs left) blow a hole in a wall located in any of the four neighboring squares. The bomb will go off in the time unit after he has placed the bomb, creating an empty cell that Bomb Man can enter in the time unit after that. That is, if he places a bomb in time unit t, he can enter the cell earliest in time unit t+2. In the maze above, Bomb Man can then reach the exit in 8 time units by first walking left, placing a bomb, waiting for the bomb to explode, and then walking down, down, left, left and down.

Create a class BombMan containing the method shortestPath which takes a String[] maze, containing the maze in the format described above, and an int bombs, the number of bombs in Bomb Man's possession. The method should return an int, the least number of time units required for Bomb Man to reach the exit. If it's not possible for Bomb Man to reach the exit, return -1 (see example 1).
*
* */

import java.util.PriorityQueue;

public class BombMan {

    private final int[] dx;
    private final int[] dy;

    public BombMan() {
        this.dx = new int[]{-1, 0, 1, 0};
        this.dy = new int[]{0, -1, 0, 1};
    }

    public int shortestPath(String[] maze, int bombs) {
        int n = maze.length;
        int startX = -1, startY = -1;
        int[][] distance = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = Integer.MAX_VALUE;
                if (maze[i].charAt(j) == 'B') {
                    startX = i;
                    startY = j;
                    distance[i][j] = 0;
                }
            }
        }

        boolean[][] visited = new boolean[n][n];
        PriorityQueue<Cell> queue = new PriorityQueue<>();
        queue.add(new Cell(startX, startY, 0, bombs));
        while(!queue.isEmpty()) {
            Cell cell = queue.poll();
            if (visited[cell.getX()][cell.getY()]) continue;

            if (maze[cell.getX()].charAt(cell.getY()) == 'E') {
                return cell.getDistance();
            }
            visited[cell.getX()][cell.getY()] = true;
            distance[cell.getX()][cell.getY()] = cell.getDistance();

            for (int k = 0; k < 4; k++) {
                int x = cell.getX() + dx[k];
                int y = cell.getY() + dy[k];
                if (x < 0 || x >= n || y < 0 || y >= n) continue;
                if (visited[x][y]) continue;

                int d = cell.getDistance() + 1;
                int b = cell.getBombs();
                if (maze[x].charAt(y) == '#') {
                    if (cell.getBombs() == 0) {
                        continue;
                    }
                    d += 2;
                    b--;
                }
                if (distance[x][y] > d) {
                    queue.add(new Cell(x, y, d, b));
                }
            }
        }
        return -1;
    }

    private class Cell implements Comparable<Cell> {
        private int x;
        private int y;
        private int distance;
        private int bombs;

        public Cell(int x, int y, int distance, int bombs) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.bombs = bombs;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDistance() {
            return distance;
        }

        public int getBombs() {
            return bombs;
        }

        @Override
        public int compareTo(Cell o) {
            return this.distance - o.distance;
        }
    }
}
