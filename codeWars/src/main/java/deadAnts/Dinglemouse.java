/**
 * An orderly trail of ants is marching across the park picnic area.
 *
 * It looks something like this:
 *
 * ..ant..ant.ant...ant.ant..ant.ant....ant..ant.ant.ant...ant..
 *
 * But suddenly there is a rumour that a dropped chicken sandwich has been spotted
 * on the ground ahead. The ants surge forward! Oh No, it's an ant stampede!!
 *
 * Some of the slower ants are trampled, and their poor little ant bodies are broken
 * up into scattered bits.
 *
 * The resulting carnage looks like this:
 *
 * ...ant...ant..nat.ant.t..ant...ant..ant..ant.anant..t
 *
 * Can you find how many ants have died?
 *
 * When in doubt, assume that the scattered bits are from the same ant.
 * e.g. 2 heads and 1 body = 2 dead ants, not 3
 */

package deadAnts;

public class Dinglemouse {

    public static int deadAntCount(final String ants) {
        if(ants == null) return 0;
        String s = ants.replaceAll("ant", "");
        long heads = s.chars().filter(i -> i == 'a').count();
        long bodies = s.chars().filter(i -> i == 'n').count();
        long tails = s.chars().filter(i -> i == 't').count();
        return (int)Math.max(Math.max(heads,bodies),tails);
    }

    public static void main(String[] args) {
        System.out.println(Dinglemouse.deadAntCount(""));
    }
}
