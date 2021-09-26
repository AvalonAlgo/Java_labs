public class MultipleNumbersInFileException extends IllegalArgumentException
{
  private final static String MESSAGE = "Expected one number only";

  public MultipleNumbersInFileException ()
  {
    super(MESSAGE);
  }
}
