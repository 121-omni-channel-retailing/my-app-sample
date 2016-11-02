package my.app.sample;

import java.util.List;

import otocloud.framework.app.engine.AppService;
import otocloud.framework.app.engine.AppServiceEngineImpl;
import otocloud.framework.app.engine.WebServer;
import otocloud.framework.core.OtoCloudComponent;


/**
 * TODO: DOCUMENT ME!
 * @date 2015年11月6日
 * @author lijing@yonyou.com
 */
public class App extends AppServiceEngineImpl
{

	//创建此APP中租户的应用服务实例时调用
	@Override
	public AppService newAppInstance() {
		return new ProductManagementService();
	}

	//创建此APP统一的web入口服务
	@Override
	public WebServer createWebServer() {
		return new MyWebServer();
	}

	//创建APP全局组件
	@Override
	public List<OtoCloudComponent> createServiceComponents() {
		return null;
	}
	
	
    public static void main( String[] args )
    {
    	App app = new App();

    	AppServiceEngineImpl.internalMain("log4j2.xml",
    										"my-app-sample.json", 
    										app);
    	
    }   

}
