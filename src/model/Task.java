


package model;

import java.time.LocalDate;
import view.Utils;

public class Task {
    private String id, taskType, requirementName, assignee, reviewer;
    private LocalDate planFrom, planTo;

    public Task() {
    }

    public Task(String id, String taskType, String requirementName, String assignee, String reviewer, LocalDate planFrom, LocalDate planTo) {
        setId(id);
        this.taskType = taskType;
        this.requirementName = requirementName;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.planFrom = planFrom;
        this.planTo = planTo;
    }

    public Task(String id, String taskType, String requirementName, String assignee, String reviewer, String planFrom, String planTo) {
        setId(id);
        this.taskType = taskType;
        this.requirementName = requirementName;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.planFrom = Utils.convertToLocalDate(planFrom);
        this.planTo = Utils.convertToLocalDate(planTo);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.matches("[A-Z]{2}[0-9]{2}")) throw new RuntimeException("Invalid ID");
        this.id = id;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public LocalDate getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(LocalDate planFrom) {
        this.planFrom = planFrom;
    }

    public LocalDate getPlanTo() {
        return planTo;
    }

    public void setPlanTo(LocalDate planTo) {
        this.planTo = planTo;
    }

    public String toString() {
        return String.format("%-6s | %-10s | %-20s | %-15s | %-15s | %-10s | %-10s", id, taskType, requirementName, assignee, reviewer, Utils.convertToStringDate(planFrom), Utils.convertToStringDate(planTo));
    }
}

