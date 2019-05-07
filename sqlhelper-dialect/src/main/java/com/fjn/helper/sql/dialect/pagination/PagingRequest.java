
/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the LGPL, Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at  http://www.gnu.org/licenses/lgpl-3.0.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fjn.helper.sql.dialect.pagination;


public class PagingRequest<E, R> {
    private Boolean count = null;
    private String countSqlId;
    private int pageNo;
    private int pageSize;
    private int fetchSize;
    private int timeout;
    private String orderBy;
    private E condition;
    private PagingResult<R> result;

    public String getCountSqlId() {
        return this.countSqlId;
    }

    public void setCountSqlId(String countSqlId) {
        this.countSqlId = countSqlId;
    }

    public boolean isValidRequest() {
        if ((this.pageNo < 0) || (this.pageSize < 0)) {
            return false;
        }
        return true;
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getFetchSize() {
        return this.fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public boolean needOrderBy() {
        if ((this.orderBy == null) || (this.orderBy.trim().length() == 0)) {
            return false;
        }
        return true;
    }

    public E getCondition() {
        return (E) this.condition;
    }

    public void setCondition(E condition) {
        this.condition = condition;
    }

    public Boolean getCount() {
        return this.count;
    }

    public void setCount(Boolean count) {
        this.count = count;
    }

    public PagingResult<R> getResult() {
        return this.result;
    }

    public void setResult(PagingResult result) {
        this.result = result;
    }
}
