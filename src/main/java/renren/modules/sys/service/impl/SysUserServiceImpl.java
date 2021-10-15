package renren.modules.sys.service.impl;///**
// * Copyright (c) 2016-2019 人人开源 All rights reserved.
// *
// * https://www.renren.io
// *
// * 版权所有，侵权必究！
// */
//
//package io.renren.modules.sys.service.impl;
//
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import io.renren.common.utils.PageUtils;
//import io.renren.modules.sys.dao.SysUserDao;
//import io.renren.modules.sys.entity.SysUserEntity;
//import io.renren.modules.sys.service.SysUserService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Map;
//
//
///**
// * 系统用户
// *
// * @author Mark sunlightcs@gmail.com
// */
//@Service("sysUserService")
//public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {
//
//	@Override
//	public PageUtils queryPage(Map<String, Object> params) {
//		return null;
//	}
//
//	@Override
//	public List<String> queryAllPerms(Long userId) {
//		return null;
//	}
//
//	@Override
//	public List<Long> queryAllMenuId(Long userId) {
//		return null;
//	}
//
//	@Override
//	public SysUserEntity queryByUserName(String username) {
//		return null;
//	}
//
//	@Override
//	public void saveUser(SysUserEntity user) {
//
//	}
//
//	@Override
//	public void update(SysUserEntity user) {
//
//	}
//
//	@Override
//	public void deleteBatch(Long[] userIds) {
//
//	}
//
//	@Override
//	public boolean updatePassword(Long userId, String password, String newPassword) {
//		return false;
//	}
//}