package com.realdolmen.scrumex.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Map;

/**
 * Created by Frederik Van Herbruggen on 3/11/2016.
 */
@Entity

public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String Question;

    private Map<String, Integer> Answers;

    protected Question() {
    }

    public Question(String question, Map<String, Integer> answers) {
        Question = question;
        Answers = answers;
    }

    public int getId() {
        return Id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public Map<String, Integer> getAnswers() {
        return Answers;
    }

    public void setAnswers(Map<String, Integer> answers) {
        Answers = answers;
    }
}
