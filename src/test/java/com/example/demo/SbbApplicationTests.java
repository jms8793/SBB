package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.answer.Answer;
import com.example.demo.answer.AnswerRepository;
import com.example.demo.question.Question;
import com.example.demo.question.QuestionRepository;

import jakarta.transaction.Transactional;



@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
    
    @Autowired
    private AnswerRepository answerRepository;
    
    @Transactional
    @Test
    void testJpa() {
    	Optional<Question> oq = this.questionRepository.findById(8);
    	assertTrue(oq.isPresent());
    	Question q = oq.get();
    	
    	List<Answer> answersList = q.getAnswerList();
    	
    	System.out.println(answersList.size());
    	assertEquals("네 자동으로 생성됩니다.", answersList.get(0).getContent());
    }
}