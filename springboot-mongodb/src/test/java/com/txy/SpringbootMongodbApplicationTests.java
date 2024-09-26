package com.txy;

import com.txy.domian.TaskLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@SpringBootTest
class SpringbootMongodbApplicationTests {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private PaySelector paySelector;
	@Test
	void contextLoads() {
		/*==================查询=================*/
		//根据主键查询
		//TaskLog byId = mongoTemplate.findById("667245bf8591a0209f7fe3f2", TaskLog.class);
		//System.out.println(byId);

		//查询所有
		//List<TaskLog> all = mongoTemplate.findAll(TaskLog.class);

		//条件查询
		Query query = new Query();
		Criteria criteria = new Criteria();
		criteria.and("bizId").is("506780099450765350");
		//query.addCriteria(Criteria.where("taskId").is(46));
		query.addCriteria(criteria);
		List<TaskLog> taskLogs = mongoTemplate.find(query, TaskLog.class);
		System.out.println(taskLogs);
	}

	@Test
	void test() {
		Pay select = paySelector.select("onePay");
		select.PayByType();

		Pay select2 = paySelector.select("twoPay");
		select2.PayByType();

		Pay select3 = paySelector.select("sanPay");
		select3.PayByType();
	}

}
