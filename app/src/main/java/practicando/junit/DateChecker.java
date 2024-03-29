package practicando.junit;

public class DateChecker {

    enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31Days(Month month){
        int numMonth = month.ordinal() +1;
        
        if (numMonth <= 7) {
            return numMonth % 2 != 0;
        }else{
            return numMonth % 2 == 0;
        }
    }

}

