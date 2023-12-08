package FactoryMethod;

public class FactoryMethodMainClass {
    public static void main(String args[]){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.getNotification("SMS");
        System.out.println(notification.getNotification());
    }
}
