package com.aze.easyrule.demo.config.rules;

import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.support.composite.UnitRuleGroup;
import org.springframework.stereotype.Component;

/**
 * @author : guoxinze
 * @classname : ScheduleRule
 * @description :
 * @date : 2020/8/8
 */

@Rule
@Component
public class FiveAndSevenRule extends UnitRuleGroup {

  public FiveAndSevenRule(FiveRule fiveRule, SevenRule sevenRule) {
    addRule(fiveRule);
    addRule(sevenRule);
  }

  @Override
  public int getPriority() {
    return 0;
  }
}
