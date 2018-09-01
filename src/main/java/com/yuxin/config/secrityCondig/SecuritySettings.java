package com.yuxin.config.secrityCondig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 用于存放权限路径的类
 */
@ConfigurationProperties(prefix = "securityconfig")
@Component
public class SecuritySettings {

    private String logoutsuccessurl = "/logout";

    private String permitall = "/api";

    private String deniedpage = "/deny";

    private String urlroles;

    public String getLogoutsuccessurl() {
        return logoutsuccessurl;
    }

    public void setLogoutsuccessurl(String logoutsuccessurl) {
        this.logoutsuccessurl = logoutsuccessurl;
    }

    public String getPermitall() {
        return permitall;
    }

    public void setPermitall(String permitall) {
        this.permitall = permitall;
    }

    public String getDeniedpage() {
        return deniedpage;
    }

    public void setDeniedpage(String deniedpage) {
        this.deniedpage = deniedpage;
    }

    public String getUrlroles() {
        return urlroles;
    }

    public void setUrlroles(String urlroles) {
        this.urlroles = urlroles;
    }
}
