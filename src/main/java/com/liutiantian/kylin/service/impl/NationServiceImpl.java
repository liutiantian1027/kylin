package com.liutiantian.kylin.service.impl;

import com.liutiantian.kylin.entity.Nation;
import com.liutiantian.kylin.entity.NationVo;
import com.liutiantian.kylin.mapper.NationMapper;
import com.liutiantian.kylin.service.INationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务实现类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {
    @Autowired
    private NationMapper nationMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public List<NationVo> findAll() {
//        ListOperations forList = redisTemplate.opsForList();
//        List nation = forList.range("adres_list", 0, -1);
//
//        if(nation.size()!=0 && nation!=null){
//            System.out.println("redis查询");
//            return nation;
//        }else{
//            System.out.println("Mysql中查询");
//            List<NationVo> nationVoAll = nationMapper.findAll();
//            redisTemplate.opsForList().leftPushAll("adres_list",nationVoAll.toArray());
//        }
        return nationMapper.findAll();
    }
}
