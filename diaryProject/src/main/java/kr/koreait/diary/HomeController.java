package kr.koreait.diary;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "joinForm";
	}
	
	
	@RequestMapping(value="/test")
	public String test(HttpServletRequest request, Model model) {
		 
		return "joinForm";
}	
	
	@RequestMapping(value="/sendCode")
	public String sendCode(HttpServletRequest request, Model model) {
		  
		  String api_key = "NCSPDUHGAWCUUPXC";
		    String api_secret = "KLXUWMMFVE0Y1OYGXVFLAPK4BY0KDH75";
		    Message coolsms = new Message(api_key, api_secret);

		    // 4 params(to, from, type, text) are mandatory. must be filled
		    HashMap<String, String> params = new HashMap<String, String>();
		    String number = request.getParameter("number");
		    System.out.println(number);
		    params.put("to", number);
		    params.put("from", "01047598517");
		    params.put("type", "SMS");
		    params.put("text", "LEECHANHO SMS API TEST �ڹٿ��� �߼۵� ���ڸ޼��� ������ȣ�� 11547 �Դϴ� ����ؿ�");
		    params.put("app_version", "test app 1.2"); // application name and version

		    try {
		      JSONObject obj = (JSONObject) coolsms.send(params);
		      System.out.println(obj.toString());
		    } catch (CoolsmsException e) {
		      System.out.println(e.getMessage());
		      System.out.println(e.getCode());
		    }
		return "joinForm";
}
}
