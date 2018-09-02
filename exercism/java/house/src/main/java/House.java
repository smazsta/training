import java.util.ArrayList;
import java.util.List;

public class House {

    public static final List<String> HOUSE_VERSES = new ArrayList<>();

    String verse(int verseNumber) {
        return HOUSE_VERSES.get(verseNumber - 1);
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse - 1; i < endVerse; i++) {
            sb.append(HOUSE_VERSES.get(i));
            if(i != endVerse - 1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    String sing() {
        return verses(1, 12);
    }

    static {
        HOUSE_VERSES.add("This is the house that Jack built.");
        HOUSE_VERSES.add("This is the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the dog " +
                "that worried the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the cow with the crumpled horn " +
                "that tossed the dog " +
                "that worried the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the maiden all forlorn " +
                "that milked the cow with the crumpled horn " +
                "that tossed the dog " +
                "that worried the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the man all tattered and torn " +
                "that kissed the maiden all forlorn " +
                "that milked the cow with the crumpled horn " +
                "that tossed the dog " +
                "that worried the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the priest all shaven and shorn " +
                "that married the man all tattered and torn " +
                "that kissed the maiden all forlorn " +
                "that milked the cow with the crumpled horn " +
                "that tossed the dog " +
                "that worried the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the rooster that crowed in the morn " +
                "that woke the priest all shaven and shorn " +
                "that married the man all tattered and torn " +
                "that kissed the maiden all forlorn " +
                "that milked the cow with the crumpled horn " +
                "that tossed the dog " +
                "that worried the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the farmer sowing his corn " +
                "that kept the rooster that crowed in the morn " +
                "that woke the priest all shaven and shorn " +
                "that married the man all tattered and torn " +
                "that kissed the maiden all forlorn " +
                "that milked the cow with the crumpled horn " +
                "that tossed the dog " +
                "that worried the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
        HOUSE_VERSES.add("This is the horse and the hound and the horn " +
                "that belonged to the farmer sowing his corn " +
                "that kept the rooster that crowed in the morn " +
                "that woke the priest all shaven and shorn " +
                "that married the man all tattered and torn " +
                "that kissed the maiden all forlorn " +
                "that milked the cow with the crumpled horn " +
                "that tossed the dog " +
                "that worried the cat " +
                "that killed the rat " +
                "that ate the malt " +
                "that lay in the house that Jack built.");
    }
}
