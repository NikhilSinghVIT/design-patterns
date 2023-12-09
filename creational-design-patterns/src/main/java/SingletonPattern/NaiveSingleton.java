package SingletonPattern;


//This implementation won't work for multithreaded application, since multiple threads may access the getInstance method at once.
public class NaiveSingleton {
    public static NaiveSingleton instance;

    String data;

    private NaiveSingleton (String data){
        this.data = data;
    }

    public static NaiveSingleton getInstance(String data){
        if(instance == null){
            instance = new NaiveSingleton(data);
        }
        return instance;
    }

}
