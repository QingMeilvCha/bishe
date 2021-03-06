package com.bishe.mapper;

import com.gkshare.pojo.TaskData;
import com.gkshare.pojo.TaskDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskDataMapper {
    int countByExample(TaskDataExample example);

    int deleteByExample(TaskDataExample example);

    int deleteByPrimaryKey(Integer taskDataId);

    int insert(TaskData record);

    int insertSelective(TaskData record);

    List<TaskData> selectByExampleWithBLOBs(TaskDataExample example);

    List<TaskData> selectByExample(TaskDataExample example);

    TaskData selectByPrimaryKey(Integer taskDataId);

    int updateByExampleSelective(@Param("record") TaskData record, @Param("example") TaskDataExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskData record, @Param("example") TaskDataExample example);

    int updateByExample(@Param("record") TaskData record, @Param("example") TaskDataExample example);

    int updateByPrimaryKeySelective(TaskData record);

    int updateByPrimaryKeyWithBLOBs(TaskData record);

    int updateByPrimaryKey(TaskData record);
}