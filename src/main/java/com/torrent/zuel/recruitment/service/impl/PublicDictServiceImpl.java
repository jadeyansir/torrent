package com.torrent.zuel.recruitment.service.impl;

import com.torrent.zuel.recruitment.dao.PublicDictDAO;
import com.torrent.zuel.recruitment.model.dto.request.PublicDictRequestDTO;
import com.torrent.zuel.recruitment.model.entity.PublicDictDO;
import com.torrent.zuel.recruitment.service.PublicDictService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * PublicDictService
 *
 * @author yan
 * @date 2021/12/12
 */
@Service
public class PublicDictServiceImpl implements PublicDictService {
    @Resource
    private PublicDictDAO publicDictDAO;

    @Override
    public Integer addPublicDict(List<PublicDictRequestDTO> publicDictRequestDTOList) {
        if (CollectionUtils.isEmpty(publicDictRequestDTOList)) {
            return 0;
        }
        List<PublicDictDO> publicDictDOList = BeanCopyUtils.copyList(publicDictRequestDTOList, PublicDictDO.class);
        return publicDictDAO.addPublicDict(publicDictDOList);
    }
}
