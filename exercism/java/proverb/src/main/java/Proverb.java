class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder sb = new StringBuilder();
        if(this.words.length == 0){
            return "";
        }

        for (int i = 0; i < this.words.length; i++) {
            if(i == words.length - 1){
                sb.append("And all for the want of a " + this.words[0] + ".");
            }
            else {
                sb.append("For want of a " + this.words[i] + " the "
                        + this.words[i+1] + " was lost.\n");
            }
        }

        return sb.toString();
    }

}
