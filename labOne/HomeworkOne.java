package Lab;

import java.util.Scanner;

public class HomeworkOne
{
  public static void main(String[] args)
  {
    Hero hero = new Hero();

    System.out.print("How should the hero travel?: " + "\n" +
            "1 - walk" + "\n" +
            "2 - run" + "\n" +
            "3 - drive\n");

    while (true)
    {
      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();
      double time = sc.nextDouble();

      if (choice == 1)
      {
        hero.setStrategy(new moveByWalk());
      }
      else if (choice == 2)
      {
        hero.setStrategy(new moveByRun());
      }
      else if (choice == 3)
      {
        hero.setStrategy(new moveByDrive());
      }
      else
      {
        break;
      }

      hero.executeMove(time);
      System.out.printf("Current hero position = %.2f \n", hero.position);
    }
  }
}
