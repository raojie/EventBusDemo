package project.raoj.com.eventbusdemo;

/**
 * class: MessageEvent
 * describe:
 * author: raoj
 * date: 2018-09-05-16:32
 */
public class MessageEvent {

    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
