package Lab;

public class moveByDrive implements Strategy
{
  private static final double speed = 20;

  public double move(double duration)
  {
    System.out.println("driving");
    return duration * speed;
  }
}
