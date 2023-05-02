package X;

/* renamed from: X.0G4  reason: invalid class name */
public final class AnonymousClass0G4 extends AnonymousClass0PS {
    public static final AnonymousClass0G4 A00 = new AnonymousClass0G4();

    public AnonymousClass0G4() {
        super(15, 16);
    }

    public void A00(C13620mg r2) {
        C18450wi.A0H(r2, 0);
        r2.A8n("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        r2.A8n("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        r2.A8n("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.A8n("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        r2.A8n("DROP TABLE `SystemIdInfo`");
        r2.A8n("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
