package uk.ac.shu.webarch.register

class AdminController {

    def index() { }

    def login() { 
      if(params.username == "admin" && params.password == "pass"){
        flash.message = "Login Successful"
        session.user = "Admin"
      }else{
        flash.message = "Login Failed"
      }
    
     redirect(action: 'index')
    }

    
    def logout = {
      session.user = null
      redirect(action: 'index')
    }
}
