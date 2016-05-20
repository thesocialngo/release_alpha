package org.tsn.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tsn.logic.IMasterDataManager;

@Controller
@RequestMapping("admin")
public class EditMasterTablesController extends BaseController
{
	final static Logger			logger	= Logger.getLogger(EditMasterTablesController.class);

	private IMasterDataManager	masterDataManager;

	@Autowired(required = true)
	@Qualifier(value = "masterDataManager")
	public void setMasterDataManager(IMasterDataManager masterDataManager)
	{
		this.masterDataManager = masterDataManager;
	}

	/*@RequestMapping(value = "/securityQuestions", method = RequestMethod.GET)
	public String listsecurityQuestions(Model model)
	{
		model.addAttribute("securityQuestions", masterDataManager.getRecords());
		System.out.println("test..........");
		return "jsonTemplate";
	}*/

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listMasterRecord(ModelMap map)
	{
		map.addAttribute("question", "");
		map.addAttribute("masterRecords", masterDataManager.getRecords());

		return "admin/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addMasterRecord(HttpServletRequest request)
	{

		String tableName = request.getParameter("tableName");
		String textValue = request.getParameter("textValue");

		masterDataManager.addRecord(tableName, textValue);

		return "redirect:/admin/";
	}

	@RequestMapping(value = "/delete/{tableName}/{question}", method = RequestMethod.GET)
	public String deleteMasterRecord(
			@PathVariable("tableName") String tableName,
			@PathVariable("question") Integer id)
	{
		logger.info("inside delete....tableName" + tableName + ", question :"
				+ id);
		masterDataManager.deleteRecord(tableName, id);

		return "redirect:/admin/";
	}

}
