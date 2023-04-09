package foorun.unieat.api.auth.oauth;

import foorun.unieat.common.auth.UniEatDefaultOAuth2UserInfo;
import foorun.unieat.common.rules.AgeGroupType;
import foorun.unieat.common.rules.GenderType;

import java.util.Date;
import java.util.Map;

public class UniEatNaverOAuth2UserInfo implements UniEatDefaultOAuth2UserInfo {
    private final Map<String, Object> attributes;

    public UniEatNaverOAuth2UserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getProvider() {
        return "naver_";
    }

    @Override
    public String getUsername() {
        return (String) attributes.get("id");
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public GenderType getGender() {
        return null;
    }

    @Override
    public AgeGroupType getAgeRange() {
        return null;
    }

    @Override
    public Date getBirthDay() {
        return null;
    }
}