package com.shop.purchase.common;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * 自定义Realm进行登录和角色权限的验证
 */
public class MyRealm extends AuthorizingRealm {
    // 当前用户角色权限验证
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String name = principals.getPrimaryPrincipal().toString();// 获取到Subject里面token的用户名
        SimpleAuthorizationInfo sm = new SimpleAuthorizationInfo();

        Set<String> roleSet = new HashSet<>();
        roleSet.add("rolea");
        roleSet.add("roleb");
        roleSet.add("roleb");
        sm.setRoles(roleSet);//加入角色

        ///////////////////
        Set<String> permSet = new HashSet<>();
        permSet.add("a");
        permSet.add("b");
        if("root".equals(name)) {
            permSet.add("c");
        }
        sm.setStringPermissions(permSet);//加入权限
        System.out.println(name + "========角色权限验证");
        return sm;
    }
    // 当前登陆用户验证(在调用Subject的login的时候调用)
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String name = token.getPrincipal().toString();// 获取用户名
        String pwd = new String((char[]) token.getCredentials());// 密码
        // 这里调用dao层，判断用户名密码是否存在
        System.out.println("登陆验证。。。。。。。。");
        if (("root".equals(name) || "admin".equals(name) || "a".equals(name)) && "12".equals(pwd)) {
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(name,
                    pwd, "realName");
            return info;
        }

        return null;
    }
}
