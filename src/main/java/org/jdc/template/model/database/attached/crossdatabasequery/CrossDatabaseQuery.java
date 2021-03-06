/*
 * CrossDatabaseQuery.java
 *
 * Created: 09/18/2014 09:40:57
 */



package org.jdc.template.model.database.attached.crossdatabasequery;

import android.database.Cursor;

import org.dbtools.android.domain.database.contentvalues.DBToolsContentValues;
import org.jdc.template.model.database.main.individual.IndividualConst;

public class CrossDatabaseQuery extends CrossDatabaseQueryBaseRecord {

    public static final String QUERY = "(" +
            "SELECT " +
            IndividualConst.FULL_C_ID + " AS " + CrossDatabaseQueryConst.C_ID + ", " +
            IndividualConst.FULL_C_FIRST_NAME + " AS " + CrossDatabaseQueryConst.C_NAME + ", " +
            " 1 " + " AS " + CrossDatabaseQueryConst.C_TYPE +
            " FROM " + IndividualConst.TABLE +
            ")";
    public static final String QUERY_RAW = "SELECT * FROM " + QUERY;

    public CrossDatabaseQuery(Cursor cursor) {
        setContent(cursor);
    }

    public CrossDatabaseQuery(DBToolsContentValues values) {
        setContent(values);
    }

    public CrossDatabaseQuery() {
    }


}