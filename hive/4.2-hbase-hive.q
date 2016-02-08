-- 4.2-hbase.q

-- ## TODO-1  : Fix MY_NAME

-- this the database
use MY_NAME;

CREATE EXTERNAL TABLE hbase(
            rowkey BIGINT, 
            ip STRING, 
            uid STRING,
            action STRING,
            domain STRING,
            campid STRING,
            cost INT,
            session STRING)
        STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
        WITH SERDEPROPERTIES ('hbase.columns.mapping' = ':key,info:ip,info:uid,info:action,info:domain,info:campid,info:cost,info:session')
        TBLPROPERTIES ('hbase.table.name' = 'MY_NAME_clickstream');

-- ## TODO-2  : Fix MY_NAME in the line above
