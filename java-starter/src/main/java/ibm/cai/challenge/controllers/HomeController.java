package ibm.cai.challenge.controllers;

import java.util.*;

import ibm.cai.challenge.*;
import org.springframework.ui.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	private String message = "Hello";
	List<Registration> list = new ArrayList<Registration>();
	Integer i = 0;

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", this.message);
		return "home";
	}

    @GetMapping("/registration")
    public String registration(Model model) {
	    model.addAttribute("registration", new Registration());
        return "registration";
    }

    @PostMapping("/registration")
    public String formSubmit(@ModelAttribute Registration registration) {
	    String fiid = UUID.randomUUID().toString();
	    registration.setFiid(fiid);

        i = new Integer(i.intValue() + 1);
        list.add(registration);
        return "submitted";
    }

    @RequestMapping("/table")
    public String printList() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
	    for(int j = 0; j < i.intValue(); j++) {
	        System.out.println("Name: " + list.get(j).getFirst() + " " + list.get(j).getLast());
	        System.out.println("Address: " + list.get(j).getAddress());
	        System.out.println("Drone ID: " + list.get(j).getId());
	        System.out.println("FAA ID: " + list.get(j).getFiid());
	        System.out.println("-------------------------------------------------------------------------------------------------------");
        }

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------");

        return "table";
    }
}
