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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitReturnGoodLogisticsRequest extends RpcAcsRequest<SubmitReturnGoodLogisticsResponse> {
	
	public SubmitReturnGoodLogisticsRequest() {
		super("linkedmall", "2018-01-16", "SubmitReturnGoodLogistics", "linkedmall");
		setMethod(MethodType.POST);
	}

	private String cpCode;

	private String subLmOrderId;

	private String bizUid;

	private Long disputeId;

	private String bizId;

	private String logisticsNo;

	public String getCpCode() {
		return this.cpCode;
	}

	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
		if(cpCode != null){
			putQueryParameter("CpCode", cpCode);
		}
	}

	public String getSubLmOrderId() {
		return this.subLmOrderId;
	}

	public void setSubLmOrderId(String subLmOrderId) {
		this.subLmOrderId = subLmOrderId;
		if(subLmOrderId != null){
			putQueryParameter("SubLmOrderId", subLmOrderId);
		}
	}

	public String getBizUid() {
		return this.bizUid;
	}

	public void setBizUid(String bizUid) {
		this.bizUid = bizUid;
		if(bizUid != null){
			putQueryParameter("BizUid", bizUid);
		}
	}

	public Long getDisputeId() {
		return this.disputeId;
	}

	public void setDisputeId(Long disputeId) {
		this.disputeId = disputeId;
		if(disputeId != null){
			putQueryParameter("DisputeId", disputeId.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
		if(logisticsNo != null){
			putQueryParameter("LogisticsNo", logisticsNo);
		}
	}

	@Override
	public Class<SubmitReturnGoodLogisticsResponse> getResponseClass() {
		return SubmitReturnGoodLogisticsResponse.class;
	}

}