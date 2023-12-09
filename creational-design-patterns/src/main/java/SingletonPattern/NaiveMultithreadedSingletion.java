package SingletonPattern;

//This will create an additional overhead, since the thread will have to wait for another thread to complete execution even if the instance is
//already instantiated. So to combat this we can use double lock check idiom and keep the static instance as volatile
public class NaiveMultithreadedSingletion {
    public static NaiveMultithreadedSingletion instance;

    String data;

    private NaiveMultithreadedSingletion(String data) {
        this.data = data;
    }

    public static NaiveMultithreadedSingletion getInstance(String data){
        synchronized (NaiveMultithreadedSingletion.class){
            if(instance == null){
                instance = new NaiveMultithreadedSingletion(data);
            }
            return instance;
        }
    }
}
