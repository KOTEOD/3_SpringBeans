package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private static Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
