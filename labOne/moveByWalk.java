package Lab;

public class moveByWalk implements Strategy
{
  private static final double speed = 1.4;

  public double move(double duration)
  {
    System.out.println("walking");
    return duration * speed;
  }
}
