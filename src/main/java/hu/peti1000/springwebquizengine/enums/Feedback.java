package hu.peti1000.springwebquizengine.enums;

public enum Feedback {
    CORRECT_ANSWER("Congratulations, you're right!"), INCORRECT_ANSWER("Wrong answer! Please, try again.");

    private final String notification;

    Feedback(String notification) {
        this.notification = notification;
    }

    public String getNotification() {
        return notification;
    }

}
