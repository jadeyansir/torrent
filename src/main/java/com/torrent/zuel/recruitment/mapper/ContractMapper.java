package com.torrent.zuel.recruitment.mapper;

import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import com.torrent.zuel.recruitment.model.entity.ContractDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 签约进度
 *
 * @author yan
 * @date 2021/12/8
 */
@Mapper
public interface ContractMapper extends DynamicQueryMapper<ContractDO> {
}
