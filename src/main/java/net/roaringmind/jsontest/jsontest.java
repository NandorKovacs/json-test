package net.roaringmind.jsontest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

/**
 * Hello world!
 *
 */
public class jsontest {
  public static void main(String[] args) {
    Gson gson = new Gson();

    Child max = new Child(5, "max");

    Child hans = new Child(8, "hans");

    Child marie = new Child(4, "marie");

    Child robert = new Child(14, "robert");

    List<Child> children = Arrays.asList(new Child[] { max, marie, robert, hans });

    try {
      FileWriter fileWriter = new FileWriter("children.json");
      gson.toJson(children, fileWriter);

      fileWriter.close();

      Reader reader = new FileReader("children.json");
      Child[] readChildren = gson.fromJson(reader, Child[].class);

      for (Child s : readChildren) {
        System.out.println(s + "\n");
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
