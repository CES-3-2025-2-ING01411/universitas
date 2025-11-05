package co.edu.poli.ces3.universitas;

import co.edu.poli.ces3.universitas.dto.Student;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private Student student;

    public void init()
    {
        student = new Student();
        System.out.println(student.suma());
        //System.out.println(Student.myName());
        message = "Hola Poli 2!!!!!!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}