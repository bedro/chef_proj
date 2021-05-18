package my.home.chef_proj.util;

import java.io.File;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FolderUtils {
public static Set<File> parseFolder(String dir){
        return Stream.of(new File(dir).listFiles())
                .filter(file -> file.isDirectory())
//                .map(file1 -> file1.getParentFile().getName()+"\\"+file1.getName())
                .collect(Collectors.toSet());
    }
    public static Set<File> parseFiles(String dir){
        return Stream.of(new File(dir).listFiles())
                .filter(file -> !file.isDirectory())
//                .map(File::getName)
//                .map(file1 -> file1.getParentFile().getName()+"\\"+file1.getName())
                .collect(Collectors.toSet());
    }
}
