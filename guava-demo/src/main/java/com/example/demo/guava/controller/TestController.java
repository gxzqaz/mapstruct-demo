package com.example.demo.guava.controller;

import com.example.demo.guava.common.Msg;
import com.example.demo.guava.common.NullMsgEvent;
import com.example.demo.guava.common.RemedialMsgEventEvent;
import com.example.demo.guava.common.ReserveMsgEventEvent;
import com.example.demo.guava.common.TrialMsgEvent;
import com.google.common.eventbus.EventBus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : guoxinze
 * @date : 2020/8/11
 * @description :
 */

@RestController
public class TestController {

  private final EventBus eventBus;

  public TestController(EventBus eventBus) {
    this.eventBus = eventBus;
  }


  @GetMapping("/test")
  public Object test(@RequestParam(value = "type", defaultValue = "1") int type) {
    Msg msg;
    switch (type) {
      case 1:
        msg = new TrialMsgEvent().studentName("jack").originCourseId(1L).targetCourseId(2L);
        break;
      case 2:
        msg = new ReserveMsgEventEvent().setStudentId(1L).setScheduleReserveId(100L).setSignId("1233344444");
        break;
      case 3:
        msg = new RemedialMsgEventEvent().setStudentId(1L).setCourseId(100L).setScheduleId(9999L);
        break;
      default:
        msg =  new NullMsgEvent();
    }
    eventBus.post(msg);
    return "ok";
  }
}
