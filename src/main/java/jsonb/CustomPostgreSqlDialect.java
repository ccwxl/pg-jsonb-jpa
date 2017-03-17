package jsonb;

import org.hibernate.dialect.PostgreSQL9Dialect;

import java.sql.Types;

/**
 * @author xielongwang
 * @create 2017-03-17 下午8:29
 * @email xielong.wang@nvr-china.com
 */
public class CustomPostgreSqlDialect extends PostgreSQL9Dialect {

    public CustomPostgreSqlDialect() {
        this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }
}
