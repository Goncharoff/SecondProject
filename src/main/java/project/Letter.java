package project;

public class Letter implements Splitter {

  @Override
  public String[] split(String source) {
    return source.replaceAll("\\W", "").split("");
  }

}
