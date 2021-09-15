import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Book> map = new HashMap<Integer, Book>();

		Book b1 = new Book(1, 4, "abcd", "java", "pqr");

		Book b2 = new Book(2, 7, "abcdef", "javaScript", "pqrst");

		Book b3 = new Book(3, 9, "abcdgh", "Advance java", "pqruvw");

		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();

			System.out.println(key + " Details:");

			System.out.println(b.bid + " " + b.quantity + " " + b.author + " " + b.bname + " " + b.publishar);

		}
	}

}
