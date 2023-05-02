package X;

/* renamed from: X.0G5  reason: invalid class name */
public final class AnonymousClass0G5 extends AnonymousClass0PS {
    public static final AnonymousClass0G5 A00 = new AnonymousClass0G5();

    public AnonymousClass0G5() {
        super(1, 2);
    }

    public void A00(C13620mg r2) {
        C18450wi.A0H(r2, 0);
        r2.A8n("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        r2.A8n("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        r2.A8n("DROP TABLE IF EXISTS alarmInfo");
        r2.A8n("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
