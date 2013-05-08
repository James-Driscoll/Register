<html>
  <head>
    <meta name="layout" content="main"/>
    <style type="text/css">
      label{
        float:left;
        width:65px;
      }
    </style>  
  </head>
  <body>
    <Title>All Sessions</Title>
    <h1>Register - Instructor: All Sessions</h1>
    <g:link controller="Home" action="index">Back to Home</g:link>
    <table>
      <thead>
        <tr>
          <td></td>
          <td>Course Code</td>
          <td>Course Name</td>
          <td>Session Code</td>
          <td>Session Name</td>
          <td>Instructor</td>
        </tr>
      </thead>
      <tbody>
        <g:each in="${SessionList}" var="c">
          <tr>
            <td>${c.sessionName}</td>
            <td>${c.courseCode}</td>
            <td>${c.courseName}</td>
            <td>${c.sessionCode}</td>
            <td>${c.sessionName}</td>
            <td>${c.instructorName}</td>
          </tr>
        </g:each>
      </tbody>
    </table>
  </body>
</html>
