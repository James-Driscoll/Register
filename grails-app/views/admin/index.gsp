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
</head>


<body>
<Title>Admin</Title>
<h1>Register - Admin</h1>

${flash.message}  
  <g:if test="${session.user}">
    <br />
    Logged in as: ${session.user}  
    <br /><br />
    <g:link controller="Student" action="list">Manage Students.</g:link>
    <br /><br /><br />
    <g:link controller="Instructor" action="list">Manage Instructors.</g:link>
    <br /><br /><br /><br />    
    <g:link action="logout">Logout</g:link>
  </g:if>
  <g:else>  
  <g:form controller="admin" action="login" style="padding-left:220px">
  <div style="width:220px">
     <label>Name:</label> <input type="text" name="username"/>
     <label>Password:</label> <input type="password" name="password"/>
     <label>&nbsp;</label><input type="submit" value="Login"/>
  </div>
  </g:form>
  </g:else>
</body>
</html>
