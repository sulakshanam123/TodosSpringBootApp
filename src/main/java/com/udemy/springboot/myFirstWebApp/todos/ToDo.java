package com.udemy.springboot.myFirstWebApp.todos;

import java.time.LocalDate;

public class ToDo {
    private Integer id;
    private String user;
    private String desc;
    private boolean isDone;
    private LocalDate targetDate;

    public ToDo(Integer id, String user, String desc, LocalDate targetDate, boolean isDone) {
        super();
        this.id = id;
        this.desc = desc;
        this.isDone = isDone;
        this.targetDate = targetDate;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", desc='" + desc + '\'' +
                ", isDone=" + isDone +
                ", targetDate=" + targetDate +
                '}';
    }
}
