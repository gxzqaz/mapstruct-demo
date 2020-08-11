package com.example.demo.guava.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author : guoxinze
 * @date : 2020/8/11
 * @description :学生补课表
 */

@Data
@Accessors(chain = true)
public class ReserveMsgEventEvent implements Msg {

  private Long studentId;
  private String signId;
  // 课次约课id
  private Long scheduleReserveId;
}
