package org.k8go4go.myspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/")
public class MemberController {
/*
    기능          Method    URI               JSP                     Redirect
    -------------------------------------------------------------------------
    홈             GET      /                     home.jsp               -
    회원가입폼       GET     /member/signup       member/signup.jsp        -
    회원가입처리     POST     /member/signup                               /
    로그인폼        GET      /member/login        member/login.jsp
    로그인처리       POST    /member/login        member/loginPro.jsp
    마이페이지       GET     /member/mypage       member/mypage.jsp
    정보수정폼       GET     /member/modify       member/modify.jsp
    정보수정처리     POST    /member/modify                              /member/mypage
    회원삭제폼       GET     /member/delete       member/delete.jsp
    회원삭제처리      POST   /member/delete       member/deletePro.jsp
*/
    @GetMapping("signup")
    public String signup() {
        System.out.println("회원가입 폼 요청");
        return "member/signup";
    }

    @GetMapping("login")
    public String login() {
        System.out.println("로그인 폼");
        return "member/login";
    }
}
