package com.example.demo.guava.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author : guoxinze
 * @date : 2020/8/11
 * @description :
 */

@Accessors(chain = true, fluent = true)
@Data
public class CourseMsg {

  /**
   * 事件类型
   */
  private Integer type;

  /**
   * 具体信息
   */
  private Msg msg;
}


