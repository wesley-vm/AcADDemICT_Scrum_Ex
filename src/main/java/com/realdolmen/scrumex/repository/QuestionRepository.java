package com.realdolmen.scrumex.repository;

import com.realdolmen.scrumex.domain.Answer;
import com.realdolmen.scrumex.domain.Question;
import com.realdolmen.scrumex.services.QuestionsRepositoryInterface;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import java.util.*;

/**
 * Created by Frederik Van Herbruggen on 3/11/2016.
 */
@Stateless
public class QuestionRepository implements QuestionsRepositoryInterface{

    private Answer dummyAnswer1, dummyAnswer2;

    @PostConstruct
    public void init(){
        dummyAnswer1 = new Answer("yes", 10);
        dummyAnswer2 = new Answer("no", 10);
    }

    public QuestionRepository(){
    }
    @Override
    public List<Question> getAllQuestions() {
        return new ArrayList<>(Arrays.asList(new Question[]{
                new Question("How long is a chinese name?", dummyAnswer1, dummyAnswer2),
                new Question("Hitler did nothing wrong.", dummyAnswer1, dummyAnswer2),
                new Question("Do you like women?", dummyAnswer1, dummyAnswer2),
                new Question("Do you like pancakes?", dummyAnswer1, dummyAnswer2),
                new Question("Do you like waffles?", dummyAnswer1, dummyAnswer2),
                new Question("Do you like Fake hair?", dummyAnswer1, dummyAnswer2),
                new Question("Do you like Oranges?", dummyAnswer1, dummyAnswer2),
                new Question("Do you like Mexicans?", dummyAnswer1, dummyAnswer2),
                new Question("Do you like walls?", dummyAnswer1, dummyAnswer2),
                new Question("Do you like Bill Clinton?", dummyAnswer1, dummyAnswer2),
                new Question("Do you like Emails?", dummyAnswer1, dummyAnswer2)
        }));
    }
}
