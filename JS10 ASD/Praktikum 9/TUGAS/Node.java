package TUGAS;

class Node {
    String question;
    String answer;
    Node next;

    public Node(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}