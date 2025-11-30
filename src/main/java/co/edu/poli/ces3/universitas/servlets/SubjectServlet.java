package co.edu.poli.ces3.universitas.servlets;

import co.edu.poli.ces3.universitas.services.SubjectService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;


@WebServlet(name = "subjectServlet", value = "/subject")
public class SubjectServlet extends HttpServlet {
    private SubjectService service;
    @Override
    public void init() throws ServletException {
        service = new SubjectService();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");

        PrintWriter out = resp.getWriter();

        Vector subjects = service.find();

        Gson gson = new Gson();

        out.print(gson.toJson(subjects));

        out.flush();
    }
}
