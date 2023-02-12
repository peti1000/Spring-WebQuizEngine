package hu.peti1000.springwebquizengine.controller;

import hu.peti1000.springwebquizengine.entities.Answer;
import hu.peti1000.springwebquizengine.entities.Quiz;
import hu.peti1000.springwebquizengine.enums.Feedback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    //initial quiz for test purpose
    private final Quiz initQuiz = new Quiz(
            "The Java Logo",
            "What is depicted on the Java logo?",
            new String[]{"Robot", "Tea leaf", "Cup of coffee", "Bug"}
    );

    @GetMapping("/api/quiz")
    public Quiz getQuiz() {
        return this.initQuiz;
    }

    @PostMapping("/api/quiz")
    public Answer postAnswer(@RequestParam int answer) {
        String myAnswer = this.initQuiz.getOptions()[answer - 1];
        String feedback;
        boolean success = false;

        if (myAnswer.equals(this.initQuiz.getOptions()[2])) {
            success = true;
            feedback = Feedback.CORRECT_ANSWER.getNotification();
        } else {
            feedback = Feedback.INCORRECT_ANSWER.getNotification();
        }
        return new Answer(success, feedback);
    }
}
