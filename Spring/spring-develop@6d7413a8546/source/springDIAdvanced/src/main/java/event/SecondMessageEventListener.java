package event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.ApplicationEvent;

public class SecondMessageEventListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof MessageEvent) {
            MessageEvent messageEvent = (MessageEvent)event;
            System.out.println("Received " + messageEvent.getMessage() +
                    " from " + messageEvent.getSource());
        }
    }
}