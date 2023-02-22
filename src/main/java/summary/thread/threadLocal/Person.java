package summary.thread.threadLocal;

public class Person {

    ThreadLocal<String> localName = new ThreadLocal<>();

    public void setName(String name){
        localName.set(name);
    }

    public String getName(){
        return localName.get();
    }
}
