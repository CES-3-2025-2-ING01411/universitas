package co.edu.poli.ces3.universitas;

import co.edu.poli.ces3.universitas.dto.Student;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private Student student;

    public HelloServlet(){
        System.out.println("Entro al constructor 1");
    }

    public void init()
    {
        // student = new Student();
        // System.out.println(student.suma());
        //System.out.println(Student.myName());
        message = "Hola Poli 2!!!!!!";

        System.out.println("Entro al metodo init");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("{");
        out.println("\"Nombre\": \""+ request.getParameter("name") + "\",");
        out.println("\"Cedula\": \"" + request.getParameter("cedula") + "\",");
        out.println("\"perfil\":{\"url\":\"vvv\",\"facebook\":\"facebook.com\"},");
        out.println("\"materias\":[\"ciencias\", \"matematicas\"]");
        out.println("}");

        response.setStatus(HttpServletResponse.SC_ACCEPTED);
    }

    public void destroy() {
    }
}