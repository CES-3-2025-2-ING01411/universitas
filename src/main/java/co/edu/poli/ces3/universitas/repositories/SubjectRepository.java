package co.edu.poli.ces3.universitas.repositories;

import co.edu.poli.ces3.universitas.dto.StatusEnum;
import co.edu.poli.ces3.universitas.dto.Subject;
import com.google.gson.JsonObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;

public class SubjectRepository extends MySQLConnect implements Crud<Subject, String>{

    public SubjectRepository() {}

    @Override
    public Subject create(JsonObject jsonDto) {
        Connection cnn = super.connect();
        try {
            Subject s = new Subject();
            s.setCode(jsonDto.get("code").getAsString());
            s.setId(super.generarId());
            s.setDescription(new StringBuilder(jsonDto.get("description").getAsString()));
            s.setName(jsonDto.get("name").getAsString());
            s.setStatus(StatusEnum.ACTIVE);

            String sql = "INSERT INTO subject(id,name,code,description,status) VALUES (?,?,?,?,?)";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getCode());
            ps.setString(4, s.getDescription().toString());
            ps.setString(5, s.getStatus().toString());
            ps.execute();
            return s;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            super.disconnect();
        }
        return null;
    }

    @Override
    public void update(Subject dto) {

    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Vector<Subject> findAll() {
        return null;
    }

    @Override
    public Subject findById(String s) {
        return null;
    }

    public static void main(String[] args) {
        SubjectRepository repo = new SubjectRepository();
    }
}
