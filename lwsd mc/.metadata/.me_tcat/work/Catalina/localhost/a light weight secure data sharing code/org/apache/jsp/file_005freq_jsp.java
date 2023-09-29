package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dbcon.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public final class file_005freq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("<head>\n");
      out.write("<title>Auditor Login Page</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/droid_sans_400-droid_sans_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("                ");

           if (request.getParameter("msg") != null) {
        
      out.write("\n");
      out.write("        <script>alert('Request Sent Successfully');</script>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1>Secure Data Sharing in Cloud Computing Using Revocable-Storage Identity-Based Encryption</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"searchform\">\n");
      out.write("        <form id=\"formsearch\" name=\"formsearch\" method=\"post\" action=\"#\">\n");
      out.write("          <span>\n");
      out.write("          <input name=\"editbox_search\" class=\"editbox_search\" id=\"editbox_search\" maxlength=\"80\" value=\"Search our ste:\" type=\"text\" />\n");
      out.write("          </span>\n");
      out.write("          <input name=\"button_search\" src=\"images/search.gif\" class=\"button_search\" type=\"image\" />\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"uhome.jsp\"><span>User Home</span></a></li>\n");
      out.write("          <li class=\"active\"><a href=\"file_req.jsp\"><span>Send Request</span></a></li>\n");
      out.write("          <li><a href=\"down.jsp\"><span>File Download </span></a></li>\n");
      out.write("          <li><a href=\"index.jsp\"><span>Logout</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"slider\">\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" width=\"960\" height=\"335\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"960\" height=\"335\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide3.jpg\" width=\"960\" height=\"335\" alt=\"\" /> </a> </div>\n");
      out.write("        <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"content\">\n");
      out.write("    <div class=\"content_resize\">\n");
      out.write("      <div class=\"mainbar\">\n");
      out.write("        <div class=\"article\">\n");
      out.write("            <br><h2>Send Request for File Access</h2><br>\n");
      out.write("         <div class=\"clr\"></div>\n");
      out.write("         <!---Start Body --->\n");
      out.write("         <table border=\"1\" style=\"text-align: center;margin-left: 0px\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th style=\"text-align: center;width: 30px; font-size: 16px; color: #0096da \">ID</th>\n");
      out.write("                                <th style=\"text-align: center;width: 300px; font-size: 16px; color: #0096da\">File Name</th>\n");
      out.write("                                <th style=\"text-align: center;width: 100px; font-size: 16px; color: #0096da\">Provider</th>\n");
      out.write("                                <th style=\"text-align: center;width: 200px; font-size: 16px; color: #0096da\">Date</th>\n");
      out.write("                                <th style=\"text-align: center;width: 100px; font-size: 16px; color: #0096da\">Send Request</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                ");

                                
                                String  Pname=(String)session.getAttribute("sssname");
                                System.out.println("Provider Name"+Pname);
                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    try {
                                        con = DbConnection.getConnection();
                                        st = con.createStatement();
                                        rs = st.executeQuery("select * from upload");
                                        while(rs.next())
                                            
                                        {
      out.write("\n");
      out.write("                                        <td style=\" font-size: 14px; color: #666464\">");
      out.print(rs.getString("id"));
      out.write("</td>     \n");
      out.write("                                        <td style=\" font-size: 14px; color: #666464\">");
      out.print(rs.getString("filename"));
      out.write("</td>     \n");
      out.write("                                        <td style=\" font-size: 14px; color: #666464\">");
      out.print(rs.getString("provider_name"));
      out.write("</td>\n");
      out.write("                                        <td style=\" font-size: 14px; color: #666464\">");
      out.print(rs.getString("time"));
      out.write("</td>\n");
      out.write("<td> <a href=\"request.jsp?filename=");
      out.print(rs.getString("filename"));
      out.write("&secret_key=");
      out.print(rs.getString("secret_key"));
      out.write("&pname=");
      out.print(rs.getString("provider_name"));
      out.write("\"><font style=\"color: green; font-size: 16px\">Send</a></font> </td>\n");
      out.write("                                        <tr />\n");
      out.write("                                        ");

                                      
                                        
                                        } 
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }

                                
      out.write("\n");
      out.write("                        </table>\n");
      out.write("         <!---End Body --->\n");
      out.write("      <br><br><br><br></div>\n");
      out.write("     </div>\n");
      out.write("      <div class=\"sidebar\">\n");
      out.write("        <div class=\"gadget\">\n");
      out.write("          <h2 class=\"star\"><span>Sidebar</span> Menu</h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <ul class=\"sb_menu\">\n");
      out.write("            <li><a href=\"uhome.jsp\">User Home</a></li>\n");
      out.write("            <li><a href=\"file_req.jsp\">Send Request</a></li>\n");
      out.write("            <li><a href=\"down.jsp\">File Download</a></li>\n");
      out.write("            <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"footer_resize\">\n");
      out.write("      <p class=\"lf\">Copyright &copy; <a href=\"#\">Jpinfotech</a></p>\n");
      out.write("      <p class=\"rf\">Design by <a target=\"_blank\" href=\"\">Ajay</a></p>\n");
      out.write("      <div style=\"clear:both;\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
