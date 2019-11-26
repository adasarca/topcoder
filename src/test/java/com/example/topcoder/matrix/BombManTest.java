package com.example.topcoder.matrix;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 11/26/2019
 */
public class BombManTest {

    private BombMan bombMan;

    @BeforeMethod
    public void setup() {
        this.bombMan = new BombMan();
    }

    @Test
    public void testShortestPath0() {
        //setup
        String[] maze = new String[] {
                ".....B.",
                ".#####.",
                ".#...#.",
                ".#E#.#.",
                ".###.#.",
                "......."
        };
        int bombs = 1;

        //test
        int path = this.bombMan.shortestPath(maze, bombs);

        //verify
        assertEquals(path, 8);
    }

    @Test
    public void testShortestPath1() {
        //setup
        String[] maze = new String[] {
                "B.#.#.#...E"
        };
        int bombs = 2;

        //test
        int path = this.bombMan.shortestPath(maze, bombs);

        //verify
        assertEquals(path, -1);
    }

    @Test
    public void testShortestPath2() {
        //setup
        String[] maze = new String[] {
                "..#####",
                "B.#####",
                "..#####",
                "#######",
                "####...",
                "####.E."
        };
        int bombs = 4;

        //test
        int path = this.bombMan.shortestPath(maze, bombs);

        //verify
        assertEquals(path, 17);
    }

    @Test
    public void testShortestPath3() {
        //setup
        String[] maze = new String[] {
                ".#.#.#.#B#...#.#...#.#...#.#...#.#...#.#.#.......",
                ".#.#.#.#.#.###.###.#.###.#.#.###.###.#.#.#.###.##",
                ".#.#.#...#.#.#.#.#.#...#.....#.#.#...#...#.#.#...",
                ".#.#.###.#.#.#.#.#.###.#.#####.#.###.###.#.#.###.",
                ".............#.#...#...#.....#.#.#...#.#.#.....#.",
                "##.#######.###.#.#####.#.#####.#.###.#.#.#.#.####",
                ".#.#.....#...#...#.#...#...#.#.#...#...#...#.....",
                ".#######.#.#####.#.#.#.#.###.#.###.#.#####.#.####",
                ".#.#.#.#...#.#.#.#.#.#.......#...#.#...#.#.#.....",
                ".#.#.#.###.#.#.#.#.#####.#####.###.###.#.#.######",
                ".....#...#.#...#...#...#...#...#...#.#.#.........",
                "####.###.#.###.###.#.###.#.#.###.###.#.#.########",
                ".......#.........#.#.#.#.#.#.#.#.........#...#...",
                ".#.###.#########.#.#.#.#.###.#.#####.#.#.#.###.##",
                ".#.#.........#.#.#.#.#.....#.#.#.....#.#.........",
                "############.#.#.#.#.#.#####.#.#.################",
                ".#...........#...#.#.#.#...#.#.#...#.#.#.....#...",
                ".#####.#####.###.#.#.#.#.###.#.#.###.#.#.#####.##",
                ".......#...#.#.#.....#...#...#.#.#.#.#...........",
                "##########.#.#.#####.#.###.###.#.#.#.#.##########",
                ".....#...#.....#.#...#.......#.#...#.......#.....",
                "##.#.###.#.###.#.#.#.#.#####.#.#.###.#######.####",
                "...#...#...#.......#.....#.#...#...#.......#.....",
                "####.#.#.#########.#.###.#.#####.###.#.#######.##",
                ".#...#...#.........#.#.....#.........#.#.#.#.....",
                ".#####.#.#.###.#######.#.###.#.#########.#.#.####",
                ".......#.#.#...#.......#.....#.#.#.......#.#.#.#.",
                "########.#.#.#.#####.#.###.#.###.#.#######.#.#.#.",
                ".........#.#.#.#.....#...#.#.........#.#.........",
                "################.#.#.#.#.#.#.#.#######.#.########",
                ".................#.#.#.#.#.#.#...........#.......",
                "########.#####.#.###.#.#.#####.###.#.#####.###.##",
                ".........#...#.#...#.#.#...#.....#.#.........#...",
                ".#####.#####.#.###.#.###.#.#.#.#.#.#####.#.###.#.",
                ".#.....#.........#.#.#...#.#.#.#.#.#.....#...#.#.",
                "####.#####.###.#.#.#.#.#.#.###.###.#.#.#.#.#####.",
                ".....#.....#.#.#.#.#.#.#.#.#...#...#.#.#.#...#...",
                "####.#.#.###.#.#.###.#.###.#.#.#####.#.#.#.######",
                ".....#.#.#.#...#...#.#...#.#.#...#...#.#.#.......",
                "##########.#.#.#.#####.###.#.#.###.#.###.#####.##",
                "...#.#...#...#.#.....#.#...#.#...#.#.#.......#...",
                ".#.#.#.#.#.#.#.#.#.#.###.#.#########.###.#.#.#.#.",
                ".#.#...#...#.#.#.#.#...#.#...#.......#...#.#.#.#.",
                "##.###.#.#.###.#.#.#.#.#####.#.#.#.###.#.########",
                ".......#.#...#.#.#.#.#.#.....#.#.#...#.#.........",
                "####.#######.#.#####.#.###.#.#.###.#.#.#.########",
                "E..#.......#.#.....#.#.#.#.#.#.#...#.#.#.........",
                "##.#.#.#.###.###.###.###.#.#.###.#.#.#.#.#######.",
                ".....#.#...#.#.....#.#.....#...#.#.#.#.#.....#..."
        };
        int bombs = 3;

        //test
        int path = this.bombMan.shortestPath(maze, bombs);

        //verify
        assertEquals(path, 76);
    }
}