package practicando.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import practicando.junit.DateChecker.Month;

public class DateCheckerTest {

    DateChecker dChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY","MARCH","MAY","JULY","AUGUST","OCTOBER","DECEMBER"})
    public void testHas31Days(Month month){
        boolean actual = dChecker.has31Days(month);
        assertTrue(actual);

    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"FEBRUARY","APRIL","JUNE","SEPTEMBER","NOVEMBER"})
    public void testHasNot31Days(Month month){
        boolean actual = dChecker.has31Days(month);
        assertFalse(actual);

    }
}
