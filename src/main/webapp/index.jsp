<%@ page import="java.io.*,java.util.*" %>
<%@ page import="com.berkgokden.HazelcastClientClass" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    String[] result =HazelcastClientClass.call();
    if (result != null) {
        for (String s : result) {
            System.out.println("<p>" + s + "</p>");
        }
    }
%>
</body>
</html>
