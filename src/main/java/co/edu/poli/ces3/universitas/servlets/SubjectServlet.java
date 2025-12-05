package co.edu.poli.ces3.universitas.servlets;

import co.edu.poli.ces3.universitas.dto.Subject;
import co.edu.poli.ces3.universitas.services.SubjectService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
        Gson gson = new Gson();
        PrintWriter out = resp.getWriter();

        if (req.getParameter("idSubject") != null){
            Subject s = service.findById(req.getParameter("idSubject"));
            out.print(gson.toJson(s));
        }else {
            Vector subjects = service.find();
            out.print(gson.toJson(subjects));
        }
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        Gson gson = new Gson();
        PrintWriter out = resp.getWriter();

        Subject s = service.add(getParamsFromBody(req));

        out.print(gson.toJson(s));

        out.flush();
    }

    protected JsonObject getParamsFromBody(HttpServletRequest request) throws IOException {
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            sb.append(line + "\n");
            line = reader.readLine();
        }
        reader.close();
        return JsonParser.parseString(sb.toString()).getAsJsonObject();
    }
}
