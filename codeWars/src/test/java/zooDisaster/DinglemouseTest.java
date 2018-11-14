package zooDisaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class DinglemouseTest {

    @Test
    public void example() {
        final String input = "fox,bug,chicken,grass,sheep";
        final String[] expected = {
                "fox,bug,chicken,grass,sheep",
                "chicken eats bug",
                "fox eats chicken",
                "sheep eats grass",
                "fox eats sheep",
                "fox"};
        assertArrayEquals(expected, Dinglemouse.whoEatsWho(input));
    }

    @Test
    public void eatRightMulti() {
        final String input = "giraffe,leaves,leaves,leaves,bear,bug,leaves,leaves,panda";
        final String[] expected = {
                "giraffe,leaves,leaves,leaves,bear,bug,leaves,leaves,panda",
                "giraffe eats leaves",
                "giraffe eats leaves",
                "giraffe eats leaves",
                "bear eats bug",
                "bear eats leaves",
                "bear eats leaves",
                "giraffe, bear, panda"};
        assertArrayEquals(expected, Dinglemouse.whoEatsWho(input));
    }

    @Test
    public void knownAndUnknownThings() {
        final String input = "fox,chicken,tree,chicken,bug,banana,bug,bear";
        final String[] expected = {
                "fox,chicken,tree,chicken,bug,banana,bug,bear",
                "fox eats chicken",
                "chicken eats bug",
                "bear eats bug",
                "fox,tree,chicken,banana,bear"};
        assertArrayEquals(expected, Dinglemouse.whoEatsWho(input));
    }

    @Test
    public void random() {
        final String input = "Random Test #1: ZOO = panda,big-fish,sheep,leaves,little-fish\n" +
                "\tpanda,big-fish,sheep,leaves,little-fish\n" +
                "panda,big-fish,sheep,leaves,little-fish";
        final String[] expected = {
                "panda,big-fish,sheep,leaves,little-fish,panda,big-fish,sheep,leaves,little-fish,panda,big-fish,sheep,leaves,little-fish",
                "panda,big-fish,sheep,leaves,little-fish,panda,big-fish,sheep,leaves,little-fish,panda,big-fish,sheep,leaves,little-fish"};
        assertArrayEquals(expected, Dinglemouse.whoEatsWho(input));
    }

    @Test
    public void eatRightSingle() {
        final String input = "bear,big-fish,lion,cow,bug,leaves";
        final String[] expected = {
                "bear,big-fish,lion,cow,bug,leaves",
                "bear eats big-fish",
                "lion eats cow",
                "bug eats leaves",
                "bear,lion,bug"};
        assertArrayEquals(expected, Dinglemouse.whoEatsWho(input));
    }

    @Test
    public void eatLeftSingle() {
        final String input = "chicken,fox,leaves,bug,grass,sheep";
        final String[] expected = {
                "fox,bug,chicken,grass,sheep",
                "chicken eats bug",
                "fox eats chicken",
                "sheep eats grass",
                "fox eats sheep",
                "fox"};
        assertArrayEquals(expected, Dinglemouse.whoEatsWho(input));
    }

    @Test
    public void nobodyEatsAnything() {
        final String input = "fox,grass,chicken,lion,panda";
        final String[] expected = {
                "fox,grass,chicken,lion,panda",
                "fox,grass,chicken,lion,panda"};
        assertArrayEquals(expected, Dinglemouse.whoEatsWho(input));
    }

}