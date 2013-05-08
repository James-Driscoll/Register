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
    <Title>Instructor</Title>
    <h1>Register - Instructor Home</h1>
    <g:link controller="Home" action="index">Back to Home</g:link>
    <br /><br />
    ${flash.message}  
    <g:if test="${session.user}">
      <br />
      <b>Logged in as: </b>${session.user}  
      <br /><br />
      <g:link controller="Session" action="insseslist">View all Sessions.</g:link>
      <br /><br /><br /><br /> 
      <g:link action="logout">Logout</g:link>
    </g:if>
    <g:else>  
      <g:form controller="instructor" action="login" style="padding-left:220px">
        <div style="width:220px">
        <label>Instructor Number:</label> <input type="text" name="username"/>
        <label>Password:</label> <input type="password" name="password"/>
        <label>&nbsp;</label><input type="submit" value="Login"/>
     </g:form>
    </g:else>
    <br /><br /><br /><i>(Example data: username=111425 password=passwordtom)</i>    
    <div style="width:220px">
    </div>
  </body>
</html>
