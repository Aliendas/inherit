import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

public class TodosTest {
    Todos todos = new Todos();
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям во вторник");
    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);
    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда");

    @BeforeEach
    public void setup (){
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
    }

    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        Task[] actual = todos.findAll();
        Task[] expected = { simpleTask, epic, meeting };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void severalTasksFound() {
        Task[] actual = todos.search("во вторник");
        Task[] expected = {simpleTask,meeting};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void oneTasksFound() {
        Task[] actual = todos.search("Яйца");
        Task[] expected = {epic};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noTasksFound() {
        Task[] actual = todos.search("булка");
        Task[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
    }



