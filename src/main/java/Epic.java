public class Epic extends Task {
    protected String title;
    protected String [] subtask;
    public Epic (int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей

    }

    public String getTitle() {
        return title;
    }
}
