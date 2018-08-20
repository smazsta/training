class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
        int numberOfDigits = String.valueOf(numberToCheck).length();
        int tempNumber = numberToCheck;
        double sum = 0;

        while (tempNumber > 0) {
            sum = sum + Math.pow((tempNumber % 10), numberOfDigits);
            tempNumber = tempNumber / 10;
        }

	    return sum == numberToCheck;
	}

}
