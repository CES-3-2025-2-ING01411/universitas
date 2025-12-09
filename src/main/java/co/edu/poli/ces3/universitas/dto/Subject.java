package co.edu.poli.ces3.universitas.dto;

import java.util.Date;

public class Subject {

    private String id;
    private String code;
    private String name;
    private StringBuilder description;
    private StatusEnum status;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

    public Subject(){

    }
    public Subject(String id, StringBuilder description){
        this.id = id;
        this.description = description;
        this.status = StatusEnum.ACTIVE;
        this.name = "default";
        this.code = "000";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringBuilder getDescription() {
        return description;
    }

    public void setDescription(StringBuilder description) {
        this.description = description;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
