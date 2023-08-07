package com.sir8august;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Answer answer = new Answer();
		answer.setId(201);
		answer.setAnsName("Java is a OOps Language");
		
		Answer answer2 = new Answer();
		answer2.setId(202);
		answer2.setAnsName("Java is a High Level Language");
		
		Question question = new Question();
		question.setId(101);
		question.setName("What is Java");
		
		answer.setQuestion(question);
		answer2.setQuestion(question);
		
		List<Answer> answers = new ArrayList<>();
		answers.add(answer);
		answers.add(answer2);
		
		question.setAnswer(answers);
		
		
//		session.save(answer);
//		session.save(answer2);
//		
//		session.save(question);
		
//		Answer answer3 = session.get(Answer.class, 201);
//		System.out.println(answer3.getQuestion().getName());
//		System.out.println(answer3.getQuestion().getId());
		
		transaction.commit();
	}
}
