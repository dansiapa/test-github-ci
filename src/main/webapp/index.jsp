<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Java 8 WebApp CI Demo</title>
    <style>
        body { font-family: Arial, sans-serif; max-width: 800px; margin: 50px auto; padding: 20px; }
        h1 { color: #2c3e50; }
        .info { background: #ecf0f1; padding: 15px; border-radius: 8px; margin: 20px 0; }
        a { color: #3498db; text-decoration: none; }
        a:hover { text-decoration: underline; }
        code { background: #f8f9fa; padding: 2px 6px; border-radius: 4px; }
    </style>
</head>
<body>
    <h1>&#9749; Java 8 WebApp CI Demo</h1>
    <div class="info">
        <p><strong>Status:</strong> Running</p>
        <p><strong>Java Version:</strong> <%= System.getProperty("java.version") %></p>
        <p><strong>Server:</strong> <%= application.getServerInfo() %></p>
    </div>
    <h2>Endpoints</h2>
    <ul>
        <li><a href="hello">GET /hello</a> - Default greeting</li>
        <li><a href="hello?name=GitHub">GET /hello?name=GitHub</a> - Custom greeting</li>
    </ul>
    <h2>About</h2>
    <p>This is a simple Java 8 web application built with <strong>GitHub Actions CI</strong>
       and packaged as a <code>.war</code> file.</p>
</body>
</html>
