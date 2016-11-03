package my.app.sample.salesorder;

import java.util.ArrayList;
import java.util.List;

import otocloud.framework.app.function.AppActivityImpl;
import otocloud.framework.app.function.BizRoleDescriptor;
import otocloud.framework.core.OtoCloudEventDescriptor;
import otocloud.framework.core.OtoCloudEventHandlerRegistry;

public class SalesOrderComponent extends AppActivityImpl {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "salesorder-mgr";
	}
	
	@Override
	public String getBizObjectType() {
		// TODO Auto-generated method stub
		return "salesorder";
	}

	@Override
	public List<BizRoleDescriptor> exposeBizRolesDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OtoCloudEventDescriptor> exposeOutboundBizEventsDesc() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<OtoCloudEventHandlerRegistry> registerEventHandlers() {
		// TODO Auto-generated method stub
		List<OtoCloudEventHandlerRegistry> ret = new ArrayList<OtoCloudEventHandlerRegistry>();

		SalesOrderCreationHandler initHandler = new SalesOrderCreationHandler(this);
		ret.add(initHandler);

		SalesOrderConfirmHandler queryHandler = new SalesOrderConfirmHandler(this);
		ret.add(queryHandler);
		
		return ret;
	}

}
