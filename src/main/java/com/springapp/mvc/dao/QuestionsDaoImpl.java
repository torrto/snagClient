package com.springapp.mvc.dao;

import com.springapp.mvc.model.Questions;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rhy704 on 8/14/16.
 */
@Repository("questionsDao")
public class QuestionsDaoImpl extends AbstractDao<Integer, Questions> implements QuestionsDao {

    public List<Questions> getAllQuestions() {
        Criteria criteria = createEntityCriteria();
        List<Questions> all = (List<Questions>) criteria.list();
        return all;
    }

    public void saveQuestions(Questions questions) {
        persist(questions);
    }

    public void editQuestion(String id, String question) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        Questions questions = (Questions) criteria.list().get(0);
        questions.setQuestion(question);
    }

    public void editAnswer(String id, String answer) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        Questions questions = (Questions) criteria.list().get(0);
        questions.setAnswer(answer);
    }

    public String getAnswerById(String id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        Questions questions = (Questions) criteria.list().get(0);
        return questions.getAnswer();
    }
}
