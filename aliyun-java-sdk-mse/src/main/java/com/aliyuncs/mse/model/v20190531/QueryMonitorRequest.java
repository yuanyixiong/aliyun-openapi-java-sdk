/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryMonitorRequest extends RpcAcsRequest<QueryMonitorResponse> {
	
	public QueryMonitorRequest() {
		super("mse", "2019-05-31", "QueryMonitor", "mse");
	}

	private String monitorType;

	private String requestPars;

	private String endTime;

	private String step;

	private String clusterId;

	private String startTime;

	public String getMonitorType() {
		return this.monitorType;
	}

	public void setMonitorType(String monitorType) {
		this.monitorType = monitorType;
		if(monitorType != null){
			putQueryParameter("MonitorType", monitorType);
		}
	}

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putBodyParameter("RequestPars", requestPars);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStep() {
		return this.step;
	}

	public void setStep(String step) {
		this.step = step;
		if(step != null){
			putQueryParameter("Step", step);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	@Override
	public Class<QueryMonitorResponse> getResponseClass() {
		return QueryMonitorResponse.class;
	}

}