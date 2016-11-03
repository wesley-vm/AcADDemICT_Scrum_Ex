package com.realdolmen.scrumex.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Frederik Van Herbruggen on 3/11/2016.
 */
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String answer;

    private int weight;

    public Answer() {
    }

    public Answer(String answer, int weight) {
        this.answer = answer;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
