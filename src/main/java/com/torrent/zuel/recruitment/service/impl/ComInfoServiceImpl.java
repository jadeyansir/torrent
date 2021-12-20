package com.torrent.zuel.recruitment.service.impl;

import com.google.common.collect.Lists;
import com.torrent.zuel.recruitment.dao.ComInfoDAO;
import com.torrent.zuel.recruitment.model.dto.response.ComInfoResponseDTO;
import com.torrent.zuel.recruitment.model.entity.ComInfoDO;
import com.torrent.zuel.recruitment.service.ComInfoService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公司信息
 *
 * @author yan
 * @date 2021/12/17
 */
@Service
public class ComInfoServiceImpl implements ComInfoService {

    @Resource
    private ComInfoDAO comInfoDAO;

    @Override
    public List<ComInfoResponseDTO> listComInfoByComChiName(String ComChiName) {
        if (StringUtils.isBlank(ComChiName)) {
            return Lists.newArrayList();
        }
        List<ComInfoDO> comInfoDOList = comInfoDAO.listComInfoByComChiName(ComChiName);
        return BeanCopyUtils.copyList(comInfoDOList, ComInfoResponseDTO.class);
    }
}
