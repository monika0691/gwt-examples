package com.gonevertical.client.app.requestfactory;

import com.gonevertical.client.app.requestfactory.dto.TodoDataProxy;
import com.gonevertical.server.data.TodoData;
import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(TodoData.class)
public interface TodoDataRequest extends RequestContext {

  InstanceRequest<TodoDataProxy, Boolean> remove();
  
}