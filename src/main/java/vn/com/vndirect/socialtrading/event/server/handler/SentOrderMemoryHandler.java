package vn.com.vndirect.socialtrading.event.server.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.com.vndirect.socialtrading.event.EventHandler;
import vn.com.vndirect.socialtrading.event.EventHandlerApplyFor;
import vn.com.vndirect.socialtrading.model.SendOrder;
import vn.com.vndirect.socialtrading.utility.InMemory;
 
@Component
@EventHandlerApplyFor(priority = 3, values = { "SENT" })
public class SentOrderMemoryHandler implements EventHandler {

	private InMemory memory;

	@Autowired
	public SentOrderMemoryHandler(InMemory memory) {
		this.memory = memory;
	}

	@Override
	public void handle(Object source) {
		SendOrder sentOrder = (SendOrder) source;
		String account = sentOrder.getByAccount();
		System.out.println("account:"+account+" "+ sentOrder.toString());
		
	}

}
