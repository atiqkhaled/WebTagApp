<%-- 
    Author     : atiqkhaled
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="superman" uri="supertaglib"%>
<html>
  <head>
    <title>A SuperMan tag</title>
  </head>
  <body>
   <!-- In superman loop tag count attribute value specifies how many times hello world will be generated on html -->
    <superman:loop count = "3">
      Hello world!
    </superman:loop>
  </body>
</html>