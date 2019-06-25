package project;

public class Word implements Splitter {

  @Override
  public String[] split(String source) {
    return source.split("\\W+");
  }

}
