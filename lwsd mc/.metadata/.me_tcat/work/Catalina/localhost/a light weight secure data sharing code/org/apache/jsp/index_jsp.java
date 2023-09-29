package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Cloud Home Page</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/droid_sans_400-droid_sans_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("</head>\n");
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
      out.write("          <li class=\"active\"><a href=\"index.jsp\"><span>Home Page</span></a></li>\n");
      out.write("          <li><a href=\"pro.jsp\"><span>Data Provider</span></a></li>\n");
      out.write("          <li><a href=\"user.jsp\"><span>User</span></a></li>\n");
      out.write("          <li><a href=\"auditor.jsp\"><span>Auditor</span></a></li>\n");
      out.write("          <li><a href=\"reg.jsp\"><span>Registration</span></a></li>\n");
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
      out.write("          <h2><span>Abstract</h2>\n");
      out.write("          \n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <!--<div class=\"img\"><img src=\"images/img1.jpg\" width=\"650\" height=\"196\" alt=\"\" class=\"fl\" /></div>-->\n");
      out.write("          <div class=\"post_content\">\n");
      out.write("            <p>\n");
      out.write("                <font style=\"font-size: 16px\">\n");
      out.write("               Cloud computing provides a flexible and convenient way for data sharing, which brings various benefits for both the society and individuals. But there exists a natural resistance for users to directly outsource the shared data to the cloud server since the data often contain valuable information. Thus, it is necessary to place cryptographically enhanced access control on the shared data. Identity-based encryption is a promising cryptographical primitive to build a practical data sharing system. However, access control is not static. That is, when some user's\n");
      out.write("               authorization is expired, there should be a mechanism that can remove him/her from the system. Consequently, the revoked user cannot access both the previously and subsequently shared data. To this end, we propose a notion called revocable-storage identity-based encryption (RS-IBE), which can provide the forward/backward security of ciphertext by introducing the functionalities of user revocation and ciphertext update simultaneously. Furthermore, we present a concrete construction of RS-IBE, and prove its security in the defined security model. The performance comparisons indicate that the proposed RS-IBE scheme has advantages in terms of functionality and efficiency, and thus is feasible for a practical and cost-effective data-sharing system. Finally, we provide implementation results of the proposed scheme to demonstrate its practicability.\n");
      out.write("               </font>\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"sidebar\">\n");
      out.write("        <div class=\"gadget\">\n");
      out.write("            <br><h2 class=\"star\"><span>Sidebar</span> Menu</h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <ul class=\"sb_menu\">\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"pro.jsp\">Data Provider</a></li>\n");
      out.write("            <li><a href=\"user.jsp\">User</a></li>\n");
      out.write("            <li><a href=\"auditor.jsp\">Auditor</a></li>\n");
      out.write("            <li><a href=\"reg.jsp\">Registration</a></li>\n");
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
