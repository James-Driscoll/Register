package uk.ac.shu.webarch.register

import org.springframework.dao.DataIntegrityViolationException
import grails.converters.*

class StudentController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
    }
      
    def login() { 		
      
      def student = Student.findByStudentNo(params.username)	//Read data from g:form on view. 
      
      if((student.studentNo == params.username) && (student.password == params.password)){ 
        flash.message = "Login Successful"			//Verify login details.
        session.user = "${student.name}"			//Use flash method to display message on view.
        
	

	//Here I am attempting to display a list of sessions that only THIS student is enrolled onto.

//       def anEnrollment = Enrollment.findByStudent(student)	//An enrollment object that has a specific student.           
       
//       def aSession = anEnrollment.session			//The session object from the enrollment object.

//       def aSessionCode = aSession.sessionCode			//The session code from the session object.
   
//      def result=[:]						//Declare an empty map.

//        result.SessionList = []					

//        Session.findAllBySessionCode(aSessionCode).each { ses ->	//Find all sessions with the specific session code.		 
//          result.SessionList.add([courseCode:ses.course.courseCode, 	//Populate the list.
//                                  courseName:ses.course.name,
//                                  sessionCode:ses.sessionCode, 
//                                  sessionName:ses.name,
//                                  instructorName:cls.instructor.name])
//          }
//        withFormat {						//Output returnable as html, json or xml.
//          html result
//          xml { render result as XML }
//          json { render result as JSON }
//        }



								//Begin new session.
      }else{							
        flash.message = "Login Failed"				//Else login unsuccessful.	
      }
    
     redirect(action: 'index')					//Do not search for view called Login.
       
     
    }
    //End of Login action.



    def logout = {
      session.user = null					//End session.
      redirect(action: 'index')			
    }
    //End of Logout action.









		//Scaffold CRUD operations.

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [studentInstanceList: Student.list(params), studentInstanceTotal: Student.count()]
    }

    def create() {
        [studentInstance: new Student(params)]
    }

    def save() {
        def studentInstance = new Student(params)
        if (!studentInstance.save(flush: true)) {
            render(view: "create", model: [studentInstance: studentInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'student.label', default: 'Student'), studentInstance.id])
        redirect(action: "show", id: studentInstance.id)
    }

    def show(Long id) {
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        [studentInstance: studentInstance]
    }

    def edit(Long id) {
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        [studentInstance: studentInstance]
    }

    def update(Long id, Long version) {
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (studentInstance.version > version) {
                studentInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'student.label', default: 'Student')] as Object[],
                          "Another user has updated this Student while you were editing")
                render(view: "edit", model: [studentInstance: studentInstance])
                return
            }
        }

        studentInstance.properties = params

        if (!studentInstance.save(flush: true)) {
            render(view: "edit", model: [studentInstance: studentInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'student.label', default: 'Student'), studentInstance.id])
        redirect(action: "show", id: studentInstance.id)
    }

    def delete(Long id) {
        def studentInstance = Student.get(id)
        if (!studentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
            return
        }

        try {
            studentInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'student.label', default: 'Student'), id])
            redirect(action: "show", id: id)
        }
    }
}
