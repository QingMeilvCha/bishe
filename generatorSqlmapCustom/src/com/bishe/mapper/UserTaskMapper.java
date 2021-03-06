package com.bishe.mapper;

import com.gkshare.pojo.UserTask;
import com.gkshare.pojo.UserTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTaskMapper {
    int countByExample(UserTaskExample example);

    int deleteByExample(UserTaskExample example);

    int deleteByPrimaryKey(Integer userTaskId);

    int insert(UserTask record);

    int insertSelective(UserTask record);

    List<UserTask> selectByExample(UserTaskExample example);

    UserTask selectByPrimaryKey(Integer userTaskId);

    int updateByExampleSelective(@Param("record") UserTask record, @Param("example") UserTaskExample example);

    int updateByExample(@Param("record") UserTask record, @Param("example") UserTaskExample example);

    int updateByPrimaryKeySelective(UserTask record);

    int updateByPrimaryKey(UserTask record);
}