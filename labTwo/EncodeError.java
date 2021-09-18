package labTwo;

import java.io.IOException;

public class EncodeError extends IOException
{
  private final static String MESSAGE = "Invalid encoding format";

  public EncodeError(Throwable cause)
  {
    super(MESSAGE, cause);
  }

  public EncodeError()
  {
    super(MESSAGE);
  }
}
