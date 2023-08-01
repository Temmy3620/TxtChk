package mypackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.nio.charset.Charset;

public class LineChk {
    public static List<String> LineCheckAndRead(String filePath,int lineNum) {
        Charset charset = Charset.forName("UTF-8");
        String filename = filePath;
        
        int numberOfLinesToRead = lineNum; // 読み込む行数を指定

        List<String> lines = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            // ファイルの最終行まで進める
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // リストを逆順にして、指定した行数だけ読み込む
        int startIndex = Math.max(0, lines.size() - numberOfLinesToRead);
        int endIndex = lines.size();
        List<String> lastNLines = lines.subList(startIndex, endIndex);

        System.out.println(lastNLines);

        int rmNum = lastNLines.size() - 1;
        lastNLines.remove(rmNum);

        System.out.println(filePath + "のリストを返します：");
        System.out.print(lastNLines);

        return lastNLines;

        
        //javac -encoding UTF-8 TextChk.java
        //java -Dfile.encoding=UTF-8 TextChk.java
        
    }
}
