package com.example.topcoder.tree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 2/5/2020
 */
public class DirectoryTreeTest {

    private DirectoryTree directoryTree;

    @BeforeMethod
    public void setup() {
        this.directoryTree = new DirectoryTree();
    }

    @Test
    public void testDisplay0() {
        //setup
        String[] files = new String[]{
                "/usr/lib/libc", "/usr/bin/find", "/home/schveiguy/bashrc",
                "/usr/bin/bash", "/usr/local/bin/ssh"
        };
        String[] expected = new String[]{
                "ROOT",
                "+-home",
                "| +-schveiguy",
                "|   +-bashrc",
                "+-usr",
                "  +-bin",
                "  | +-bash",
                "  | +-find",
                "  +-lib",
                "  | +-libc",
                "  +-local",
                "    +-bin",
                "      +-ssh"
        };

        //test
        String[] output = this.directoryTree.display(files);

        //verify
        assertEquals(output, expected);
    }

    @Test
    public void testDisplay1() {
        //setup
        String[] files = new String[]{
                "/dir/dir/file", "/dir/file", "/file",
                "/dir/sharedname/dir", "/dir/dir/sharedname"
        };
        String[] expected = new String[]{
                "ROOT",
                "+-dir",
                "| +-dir",
                "| | +-file",
                "| | +-sharedname",
                "| +-file",
                "| +-sharedname",
                "|   +-dir",
                "+-file"
        };

        //test
        String[] output = this.directoryTree.display(files);

        //verify
        assertEquals(output, expected);
    }

    @Test
    public void testDisplay2() {
        //setup
        String[] files = new String[]{
                "/a/a/a/a/a/a/a","/a/b/a/a/a/a/a","/a/a/a/a/b/a/a"
        };
        String[] expected = new String[]{
                "ROOT",
                "+-a",
                "  +-a",
                "  | +-a",
                "  |   +-a",
                "  |     +-a",
                "  |     | +-a",
                "  |     |   +-a",
                "  |     +-b",
                "  |       +-a",
                "  |         +-a",
                "  +-b",
                "    +-a",
                "      +-a",
                "        +-a",
                "          +-a",
                "            +-a"
        };

        //test
        String[] output = this.directoryTree.display(files);

        //verify
        assertEquals(output, expected);
    }

    @Test
    public void testDisplay3() {
        //setup
        String[] files = new String[]{
                "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/y", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/x", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/w", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/v", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/u", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/t", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/s", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/r", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/q", "/a/b/c/d/e/f/g/h/i/j/k/l/m/n/p", "/a/b/c/d/e/f/g/h/i/j/k/l/m/o", "/a/b/c/d/e/f/g/h/i/j/k/l/n", "/a/b/c/d/e/f/g/h/i/j/k/m", "/a/b/c/d/e/f/g/h/i/j/l", "/a/b/c/d/e/f/g/h/i/k", "/a/b/c/d/e/f/g/h/j", "/a/b/c/d/e/f/g/i", "/a/b/c/d/e/f/h", "/a/b/c/d/e/g", "/a/b/c/d/f", "/a/b/c/e", "/a/b/d", "/a/c", "/b"
        };
        String[] expected = new String[]{
                "ROOT", "+-a", "| +-b", "| | +-c", "| | | +-d", "| | | | +-e", "| | | | | +-f", "| | | | | | +-g", "| | | | | | | +-h", "| | | | | | | | +-i", "| | | | | | | | | +-j", "| | | | | | | | | | +-k", "| | | | | | | | | | | +-l", "| | | | | | | | | | | | +-m", "| | | | | | | | | | | | | +-n", "| | | | | | | | | | | | | | +-o", "| | | | | | | | | | | | | | | +-p", "| | | | | | | | | | | | | | | | +-q", "| | | | | | | | | | | | | | | | | +-r", "| | | | | | | | | | | | | | | | | | +-s", "| | | | | | | | | | | | | | | | | | | +-t", "| | | | | | | | | | | | | | | | | | | | +-u", "| | | | | | | | | | | | | | | | | | | | | +-v", "| | | | | | | | | | | | | | | | | | | | | | +-w", "| | | | | | | | | | | | | | | | | | | | | | | +-x", "| | | | | | | | | | | | | | | | | | | | | | | | +-y", "| | | | | | | | | | | | | | | | | | | | | | | +-y", "| | | | | | | | | | | | | | | | | | | | | | +-x", "| | | | | | | | | | | | | | | | | | | | | +-w", "| | | | | | | | | | | | | | | | | | | | +-v", "| | | | | | | | | | | | | | | | | | | +-u", "| | | | | | | | | | | | | | | | | | +-t", "| | | | | | | | | | | | | | | | | +-s", "| | | | | | | | | | | | | | | | +-r", "| | | | | | | | | | | | | | | +-q", "| | | | | | | | | | | | | | +-p", "| | | | | | | | | | | | | +-o", "| | | | | | | | | | | | +-n", "| | | | | | | | | | | +-m", "| | | | | | | | | | +-l", "| | | | | | | | | +-k", "| | | | | | | | +-j", "| | | | | | | +-i", "| | | | | | +-h", "| | | | | +-g", "| | | | +-f", "| | | +-e", "| | +-d", "| +-c", "+-b"
        };

        //test
        String[] output = this.directoryTree.display(files);

        //verify
        assertEquals(output, expected);
    }
}