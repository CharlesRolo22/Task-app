package com.codeup.tasker.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 60)
    private String taskTitle;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String taskDescription;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
