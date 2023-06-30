package systems.loreto.java8.dateAndTimeApi;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateAndTimeApiTest {

    @Test
    void period_between() {
        LocalDate startDate = LocalDate.of(2023, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2023, Month.JUNE, 3);

        Period period = Period.between(startDate, endDate);

        assertEquals(5, period.getMonths());
        assertEquals(0, period.getYears());
        assertEquals(2, period.getDays());
    }

    @Test
    void local_date_manipulation() {
        LocalDate currentDate = LocalDate.of(2023, Month.JANUARY, 1);

        LocalDate nextMonth = currentDate.plusMonths(1);
        LocalDate nextYear = currentDate.plusYears(1);
        LocalDate previousWeek = currentDate.minusWeeks(1);

        assertEquals(2, nextMonth.getMonthValue());
        assertEquals(2024, nextYear.getYear());
        assertEquals(2022, previousWeek.getYear());
    }
}
