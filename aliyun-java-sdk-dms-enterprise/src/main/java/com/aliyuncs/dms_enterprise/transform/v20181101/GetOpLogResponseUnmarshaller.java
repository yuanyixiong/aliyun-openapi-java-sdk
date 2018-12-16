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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetOpLogResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetOpLogResponse.OpLogDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOpLogResponseUnmarshaller {

	public static GetOpLogResponse unmarshall(GetOpLogResponse getOpLogResponse, UnmarshallerContext context) {
		
		getOpLogResponse.setRequestId(context.stringValue("GetOpLogResponse.RequestId"));
		getOpLogResponse.setSuccess(context.booleanValue("GetOpLogResponse.Success"));
		getOpLogResponse.setErrorMessage(context.stringValue("GetOpLogResponse.ErrorMessage"));
		getOpLogResponse.setErrorCode(context.stringValue("GetOpLogResponse.ErrorCode"));
		getOpLogResponse.setTotalCount(context.longValue("GetOpLogResponse.TotalCount"));

		List<OpLogDetail> opLogDetails = new ArrayList<OpLogDetail>();
		for (int i = 0; i < context.lengthValue("GetOpLogResponse.OpLogDetails.Length"); i++) {
			OpLogDetail opLogDetail = new OpLogDetail();
			opLogDetail.setUserId(context.longValue("GetOpLogResponse.OpLogDetails["+ i +"].UserId"));
			opLogDetail.setUserNick(context.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].UserNick"));
			opLogDetail.setModule(context.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].Module"));
			opLogDetail.setOpContent(context.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].OpContent"));
			opLogDetail.setOpTime(context.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].OpTime"));
			opLogDetail.setDatabase(context.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].Database"));
			opLogDetail.setOrderId(context.longValue("GetOpLogResponse.OpLogDetails["+ i +"].OrderId"));

			opLogDetails.add(opLogDetail);
		}
		getOpLogResponse.setOpLogDetails(opLogDetails);
	 
	 	return getOpLogResponse;
	}
}