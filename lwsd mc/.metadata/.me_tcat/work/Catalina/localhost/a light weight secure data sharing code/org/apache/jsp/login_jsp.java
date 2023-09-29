package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.UUID;
import java.security.SecureRandom;
import java.sql.ResultSet;
import Dbcon.DbConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Random;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Connection con = null;
    Statement st = null;
   ResultSet rs = null;

    
      String name = request.getParameter("name");
       String pass = request.getParameter("pass");
        String Eamil = request.getParameter("email");
         String dob = request.getParameter("dob");
          String gen = request.getParameter("gen");
         String role = request.getParameter("role");
        String State = request.getParameter("state");
       String Country = request.getParameter("country");
       String skey = request.getParameter("skey");
      session.setAttribute("ssskey", skey);
    System.out.println("User Details"+dob+gen+role+State+Eamil+name+pass+Country);
  
     int status = Integer.parseInt(request.getParameter("status"));
    try {
        con = DbConnection.getConnection();
        st = con.createStatement();
        switch (status) {
            case 1:
                try {
                    rs = st.executeQuery("select * from reg where name='" + name + "' AND pass='" + pass + "' AND role='Provider'");
                    if (rs.next()) {
                        session.setAttribute("sssid", rs.getString("id"));
                        session.setAttribute("sssname", rs.getString("name"));
                        session.setAttribute("sssemail", rs.getString("email"));
                        session.setAttribute("sssstate", rs.getString("state"));
                        session.setAttribute("ssscountry", rs.getString("country"));
                        response.sendRedirect("pro_home.jsp?msg=success");
                    } else {
                        response.sendRedirect("pro.jsp?msgg=failed");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
                     case 2:
                try {
                    rs = st.executeQuery("select * from reg where name='" + name + "' AND pass='" + pass + "' AND role='User'");
                    if (rs.next()) {
                        session.setAttribute("ssid", rs.getString("id"));
                        session.setAttribute("ssname", rs.getString("name"));
                        session.setAttribute("ssemail", rs.getString("email"));
                        session.setAttribute("ssstate", rs.getString("state"));
                        session.setAttribute("sscountry", rs.getString("country"));
                        response.sendRedirect("uhome.jsp?msg=success");
                    } else {
                        response.sendRedirect("user.jsp?msgg=failed");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
              
                case 3:

              try {
                 con = DbConnection.getConnection();
                 st = con.createStatement();
            int is = st.executeUpdate("insert into reg(name, pass, email, dob, gen, role, state, country) values ('" + name + "','" + pass + "','" + Eamil + "','" + dob + "','" + gen + "','" + role + "','" + State + "','" + Country + "')");                                           
                if (is != 0) {
                response.sendRedirect("reg.jsp?msg=success");
                } else {
                     response.sendRedirect("reg.jsp?msgg=failed");
                 }            
                  } catch (Exception ex) {
                  response.sendRedirect("user_reg.jsp?msggg=failed");
                }
                break;
          
            case 4:
                try {
                    if (name.equalsIgnoreCase("auditor") && pass.equalsIgnoreCase("auditor")) {
                        response.sendRedirect("ahome.jsp?msg=success");
                    } else {
                        response.sendRedirect("auditor.jsp?msgg=failed");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
                  case 5:
                try {
                    rs = st.executeQuery("select * from upload where secret_key='" + skey + "'");
                    if (rs.next()) {
                    
                        response.sendRedirect("down1.jsp?msg=success");
                    } else {
                        response.sendRedirect("down.jsp?msgg=failed");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
            default:
                response.sendRedirect("index.jsp");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }


    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
