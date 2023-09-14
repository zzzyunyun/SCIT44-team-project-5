package com.scit.lms.dao;

import com.scit.lms.domain.Question;
import com.scit.lms.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TestDAO {

    // 테스트 목록 조회
    ArrayList<Test> testList();

    // 테스트 등록
    int submitTest(Test test);

    // 테스트 정보 조회
    Test selectTest(int testid);
}
