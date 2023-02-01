package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component

public class Timer {

    private Long nanoTime = System.nanoTime();


    public void setNanoTime(Long nanoTime) {this.nanoTime = nanoTime;}


    public Long getTime() {
        return nanoTime;
    }
}
