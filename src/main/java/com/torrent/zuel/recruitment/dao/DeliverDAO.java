package com.torrent.zuel.recruitment.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.mapper.mybatis.DeliverViewMapper;
import com.torrent.zuel.recruitment.model.entity.DeliverDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 进度
 *
 * @author yan
 * @date 2021/12/7
 */
@Repository
public class DeliverDAO {
    @Resource
    private DeliverViewMapper deliverViewMapper;

    public PageInfo<DeliverDO> listDeliver(Long stuUniCode, Integer deliverStatus, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DeliverDO> deliverDOList = deliverViewMapper.listDeliver(stuUniCode, deliverStatus);
        return new PageInfo<>(deliverDOList);
    }

    public DeliverDO getDeliverDOById(Long id) {
        return deliverViewMapper.getDeliverDOById(id);
    }

}
