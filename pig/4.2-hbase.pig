-- 4.2-hbase.pig


-- ## TODO-1 : set the name of job
SET job.name 'MY_NAME  4.2-hbase.pig';

-- ## TODO-2 : fix MY_NAME
clickstream = load 'MY_NAME/clickstream/in/clickstream.csv' using PigStorage(',') as (ts:long, ip:chararray, uid:chararray, action:chararray, domain:chararray, campid:chararray, cost:int, session:chararray);

-- ## TODO-3 : Fix MY_NAME
store clickstream into 'hbase://MY_NAME_clickstream' using
      org.apache.pig.backend.hadoop.hbase.HBaseStorage(
      'info:ts, info:ip, info:uid, info:action, info:domain, info:campid, info:cost, info:session');
