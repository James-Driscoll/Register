<html>
  <head>
  <meta name="layout" content="main"/>
  <title>Your Sessions</title>
  <style type="text/css">
    label{
      float:left;
      width:65px;
    }
  </style>  
  </head>
<body>
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
            <td><g:link action="sessiondetail" params="${[courseCode:c.courseCode,sessionCode:c.sessionCode]}">${c.sessionName}</g:link></td>
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
