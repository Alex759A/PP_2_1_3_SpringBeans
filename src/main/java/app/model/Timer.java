package app.model;


import org.springframework.stereotype.Component;


@Component

public class Timer {

    private Long nanoTime = System.nanoTime();


    public void setNanoTime(Long nanoTime) {this.nanoTime = nanoTime;}


    public Long getTime() {
        return nanoTime;
    }
}
