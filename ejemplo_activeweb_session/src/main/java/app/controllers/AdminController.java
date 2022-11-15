package app.controllers;
import org.javalite.activeweb.AppController;
public class AdminController extends AppController{
    public void index(){
      session("nombre_usuario", getHttpServletRequest().getRemoteUser());
      session("puede_acceder_area_restringida", getHttpServletRequest().isUserInRole("super_administrador"));
      session("puede_acceder_a_otra_area", getHttpServletRequest().isUserInRole("usuario"));  
    
    }
    
    
    public void otra(){
    
    }
    
    public void restringido(){
        
    }
    
    public void cerrar(){
        session().invalidate();
        redirect();
    }
}
