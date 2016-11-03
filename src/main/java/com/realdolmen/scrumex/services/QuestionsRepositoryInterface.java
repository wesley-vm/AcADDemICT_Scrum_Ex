package com.realdolmen.scrumex.services;

import com.realdolmen.scrumex.domain.Question;

import java.util.List;

/**
 * Created by Frederik Van Herbruggen on 3/11/2016.
 */
public interface QuestionsRepositoryInterface {
    public List<Question> getAllQuestions();
}
