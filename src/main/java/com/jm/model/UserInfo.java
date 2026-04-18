package com.jm.model;

import com.jm.mock.MockModel;
import java.util.List;

public class UserInfo extends MockModel{
    private String userId;
    private String password;
    private String[] roles;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String[] getRoles() {
        return roles;
    }
    
    public static List<UserInfo> sample(){
        UserInfo user=new UserInfo();
        String[] names=new String[] {"userId","password","roles"};
        List<MockModel> list=user.loadUserInfo("userinfo.txt", names);
        List<UserInfo>  result=(List<UserInfo>)(Object) list;
        return result;
    }
}
