import java.util.concurrent.Semaphore;

public class CallCenter {

  private static final boolean[] OPERATOR_NUM = new boolean[2];
  private static final Semaphore SEMAPHORE = new Semaphore(2, true);
  private static int usersQuant = 5; // quantity of users

  public static void main(String[] args) throws InterruptedException {

    System.out.println("Коллцентр начал работу");
    for (int i = 1; i <= usersQuant; i++) {
      new Thread(new User(i)).start();
      Thread.sleep(400);
    }
  }
  public static class User implements Runnable {
    private int userNumber;

    public User(int userNumber) {
      this.userNumber = userNumber;
    }

    @Override
    public void run() {
      try {
        SEMAPHORE.acquire();
        int operatorNumber = -1;
        //operator starts working
        synchronized (OPERATOR_NUM) {
          for (int i = 0; i < 2; i++) {
            if (!OPERATOR_NUM[i] && userNumber <= 2) {
              OPERATOR_NUM[i] = true;
              operatorNumber = i;
              System.out.printf("Оператор %d начал работу.\n", i + 1);
              break;
            }
            if (!OPERATOR_NUM[i] && userNumber > 2) {
              OPERATOR_NUM[i] = true;
              operatorNumber = i;
              System.out.printf("Оператор %d взял другого пользователя.\n", i + 1);
              break;
            }
          }
        }
        Thread.sleep(5000);
        synchronized (OPERATOR_NUM) {
          OPERATOR_NUM[operatorNumber] = false;
          System.out.println("Оператор " + (operatorNumber + 1) + " поговорил с юзером " + userNumber);
          if (userNumber == usersQuant) {
            System.out.println("Коллцентр закончил работу");
          }
        }
        SEMAPHORE.release();
      } catch (InterruptedException e) {
      }
    }
  }
}

