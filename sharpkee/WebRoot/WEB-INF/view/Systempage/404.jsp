<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>404</title> 
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   <link rel="stylesheet" type="text/css" href="resources/errorpage/css/dandelion.css">
  </head>
  
  <body> 
	<div id="da-wrapper" class="fluid">
    
        <!-- Content -->
        <div id="da-content">
            
            <!-- Container -->
            <div class="da-container clearfix">
            
            	<div id="da-error-wrapper">
                	
                   	<div id="da-error-pin"></div>
                    <div id="da-error-code">
                    	页面不存在 <span>sorry</span>                    </div>
                
                	<h1 class="da-error-heading">哎呀，好像走丢了！！！</h1>
                    <p> <a href="#">点击返回首页</a></p>
                </div>
            </div>
        </div> 
                <div id="da-footer">
        	<div class="da-container clearfix">
           	<p> 2016 sharpkee . All Rights Reserved. <a href="#">sharpkee</a></div>
        </div>
    </div>
  </body>
</html>
