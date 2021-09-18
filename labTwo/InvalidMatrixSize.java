package labTwo;

public class InvalidMatrixSize extends IllegalArgumentException
{
  private final static String MESSAGE = "Array parameters cannot be greater than 10^6";

  public InvalidMatrixSize(Throwable cause)
  {
    super(MESSAGE, cause);
  }

  public InvalidMatrixSize()
  {
    super(MESSAGE);
  }
}
