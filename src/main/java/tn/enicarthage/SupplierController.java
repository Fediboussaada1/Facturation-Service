package tn.enicarthage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SupplierController {
	
	@Autowired
	SupplierRepository supR;
	
	@RequestMapping(value = {"/saveSupplier"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String insertSupplier(@ModelAttribute("f") Supplier f, Model model)
	{
		supR.save(f);
		System.out.println(supR.findAll());
		return"redirect:http://localhost:8888/SUPPLIER-SERVICE/SupplierAdd.html";
	}
	
	@RequestMapping(value = "/getSuppliers", method = RequestMethod.GET)
    public ModelAndView getSuppliers() {
		System.out.println("\n \n here \n \n");
		System.out.println(supR.findAll());
        ModelAndView mv= new ModelAndView("suppTab.html"); 
        mv.addObject("suppliers",supR.findAll());
        return mv;
    }
	
	@RequestMapping(value = {"/deleteSupp"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String deleteBill(@ModelAttribute("b") Supplier c, Model model)
	{
		System.out.println("Delete supp");
		supR.delete(c);
		return"redirect:http://localhost:8888/SUPPLIER-SERVICE/getSuppliers";
	}
	

}
