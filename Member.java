import java.util.ArrayList;
import java.util.Calendar;

public class Member {
	int id;
	String[] name = new String[2];
	int rentalNumber;
	String[] address = new String[3];
	ArrayList<Book> rentalBook = new ArrayList<Book>();
	int rentalMax;
	int rentalLimit;
	boolean penalty;
	Calendar penaltyDate;

	public Member createMember(String[] name, String[] address, ArrayList<Book> rentalBook, boolean penalty,
			Calendar penaltyDate, int id) {
		Member member = new Member();
		this.name = name;
		this.address = address;
		if (rentalBook == null) {
			this.rentalBook = new ArrayList<Book>();
			this.rentalNumber = 0;
		} else {
			this.rentalBook = rentalBook;
			this.rentalNumber = rentalBook.size();
		}
		this.exist = true;
		this.penalty = penalty;
		this.penaltyDate = penaltyDate;
		this.rentalMax = 3;
		this.rentalLimit = 14;
		this.id = id;

		return member;
	}

	public Calendar getPenaltyDate() {
		return penaltyDate;
	}

	boolean exist;
}
