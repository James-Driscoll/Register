import uk.ac.shu.webarch.register.*;

class BootStrap {

    def init = { servletContext ->

    println("BootStrap::init");


    //Instructor test data: 
   
    def ian_instructor = Instructor.findByInstructorNo('646345d') ?:
                new Instructor(instructorNo:'646345d',
             	               name:'Ian Ibbotson',
                               password:'passwordian').save(failOnError:true);

    def matthew_instructor = Instructor.findByInstructorNo('253425') ?:
                new Instructor(instructorNo:'253425',
		               name:'Matthew Love', 					
                               password:'passwordmatt').save(failOnError:true);
    
    def tom_instructor = Instructor.findByInstructorNo('111425') ?:
                new Instructor(instructorNo:'111425',
		               name:'Thomas Table', 					
                               password:'passwordtom').save(failOnError:true);




    //Course test data:

    def web_arch_course = Course.findByCourseCode('55-5571-00L-A-20123') ?:
                    new Course(courseCode:'55-5571-00L-A-20123', 
                               name:'Web Architectures', 
                               description:'Web Development Course.').save(failOnError:true);
     
    def is_course = Course.findByCourseCode('443343d4') ?:
                    new Course(courseCode:'443343d4', 
                               name:'Information Systems', 
                               description:'Systems Design.').save(failOnError:true);
 
    def bs_course = Course.findByCourseCode('357843d4') ?:
                    new Course(courseCode:'357843d4', 
                               name:'Business Studies', 
                               description:'Study of business operations.').save(failOnError:true);





    //Session test data:
    //Five unique sessions, however linkning to only three unique courses. 
    //Two Web-Arch sessions.  One Information Systems session.  Two Business Studies sessions.

    def monday_pm_session = Session.findByCourseAndSessionCode(web_arch_course, 'WebArchOne') ?: 
                   new Session(name:'Web Architectures Group One',
                               sessionCode:'WebArchOne',
                               instructor:ian_instructor, 
                               course:web_arch_course).save(failOnError:true);

    def tuesday_pm_session = Session.findByCourseAndSessionCode(web_arch_course, 'WebArchTwo') ?: 
                   new Session(name:'Web Architectures Group Two',
                               sessionCode:'WebArchTwo',
                               instructor:ian_instructor, 
                               course:web_arch_course).save(failOnError:true);

    def info_sys_session = Session.findByCourseAndSessionCode(is_course, 'ISOne') ?:
                   new Session(name:'Information SYstems Group One',
                               sessionCode:'ISOne',
                               instructor:matthew_instructor,
                               course:is_course).save(failOnError:true);

    def bus_mon_session = Session.findByCourseAndSessionCode(bs_course, 'BSOne') ?:
                   new Session(name:'Business Studies Group One',
                               sessionCode:'BSOne',
                               instructor:tom_instructor,
                               course:bs_course).save(failOnError:true);

    def bus_thurs_session = Session.findByCourseAndSessionCode(bs_course, 'BSTwo') ?:
                   new Session(name:'Business Studies Group Two',
                               sessionCode:'BSTwo',
                               instructor:tom_instructor,
                               course:bs_course).save(failOnError:true);





    //Student test data:
    //Seven unique test students.

    def student_a = Student.findByStudentNo('A111') ?:
                   new Student(studentNo:'A111',
                               name:'Student Fred',
                               comment:'Student Fred Notes',
                               password:'passwordfred').save(failOnError:true);

    def student_b = Student.findByStudentNo('B111') ?:
                   new Student(studentNo:'B111',
                               name:'Student James',
                               comment:'Student Fred Notes',
                               password:'passwordjames').save(failOnError:true);

    def student_c = Student.findByStudentNo('C111') ?:
                   new Student(studentNo:'C111',
                               name:'Student Gill',
                               comment:'Student Gill Notes',
                               password:'passwordgill').save(failOnError:true);

    def student_d = Student.findByStudentNo('D111') ?:
                   new Student(studentNo:'D111',
                               name:'Student Freda', 
                               comment:'Student Freda Notes',
                               password:'passwordfreda').save(failOnError:true);

    def student_e = Student.findByStudentNo('E111') ?:
                   new Student(studentNo:'E111',
                               name:'Student Janine',
                               comment:'Student Janine Notes',
                               password:'passwordjanine').save(failOnError:true);

    def student_f = Student.findByStudentNo('F111') ?:
                   new Student(studentNo:'F111', 
                               name:'Student Graham',
                               comment:'Student Graham Notes',
                               password:'passwordgraham').save(failOnError:true);

    def student_g = Student.findByStudentNo('G111') ?:
                   new Student(studentNo:'G111',
                               name:'Student Wibble', 
                               comment:'Student Wibble Notes',
                               password:'passwordwibble').save(failOnError:true);

    println("Find or create by...")





    //Enrollment test data:
    //Each student is enrolled onto at least one session.
    //Each session has at least one student enrolled onto itself.

    def student_a_web_arch = Enrollment.findOrCreateByStudentAndSession(student_a,monday_pm_session)

    def student_b_web_arch = Enrollment.findOrSaveByStudentAndSession(student_b,monday_pm_session)

    def student_c_web_arch = Enrollment.findOrSaveByStudentAndSession(student_c,bus_mon_session)

    def student_d_web_arch = Enrollment.findOrSaveByStudentAndSession(student_d,info_sys_session)

    def student_e_web_arch = Enrollment.findOrSaveByStudentAndSession(student_e,bus_thurs_session)

    def student_f_web_arch = Enrollment.findOrSaveByStudentAndSession(student_f,bus_mon_session)

    def student_g_web_arch = Enrollment.findOrSaveByStudentAndSession(student_g,info_sys_session)

    println("Done...")



    }
    def destroy = {
    }
}
