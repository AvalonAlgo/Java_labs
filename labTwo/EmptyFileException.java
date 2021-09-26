public class EmptyFileException extends IllegalArgumentException
{
  private final static String MESSAGE = "File is empty";

  public EmptyFileException ()
  {
    super(MESSAGE);
  }
}
