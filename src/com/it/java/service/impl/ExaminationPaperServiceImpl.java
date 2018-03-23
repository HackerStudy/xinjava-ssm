package com.it.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.ExaminationPaperMapper;
import com.it.java.pojo.TestPaper;
import com.it.java.service.ExaminationPaperService;

/**
 * 试卷
 * @author ASUS
 *
 */
@Service
public class ExaminationPaperServiceImpl implements ExaminationPaperService {

	@Autowired
	private ExaminationPaperMapper examinationPaperMapper;
	
	public void AddExaminationPaper(String topic) {
		examinationPaperMapper.AddExaminationPaper(topic);
	}

	public List<TestPaper> FindExaminationPaperTopic() {
		
		return examinationPaperMapper.FindExaminationPaperTopic();
	}

}
