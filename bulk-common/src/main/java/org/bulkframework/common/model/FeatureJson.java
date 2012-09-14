/**
 * Copyright 2011-2012 [wiflish.xie@gmail.com].
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bulkframework.common.model;

import java.io.Serializable;

/**
 * 
 * 扩展字段接口，不用于where条件.
 * 
 * @author wiflish
 * @createTime 2012-9-5 下午5:39:40
 */
public interface FeatureJson extends Serializable {
    /**
     * 转换为JSON字串.
     * 
     * @return JSON字串.
     */
    public String toJSONString();
}
