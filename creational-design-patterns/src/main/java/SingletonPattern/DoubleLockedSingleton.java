package SingletonPattern;

public class DoubleLockedSingleton {
    public static volatile DoubleLockedSingleton instance;

    String data;

    private DoubleLockedSingleton(String data) {
        this.data = data;
    }

    public static DoubleLockedSingleton getInstance(String data){
        if(instance == null){
            synchronized (DoubleLockedSingleton.class){
                if(instance == null) {
                    instance = new DoubleLockedSingleton(data);
                }
            }
        }
        return instance;
    }
}
