package com.example.demo.guava.eventbus;

import com.example.demo.guava.consumer.CourseMsgListener;
import com.google.common.eventbus.EventBus;
import lombok.val;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : guoxinze
 * @date : 2020/8/11
 * @description :
 */

@Configuration
public class EventBusConfig {

  private final CourseMsgListener courseMsgListener;

  public EventBusConfig(CourseMsgListener courseMsgListener) {
    this.courseMsgListener = courseMsgListener;
  }

  @Bean
  public EventBus courseEventBus() {
    final val eventBus = new EventBus((ex,context) ->{
      ex.printStackTrace();
      System.out.println(context.getEvent());
      System.out.println(context.getEventBus());
      System.out.println(context.getSubscriber());
      System.out.println(context.getSubscriberMethod());
    });
    eventBus.register(courseMsgListener);
    return eventBus;
  }
}
