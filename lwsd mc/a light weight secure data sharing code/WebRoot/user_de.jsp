<%-- 
    Document   : user_de
    Created on : Jul 12, 2016, 12:12:19 PM
    Author     : java4
--%>

<%@page import="Dbcon.DbConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
<title>Auditor Login Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/droid_sans_400-droid_sans_700.font.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
                <%
           if (request.getParameter("msgg") != null) {
        %>
        <script>alert('Please Enter Correct username and Password');</script>
        <%
            }
        %>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1>Secure Data Sharing in Cloud Computing Using Revocable-Storage Identity-Based Encryption</h1>
      </div>
      <div class="searchform">
        <form id="formsearch" name="formsearch" method="post" action="#">
          <span>
          <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="Search our ste:" type="text" />
          </span>
          <input name="button_search" src="images/search.gif" class="button_search" type="image" />
        </form>
      </div>
      <div class="clr"></div>
      <div class="menu_nav">
       <ul>
          <li><a href="ahome.jsp"><span>Auditor Home</span></a></li>
          <li><a href="pro_de.jsp"><span>Data Provider Details</span></a></li>
          <li class="active"><a href="user_de.jsp"><span>User Details</span></a></li>
          <li><a href="user_req.jsp"><span>User Request</span></a></li>
          <li><a href="file_ac.jsp"><span>Download Details</span></a></li>
          <li><a href="index.jsp"><span>Logout</span></a></li>
        </ul>
      </div>
      <div class="clr"></div>
      <div class="slider">
        <div id="coin-slider"> <a href="#"><img src="images/slide1.jpg" width="960" height="335" alt="" /> </a> <a href="#"><img src="images/slide2.jpg" width="960" height="335" alt="" /> </a> <a href="#"><img src="images/slide3.jpg" width="960" height="335" alt="" /> </a> </div>
        <div class="clr"></div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
            <br><h2>User Details</h2><br>
         <div class="clr"></div>
         <!---Start Body --->
         <table border="1" style="text-align: center;margin-left: 0px">
                            <tr>
                                <th style="text-align: center;width: 30px; font-size: 16px; color: #0096da ">ID</th>
                                <th style="text-align: center;width: 300px; font-size: 16px; color: #0096da">Name</th>
                                <th style="text-align: center;width: 100px; font-size: 16px; color: #0096da">Email</th>
                                <th style="text-align: center;width: 200px; font-size: 16px; color: #0096da">DOB</th>
                                <th style="text-align: center;width: 100px; font-size: 16px; color: #0096da">State</th>
                                <th style="text-align: center;width: 100px; font-size: 16px; color: #0096da">Country</th>
                            </tr>
                            <tr>
                                <%
                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    try {
                                        con = DbConnection.getConnection();
                                        st = con.createStatement();
                                        rs = st.executeQuery("select * from reg where role='User'");
                                        while(rs.next())
                                            
                                        {%>
                                        <td style=" font-size: 14px; color: #666464"><%=rs.getString("id")%></td>     
                                        <td style=" font-size: 14px; color: #666464"><%=rs.getString("name")%></td>     
                                        <td style=" font-size: 14px; color: #666464"><%=rs.getString("email")%></td>
                                        <td style=" font-size: 14px; color: #666464"><%=rs.getString("dob")%></td>
                                        <td style=" font-size: 14px; color: #666464"><%=rs.getString("state")%></td>
                                        <td style=" font-size: 14px; color: #666464"><%=rs.getString("country")%></td>
                                        <tr />
                                        <%
                                      
                                        
                                        } 
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }

                                %>
                        </table>
         <!---End Body --->
      <br><br><br><br></div>
     </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star"><span>Sidebar</span> Menu</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li><a href="ahome.jsp">Home</a></li>
            <li><a href="pro_de.jsp">Data Provider Details</a></li>
            <li><a href="user_de.jsp">User Details</a></li>
            <li><a href="user_req.jsp">User Request</a></li>
            <li><a href="file_ac.jsp">Download Details</a></li>
            <li><a href="index.jsp">Logout</a></li>
          </ul>
        </div>
        
      </div>
      <div class="clr"></div>
    </div>
  </div>

  <div class="footer">
    <div class="footer_resize">
      <p class="lf">Copyright &copy; <a href="#">Jpinfotech</a></p>
      <p class="rf">Design by <a target="_blank" href="">Ajay</a></p>
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
</body>
</html>