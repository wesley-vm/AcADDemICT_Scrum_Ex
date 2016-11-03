package com.realdolmen.scrumex.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;
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

    private List<Answer> answers;

    protected Question() {
    }

    public Question(String question, Answer... answers) {
        Question = question;
        this.answers = Arrays.asList(answers);
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

    public List<Answer> getAnswers() {
        return answers;
    }

}
