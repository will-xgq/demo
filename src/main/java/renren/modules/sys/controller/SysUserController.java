/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package renren.modules.sys.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 系统用户
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/test")
public class SysUserController {
//	@Autowired
//	private SysUserService sysUserService;

	/**
	 * 所有用户列表
	 */
	@GetMapping("/hello")
	public String list(@RequestParam Map<String, Object> params){
		//只有超级管理员，才能查看所有管理员列表
		System.out.println("进入接口 开始执行操作 --------    hello world");
		return "Hello World";
	}
	

}
