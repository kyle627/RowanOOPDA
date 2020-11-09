import java.io.*;

public class Driver {

	public static void main(String[] args) {
		
		try (PrintWriter pw = new PrintWriter("OOPDA3.txt")) {
			
			pw.println("Hello OOPDA 3!");
			for(int i = 0; i < 10; i++) {
				pw.println(i);
			}
			
		} catch(IOException e) {
			
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("OOPDA3.txt"))){
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
