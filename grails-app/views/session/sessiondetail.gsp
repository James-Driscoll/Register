<html>
  <head>
  <meta name="layout" content="main"/>
  <title>${params.sessionCode}</title>
  <style type="text/css">
    label{
      float:left;
      width:65px;
    }
  </style>  
  </head>  
  <body>
   <br/><br/>
   <h1>${params.sessionCode} Session</h1>
   <br/><br/>
   <g:each in="${SessionList}" var="s">
    <b>Session Code:</b> ${params.sessionCode}<br/><br/>
    <b>Session Name:</b>${s.sessionName}<br/><br/>
    <b>CourseCode:</b>${params.courseCode}<br/><br/>
    <b>Course Name:</b>$s.courseName}<br/><br/>
    <b>Instructor:</b>${s.instructorName}<br/><br/>
   </g:each>   
   <br /><br /><br /><br />    
   <g:form name="student" url="[action:'processattendance',controller:'Apply']">
     Name: <input type="text" name="name"><br>
   </g:form>

</body>
</html>
