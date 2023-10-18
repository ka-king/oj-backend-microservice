package com.example.ojbackendjudgeservice.judge.codesandbox.impl;

import com.example.ojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.example.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.example.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;


/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 * @author 南黎
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
