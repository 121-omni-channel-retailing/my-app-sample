package my.app.sample.product;

import java.util.ArrayList;
import java.util.List;

import otocloud.framework.app.function.AppActivityImpl;
import otocloud.framework.app.function.BizRoleDescriptor;
import otocloud.framework.core.OtoCloudEventDescriptor;
import otocloud.framework.core.OtoCloudEventHandlerRegistry;

public class ProductManagementComponent extends AppActivityImpl {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "product-mgr";
	}
	
	@Override
	public String getBizObjectType() {
		// TODO Auto-generated method stub
		return "product";
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

		ProductCreationHandler initHandler = new ProductCreationHandler(this);
		ret.add(initHandler);

		ProductRemoveHandler queryHandler = new ProductRemoveHandler(this);
		ret.add(queryHandler);
		
		return ret;
	}

}
