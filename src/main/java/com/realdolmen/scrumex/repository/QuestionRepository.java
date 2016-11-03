package com.realdolmen.scrumex.repository;

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

    private Map<String, Integer> dummyAnswers;

    @PostConstruct
    public void init(){
        dummyAnswers = new HashMap<String, Integer>();
        dummyAnswers.put("Yes", 1);
        dummyAnswers.put("No", 2);
    }

    public QuestionRepository(){
    }
    @Override
    public List<Question> getAllQuestions() {
        return new ArrayList<>(Arrays.asList(new Question[]{
                new Question("How long is a chinese name?", dummyAnswers),
                new Question("Hitler did nothing wrong.", dummyAnswers),
                new Question("Do you like women?", dummyAnswers),
                new Question("Do you like pancakes?", dummyAnswers),
                new Question("Do you like waffles?", dummyAnswers),
                new Question("Do you like Fake hair?", dummyAnswers),
                new Question("Do you like Oranges?", dummyAnswers),
                new Question("Do you like Mexicans?", dummyAnswers),
                new Question("Do you like walls?", dummyAnswers),
                new Question("Do you like Bill Clinton?", dummyAnswers),
                new Question("Do you like Emails?", dummyAnswers)
        }));
    }
}
