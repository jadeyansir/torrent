package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.enums.ApprovalStatusEnum;
import com.torrent.zuel.recruitment.enums.DeletedEnum;
import com.torrent.zuel.recruitment.mapper.CollegeInfoMapper;
import com.torrent.zuel.recruitment.model.dto.response.CollegeInfoResponseDTO;
import com.torrent.zuel.recruitment.model.entity.CollegeInfoDO;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * 学校
 *
 * @author yan
 * @date 2021/12/31
 */
@Repository
public class CollegeInfoDAO {

    @Resource
    private CollegeInfoMapper collegeInfoMapper;

    public List<CollegeInfoResponseDTO> listCollegeInfoResponseDTO() {
        DynamicQuery<CollegeInfoDO> query = DynamicQuery.createQuery(CollegeInfoDO.class)
                .and(CollegeInfoDO::getApprovalStatus, isEqual(ApprovalStatusEnum.PASSED.getValue()))
                .and(CollegeInfoDO::getDeleted, isEqual(DeletedEnum.NOT_DELETE.getValue()));
        return BeanCopyUtils.copyList(collegeInfoMapper.selectByDynamicQuery(query), CollegeInfoResponseDTO.class);
    }
}
