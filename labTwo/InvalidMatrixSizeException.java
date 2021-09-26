public class InvalidMatrixSizeException extends IllegalArgumentException
{
  private final static String MESSAGE = "Array parameters cannot be greater than 10^6";

  public InvalidMatrixSizeException ()
  {
    super(MESSAGE);
  }
}
