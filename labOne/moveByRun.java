package Lab;

public class moveByRun implements Strategy
{
  private static final double speed = 5;

  public double move(double duration)
  {
    System.out.println("running");
    return duration * speed;
  }
}
