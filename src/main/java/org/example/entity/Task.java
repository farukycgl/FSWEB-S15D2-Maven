package org.example.entity;
import org.example.entity.Status;
import org.example.entity.Priority;

import java.util.Objects;

public class Task {
    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

    public Task(String project, String description, String assignee, Status status,Priority priority){
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.priority = priority;

    }

    public String  getProject(){
        return project;
    }

    public String getDescription(){
        return description;
    }

    public String getAssignee(){
        return assignee;
    }

    public Priority getPriority(){
        return priority;
    }

    public Status getStatus(){
        return status;
    }

    //Eşitsizlik kontrolü için; project ve description'lara göre kontrol sağlıyoruz.

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode(){
        return Objects.hash(project, description);
    }
}
