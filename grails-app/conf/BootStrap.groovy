import uk.ac.shu.webarch.register.*;

class BootStrap {

    def init = { servletContext ->



    println("BootStrap::init");
    
    def ian_instructor = Instructor.findByInstructorNo('646345d') ?:
                new Instructor(InstructorNo:'646345d',
             	               name:'Ian Ibbotson',
                               password:'passwordian').save();

    def matthew_instructor = Instructor.findByInstructorNo('253425') ?:
                new Instructor(InstructorNo:'253425',
		               name:'Matthew Love', 					
                               password:'passwordmatt').save();

    def web_arch_course = Course.findByCourseCode('55-5571-00L-A-20123') ?:
                    new Course(courseCode:'55-5571-00L-A-20123', 
                               name:'Web Architectures', 
                               description:'Web Development Course.').save();

 
    def is_course = Course.findByCourseCode('443343d4') ?:
                    new Course(courseCode:'443343d4', 
                               name:'Information Systems', 
                               description:'Systems Design.').save();
 
   def monday_pm_class = Session.findByCourseAndSessionCode(web_arch_course, 'WebArchOne') ?: 
                   new Session(name:'Web Architectures Group One',
                               sessionCode:'WebArchOne',
                               instructor:ian_instructor, 
                               course:web_arch_course).save();

    def tuesday_pm_class = Session.findByCourseAndSessionCode(web_arch_course, 'WebArchTwo') ?: 
                   new Session(name:'Web Architectures Group Two',
                               sessionCode:'WebArchTwo',
                               instructor:ian_instructor, 
                               course:web_arch_course).save();

    def info_sys_c1 = Session.findByCourseAndSessionCode(is_course, 'ISOne') ?:
                   new Session(name:'Information SYstems Group One',
                               sessionCode:'ISOne',
                               instructor:matthew_instructor,
                               course:is_course).save();

    def student_a = Student.findByStudentNo('A111') ?:
                  new Student(studentNo:'A111', name:'Student Fred', comment:'Student Fred Notes').save();

    def student_b = Student.findByStudentNo('B111') ?:
                  new Student(studentNo:'B111', name:'Student James', comment:'Student Fred Notes').save();

    def student_c = Student.findByStudentNo('C111') ?:
                  new Student(studentNo:'C111', name:'Student Gill', comment:'Student Gill Notes').save();

    def student_d = Student.findByStudentNo('D111') ?:
                  new Student(studentNo:'D111', name:'Student Freda', comment:'Student Freda Notes').save();

    def student_e = Student.findByStudentNo('E111') ?:
                  new Student(studentNo:'E111', name:'Student Janine', comment:'Student Janine Notes').save();

    def student_f = Student.findByStudentNo('F111') ?:
                  new Student(studentNo:'F111', name:'Student Graham', comment:'Student Graham Notes').save();

    def student_g = Student.findByStudentNo('G111') ?:
                  new Student(studentNo:'G111', name:'Student Wibble', comment:'Student Wibble Notes').save();

    println("Find or create by...")

    def student_a_web_arch = Enrollment.findOrCreateByStudentAndSession(student_a,monday_pm_class)

    def student_b_web_arch = Enrollment.findOrSaveByStudentAndSession(student_b,monday_pm_class)

    def student_c_web_arch = Enrollment.findOrSaveByStudentAndSession(student_c,tuesday_pm_class)

    def student_d_web_arch = Enrollment.findOrSaveByStudentAndSession(student_d,tuesday_pm_class)

    def student_e_web_arch = Enrollment.findOrSaveByStudentAndSession(student_e,tuesday_pm_class)

    def student_f_web_arch = Enrollment.findOrSaveByStudentAndSession(student_f,monday_pm_class)

    def student_g_web_arch = Enrollment.findOrSaveByStudentAndSession(student_g,tuesday_pm_class)

    println("Done...")



    }
    def destroy = {
    }
}
