package com.ai.ai_project.controller;


import com.ai.ai_project.common.BaseResponse;
import com.ai.ai_project.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Controller {
    @GetMapping("/check")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("Health check passed!");
    }
}
