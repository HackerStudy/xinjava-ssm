package com.it.java.pojo;

import java.io.Serializable;

/**
 * 试题
 * @author ASUS
 *
 */
public class QuestionBank implements Serializable {
	private int id;
	private int tid;
	private String question;
	private String rightAnswers;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRightAnswers() {
		return rightAnswers;
	}

	public void setRightAnswers(String rightAnswers) {
		this.rightAnswers = rightAnswers;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public QuestionBank(int id, int tid, String question, String rightAnswers, String option1, String option2,
			String option3, String option4, int score) {
		super();
		this.id = id;
		this.tid = tid;
		this.question = question;
		this.rightAnswers = rightAnswers;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.score = score;
	}

	public QuestionBank() {
		super();
	}

	public String toString() {
		return "QuestionBank [id=" + id + ", tid=" + tid + ", question=" + question + ", rightAnswers=" + rightAnswers
				+ ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4
				+ ", score=" + score + "]";
	}

}
