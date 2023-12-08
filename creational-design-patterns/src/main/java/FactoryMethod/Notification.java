package FactoryMethod;

//This is a generic Notification class, and our factory will produce different implementation of this according to needs, namely SMS, Email, Push
public interface Notification {
    public String getNotification();
}
