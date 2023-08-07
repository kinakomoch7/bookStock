import java.util.Calendar;
import java.util.ArrayList;

public class Book{
	String name;
	String author;
	String publisher;
	int num;
	int numMax;
	Calendar cal;
	ArrayList<Member> rentalMember = new ArrayList<Member>();
	int id;
	boolean exist;

	public Book(String name, String author, String publisher, int num,int id){
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.num = num;
		this.numMax = num;
		this.exist = true;
		this.id = id;
	}

	public Book(String name, String author, String publisher,int id){
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.id = id;
	}

}
