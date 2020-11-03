package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("2nd best processor");
    }
}
