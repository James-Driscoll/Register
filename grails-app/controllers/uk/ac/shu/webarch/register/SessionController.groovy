package uk.ac.shu.webarch.register

import grails.converters.*

class SessionController {

    def index() {
        
    def result=[:]

      result.SessionList = []

      Session.findAll().each { cls ->
        result.SessionList.add([courseCode:cls.course.courseCode, 
                                courseName:cls.course.name,
                                sessionCode:cls.sessionCode, 
                                sessionName:cls.name,
                                instructorName:cls.instructor.name])
    }
      withFormat {
        html result
        xml { render result as XML }
        json { render result as JSON }
      }  
     
      def s = enrollment.findbyStudentandSession(1, 2)
      render s

    }
    //End of Index action.



    def sessiondetail() {
        
    def result=[:]

      result.SessionList = []

      Session.findAll().each { cls ->
        result.SessionList.add([courseCode:cls.course.courseCode, 
                                courseName:cls.course.name,
                                sessionCode:cls.sessionCode, 
                                sessionName:cls.name,
                                instructorName:cls.instructor.name])
    }
      withFormat {
        html result
        xml { render result as XML }
        json { render result as JSON }
      }  
    }
    //End SessionDetail action.



   def insseslist() {
        
    def result=[:]

      result.SessionList = []

      Session.findAll().each { cls ->
        result.SessionList.add([courseCode:cls.course.courseCode, 
                                courseName:cls.course.name,
                                sessionCode:cls.sessionCode, 
                                sessionName:cls.name,
                                instructorName:cls.instructor.name])
    }
      withFormat {
        html result
        xml { render result as XML }
        json { render result as JSON }
      }  
    }
    //End of InsSesList Action.


}
