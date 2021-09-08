package labTwo;

public class doTaskTwo
{
  public static void main(String[] args)
  {
    Matrix matrix = new Matrix();
    matrix.print();

    // 90 degrees
    matrix.rotateLeft();
    matrix.print();

    // 180 degrees
    matrix.rotateLeft();
    matrix.print();

    // 270 degrees
    matrix.rotateLeft();
    matrix.print();
  }
}
