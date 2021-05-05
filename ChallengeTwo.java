public class Main {
  /** @return the index of optimal (balanced) sum of numbers found in an array */
  public static int getOptimal(int input[], int n) {
    //TODO
        int i;
        for(i = 0; i < n; i++)
        {
            if(input[i] == i)
                return i;
        }
        return -1;
  }

  public static void main(String[] args) {
    int input[] = {1,1};
    int n = input.length;
    System.out.println(getOptimal(input, n));
  }
}
