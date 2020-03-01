package com.company.Patel;

import java.util.Scanner;

public class Task {
    private String task;
    private String description;
    private int priority;
    private static int numTasks = 0;

    Scanner input = new Scanner(System.in);

    public Task(){
        numTasks++;
    }
    public Task(String task, String description, int priority) {
        this.task = task;
        this.description = description;
        this.priority = priority;
        numTasks++;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public static int getNumTasks() {
        return numTasks;
    }

    public static void setNumTasks(int numTasks) {
        Task.numTasks = numTasks;
    }

    @Override
    public String toString() {
        return "Task: " + task + " - " + description + " (" + priority + ")" ;
    }


}

