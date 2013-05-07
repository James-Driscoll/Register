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
    
  <h1>Your Courses</h1>
  <br/>
   This is a list of your classes, select the session that you wish to sign in to.<br/><br/><br/>
   <table>
      <thead>
        <tr>
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
