package com.drifter.spring_ai_sb.services;

import com.drifter.spring_ai_sb.model.Answer;
import com.drifter.spring_ai_sb.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

}
