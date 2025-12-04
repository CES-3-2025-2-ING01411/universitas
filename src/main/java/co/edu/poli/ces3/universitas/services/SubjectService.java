package co.edu.poli.ces3.universitas.services;

import co.edu.poli.ces3.universitas.dto.StatusEnum;
import co.edu.poli.ces3.universitas.dto.Subject;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.security.SecureRandom;
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
                .filter(subject -> subject.getId().toString().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Subject add(JsonObject jsonSubject){
        Subject s = new Subject();
        s.setCode(jsonSubject.get("code").getAsString());
        s.setId(this.generarId());
        s.setDescription(new StringBuilder(jsonSubject.get("description").getAsString()));
        s.setName(jsonSubject.get("name").getAsString());
        s.setStatus(StatusEnum.ACTIVE);

        subjects.add(s);

        return s;
    }

    private String generarId() {

        String ALPHANUM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        SecureRandom RANDOM = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // Primeros 3 caracteres
        for (int i = 0; i < 3; i++) {
            sb.append(ALPHANUM.charAt(RANDOM.nextInt(ALPHANUM.length())));
        }

        sb.append('-');

        // Últimos 3 caracteres
        for (int i = 0; i < 3; i++) {
            sb.append(ALPHANUM.charAt(RANDOM.nextInt(ALPHANUM.length())));
        }

        return sb.toString();
    }

}
