package com.drifter.spring_ai_sb.controllers;

import com.drifter.spring_ai_sb.model.Answer;
import com.drifter.spring_ai_sb.model.GetCapitalRequest;
import com.drifter.spring_ai_sb.model.Question;
import com.drifter.spring_ai_sb.services.OpenAIService;
import com.drifter.spring_ai_sb.services.OpenAIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/capital")
    public Answer getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapital(getCapitalRequest);
    }

    @PostMapping("/ask")
    public Answer aksQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }
}
