package Lesson19;

public class SeaonFinder {
    public enum Month {
        YANVAR, FEVRAL, MART, APREL, MAY, IYUN, IYUL, AVQUST, SENTYABR, OKTYABR, NOYABR, DEKABR;

    }

    public static Month getMonth() {

        int randomMonthIndex = (int) (Math.random() * Month.values().length);
        return Month.values()[randomMonthIndex];
    }
}