class Twofer {
    String twofer(String name) {
		String aName = name;
        if(name == null || name.isEmpty()){
            aName = "you";
        }
        return "One for " + aName + ", one for me.";
    }
}
