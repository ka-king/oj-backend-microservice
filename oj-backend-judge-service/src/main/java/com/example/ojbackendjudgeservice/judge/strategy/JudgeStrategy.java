package com.example.ojbackendjudgeservice.judge.strategy;


import com.example.ojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * 判题策略
 * @author 南黎
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
