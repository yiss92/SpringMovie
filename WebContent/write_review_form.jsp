<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Contact</title>
	<meta charset="utf-8">
	<link rel="icon" href="img/favicon.ico" type="image/x-icon">
	<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
	<meta name="description" content="Your description">
	<meta name="keywords" content="Your keywords">
	<meta name="author" content="Your name">
	<link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen">
	<link rel="stylesheet" href="css/responsive.css" type="text/css" media="screen">
	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300' rel='stylesheet' type='text/css'>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/superfish.js"></script>
	<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="js/jquery.cookie.js"></script>
	<script src="js/forms.js"></script>
	<script>		
   jQuery(window).load(function() {	
    jQuery('.spinner').animate({'opacity':0},1000,'easeOutCubic',function (){jQuery(this).css('display','none')});	
   });			
	</script>

	<!--[if lt IE 8]> 
  		<div style='text-align:center'><a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/img/upgrade.jpg"border="0"alt=""/></a></div>  
 	<![endif]-->
	<!--[if (gt IE 9)|!(IE)]><!-->
	<!--<![endif]-->
	<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <link rel="stylesheet" href="css/docs.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/ie.css" type="text/css" media="screen">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400' rel='stylesheet' type='text/css'>
  <![endif]-->
	</head>

	<body  class="bg-content">
<div class="spinner"></div>

<div class="bg-content"> 
      <!--============================== content =================================-->
      <div id="content"><div class="ic"></div>
    <div class="container">
          <div class="row">
        <article class="span8">
              <h3>게시판</h3>
              <div class="inner-1">
            <form id="contact-form" action="writeReview.do" method="post">
<!--                   <div class="success"> Contact form submitted! <strong>We will be in touch soon.</strong> </div> -->
                  <fieldset>
									<div>
										제목 : <input type="text" name="review_title"><br> <br> 
										영화 : <input type="text" name="movie_title"> <br> <br> 
										
									</div>
									<div>
                <br>내용<br>
                	
                    <textarea name="content"></textarea>
                    <br>
                    <br>
                    별점 : <input type="text" name="score"> <br> <br>
<!--                     <span class="error">*The message is too short.</span> <span class="empty">*This field is required.</span> </label> -->
                    </div>
<!--                 <div class="buttons-wrapper"> <a class="btn btn-1" data-type="reset">Clear</a> <a class="btn btn-1" data-type="submit">Send</a></div> -->
              		<div>
              		<br><br>
              		<input type="submit" value="저장" onclick="document.getElementById('contact-form').submit();">
<!-- 					<input type="hidden" name="type" value="write">		 -->
              		</div>
              </fieldset>
                </form>
          </div>
            </article>
            </div>
        </div>
  </div>
    </div>



</body>
</html>