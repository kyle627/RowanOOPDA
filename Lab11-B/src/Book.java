
@SuppressWarnings("serial")
public class Book implements java.io.Serializable{
	
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    
    public String  toString() {
         
        return title + "..."+ pages;
    }
}
