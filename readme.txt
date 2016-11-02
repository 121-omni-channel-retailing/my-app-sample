目的：在eclipse中直接运行和调试APP

APP的配置文件为src/main/config/my-app-sample.json

1、启动mongodb，建库MyTest
2、在eclipse中DeBug运行my.app.sample.App
3、发送如下http post:
URL： http://localhost:8084/my-app-sample/product-mgr/create?context=3||123445|
POST数据:任意json
	{"name":"Jack"}
4、检查mongodb库MyTest是否写入成功