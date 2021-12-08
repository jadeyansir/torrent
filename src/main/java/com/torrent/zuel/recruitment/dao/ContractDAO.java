package com.torrent.zuel.recruitment.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.mapper.ContractMapper;
import com.torrent.zuel.recruitment.model.entity.ContractDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * 签约进度
 *
 * @author yan
 * @date 2021/12/8
 */
@Repository
public class ContractDAO {
    @Resource
    private ContractMapper contractMapper;

    public PageInfo<ContractDO> listContract(Long stuUniCode, Integer contractStatus, int pageNum, int pageSize) {
        DynamicQuery<ContractDO> query = DynamicQuery.createQuery(ContractDO.class)
                .and(ContractDO::getStuUniCode, isEqual(stuUniCode))
                .and(ContractDO::getContractStatus, isEqual(contractStatus));
        return PageHelper.startPage(pageNum, pageSize)
                .doSelectPageInfo(() -> contractMapper.selectByDynamicQuery(query));
    }

}
