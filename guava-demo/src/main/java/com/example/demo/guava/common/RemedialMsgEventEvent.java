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
public class RemedialMsgEventEvent implements Msg {

  private Long studentId;
  private Long courseId;
  // 排课Id
  private Long scheduleId;
}
