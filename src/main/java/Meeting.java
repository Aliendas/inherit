public class Meeting extends Task {
    private String topic;
    private String start;
    private String project;
    public Meeting (int id, String topic, String start, String project) {
        super(id); // вызов родительского конструктора
        this.topic = topic;
        this.start = start;
        this.project = project;// заполнение своих полей
    }
    public String getTopic() {
        return topic;
    }
        public String getStart() {
            return start;
        }
            public String getProject() {
                return project;
    }
    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}

