public class LeapYear {
    public static void main(String[] args) {
    System.out.println ( isLeapYear (1600)  );

    }
    public static boolean isLeapYear(int year) {
       /* if ((year < 1) | (year > 9999)) return false;
        if (((year % 4) != 0) | ((year % 100) == 0) & ((year % 400) == 0)) {
            return false;
        }
        return true;*/
        if (year <= 0)  {
            //System.out.println("Not 1");
            return false;
        }
        if (year >= 9999) {
            //System.out.println("Not 2");
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    //System.out.println("yeas ");
                    return true;
                }
            }
            else {
                //System.out.println("yeas ");
                return true;
            }

        }
        else System.out.print(year);
        return false;

    }
}
