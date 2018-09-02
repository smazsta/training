public class PigLatinTranslator {

    public String translate(String phrase){
        StringBuilder sb = new StringBuilder(phrase);
        String beginWithVowelRegex = "^[aefhilmnxsyou].*";
        String beginningDoubleRegex = "^(ch|qu|th|rh).*";
        String beginningTripleRegex = "^(sch|squ|thr).*";

        if(phrase.matches(beginningDoubleRegex)) {
            sb.append(phrase, 0, 2).append("ay");
            sb.delete(0, 2);
        } else if(phrase.matches(beginWithVowelRegex) || phrase.matches("^(xe).*")){
            sb.append("ay");
        } else if(phrase.matches(beginningTripleRegex)){
            sb.append(phrase, 0, 3).append("ay");
            sb.delete(0, 3);
        } else {
            sb.append(phrase.charAt(0)).append("ay");
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
