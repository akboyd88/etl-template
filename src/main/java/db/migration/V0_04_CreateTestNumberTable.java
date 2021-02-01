package db.migration;

import db.migration.helpers.SimpleExecutionMigration;

public class V0_04_CreateTestNumberTable extends SimpleExecutionMigration {
    private static final String UP_SQL = """
       CREATE TABLE IF NOT EXISTS test_numbers (
                   id uuid PRIMARY KEY default gen_random_uuid(),
                   value 
                   
               );
               CREATE INDEX idx_title ON test(title);
    """;

    /**
     * Create test number table in database
     */
    public V0_04_CreateTestNumberTable(){
        super(false);
    }

    @Override
    public String getSql() {
        return UP_SQL;
    }
}
