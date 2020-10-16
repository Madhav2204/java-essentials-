package com.FirstAppDevelopment;

public class AppWorking {
    QuizQuestions[] questions=new QuizQuestions[6];
    PlayerDetails player=new PlayerDetails();

    public void Newgame()
    {
        for(int i=0;i<6;i++){
            questions[i]=new QuizQuestions();
        }

        questions[0].question="Which programming language did you thik I like most?";
        questions[0].option1="C";
        questions[0].option2="C++";
        questions[0].option3="Java";
        questions[0].option4="Python";
        questions[0].correctAnswer=4;

        questions[1].question="Which Programming language contain 'django' as its one of Framework?";
        questions[1].option1="Python";
        questions[1].option2="Go";
        questions[1].option3="PHP";
        questions[1].option4="Java";
        questions[1].correctAnswer=1;

        questions[2].question="Which One of the Following is a Programming Language?";
        questions[2].option1="Urdu";
        questions[2].option2="Javascript";
        questions[2].option3="Panjabi";
        questions[2].option4="English";
        questions[2].correctAnswer=2;

        questions[3].question="Which One of the Following Programming Language is used as a Backend in web-development?";
        questions[3].option1="PHP";
        questions[3].option2="Go";
        questions[3].option3="C++";
        questions[3].option4="None of the above";
        questions[3].correctAnswer=1;

        questions[4].question="Which One of the Following Programming Language is used in Front-End Web Development?";
        questions[4].option1="R-language";
        questions[4].option2="C";
        questions[4].option3="HTML";
        questions[4].option4="Kotlin";
        questions[4].correctAnswer=3;

        questions[5].question="Which One of the Following is a Programming Language is Used in Data Visualization and analysis?";
        questions[5].option1="Java";
        questions[5].option2="Flutter";
        questions[5].option3="All of the above";
        questions[5].option4="R-language";
        questions[5].correctAnswer=4;

    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<6;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status)
            {
                System.out.println("Hurrah! You Are Right.");
                player.yourScore=player.yourScore+5;
            }
            else{
                System.out.println("Well Tried! Try Again.");
            }
        }

        System.out.println(player.name+" your score is "+ player.yourScore + " out of 30");

    }

}
