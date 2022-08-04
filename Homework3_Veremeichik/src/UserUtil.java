import java.util.ArrayList;
import java.util.List;


public class UserUtil {


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

    List<User> users1Friends = new ArrayList<>();
    users1Friends.add(user2);
    users1Friends.add(user3);
    user1.setFriend(users1Friends);


    List<User> users2Friends = new ArrayList<>();
    users2Friends.add(user4);
    users2Friends.add(user7);
    user2.setFriend(users2Friends);

    List<User> users3Friends = new ArrayList<>();
    users3Friends.add(user5);
    users3Friends.add(user6);
    user3.setFriend(users3Friends);

    List<User> users7Friends = new ArrayList<>();
    users7Friends.add(user8);
    users7Friends.add(user9);
    user7.setFriend(users7Friends);

    List<User> users9Friends = new ArrayList<>();
    users9Friends.add(user10);
    user9.setFriend(users9Friends);

    List<User> users4Friends = new ArrayList<>();
    users4Friends.add(user10);
    user4.setFriend(users4Friends);

    List<User> users5Friends = new ArrayList<>();
    users5Friends.add(user10);
    user5.setFriend(users5Friends);


    return users;
  }
}

