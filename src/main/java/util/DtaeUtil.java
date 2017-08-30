package util;

import java.time.LocalDate;
import java.time.Month;

public class DtaeUtil {
    public static LocalDate of(int year, Month month) {
        return LocalDate.of(year, month, 1);
    }
}
