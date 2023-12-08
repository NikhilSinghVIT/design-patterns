package AbstractFactoryMethod;

public class AbstractFactoryMainClass {
    private static String MACOS = "mac";
    private static String WINDOWS = "windows";
    public static void main(String args[]){
        String os = "windows";
        GUIFactory guiFactory = null;
        if(MACOS.equals(os)){
            guiFactory = new MacOSFactory();
        }else if(WINDOWS.equals(os)){
            guiFactory = new WindowsFactory();
        }

        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();

    }
}
