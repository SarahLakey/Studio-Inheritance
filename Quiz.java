package org.example;

import java.util.List;

public class Quiz {
    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    private List<Question> questions;

    public void addQuestion(Question question){
        questions.add(question);
    }

    public void runQuiz(){
        //iterate the list
        //display the question
        //prompt for the answer
        //check if answer is correct

    }

    public void gradeQuiz(){

    }
}
