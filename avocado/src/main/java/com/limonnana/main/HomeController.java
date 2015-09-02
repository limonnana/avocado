package com.limonnana.main;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private RestTemplate restTemplate = new RestTemplate();
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
  /*
  * 
  * Sends a new record to the REST provider
  * based on the information submitted from the JSP add page.
  
 @RequestMapping(value = "/add", method = RequestMethod.POST)
 public String addPerson(@ModelAttribute("personAttribute") Person person,
       Model model) {
  logger.debug("Add new person");
   
  // Prepare acceptable media type
  List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
  acceptableMediaTypes.add(MediaType.APPLICATION_XML);
   
  // Prepare header
  HttpHeaders headers = new HttpHeaders();
  headers.setAccept(acceptableMediaTypes);
  // Pass the new person and header
  HttpEntity<Person> entity = new HttpEntity<Person>(person, headers);
 
  // Send the request as POST
  try {
   ResponseEntity<Person> result = restTemplate.exchange("http://localhost:8080/spring-rest-provider/krams/person", HttpMethod.POST, entity, Person.class);
  } catch (Exception e) {
   logger.error(e);
  }
   
  // This will resolve to /WEB-INF/jsp/resultpage.jsp
  return "resultpage";
 }
 
 * 
 */
	
	
	
	
	@RequestMapping(value = "/web", method = RequestMethod.GET)
	public String web( Model model) {
		
		
		model.addAttribute("serverTime", "hola" );
		
		return "web";
	}
	
	
}
