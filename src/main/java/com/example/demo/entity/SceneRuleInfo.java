package com.example.demo.entity;

import lombok.Data;

@Data
public class SceneRuleInfo {

    public Integer id;
    public Integer ruleSetId;
    public String name;
    public String description;
    public String status;
    public String ruleCondition;
    public String ruleAction;
    public String level;
    public String createTime;
    public String updateTime;
}
