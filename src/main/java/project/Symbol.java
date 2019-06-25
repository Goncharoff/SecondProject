package project;

public class Symbol implements Splitter {

  @Override
  public String[] split(String source) {
    return source.replaceAll("\\s+", "")
            .split("\\w+");
  }

}
