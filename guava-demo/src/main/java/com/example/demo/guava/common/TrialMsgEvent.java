package com.example.demo.guava.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author : guoxinze
 * @date : 2020/8/11
 * @description :
 */

@Data
@Accessors(chain = true, fluent = true)
public class TrialMsgEvent implements Msg {

  private String studentName;
  private Long originCourseId;
  private Long targetCourseId;
}
