package com.example.simpleBoard.service;

import com.example.simpleBoard.domain.Member;
import com.example.simpleBoard.dto.ResponseDTO;
import com.example.simpleBoard.enums.ResponseCode;
import com.example.simpleBoard.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    @Autowired
    void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public ResponseDTO join(Member member) {
        try {
            if (memberRepository.findByLoginID(member.getLoginId()) != null) {
                throw new Exception("join fail - id duplicated");
            } else if (memberRepository.findByName(member.getName()) != null) {
                throw new Exception("join fail - duplicated");
            }
            return new ResponseDTO(ResponseCode.SUCCESS, "join success", memberRepository.save(member));
        } catch (Exception exception) {
            return new ResponseDTO(ResponseCode.FAIL, exception.getMessage(), null);
        }
    }


    public ResponseDTO login(String loginId, String password) {
        try {
            Member member = memberRepository.findByLoginID(loginId);
            if (member == null) {
                throw new Exception("login fail - not joined id");
            } else if (!member.getPassword().equals(password)) {
                throw new Exception("login fail - password incorrect");
            }
            return new ResponseDTO(ResponseCode.SUCCESS, "login success", member);
        } catch (Exception exception) {
            return new ResponseDTO(ResponseCode.FAIL, exception.getMessage(), null);
        }
    }

    public ResponseDTO modify(Member member) {
        try {
            Member target = memberRepository.findById(member.getId());
            if (target == null) {
                throw new Exception("modify fail - not exist member");
            }
            return new ResponseDTO(ResponseCode.SUCCESS, "login success", memberRepository.update(member));
        } catch (Exception exception) {
            return new ResponseDTO(ResponseCode.FAIL, exception.getMessage(), null);
        }
    }

    public ResponseDTO quit(Long id) {
        try {
            Member member = memberRepository.findById(id);
            if (member == null) {
                throw new Exception("quit fail - not exist member");
            }
            return new ResponseDTO(ResponseCode.SUCCESS, "quit success", memberRepository.delete(member));
        } catch (Exception exception) {
            return new ResponseDTO(ResponseCode.FAIL, exception.getMessage(), null);
        }
    }
}
