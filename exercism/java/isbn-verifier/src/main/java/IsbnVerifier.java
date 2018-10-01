class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        if(stringToVerify.isEmpty()){
            return false;
        }

        String cleanString = stringToVerify.replaceAll("-", "");

        if(cleanString.length() != 10 || cleanString.matches("\\d{9}[0-9|X]?") ){
            return false;
        }

        int isbnSum = 0;
        int currentNumber = 0;

        for (int index = 0, multiplier = cleanString.length();
               index < cleanString.length(); index++, multiplier--) {
            if(cleanString.charAt(index) == 'X'){
                currentNumber = 10;
            } else {
                currentNumber = Integer.parseInt(cleanString.substring(index, index + 1));
            }
            isbnSum = isbnSum + currentNumber * multiplier;
        }

        return isbnSum % 11 == 0;
    }
}
