package com.realdolmen.scrumex.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.realdolmen.scrumex.services.QuestionsRepositoryInterface;

@Named
@ApplicationScoped
public class BackingBean implements Serializable {

	@Inject
	QuestionsRepositoryInterface repo;

	@PostConstruct
	private void init() {

	}

}
