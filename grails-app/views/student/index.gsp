<html>
  <head>
    <meta name="layout" content="main"/>
    <title></title>
    <style type="text/css">
      label{
        float:left;
        width:65px;
      }
    </style>
  </head>
  <body>
    <Title>Student</Title>
    <h1>Register - Student Home</h1>
    <g:link controller="Home" action="index">Back to Home</g:link>
    <div style="width:220px">
      <br /><br />
      <g:link controller="Session">View your classes.</g:link>
      <br /><br /><br />
      <g:form name="student_login" url="[action:'login',controller:'Student']">
        Name: <input type="text" name="name"><br>
      </g:form>
    </div>
  </body>
</html>
