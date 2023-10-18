package com.example.ojbackendjudgeservice.judge;


import com.example.ojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.example.ojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.example.ojbackendjudgeservice.judge.strategy.JudgeContext;
import com.example.ojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.example.ojbackendmodel.model.codesandbox.JudgeInfo;
import com.example.ojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
