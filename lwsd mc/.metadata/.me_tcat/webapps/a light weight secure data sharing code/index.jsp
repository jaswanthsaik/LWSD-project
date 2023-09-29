<%-- 
    Document   : index
    Created on : Jul 11, 2016, 6:09:50 PM
    Author     : java4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Cloud Home Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/droid_sans_400-droid_sans_700.font.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
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
          <li class="active"><a href="index.jsp"><span>Home Page</span></a></li>
          <li><a href="pro.jsp"><span>Data Provider</span></a></li>
          <li><a href="user.jsp"><span>User</span></a></li>
          <li><a href="auditor.jsp"><span>Auditor</span></a></li>
          <li><a href="reg.jsp"><span>Registration</span></a></li>
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
          <h2><span>Abstract</h2>
          
          <div class="clr"></div>
          <!--<div class="img"><img src="images/img1.jpg" width="650" height="196" alt="" class="fl" /></div>-->
          <div class="post_content">
            <p>
                <font style="font-size: 16px">
               Cloud computing provides a flexible and convenient way for data sharing, which brings various benefits for both the society and individuals. But there exists a natural resistance for users to directly outsource the shared data to the cloud server since the data often contain valuable information. Thus, it is necessary to place cryptographically enhanced access control on the shared data. Identity-based encryption is a promising cryptographical primitive to build a practical data sharing system. However, access control is not static. That is, when some user's
               authorization is expired, there should be a mechanism that can remove him/her from the system. Consequently, the revoked user cannot access both the previously and subsequently shared data. To this end, we propose a notion called revocable-storage identity-based encryption (RS-IBE), which can provide the forward/backward security of ciphertext by introducing the functionalities of user revocation and ciphertext update simultaneously. Furthermore, we present a concrete construction of RS-IBE, and prove its security in the defined security model. The performance comparisons indicate that the proposed RS-IBE scheme has advantages in terms of functionality and efficiency, and thus is feasible for a practical and cost-effective data-sharing system. Finally, we provide implementation results of the proposed scheme to demonstrate its practicability.
               </font>
            </p>
            
          </div>
          <div class="clr"></div>
        </div>

        
      </div>
      <div class="sidebar">
        <div class="gadget">
            <br><h2 class="star"><span>Sidebar</span> Menu</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="pro.jsp">Data Provider</a></li>
            <li><a href="user.jsp">User</a></li>
            <li><a href="auditor.jsp">Auditor</a></li>
            <li><a href="reg.jsp">Registration</a></li>
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