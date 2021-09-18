package labTwo;

public class EmptyFile extends IllegalArgumentException
{
  private final static String MESSAGE = "File is empty";

  public EmptyFile(Throwable cause)
  {
    super(MESSAGE, cause);
  }

  public EmptyFile()
  {
    super(MESSAGE);
  }
}
