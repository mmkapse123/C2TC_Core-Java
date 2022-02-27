import java.io.FileInputStream;
import java.io.FileNotFoundException;
class exception7 {
	public void checkFileNotFound()
   {
   try
   {
   FileInputStream in = new FileInputStream("input.txt");
   System.out.println("This is not printed");
   }
   catch (Exception fileNotFoundException)
   {
   System.out.println(fileNotFoundException+"file not found exception");
   }
}
  public static void main(String[] args) {
	  exception7 example = new exception7();
      example.checkFileNotFound();
    }
}
