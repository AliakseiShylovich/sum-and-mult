public class Main {
    public static void main(String[] args) {
       int a, b, c, e, f;
       a = 99;
       e = 0;
       f = 1;
          do {
             b = a % 10;
             c = a / 10;
             a = c;
             e = e + b;
             f = f*b;
          } while (c != 0);
       {
          System.out.println(e);
          System.out.println(f);
       }
       }

    }
