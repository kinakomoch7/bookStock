import java.util.ArrayList;
import java.util.Calendar;

interface MemberInterface {
    Member createMember(String[] name, String[] address, ArrayList<Book> rentalBook, boolean penalty,
            Calendar penaltyDate, int id);
}
