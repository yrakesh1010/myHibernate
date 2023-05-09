package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
  @Id()
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "question_id")	
  private int questionId;
  @Column(name = "question")
  private String question;
  @OneToOne
  @JoinColumn(name = "answer_id")
  private Answer answer;
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public Question(int questionId, String question, Answer answer) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Answer getAnswer() {
	return answer;
}
public void setAnswer(Answer answer) {
	this.answer = answer;
}
@Override
public String toString() {
	return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
}
  
}
