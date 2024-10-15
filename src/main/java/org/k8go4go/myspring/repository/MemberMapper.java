package org.k8go4go.myspring.repository;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MemberMapper {
    public List<MemberVO> getMembers() ;

    @Select("SELECT * FROM EMP WHERE EMAIL = #{email}")
    public MemberVO getMember(String email);
}
