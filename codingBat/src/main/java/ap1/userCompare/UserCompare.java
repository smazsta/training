package ap1.userCompare;

public class UserCompare {

    public static int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) == 0) {
            if(aId == bId){
                return 0;
            } else {
                return aId < bId ? -1 : 1;
            }
        } else {
            return aName.compareTo(bName) > 0 ? 1 : -1;
        }
    }
}
