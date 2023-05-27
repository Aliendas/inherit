public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;
    public Meeting (int id, String topic, String start, String project) {
        super(id); // вызов родительского конструктора
        this.topic = topic;
        this.start=start;
        this.project=project;// заполнение своих полей
    }

    public String getTopic() {
        return topic;}
        public String getStart() {
            return start;
        }
            public String getProject() {
                return project;
    }
}

