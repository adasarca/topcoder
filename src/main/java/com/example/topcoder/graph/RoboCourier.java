/*
 * Created by AdelaSarca
 * Date: 11/28/2019
 */
package com.example.topcoder.graph;

/*
*
A robotic courier needs to deliver a package through a minefield, following a safe path discovered by a robotic scout. The scout's path is not necessarily as efficient as it could be. For example, it might loop back on itself. The courier need not follow the path exactly, but can take shortcuts when it can do so safely.

Each robot can make only three kinds of moves, each represented by a single letter: it can go forward 1 meter ('F'), pivot right 60 degrees ('R'), or pivot left 60 degrees ('L'). Notice that the locations on which a robot can begin or end a move form a hexagonal grid. The scout and courier begin in the same location, facing in the same direction. The courier's goal is to reach the last location visited by the scout as quickly as possible. To travel safely, the courier must always stay in the wheel tracks of the scout. That is, any forward movement made by the courier must be along a path segment traveled by the scout. Pivoting left or right is always safe. Note that the courier is permitted to follow a path segment in either the same or the opposite direction as the scout. Similarly, the courier may be facing in any direction when it reaches its final destination--it need not end up facing in same direction as the scout.

The courier requires 3 seconds to pivot left or right 60 degrees, and 4 seconds to move forward one meter. However, because of acceleration effects, the courier can move faster when it makes several consecutive forward moves. The first and last moves in any such sequence take 4 seconds each, but intermediate moves in the sequence take 2 seconds each. For example, it would take the courier 20 seconds to travel 8 meters in a straight line: 4 seconds for the first meter, 4 seconds for the last meter, and 12 seconds for the six meters in between.

For example, suppose the scout follows the path "FRRFLLFLLFRRFLF" (all quotes for clarity only). Altogether, it visits six locations, which can be drawn as

    _
   /6\_
   \_/5\_
     \_/4\
     /2\_/
     \_/3\
     /1\_/
     \_/
It begins in hexagon 1, facing upward, and travels in order to hexagons 2, 3, and 4. It then returns to hexagon 2 before continuing on to hexagons 5 and 6. The courier could deliver the package in a minimum of 15 seconds, using the path "FFLF" which visits hexagons 1, 2, 5, and 6.
The scout's path will be given as a String[] path, rather than as a single String. For example, the scout's path above might have been given as {"FRRFLLFLL", "FRRFLF"}. Note that there is no significance to where the breaks fall between strings in path; it is best to think of all the strings being concatenated together. Given the path, you must calculate the minimum time needed for the courier to deliver its package.
* */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;

public class RoboCourier {

    private final int[] dx = new int[]{0,1,1,0,-1,-1};
    private final int[] dy = new int[]{2,1,-1,-2,-1,1};

    public int timeToDeliver(String[] path) {
        HashMap<Position, HashSet<Node>> graph = new HashMap<>();
        Position current = new Position(0, 0);
        graph.put(current, new HashSet<>());
        int d = 0;

        //build graph
        for (String s : path) {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case 'L': d = (d + 5) % 6; break;
                    case 'R': d = (d + 1) % 6; break;
                    case 'F':
                        Position pos = new Position(current.x + dx[d], current.y + dy[d]);
                        Node node = new Node(pos, d);
                        graph.get(current).add(node);

                        graph.putIfAbsent(pos, new HashSet<>());
                        graph.get(pos).add(new Node(current, (d + 3) % 6));
                        current = pos;
                }
            }
        }
        Position end = current;

        //dijkstra
        HashMap<Position, Integer> time = new HashMap<>();
        for (Position pos : graph.keySet()) {
            time.put(pos, Integer.MAX_VALUE);
        }
        time.put(new Position(0,0), 0);

        HashSet<Position> visited = new HashSet<>();
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(new Position(0,0), 0, 0, 0));
        while (!queue.isEmpty()) {
            Node min = queue.poll();
            if (visited.contains(min.pos)) continue;

            if (min.pos.equals(end)) {
                return min.time;
            }

            visited.add(min.pos);
            for (Node node : graph.get(min.pos)) {
                if (visited.contains(node.pos)) continue;

                int t = min.time + 4;
                int acceleration = 1;
                if (node.direction == min.direction) {
                    acceleration = min.acceleration + 1;
                    if (acceleration > 2) t -= 2;
                } else {
                    int p = (node.direction - min.direction + 6) % 6;
                    t += 3 * Math.min(p, 6 - p);
                }

                if (t < time.get(node.pos)) {
                    time.put(node.pos, t);
                    queue.add(new Node(node.pos, node.direction, t, acceleration));
                }
            }
        }

        return Integer.MAX_VALUE;
    }

    private class Node implements Comparable<Node> {
        Position pos;
        int direction;
        int time;
        int acceleration;

        Node(Position pos, int direction) {
            this.pos = pos;
            this.direction = direction;
        }

        Node(Position pos, int direction, int time, int acceleration) {
            this.pos = pos;
            this.direction = direction;
            this.time = time;
            this.acceleration = acceleration;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(pos, node.pos);
        }

        @Override
        public int hashCode() {
            return Objects.hash(pos);
        }

        @Override
        public int compareTo(Node o) {
            return this.time - o.time;
        }
    }

    private class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position value = (Position) o;
            return x == value.x && y == value.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
