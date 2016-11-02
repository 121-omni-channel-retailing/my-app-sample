package my.app.sample;

import java.util.ArrayList;
import java.util.List;

import my.app.sample.catelog.CatelogManagementComponent;
import my.app.sample.product.ProductManagementComponent;
import otocloud.framework.app.engine.AppServiceImpl;
import otocloud.framework.app.engine.WebServer;
import otocloud.framework.app.function.AppActivity;
import otocloud.framework.app.function.AppInitActivityImpl;

/**
 * TODO: DOCUMENT ME!
 * @date 2015年11月6日
 * @author lijing@yonyou.com
 */
public class ProductManagementService extends AppServiceImpl
{

	//创建服务初始化组件
	@Override
	public AppInitActivityImpl createAppInitActivity() {		
		return null;
	}

	//创建租户级web server
	@Override
	public WebServer createWebServer() {
		// TODO Auto-generated method stub
		return null;
	}

	//创建服务内的业务活动组件
	@Override
	public List<AppActivity> createBizActivities() {
		List<AppActivity> retActivities = new ArrayList<>();
		
		CatelogManagementComponent catelogCom = new CatelogManagementComponent();
		retActivities.add(catelogCom);
				
		ProductManagementComponent productCom = new ProductManagementComponent();
		retActivities.add(productCom);

		return retActivities;
	}
}
