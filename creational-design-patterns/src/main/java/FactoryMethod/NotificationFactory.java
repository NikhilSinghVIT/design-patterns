package FactoryMethod;

//This is the "Factory" which will produce the different types of Objects according to business needs
public class NotificationFactory {

    public Notification getNotification(String notificationType) {
        switch (notificationType){
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                return null;
        }
    }
}
