
public class book {
	int book_id;
	String name;
	String author_name;
	int price;
	public book(int book_id, String name, String author_name, int price ) {
		this.book_id= book_id;
		this.name= name;
		this.author_name= author_name;
		this.price= price;
	}
	
	public void setbook_id(int book_id){
		this.book_id= book_id;
	}
	public void setname(String name){
		this.name= name;
	}
	
	public void setauthor_name(String author_name){
		this.author_name= author_name;
	}
	public void setprice(int price){
		this.price= price;
	}
	public int getbook_id() {
		return book_id;		
	}
	public String getname() {
		return name;		
	}
	public String getauthor_name() {
		return author_name;		
	}
	public int getprice() {
		return price;		
	}

}
