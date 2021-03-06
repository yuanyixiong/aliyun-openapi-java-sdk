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

package com.aliyuncs.objectdet.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.objectdet.model.v20191230.DetectTransparentImageResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectTransparentImageResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectTransparentImageResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectTransparentImageResponseUnmarshaller {

	public static DetectTransparentImageResponse unmarshall(DetectTransparentImageResponse detectTransparentImageResponse, UnmarshallerContext _ctx) {
		
		detectTransparentImageResponse.setRequestId(_ctx.stringValue("DetectTransparentImageResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectTransparentImageResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTransparentImage(_ctx.integerValue("DetectTransparentImageResponse.Data.Elements["+ i +"].TransparentImage"));

			elements.add(element);
		}
		data.setElements(elements);
		detectTransparentImageResponse.setData(data);
	 
	 	return detectTransparentImageResponse;
	}
}