public class DivideByZeroException extends RuntimeException
{
  private final static String MESSAGE = "Cannot divide by zero";

  public DivideByZeroException ()
  {
    super(MESSAGE);
  }
}
