﻿<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>WiseInfo</title>
<script language="javascript" src="jquery.js"></script>
<style type="text/css">
<!--
* { 
	margin:0px; 
	padding:0px;
}
html, body{	
	height:100%;
	overflow: hidden;

}
html>body{		/*-- for !IE6.0 --*/
	width: auto;
	height: auto;
	position: absolute;
	top: 0px;
	left: 0px;
	right: 0px;
	bottom: 0px;
	
}
body {
	border:8px solid #ffffff;
	background-color: #ffffff;min-width:230px;
}
#mainDiv {
	width: 100%;
	height: 100%;
    padding:60px 0px 25px 0px;;
	
	
}
#centerDiv{
	width: 100%;
	height: 100%;
	background-color:#00CCFF;
	padding-left:158px;
}
#mainDiv>#centerDiv{		/*-- for !IE6.0 --*/	
	width: auto;
	height: auto;
	position: absolute;
	top: 56px;
	left: 0px;
	right: 0px;
	bottom: 20px;
	
}
#left{
width:158px;
height:100%;
background:url(slide.jpg) repeat-y;
position:absolute;
left:0px;
}
#lhead{
background:url(left-head.jpg) left top no-repeat;
height:25px;
	font-size:14px;
	color:#FF9933;
    text-align:center;
	line-height:25px;
}
#right{
width:100%;
height:100%;
background:#ffffff;
position:absolute;
overflow-y:auto;
border:1px #003366 solid;
padding:20px 0 0 10px;
font-size:12px;
font-family:"宋体";
}
#centerDiv>#right{
width:auto;
height:auto;
position:absolute;
top:0px;
right:0px;
left:158px;
bottom:0px;
}
#topDiv{
	width:100%;
	height:56px;

	background:url(head-bg.jpg) repeat-x;
	position:absolute;
	top:0px;
	overflow:hidden;
}
#topDiv ul{
list-style:none;
font-size:12px;

width:100%;
margin:0;
padding:0;
}
#topDiv ul li{
float:left;
width:15%
}
#topDiv ul li a {
display:block;
width:100%;
height:25px;
line-height:25px;
background:url(menu-bg.jpg) repeat-x;
color:#FFFFFF;
direction:none;
text-align:center;
border-bottom:1px #000066 solid;
border:1px #06597D solid;
}
#tmenu{
width:100%;
position:absolute;
left:12%;
bottom:0;
padding-left:15%;
margin-left:-15%;
}
#current{
background:#ccc;
height:25px;
line-height:25px;
margin:-20px 0 0 -10;
overflow:hidden;
}
#bottomDiv{
	width:100%;
	height:20px;
	background:url(bottom.jpg) repeat-x;
	position:absolute;
	bottom:0px;
	bottom:-1px;		 /*-- for IE6.0 --*/
}
#left ul{
list-style:none;
font-size:12px;
margin:50px 0 0 8px;
}
#left ul li a{
display:block;
width:140px;
height:25px;
line-height:25px;
background:url(menu-bg.jpg) repeat-x;
color:#FFFFFF;
direction:none;
text-align:center;
border-bottom:1px #000066 solid;
border:1px #06597D solid;
}
#left ul li a:hover{

background:url(menu-bg.jpg) 0px 25px;
color:#99FFCC;
direction:none;
text-align:center;
border-bottom:1px #000066 solid;
}
#form{
width:80%;
height:99%;
margin:0 auto;
_margin-left:20%;

}
fieldset{
width:100%;
margin:20 auto;
line-height:35px;
padding-left:20PX;
}

#iframe {
    width: 100%;
    height: 100%;
    border: 0;
}
-->
</style>
</head>
<body>
<div id="mainDiv">
	<div id="topDiv">
	</div>
	<div id="centerDiv">
	
	 <div id="left">
	<div id="lhead">查询吉他</div>
	<ul>
	<li ><a href="index.jsp" >重新查询</a></li>
	<li ><a href="add.jsp" >添加吉他</a></li>
	</ul>
	</div> 
	<div id="right"> 
      
	<div id="current">&nbsp;&nbsp;&nbsp;&nbsp;添加吉他:</div>
    <div id="form">

<form name="search" action="findguitar" method="post">

<fieldset>
		<legend>添加吉他序号:</legend>	
		<input  name="serialNumber" type="text" value="" />	
</fieldset>

<fieldset>
		<legend>添加吉他价格:</legend>	
		<input  name="price" type="text" value="" />	
</fieldset>

<fieldset>
		<legend>添加吉他制造商:</legend>	
		<input  name="builder" type="text" value="" />		
</fieldset>

<fieldset>
		<legend>添加吉他型号:</legend>	
		<input  name="model" type="text" value="" />		
</fieldset>

<fieldset>
		<legend>查询吉他类型:</legend>	
		<input  name="type" type="text" value="" />		
</fieldset>

<fieldset>
		<legend>添加吉他木料:</legend>	
		hou<input  name="backwood" type="text" value="" />	
		ding<input  name="topwood" type="text" value="" />		
</fieldset>

<fieldset>
		<legend>提交:</legend>
		<input type="submit" value="提交" id="submit" name="submit" />
		<input type="reset" value="重置" id="reset" name="reset" />
</fieldset>


</form>

</div>
     </div>
	<div id="bottomDiv"></div>
</div>
<script language="javascript">
$("#test1").toggle(function(){$("#test").slideDown()},function(){$("#test").slideUp()})
</script>
</body>
</html>