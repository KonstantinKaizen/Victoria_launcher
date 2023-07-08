import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Language {







    public static void sync_language(String path){

        System.out.println("sync lang enter");

        if(Graphic.language_russian){

            if(Files.exists(Paths.get(path+"ENG.txt"))){

                try {
                    System.out.println("rename to rus");

                    Path source = Paths.get(path+"a.csv");
                    Files.move(source, source.resolveSibling("c.csv"));

                    Path source1 = Paths.get(path+"b.csv");
                    Files.move(source1, source1.resolveSibling("a.csv"));

                    Path source2 = Paths.get(path+"c.csv");
                    Files.move(source2, source2.resolveSibling("b.csv"));

                    Path source3 = Paths.get(path+"ENG.txt");
                    Files.move(source3, source3.resolveSibling("RUS.txt"));


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }

        } else {


            if(Files.exists(Paths.get(path+"RUS.txt"))){


                try {
                    System.out.println("rename to eng");

                    Path source = Paths.get(path+"a.csv");
                    Files.move(source, source.resolveSibling("c.csv"));

                    Path source1 = Paths.get(path+"b.csv");
                    Files.move(source1, source1.resolveSibling("a.csv"));

                    Path source2 = Paths.get(path+"c.csv");
                    Files.move(source2, source2.resolveSibling("b.csv"));

                    Path source3 = Paths.get(path+"RUS.txt");
                    Files.move(source3, source3.resolveSibling("ENG.txt"));


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }




            }


        }




    }

}
