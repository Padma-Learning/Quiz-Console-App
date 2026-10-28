import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class QuestionService {

    private List<Question> objQuestions ;
    private Scanner sc;


    public QuestionService()
    {
        objQuestions= new ArrayList<>();

         sc = new Scanner(System.in);

        createQuestions();
    }

    private void createQuestions()
    {


        objQuestions.add (new Question( "What is Java?",
                "Programming Language",
                "Database",
                "Operating System",
                "Browser",
                "A"));
        objQuestions.add(new Question(
                "Which keyword is used to create an object?",
                "new",
                "class",
                "object",
                "create",
                "A"));
        objQuestions.add(new Question(
                "Which method is the starting point of a Java program?",
                "main()",
                "start()",
                "run()",
                "execute()",
                "A"
        ));

        objQuestions.add(new Question(
                "Which data type stores whole numbers?",
                "int",
                "double",
                "boolean",
                "String",
                "A"
        ));

        objQuestions.add(new Question(
                "Which keyword is used to create a class?",
                "function",
                "class",
                "method",
                "object",
                "B"
        ));

        objQuestions.add(new Question(
                "Which symbol is used to end a Java statement?",
                ";",
                ":",
                ".",
                ",",
                "A"
        ));

        objQuestions.add(new Question(
                "Which loop is commonly used when the number of iterations is known?",
                "for",
                "if",
                "switch",
                "try",
                "A"
        ));

        objQuestions.add(new Question(
                "Which keyword is used to inherit a class?",
                "extends",
                "implements",
                "inherits",
                "super",
                "A"
        ));

        objQuestions.add(new Question(
                "Which data structure has a fixed size?",
                "Array",
                "List",
                "Map",
                "Set",
                "A"
        ));

        objQuestions.add(new Question(
                "Which keyword is used to create a constant?",
                "final",
                "constant",
                "static",
                "fixed",
                "A"
        ));

    }
    public void startQuiz()
    {
        System.out.println("==============================");
        System.out.println("       JAVA QUIZ");
        System.out.println("==============================");

        for (int i=0; i<objQuestions.size(); i++)
        {
            Question quizQuestion=objQuestions.get(i);

            System.out.println(("\nQuestion " +(i+1)));
            System.out.println(quizQuestion.getQuestionText());

            System.out.println("A. " + quizQuestion.getOptionA());
            System.out.println("B. "+ quizQuestion.getOptionB());
            System.out.println("C. "+ quizQuestion.getOptionC());
            System.out.println("D. " + quizQuestion.getOptionD());

            System.out.println("Enter your answer: ");
            String answer= sc.nextLine().trim().toUpperCase();
            quizQuestion.setUserAnswer(answer);
        }
        displayResults();
    }
    private void displayResults() {

        int score = 0;

        System.out.println("\n==============================");
        System.out.println("       QUIZ RESULTS");
        System.out.println("==============================");

        for (int i = 0; i < objQuestions.size(); i++) {

            Question question = objQuestions.get(i);

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(question.getQuestionText());

            System.out.println("Your Answer: "
                    + question.getUserAnswer());

            System.out.println("Correct Answer: "
                    + question.getCorrectAnswer());

            if (question.isCorrect()) {
                System.out.println("Result: Correct");
                score++;
            } else {
                System.out.println("Result: Incorrect");
            }
        }

        System.out.println("\n==============================");
        System.out.println("Your Score: " + score + "/" + objQuestions.size());
        System.out.println("==============================");
    }
}

