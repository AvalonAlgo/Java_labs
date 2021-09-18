package labTwo;

public class DivideByZero extends RuntimeException
{
  private final static String MESSAGE = "Cannot divide by zero";

  public DivideByZero(Throwable cause)
  {
    super(MESSAGE, cause);
  }

  public DivideByZero()
  {
    super(MESSAGE);
  }
}
