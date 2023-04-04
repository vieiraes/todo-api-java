package br.com.labsonlive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("tasks")
public class Tasks {

    @Id
    private String userId;
    private String taskName;
    private String endTime;
    private String startTime;
    private String createdAt;
    private String categoryId;

    // CONSTRUCTOR
    Tasks(String userId, String taskName, String startTime, String endTime, String createdAt, String categoryId) {
        super();
        this.userId = userId;
        this.taskName = taskName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createdAt = createdAt;
        this.categoryId = categoryId;
    }

}