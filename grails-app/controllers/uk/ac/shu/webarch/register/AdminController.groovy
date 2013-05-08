package uk.ac.shu.webarch.register

class AdminController {

    def index() { }

    def login() { 
      if(params.username == "admin" && params.password == "pass"){	//Read data from g:form on view. 
        flash.message = "Login Successful"				//Use flash method to display message.
        session.user = "Admin"						//Begin new session.
      }else{
        flash.message = "Login Failed"
      }
    
     redirect(action: 'index')
    }
    //End of Login action.
    


    def logout = {
      session.user = null			//End session.
      redirect(action: 'index')			
    }
    //End of Logout action.
}
