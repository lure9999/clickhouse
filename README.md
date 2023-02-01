# clickhouse

场景：公司历史数据7700w，一张表，要求统计。mysql 统计直接1分钟起。
解决方法。把mysql 数据导入到clickhouse
CREATE TABLE wlw_dayvalue ENGINE = MergeTree ORDER BY ID AS
SELECT * FROM mysql('192.168.111.39', 'test', 'wlw_dayvalue', 'root', '123456');
看下总条数 77121831  5ms mysql就这个语句要一分钟起了


再来按时间统计下 230ms 

好了 数据库 方案没问题 写下java代码 分页效果也是好的不行。



JAVA demo 地址 https://github.com/lure9999/clickhouse
https://www.jianshu.com/p/ffc62c40d5d3
