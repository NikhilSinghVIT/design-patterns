package AbstractFactoryMethod;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a windows button");
    }
}
