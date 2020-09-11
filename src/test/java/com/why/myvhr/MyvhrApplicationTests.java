package com.why.myvhr;

import com.why.myvhr.beans.SysResources;
import com.why.myvhr.beans.SysRole;
import com.why.myvhr.beans.SysUser;
import com.why.myvhr.mapper.SysRoleMapper;
import com.why.myvhr.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = MyvhrApplication.class)
class MyvhrApplicationTests {

	@Autowired
	private SysRoleMapper roleMapper;
	@Autowired
	private SysUserMapper userMapper;

	@Test
	public void testRole() {

		SysRole sysRole = roleMapper.get(1);
		System.out.println("角色的名称"+sysRole.getRolename());

		List<SysResources> resources = sysRole.getResources();
		for(SysResources res : resources){
			System.out.println("资源的名称"+res.getName()+"....资源的许可"+res.getPermission());
		}
	}
	@Test
	public void testUser(){

		SysUser user=new SysUser();
		user.setUsername("root");
		user.setPassword("root");
		SysUser sysUser = userMapper.get(user);
		System.out.println("用户信息"+sysUser);

		List<SysRole> roles = sysUser.getRoles();
		for(SysRole role : roles){
			System.out.println("用户的角色信息"+role);
		}
	}

}
