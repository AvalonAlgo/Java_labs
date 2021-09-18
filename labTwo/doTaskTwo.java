package labTwo;

import java.io.FileWriter;
import java.io.IOException;

public class doTaskTwo
{
  public static void main(String[] args)
  {
    try
    {
      FileWriter writer = new FileWriter("output.txt", false);

      Matrix matrix = new Matrix();
      matrix.print();

      // 90 degrees
      matrix.rotateLeft();
      matrix.print();
      matrix.printToFile(writer);
      writer.write("\n");

      // 180 degrees
      matrix.rotateLeft();
      matrix.print();
      matrix.printToFile(writer);
      writer.write("\n");

      // 270 degrees
      matrix.rotateLeft();
      matrix.print();
      matrix.printToFile(writer);

      writer.flush();
    }
    catch (IOException e)
    {
      System.out.println(e);
    }
  }
}
