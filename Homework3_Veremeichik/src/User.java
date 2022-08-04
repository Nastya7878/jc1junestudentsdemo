import java.util.List;

public class User {
  private Long id;
  private String name;
  private String surname;
  private List<User> friend;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public List<User> getFriend() {
    return friend;
  }

  public void setFriend(List<User> friend) {
    this.friend = friend;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", friend=" + friend +
            '}';
  }

  public User(Long id, String name, String surname) {
    this.id = id;
    this.name = name;
    this.surname = surname;


  }
}

