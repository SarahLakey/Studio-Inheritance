package org.example;

import java.util.List;

public class CheckboxQuestion extends Question {

    List<String> possibleAnswers;
    List<String> correctAnswers;

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void displayQuestions() {

    }
}
