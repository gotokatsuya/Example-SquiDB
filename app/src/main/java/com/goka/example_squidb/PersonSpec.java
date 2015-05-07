package com.goka.example_squidb;

import com.yahoo.squidb.annotations.ColumnSpec;
import com.yahoo.squidb.annotations.TableModelSpec;

/**
 * Created by katsuyagoto on 2015/05/07.
 */
@TableModelSpec(className = "Person", tableName = "people")
public class PersonSpec {

    @ColumnSpec(defaultValue = "Me", constraints = "NOT NULL")
    String name;

}
