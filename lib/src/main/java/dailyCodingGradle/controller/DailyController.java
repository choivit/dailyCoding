package dailyCodingGradle.controller;

import java.util.HashMap;

import com.google.j2objc.annotations.AutoreleasePool;

import dailyCodingGradle.BearerDecodeApi;
import dailyCodingGradle.service.LoginService;

@Controller
public class DailyController {

	@Autowired
	private BearerDecodeApi bearerDecodeApi;
	
	@PostMapping(value = "/login")
	public String LoginInfo(HttpServletRequest request, @RequestBody HashMap<String, Object> paramMap) {
		paramMap.put("token", bearerDecodeApi(request));
		
		LoginService.LoginInfo(request, paramMap);
	}
	
}
