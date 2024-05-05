import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(fibb(x));
    System.out.println(fib(x));
    System.out.println(fibbonacci(x));
  }

  public static int fib(int n) {
    return fib(n, new HashMap<Integer, Integer>());
  }

  private static int fib(int n, HashMap<Integer, Integer> map) {
    if (n < 2)
      return n;

    if (map.containsKey(n))
      return map.get(n);

    int res = fib(n - 1, map) + fib(n - 2, map);
    map.put(n, res);
    return res;

  }

  public static int fibbonacci(int n) {
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;

    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }

  public static int fibb(int n) {
    double phi = Math.pow(((1 + Math.sqrt(5)) / 2), n);
    double pho = Math.pow(((1 - Math.sqrt(5)) / 2), n);
    double sqrt = Math.sqrt(5);
    return (int) ((phi - pho) / sqrt);
  }
}