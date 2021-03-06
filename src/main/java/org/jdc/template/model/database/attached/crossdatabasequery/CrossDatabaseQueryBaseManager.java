/*
 * CrossDatabaseQueryBaseManager.java
 *
 * GENERATED FILE - DO NOT EDIT
 * 
 */



package org.jdc.template.model.database.attached.crossdatabasequery;

import org.jdc.template.model.database.DatabaseManager;
import org.dbtools.android.domain.database.DatabaseWrapper;
import org.dbtools.android.domain.RxAndroidBaseManagerReadOnly;


@SuppressWarnings("all")
public abstract class CrossDatabaseQueryBaseManager extends RxAndroidBaseManagerReadOnly<CrossDatabaseQuery> {

    private DatabaseManager databaseManager;

    public CrossDatabaseQueryBaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    @javax.annotation.Nonnull
    public String getDatabaseName() {
        return CrossDatabaseQueryConst.DATABASE;
    }

    @javax.annotation.Nonnull
    public CrossDatabaseQuery newRecord() {
        return new CrossDatabaseQuery();
    }

    @javax.annotation.Nonnull
    public String[] getAllColumns() {
        return CrossDatabaseQueryConst.ALL_COLUMNS;
    }

    @javax.annotation.Nonnull
    public DatabaseWrapper getReadableDatabase(@javax.annotation.Nonnull String databaseName) {
        return databaseManager.getReadableDatabase(databaseName);
    }

    @javax.annotation.Nonnull
    public DatabaseWrapper getReadableDatabase() {
        return databaseManager.getReadableDatabase(getDatabaseName());
    }

    @javax.annotation.Nonnull
    public DatabaseWrapper getWritableDatabase(@javax.annotation.Nonnull String databaseName) {
        return databaseManager.getWritableDatabase(databaseName);
    }

    @javax.annotation.Nonnull
    public DatabaseWrapper getWritableDatabase() {
        return databaseManager.getWritableDatabase(getDatabaseName());
    }

    @javax.annotation.Nonnull
    public org.dbtools.android.domain.AndroidDatabase getAndroidDatabase(@javax.annotation.Nonnull String databaseName) {
        return databaseManager.getDatabase(databaseName);
    }

    public org.dbtools.android.domain.config.DatabaseConfig getDatabaseConfig() {
        return databaseManager.getDatabaseConfig();
    }

    public abstract String getQuery();

    @javax.annotation.Nonnull
    public String getTableName() {
        return getQuery();
    }

    @javax.annotation.Nonnull
    public String getPrimaryKey() {
        return null;
    }

    @javax.annotation.Nonnull
    public String getDropSql() {
        return "";
    }

    @javax.annotation.Nonnull
    public String getCreateSql() {
        return "";
    }

    @javax.annotation.Nonnull
    public String getInsertSql() {
        return "";
    }

    @javax.annotation.Nonnull
    public String getUpdateSql() {
        return "";
    }


}