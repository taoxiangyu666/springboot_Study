package com.txy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.txy.config.DataSourceContextHolder;
import com.txy.domain.DataLedgerInfo;
import com.txy.domain.SrdgDataMetaInfo;
import com.txy.mapper.DataLedgerInfoMapper;
import com.txy.service.DataLedgerInfoService;
import com.txy.service.SrdgDataMetaInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMybatisPlusApplicationTests {

	@Autowired
	DataLedgerInfoService dataLedgerInfoService;
	@Autowired
    SrdgDataMetaInfoService srdgDataMetaInfoService;
	@Autowired
	DataLedgerInfoMapper mapper;

	@Test
	void contextLoads() {
		//根据id 查询
		DataLedgerInfo byId = dataLedgerInfoService.getById(1002);
        DataSourceContextHolder.setDataSourceType("slave");
        SrdgDataMetaInfo byId1 = srdgDataMetaInfoService.getById(1);
        //

		System.out.println(byId);
	}


	/**
	 * 模糊查询
	 */
	@Test
	void testLike() {
		String name = "LEDGER_NAME";
		QueryWrapper queryWrapper = new QueryWrapper();
		//模糊查询 like %name%
		queryWrapper.like(name,"科技");
		//模糊查询 like %name
		queryWrapper.likeLeft(name,"科技");
		//模糊查询 like name%
		queryWrapper.likeRight(name,"科技");

		// not like %name%
		queryWrapper.notLike(name,"科技");
		//not like %name
		queryWrapper.notLikeLeft(name,"科技");
		//not like name%
		queryWrapper.notLikeRight(name,"科技");
		List list = mapper.selectList(queryWrapper);
		System.out.println(list);

	}


	/**
	 * 排序
	 */
	@Test
	void testOrderBy() {
		String name = "LEDGER_NAME";
		QueryWrapper queryWrapper = new QueryWrapper();
		//正序
		queryWrapper.orderByAsc(name);
		//倒序
		queryWrapper.orderByDesc(name);
		List list = mapper.selectList(queryWrapper);
		System.out.println(list);

		//查询该接口信息是否有加密或者脱敏
	/*	List<SrdgDataColumnInfo> columnInfos = srdgDataColumnInfoService.lambdaQuery()
				.eq(SrdgDataColumnInfo::getMetaId, srdgDataMetaInfo.getId())
				.isNotNull(SrdgDataColumnInfo::getEncryptionType)
				.or().isNotNull(SrdgDataColumnInfo::getDesensType)
				.list();*/


		/*SELECT *
				FROM srdg_data_column_info
		WHERE meta_id =#{meteId}
		and  (encryption_type IS NOT NULL or desens_type IS NOT NULL);*/
	}



}
