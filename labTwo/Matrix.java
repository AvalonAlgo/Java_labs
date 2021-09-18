package labTwo;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix
{
  private double [][] matrix;

  Matrix()
  {
    this.readFromFile();
  }

  private void readFromFile()
  {
    int N;

    try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\deniz\\IdeaProjects\\Lab2\\src\\labTwo\\matrixSize.txt")))
    {
      String line = reader.readLine();
      if (line != null)
      {
        String[] stringArr = line.split(" ");
        if (stringArr.length > 1)
        {
          throw new MultipleNumbersInFile();
        }
        else if (stringArr.length < 1)
        {
          throw new EmptyFile();
        }

        N = Integer.parseInt(stringArr[0]);
        if (N > (10^6))
        {
          throw new InvalidMatrixSize();
        }

        this.matrix = new double [N][N];
        this.fillMatrix();
      }
    }
    catch (InvalidMatrixSize | MultipleNumbersInFile | EmptyFile e)
    {
      System.out.println(e.getMessage());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  private void fillMatrix()
  {
    int N = matrix.length;

    for (int i = 0; i < N; i++)
    {
      for (int j = 0; j < N; j++)
      {
        matrix[i][j] = ThreadLocalRandom.current().nextInt(-N, N + 1);
      }
    }
  }

  private void divide()
  {
    double[][] tempMatrix = new double[matrix.length][matrix.length];
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix.length; j++)
      {
        tempMatrix[i][j] = matrix[i][j];
      }
    }

    double sumAround;
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix.length; j++)
      {
        sumAround = sumAroundIndex(i, j);
        if (Math.abs(sumAround - 0) < (10^(-3)))
        {
          throw new DivideByZero();
        }
        tempMatrix[i][j] = matrix[i][j] / sumAround;
      }
    }
    matrix = tempMatrix;
  }

  private double sumAroundIndex(int i, int j)
  {
    double sum = 0;
    for (int k = i - 1; k <= i + 1; k++)
    {
      for (int z = j - 1; z <= j + 1; z++)
      {
        sum += getValueByIndex(k, z);
      }
    }
    sum -= matrix[i][j];
    return sum;
  }

  private double getValueByIndex(int i, int j)
  {
    if (i < 0 || i >= matrix.length || j < 0 || j >= matrix.length)
    {
      return 0;
    }
    else return matrix[i][j];
  }

  public void rotateLeft()
  {
    int N = matrix.length;
    double[][] rotatedArray = new double[N][N];

    for (int row = 0; row < N; row++)
    {
      for (int col = 0; col < N; col++)
      {
        rotatedArray[row][col] = matrix[col][N - row - 1];
      }
    }
    matrix = rotatedArray;
  }

  public void print()
  {
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix.length; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();
  }

  public void printToFile(FileWriter writer) throws IOException
  {
    for (int i = 0; i < matrix.length; ++i)
    {
      for (int j = 0; j < matrix.length; ++j)
      {
        writer.write(matrix[i][j] + " ");
      }

      writer.write("\n");
    }
  }
}
