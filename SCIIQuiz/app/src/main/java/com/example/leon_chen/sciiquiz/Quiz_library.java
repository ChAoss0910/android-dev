package com.example.leon_chen.sciiquiz;

/**
 * Created by Leon_Chen on 9/23/17.
 */

public class Quiz_library {
    private String mQuestions [] = {
            "Which year was Starcraft II produced?",
            "Which one is the recent version of Starcraft II?",
            "Which one is the leader of Raiders?",
            "Who is the best Chinese professional terren player currently?"

    };


    private String mChoices [][] = {
            {"1998", "2008", "2010","2015"},
            {"Wings of Liberty", "Heart of Swarm", "Void of Legend","Brood War"},
            {"Jim Raynor", "Arcturus Mengsk", "Nova Terra","Sarah Kerrigan"},
            {"F91", "IA", "TIME","XY"}
    };



    private String mCorrectAnswers[] = {"2010", "Void of Legend", "Jim Raynor", "TIME"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
