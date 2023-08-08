import java.util.ArrayList;
import java.util.Calendar;

interface BookInterface {

    String name = "ハリーポッター";
    String author = "D.K";
    String publisher = "集英社";
    int num = 1;
    int numMax = 10;
    Calendar cal = Calendar.getInstance();
    ArrayList<Member> rentalMember = new ArrayList<Member>();
    int id = 0;;
    boolean exist = true;

}
