package com.example.demo.guava.common;

import lombok.Getter;

/**
 * @author : guoxinze
 * @date : 2020/8/11
 * @description :
 */

@Getter
public enum MsgEventType {

  /**
   * see desc
   */
  trial(1, "试听"),
  reserve(2, "约课"),
  remedial(3, "补课");

  private final int type;

  private final String description;

  MsgEventType(int type, String description) {
    this.type = type;
    this.description = description;
  }
}
