package com.example.simpleBoard.controller;

import com.example.simpleBoard.domain.Member;
import com.example.simpleBoard.dto.ResponseDTO;
import com.example.simpleBoard.service.MemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("member")
public class MemberController {
    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    @ApiOperation(value = "회원 등록")
    @PostMapping("join")
    public ResponseDTO join(Member member) {
        return memberService.join(member);
    }

    @ApiOperation(value = "로그인")
    @PostMapping(value = "login")
    public ResponseDTO login(String loginId, String password) {
        return memberService.login(loginId, password);
    }

    @ApiOperation(value = "회원 정보 수정")
    @PostMapping("modify")
    public ResponseDTO modify(Member member) {
        return memberService.modify(member);
    }

    @ApiOperation(value = "회원 삭제")
    @PostMapping("quit")
    public ResponseDTO quit(Long id) {
        return memberService.quit(id);
    }
}