package labTwo;

import javax.management.RuntimeErrorException;

public class FileNotFound extends RuntimeException
{
  private final static String MESSAGE = "Unable to locate the desired file";

  public FileNotFound(Throwable cause)
  {
    super(MESSAGE, cause);
  }

  public FileNotFound()
  {
    super(MESSAGE);
  }
}
