package edu.umuc.pse.controller;




import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping("/")
public class PSEController {
	
		
	// Clicking on from SUBMIT button runs this method.  The URL it maps to is
	// ContextRoot/blah/save.
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(){
	
			try{
				return "success";
			}catch(DataIntegrityViolationException ex){
				return "error";
			}
		}
		
	
	// Browsing to ContextRoot/blah causes this method to run.
	
	@RequestMapping(method=RequestMethod.GET)
	public String displayUserForm(Model model){
		
	
		return "userForm";
		
	}
	
}
