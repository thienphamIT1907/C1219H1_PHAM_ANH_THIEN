import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount_servlet.java")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount_percent"));
        float discount = (float) (price * discount_percent * 0.01);
        float total = price - discount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product description: " + description + "</h1>");
        writer.println("<h1>Price: " + price + "</h1>");
        writer.println("<h1>Discount percent: " + discount_percent + "</h1>");
        writer.println("<h1>Discount: " + discount + "</h1>");
        writer.println("<h1>Total: " + total + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
