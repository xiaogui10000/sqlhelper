package com.jn.sqlhelper.mybatis.plugins.pagination;

import com.jn.easyjson.core.JSONBuilderProvider;

public class PaginationPluginConfig {
    private boolean count = true;
    private int countCacheInitCapacity = 10;
    private int countCacheMaxCapacity = 1000;
    private String countSuffix = "_COUNT";
    private int countCacheExpireInSeconds = 5;
    private int defaultPageSize = 10;
    private boolean useLastPageIfPageNoOut = false;

    public boolean enableCountCache() {
        return this.countCacheMaxCapacity > 0;
    }

    @Override
    public String toString() {
        return JSONBuilderProvider.create().serializeNulls(true).build().toJson(this);
    }

    public boolean isCount() {
        return count;
    }

    public void setCount(boolean count) {
        this.count = count;
    }

    public int getCountCacheInitCapacity() {
        return countCacheInitCapacity;
    }

    public void setCountCacheInitCapacity(int countCacheInitCapacity) {
        this.countCacheInitCapacity = countCacheInitCapacity;
    }

    public int getCountCacheMaxCapacity() {
        return countCacheMaxCapacity;
    }

    public void setCountCacheMaxCapacity(int countCacheMaxCapacity) {
        this.countCacheMaxCapacity = countCacheMaxCapacity;
    }

    public String getCountSuffix() {
        return countSuffix;
    }

    public void setCountSuffix(String countSuffix) {
        this.countSuffix = countSuffix;
    }

    public int getCountCacheExpireInSeconds() {
        return countCacheExpireInSeconds;
    }

    public void setCountCacheExpireInSeconds(int countCacheExpireInSeconds) {
        this.countCacheExpireInSeconds = countCacheExpireInSeconds;
    }

    public int getDefaultPageSize() {
        return defaultPageSize;
    }

    public void setDefaultPageSize(int defaultPageSize) {
        this.defaultPageSize = defaultPageSize;
    }

    public boolean isUseLastPageIfPageNoOut() {
        return useLastPageIfPageNoOut;
    }

    public void setUseLastPageIfPageNoOut(boolean useLastPageIfPageNoOut) {
        this.useLastPageIfPageNoOut = useLastPageIfPageNoOut;
    }
}
