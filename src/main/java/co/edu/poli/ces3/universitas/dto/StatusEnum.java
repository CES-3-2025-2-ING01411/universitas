package co.edu.poli.ces3.universitas.dto;

public enum StatusEnum {
    ACTIVE(1, "active"),
    INNACTIVE(2, "innactive");

    private final int id;
    private final String description;

    StatusEnum(int id, String description){
        this.id = id;
        this.description = description;
    }
}
