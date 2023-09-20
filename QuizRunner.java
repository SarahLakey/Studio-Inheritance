package org.example;


import java.util.ArrayList;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        MultipleChoiceQuestion question = new MultipleChoiceQuestion();
        question.setQuestionText("What planet is closest to the Sun?");

        List<String> possibleAnswers = new ArrayList<>();
        possibleAnswers.add("Venus");
        possibleAnswers.add("Mars");
        question.setPossibleAnswers(possibleAnswers);
        quiz.addQuestion(question);


    }
}