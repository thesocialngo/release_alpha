package org.tsn.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tsn.entity.TSecurityQuestions;
import org.tsn.service.interfaces.ISecurityQuestionManager;
 
@Controller
@RequestMapping("questions")
public class EditSecurtyQuestionController extends BaseController {
 
    @Autowired
    private ISecurityQuestionManager securityQuestionManager;
 
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listsecurityQuestions(ModelMap map)
    {
        map.addAttribute("securityQuestion", new TSecurityQuestions());
        map.addAttribute("securityQuestionList", securityQuestionManager.getRecords());        //return "editEmployeeList";
        return  "admin/editMasterData";
    }
 
    @RequestMapping(value = "/questions/add", method = RequestMethod.GET)
    public String addsecurityQuestion( @ModelAttribute(value="question") TSecurityQuestions question , BindingResult result)
    {
        securityQuestionManager.addRecord(question);
        return "redirect:/admin/questions/";
    }
 
    @RequestMapping("/questions/delete/{questionId}")
    public String deleteEmplyee(@PathVariable("questionId") Integer questionId)
    {
        securityQuestionManager.deleteRecord(questionId);
        return "redirect:/admin/questions/";
    }
 
    public void setSecurityQuestionManager(ISecurityQuestionManager manager ) {
        this.securityQuestionManager = manager;
    }
}