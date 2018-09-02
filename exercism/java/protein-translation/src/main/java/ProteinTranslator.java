import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    public static final int CODON_LENGTH = 3;
    public static final Map<String, String> proteinsMap = new HashMap<>();

    List<String> translate(String rnaSequence) {
        List<String> proteinChainNames = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i = i + CODON_LENGTH) {
            String codon = rnaSequence.substring(i, i + CODON_LENGTH);
            if (proteinsMap.get(codon).equals("STOP")) {
                return proteinChainNames;
            } else {
                proteinChainNames.add(proteinsMap.get(codon));
            }
        }

        return proteinChainNames;
    }

    static {
        proteinsMap.put("AUG", "Methionine");
        proteinsMap.put("UUU", "Phenylalanine");
        proteinsMap.put("UUC", "Phenylalanine");
        proteinsMap.put("UUA", "Leucine");
        proteinsMap.put("UUG", "Leucine");
        proteinsMap.put("UCU", "Serine");
        proteinsMap.put("UCC", "Serine");
        proteinsMap.put("UCA", "Serine");
        proteinsMap.put("UCG", "Serine");
        proteinsMap.put("UAU", "Tyrosine");
        proteinsMap.put("UAC", "Tyrosine");
        proteinsMap.put("UGU", "Cysteine");
        proteinsMap.put("UGC", "Cysteine");
        proteinsMap.put("UGG", "Tryptophan");
        proteinsMap.put("UAA", "STOP");
        proteinsMap.put("UAG", "STOP");
        proteinsMap.put("UGA", "STOP");
    }

}