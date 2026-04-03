import org.junit.jupiter.api.Test;

import com.flowsync.Task;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testInitialStatus() {
        Task task = new Task("Configurar CI");
        assertEquals("Backlog", task.getStatus());
    }

    @Test
    public void testMoveToToDo() {
        Task task = new Task("Configurar CI");
        task.moveToDo();
        assertEquals("To Do", task.getStatus());
    }

    @Test
    public void testCompleteFlow() {
        Task task = new Task("Gravar Video");
        // Tentativa de completar direto do Backlog deve falhar (status continua Backlog)
        task.complete(); 
        assertNotEquals("Done", task.getStatus());
    }
}