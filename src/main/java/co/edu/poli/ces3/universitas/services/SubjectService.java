package co.edu.poli.ces3.universitas.services;

import co.edu.poli.ces3.universitas.dto.StatusEnum;
import co.edu.poli.ces3.universitas.dto.Subject;

import java.util.Vector;

public class SubjectService {

    private Vector<Subject> subjects;

    public SubjectService(){
        subjects = new Vector();
        subjects.add(new Subject("APL-123",new StringBuilder("CES3")));
        subjects.add(new Subject("DT-13",new StringBuilder("Base de dato 2")));
    }

    public Vector<Subject> find(){
        return this.subjects;
    }

    public Subject findById(String id){
        return subjects.stream()
                .filter(subject -> subject.getCode().toString().equals(id))
                .findFirst()
                .orElse(null);
    }

}
