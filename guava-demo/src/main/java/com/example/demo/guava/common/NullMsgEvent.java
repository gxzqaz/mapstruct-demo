package com.example.demo.guava.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author : guoxinze
 * @date : 2020/8/11
 * @description :
 */

@Data
@Accessors(chain = true)
public class NullMsgEvent implements Msg {

  private String msg = "9999";
}
