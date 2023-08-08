import java.util.ArrayList;
import java.util.Calendar;

interface MemberInterface {
    static Member createMember(String[] name, String[] address, ArrayList<Book> rentalBook, boolean penalty,
            Calendar penaltyDate, int id) {

        return new Normal(name, address, rentalBook, penalty, penaltyDate, id);
    }
}
