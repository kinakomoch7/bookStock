import java.util.ArrayList;
import java.util.Calendar;

interface MemberManageInterface extends MemberInterface {
    void memberRegister(MemberList ml);

    void memberEdit(MemberList ml);

    String[] memberName();

    String[] memberAddress();

    static int idManagement(MemberList ml) {
        return idManagement(ml);
    };

    void DelayCheck(MemberList ml);

    Member createMember(String[] name, String[] address, ArrayList<Book> rentalBook, boolean penalty,
            Calendar penaltyDate, int id);
}
