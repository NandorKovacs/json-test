package net.roaringmind.jsontest;

import java.io.FileWriter;
import java.io.IOException;
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

    List<String> children = Arrays.asList(new String[] { max.name, marie.name, robert.name, hans.name });

    try {
      FileWriter fileWriter = new FileWriter("children.json");

      gson.toJson(children, fileWriter);

      fileWriter.close();
    } catch (JsonIOException | IOException e) {
      e.printStackTrace();
    }

    //eddig minden jól néz ki, szupin ki printel json ba

    String[] readChildren = gson.fromJson("children.json", String[].class);

    System.out.println(readChildren);

    //valami nem jó, azt modja stringet talált BEGIN_ARRAY helyett

    //wtf, mér? azt olvassa amit ö maga irt
  }
}
