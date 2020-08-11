package com.example.demo.guava.consumer;

import com.example.demo.guava.common.NullMsgEvent;
import com.example.demo.guava.common.RemedialMsgEventEvent;
import com.example.demo.guava.common.ReserveMsgEventEvent;
import com.example.demo.guava.common.TrialMsgEvent;
import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

/**
 * @author : guoxinze
 * @date : 2020/8/11
 * @description :
 */

@Component
public class CourseMsgListener {

  @Subscribe
  public void handler(RemedialMsgEventEvent eventEvent) {
    System.out.println(eventEvent);
  }

  @Subscribe
  public void handler(ReserveMsgEventEvent eventEvent) {
    System.out.println(eventEvent);
  }


  @Subscribe
  public void handler(TrialMsgEvent eventEvent) {
    System.out.println(eventEvent);
  }

  @Subscribe
  public void handler(NullMsgEvent eventEvent) {
    throw new RuntimeException("空event");
  }
}
