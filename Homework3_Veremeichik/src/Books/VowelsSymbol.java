package Books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum VowelsSymbol {
  A('А'),
  O('О'),
  U('У'),
  I('И'),
  E('Э'),
  Y('Ы'),
  YA('Я'),
  YU('Ю'),
  IE('Е');

  private static final List<Character> VALUES;

  private final Character value;

  static {
    VALUES = new ArrayList<>();
    for (VowelsSymbol someEnum : VowelsSymbol.values()) {
      VALUES.add(someEnum.value);
    }
  }

  VowelsSymbol(Character value) {
    this.value = value;
  }

  public static List<Character> getValues() {
    return Collections.unmodifiableList(VALUES);
  }
}
