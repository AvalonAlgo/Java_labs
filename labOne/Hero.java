package Lab;

public class Hero
{
  private Strategy strategy;
  public double position = 0;

  Hero(int position)
  {
    this.position = position;
  }

  Hero()
  {
    this.position = 0;
  }

  public void setStrategy(Strategy strategy)
  {
    this.strategy = strategy;
  }

  public void executeMove(double time)
  {
    position = strategy.move(time);
  }
}
