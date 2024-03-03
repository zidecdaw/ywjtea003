package com.msb.business.service.convert;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.msb.business.model.dto.HorseUserDTO;
import com.msb.business.model.entity.HorseUser;
import com.msb.business.model.vo.HorseUserVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-18T13:43:28+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_333 (Oracle Corporation)"
)
@Component
public class HorseUserConvertImpl implements HorseUserConvert {

    @Override
    public HorseUserVO toVo(HorseUser horseUser) {
        if ( horseUser == null ) {
            return null;
        }

        HorseUserVO horseUserVO = new HorseUserVO();

        horseUserVO.setId( horseUser.getId() );
        horseUserVO.setName( horseUser.getName() );
        horseUserVO.setAddress( horseUser.getAddress() );
        horseUserVO.setIsDeleted( horseUser.getIsDeleted() );

        return horseUserVO;
    }

    @Override
    public List<HorseUserVO> toVo(List<HorseUser> horseUser) {
        if ( horseUser == null ) {
            return null;
        }

        List<HorseUserVO> list = new ArrayList<HorseUserVO>( horseUser.size() );
        for ( HorseUser horseUser1 : horseUser ) {
            list.add( toVo( horseUser1 ) );
        }

        return list;
    }

    @Override
    public Page<HorseUserVO> toVo(Page<HorseUser> horseUser) {
        if ( horseUser == null ) {
            return null;
        }

        Page<HorseUserVO> page = new Page<HorseUserVO>();

        page.setPages( horseUser.getPages() );
        page.setRecords( toVo( horseUser.getRecords() ) );
        page.setTotal( horseUser.getTotal() );
        page.setSize( horseUser.getSize() );
        page.setCurrent( horseUser.getCurrent() );
        page.setSearchCount( horseUser.isSearchCount() );
        page.setOptimizeCountSql( horseUser.isOptimizeCountSql() );
        List<OrderItem> list1 = horseUser.getOrders();
        if ( list1 != null ) {
            page.setOrders( new ArrayList<OrderItem>( list1 ) );
        }
        page.setCountId( horseUser.getCountId() );
        page.setMaxLimit( horseUser.getMaxLimit() );

        return page;
    }

    @Override
    public HorseUser toDo(HorseUserDTO horseUserDTO) {
        if ( horseUserDTO == null ) {
            return null;
        }

        HorseUser horseUser = new HorseUser();

        horseUser.setId( horseUserDTO.getId() );
        horseUser.setName( horseUserDTO.getName() );
        horseUser.setAddress( horseUserDTO.getAddress() );
        horseUser.setIsDeleted( horseUserDTO.getIsDeleted() );

        return horseUser;
    }
}
