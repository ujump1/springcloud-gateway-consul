package springboots.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health")
public class HealthController {

	/**
	 * 健康检查服务
	 * @param name
	 * @return
	 */
	@GetMapping("/check")
	public String check(String name) {
		return "up" ;
	}
}
