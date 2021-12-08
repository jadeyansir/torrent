package com.torrent.zuel.recruitment.mapper.mybatis;

import com.torrent.zuel.recruitment.model.entity.DeliverDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 进度
 *
 * @author yan
 * @date 2021/12/7
 */
@Mapper
public interface DeliverViewMapper {

    List<DeliverDO> listDeliver(@Param("stuUniCode") Long stuUniCode, @Param("deliverStatus") Integer deliverStatus);

}
