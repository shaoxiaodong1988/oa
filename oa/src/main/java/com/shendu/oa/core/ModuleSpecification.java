package com.shendu.oa.core;

public interface ModuleSpecification {
    public static final String PREFIX = "_DB_";

    boolean isEnabled();

    String getSchemaTable();

    String getSchemaLocation();

    boolean isInitData();

    String getDataTable();

    String getDataLocation();
}
