package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import network.Upload_new;

public final class file_005fupload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style> \n");
      out.write("\n");
      out.write(".inputs {\n");
      out.write("    background: #f5f5f5;\n");
      out.write("    font-size: 0.8rem;\n");
      out.write("    -moz-border-radius: 3px;\n");
      out.write("    -webkit-border-radius: 3px;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    border: none;\n");
      out.write("    padding: 10px 10px;\n");
      out.write("    width: 200px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    box-shadow: inset 0 2px 3px rgba( 0, 0, 0, 0.1 );\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputs:focus {\n");
      out.write("    background: #fff;\n");
      out.write("    box-shadow: 0 0 0 3px #fff38e, inset 0 2px 3px rgba( 0, 0, 0, 0.2 ), 0px 5px 5px rgba( 0, 0, 0, 0.15 );\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write(".inputss {\n");
      out.write("    background: #f5f5f5;\n");
      out.write("    font-size: 0.8rem;\n");
      out.write("    -moz-border-radius: 3px;\n");
      out.write("    -webkit-border-radius: 3px;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    border: none;\n");
      out.write("    padding: 10px 10px;\n");
      out.write("    width: 200px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    box-shadow: inset 0 2px 3px rgba( 0, 0, 0, 0.1 );\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputss:focus {\n");
      out.write("    background: #fff;\n");
      out.write("    box-shadow: 0 0 0 3px #fff38e, inset 0 2px 3px rgba( 0, 0, 0, 0.2 ), 0px 5px 5px rgba( 0, 0, 0, 0.15 );\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("    background-color: #0096da; /* Green */\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 23px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write("</style> \n");
      out.write("<head>\n");
      out.write("<title>Data Provider Home Page</title>\n");
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

           if (request.getParameter("status") != null) {
        
      out.write("\n");
      out.write("        <script>alert('Encrypted File Upload to Cloud');</script>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("                        ");

           if (request.getParameter("failed") != null) {
        
      out.write("\n");
      out.write("        <script>alert('This File Already Uploaded to Cloud');</script>\n");
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
      out.write("       <ul>\n");
      out.write("          <li><a href=\"pro_home.jsp\"><span>Data Provider Home</span></a></li>\n");
      out.write("          <li class=\"active\"><a href=\"file_upload.jsp\"><span>File Upload </span></a></li>\n");
      out.write("          <li><a href=\"file_de.jsp\"><span>Uploaded File Details</span></a></li>\n");
      out.write("          <li><a href=\"file_update.jsp\"><span>File Update</span></a></li>\n");
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
      out.write("            <br><h2>File Upload to Cloud</h2><br>\n");
      out.write("         <div class=\"clr\"></div>\n");
      out.write("         <!---Start Body --->\n");
      out.write("         <img src=\"images/en.jpg\" width=\"360\" height=\"200\" alt=\"\" />\n");
      out.write("         <div>\n");
      out.write("         <form action=\"Upload_new\" method=\"post\" enctype=\"multipart/form-data\"> \n");
      out.write("         <br><input type=\"file\"class=\"inputs\" name=\"file\" required=\"\" placeholder=\"File\" /><br><br>\n");
      out.write("         <input type=\"Submit\" value=\"Upload\" class=\"button\" >\n");
      out.write("             </form>\n");
      out.write("             </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <!---End Body --->\n");
      out.write("      <br><br><br><br></div>\n");
      out.write("     </div>\n");
      out.write("      <div class=\"sidebar\">\n");
      out.write("        <div class=\"gadget\">\n");
      out.write("          <h2 class=\"star\"><span>Sidebar</span> Menu</h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <ul class=\"sb_menu\">\n");
      out.write("            <li><a href=\"pro_home.jsp\">Data Provider Home</a></li>\n");
      out.write("            <li><a href=\"file_upload.jsp\">File Upload to Cloud</a></li>\n");
      out.write("            <li><a href=\"file_de.jsp\">Uploaded File Details</a></li>\n");
      out.write("            <li><a href=\"file_update.jsp\">File Update</a></li>\n");
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
      out.write("</html>\n");
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
