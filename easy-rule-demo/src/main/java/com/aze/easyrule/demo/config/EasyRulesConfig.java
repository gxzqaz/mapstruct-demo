package com.aze.easyrule.demo.config;

import com.aze.easyrule.demo.config.rules.ScheduleRule;
import lombok.val;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : guoxinze
 * @classname : EasyRulesConfig
 * @description :
 * @date : 2020/8/8
 */

@Configuration
public class EasyRulesConfig {

  private final ScheduleRule scheduleRule;

  public EasyRulesConfig(ScheduleRule scheduleRule) {
    this.scheduleRule = scheduleRule;
  }

  @Bean
  public DefaultRulesEngine defaultRulesEngine() {
    final val defaultRulesEngine = new DefaultRulesEngine();

    Rules rules = new Rules();
    // 注册所有的rules
    rules.register(scheduleRule);
    return defaultRulesEngine;
  }

}
