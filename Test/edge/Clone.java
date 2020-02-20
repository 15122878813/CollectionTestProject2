package edge;

class Book implements Cloneable{
	private String name;

	public Book(String name) {
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Book(this.name);
	}
//	@Override
//	public String toString() {
//		return "Book [name=" + name + "]";
//	}
}
public class Clone {
	public static void main(String[] args) throws Exception {
		Book book1 = new Book("金瓶梅");
		Object book2 = book1.clone();
		System.out.println(book2 instanceof Book);
		System.out.println(book1);
		System.out.println(book2);
	}
}
