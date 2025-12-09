package co.edu.poli.ces3.universitas.repositories;

import com.google.gson.JsonObject;
import java.util.Vector;

public interface Crud<T, ID>
{
    T create(JsonObject jsonDto);
    void update(T dto);
    void delete(ID id);
    Vector<T> findAll();
    T findById(ID id);
}
