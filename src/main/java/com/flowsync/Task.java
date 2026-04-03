package com.flowsync;

public class Task {
    private String title;
    private String status; // Backlog, To Do, In Progress, Review, Done

    public Task(String title) {
        this.title = title;
        this.status = "Backlog"; // Toda tarefa começa no Backlog
    }

    public String getStatus() {
        return status;
    }

    public void moveToDo() {
        this.status = "To Do";
    }

    // Regra de negócio: Uma tarefa só pode ir para 'Done' se passar por 'Review'
    public void complete() {
        // if (this.status.equals("Review")) {
            this.status = "Done";
        // }
    }
}