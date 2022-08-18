import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class UserUtil {

  public static List<User> friendCreation() {
    List<User> userList = usersExamples();
    List<User> listUsersWithFriends = new ArrayList<>();

    int j = userList.size() - 3;
    Random generator = new Random();
    for (int i = 0; i <= j; i++) {                                         // for adding 2 friends
      int n = generator.nextInt(userList.size());
      User userRandom = userList.get(n);                               // selection random user from user list
      List<User> userFriands = new ArrayList<>();
      userList.remove(n);                                             // remove selected user from the list
      n = generator.nextInt(userList.size());                        // selected friends from user list
      User friend1 = userList.get(n);
      userFriands.add(friend1);
      int b = -1;
      while (userList.size() >= 2) {
        b = (int) Math.floor(Math.random() * userList.size());
        if (b != n) {
          User friend2 = userList.get(b);
          userFriands.add(friend2);
          break;
        }
      }
      userRandom.setFriend(userFriands);
      listUsersWithFriends.add(userRandom);
    }
    return listUsersWithFriends;
  }

  public static List<User> usersExamples() {

    List<User> users = new ArrayList<>();

    User user1 = new User(1L, "Антон", "Пупа");
    User user2 = new User(2L, "Татьяна", "Шашок");
    User user3 = new User(3L, "Виталий", "Куликович");
    User user4 = new User(4L, "Надежда", "Демидова");
    User user5 = new User(5L, "Оксана", "Дранкевич");
    User user6 = new User(6L, "Вадим", "Козак");
    User user7 = new User(7L, "Алена", "Андрончик");
    User user8 = new User(8L, "Вадим", "Мишук");
    User user9 = new User(9L, "Елена", "Кацпшик");
    User user10 = new User(10L, "Александр", "Чижиков");

    users.add(user1);
    users.add(user2);
    users.add(user3);
    users.add(user4);
    users.add(user5);
    users.add(user6);
    users.add(user7);
    users.add(user8);
    users.add(user9);
    users.add(user10);

    return users;
  }
}

