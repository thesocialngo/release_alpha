package org.tsn.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.tsn.coverter.ProjectTypeEditor;
import org.tsn.service.interfaces.IMasterDataManager;
import org.tsn.service.interfaces.IProjectMovement;
import org.tsn.tos.ProjectMovement;
import org.tsn.tos.ProjectType;

@Controller
@RequestMapping("movement")
public class ProjectMovementController extends BaseController
{
	final static Logger			logger	= Logger.getLogger(ProjectMovementController.class);

	@Autowired
	private IProjectMovement	fMovement;

	@Autowired
	private IMasterDataManager	masterDataManager;

	@RequestMapping(value = "/startYourMovement", method = RequestMethod.GET)
	public String doStartYourMovement(Model model)
	{

		ProjectMovement movement = new ProjectMovement();
		model.addAttribute("movement", movement);
		// return "addEmployee";

		/* if (result.hasErrors()) {
		        ...
		    }*/

		return "general/Start-your-movement";
	}

	@RequestMapping(value = "/startYourMovement", method = RequestMethod.POST)
	public String doUpdateYourMovement(
			@ModelAttribute("movement") ProjectMovement movement,
			BindingResult result,
			SessionStatus status)
			/*(Model model,@Valid ProjectType projectType)*/
	{
		// status.setComplete();
		/*Set<ConstraintViolation<ProjectType>> violations = validator.validate(employeeVO);

		for (ConstraintViolation<EmployeeVO> violation : violations)
		{
			String propertyPath = violation.getPropertyPath().toString();
			String message = violation.getMessage();
			// Add JSR-303 errors to BindingResult
			// This allows Spring to display them in view via a FieldError
			result.addError(new FieldError("employee", propertyPath, "Invalid "+ propertyPath + "(" + message + ")"));
		}*/
		/*		[Field error in object 'movement' on field 'projectType': rejected value [2];
				codes [methodInvocation.movement.projectType,methodInvocation.projectType,methodInvocation.org.tsn.tos.ProjectType,methodInvocation];
				arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [movement.projectType,projectType];
				arguments []; default message [projectType]]; default message [Property 'projectType' threw exception; nested exception is java.lang.NullPointerException]]*/
		if (result.hasErrors())
		{
			return "general/Start-your-movement";
		}
		// Store the employee information in database
		// manager.createNewRecord(employeeVO);
		fMovement.addMovement(movement);
		System.out.println(movement);

		// Mark Session Complete
		// status.setComplete();
		// return "/";
		return "general/Start-your-movement";
	}

	@ModelAttribute("projectTypes")
	public List<ProjectType> populateProjectTypes()
	{
		List<ProjectType> projectTypes = new ArrayList<ProjectType>();
		projectTypes = Arrays.asList(masterDataManager.getProjectTypes());

		return projectTypes;
	}

	@RequestMapping(value = "/explore", method = RequestMethod.GET)
	public String doExplore(ModelMap map)
	{

		return "general/Explore";
	}

	@RequestMapping(value = "/howItWorks", method = RequestMethod.GET)
	public String doHowItWorks(ModelMap map)
	{

		return "general/how-it-works";
	}

	@RequestMapping(value = "/TermAndConditions", method = RequestMethod.GET)
	public String doTermsAndConditions(ModelMap map)
	{

		return "general/Terms-Conditions";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.registerCustomEditor(ProjectType.class, new ProjectTypeEditor());
	}
}
