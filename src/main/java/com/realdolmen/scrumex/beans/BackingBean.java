package com.realdolmen.scrumex.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.realdolmen.scrumex.domain.Question;
import com.realdolmen.scrumex.services.QuestionsRepositoryInterface;

@Named
@ApplicationScoped
public class BackingBean implements Serializable {

	@Inject
	QuestionsRepositoryInterface repo;

	List<Question> questions;

	@PostConstruct
	private void init() {
		questions = repo.getAllQuestions();
	}

	public QuestionsRepositoryInterface getRepo() {
		return repo;
	}

	public void setRepo(QuestionsRepositoryInterface repo) {
		this.repo = repo;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
