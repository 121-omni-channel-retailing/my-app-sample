目的：在eclipse中直接运行和调试APP

一、配置、运行
APP的配置文件为src/main/config/my-app-sample.json
1、执行mysql数据库脚本dbscripts/1103-data.sql,目的是模拟一个账户进行app订购
2、因为srv-framework(otocloud-framework)代码有修改，需要刷新
3、启动mongodb，建库app对应的业务库MyTest
4、在eclipse中DeBug运行my.app.sample.App

二、商品管理场景测试
1、创建商品
POST:： http://localhost:8084/my-app-sample/product-mgr/create?context=3|3|lj|aaa
	{"name":"Jack"}
2、检查mongodb库MyTest是否写入成功

三、订单场景测试
1、订单创建
POST: http://localhost:8084/my-app-sample/salesorder-mgr/create?context=3|3|lj|aaa
	{
		"bo_id":"BO00001",
		"customer":"CUS001"
	}
2、审批订单
PUT: http://localhost:8084/my-app-sample/salesorder-mgr/confirm?context=3|3|lj|aaa&bo_id=BO00001

3、检查mongodb库MyTest中的订单数据写入情况