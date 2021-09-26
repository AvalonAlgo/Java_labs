public class FileNotFoundException extends RuntimeException
{
  private final static String MESSAGE = "Unable to locate the desired file";

  public FileNotFoundException ()
  {
    super(MESSAGE);
  }
}
