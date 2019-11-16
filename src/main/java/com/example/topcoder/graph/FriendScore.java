package com.example.topcoder.graph;

/*
 * You want to determine the most popular person in a social network. To do this, you will count the number of "2-friends" that each person has. Person A is called a 2-friend of another person B if they are friends with each other or if there exists some person C who is a friend of both A and B. The most popular person is the person with the highest number of 2-friends. (There might be more than one if multiple people all have the maximal number of 2-friends.)
 * You are given a String[] friends, where the j-th character of the i-th element is 'Y' if person i and person j are friends, and 'N' otherwise. Return the number of 2-friends of the most popular person in this social network.
 */

public class FriendScore {

    public int highestScore(String[] friends) {
        int n = friends.length;

        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (friends[i].charAt(j) == 'Y') {
                    count++;
                    continue;
                }

                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) {
                        continue;
                    }

                    if (friends[i].charAt(k) == 'Y' && friends[j].charAt(k) == 'Y') {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
