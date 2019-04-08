package com.parvika.controllers;

import com.parvika.model.Member;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController
{
    @RequestMapping("/team")
    public List<Member> getMembers()
    {
        return Arrays.asList(
                new Member(1, "Parvika", "Singhal"),
                new Member(2, "Aman", "Singh"),
                new Member(2, "ABC", "XYZ")
        );
    }
}