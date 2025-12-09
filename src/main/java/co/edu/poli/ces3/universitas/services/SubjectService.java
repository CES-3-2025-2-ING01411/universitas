package co.edu.poli.ces3.universitas.services;

import co.edu.poli.ces3.universitas.dto.StatusEnum;
import co.edu.poli.ces3.universitas.dto.Subject;
import co.edu.poli.ces3.universitas.repositories.SubjectRepository;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.Vector;

public class SubjectService {

    private Vector<Subject> subjects;
    private SubjectRepository repository;

    public SubjectService(){
        subjects = new Vector();
        subjects.add(new Subject("APL-123",new StringBuilder("CES3")));
        subjects.add(new Subject("DT-13",new StringBuilder("Base de dato 2")));

        repository =  new SubjectRepository();
    }

    public Vector<Subject> find(){
        return this.subjects;
    }

    public Subject findById(String id){
        return subjects.stream()
                .filter(subject -> subject.getId().toString().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Subject add(JsonObject jsonSubject){
        Subject subject = repository.create(jsonSubject);
        return subject;
    }
}
