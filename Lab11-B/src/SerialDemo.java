import java.io.*;

public class SerialDemo {
	
     public static void main(String args[]) throws Exception {
         File f1 = new File("bookdata.dat");
         
         ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream (f1));
             
         Book b[] = new Book[3]; //new Book object
         
         b[0] = new Book("War and Peace" , 345);
         
         b[1] = new Book("BlueJ for Profit" , 245);
         
         try {
        	 for(int i=0; i < 2; i++) {
            	 os.writeObject(b[i]);
             }
             os.close();
         } catch(FileNotFoundException e) {
        	 System.out.println(e.getMessage());
         } catch(Exception e) {
        	 System.out.println(e.getMessage());
         }
         
         
         
         /**
          * Create a new Object Input Stream to read in the the object data from the file f1
          * Loop through each line (like above) to print each line to the console.
          * **Utilize the readObject() method**
          */
         ObjectInputStream is = new ObjectInputStream(new FileInputStream(f1));
         try {
        	 for(int i = 0; i < 2; i++) {
        		 //it mentions casting to "Book" , however this wasn't necessary?
            	 System.out.println(is.readObject());
             }
        	 is.close();
         } catch(FileNotFoundException e) {
        	 System.out.println(e.getMessage());
         } catch(Exception e) {
        	 System.out.println(e.getMessage());
         }  
         
    }
}
