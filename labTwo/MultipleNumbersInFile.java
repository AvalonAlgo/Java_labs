package labTwo;

public class MultipleNumbersInFile extends IllegalArgumentException
{
  private final static String MESSAGE = "Expected one number only";

  public MultipleNumbersInFile(Throwable cause)
  {
    super(MESSAGE, cause);
  }

  public MultipleNumbersInFile()
  {
    super(MESSAGE);
  }
}
