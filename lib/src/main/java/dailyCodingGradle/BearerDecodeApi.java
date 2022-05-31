package dailyCodingGradle;

import java.util.HashMap;



public class BearerDecodeApi{

 

	public  HashMap<String, Object> BarerTokenDecode(HttpServletRequest request, HashMap<String, Object> paramMap) {

		

		String bearerToken = request.getHeader("authorization");

		String [] arrays = bearerToken.split(" ");

		for(String a: arrays)

			paramMap.put("bearerToken", a);

		return paramMap;
		
	}

}
