package X;

/* renamed from: X.0G8  reason: invalid class name */
public final class AnonymousClass0G8 extends AnonymousClass0PS {
    public static final AnonymousClass0G8 A00 = new AnonymousClass0G8();

    public AnonymousClass0G8() {
        super(6, 7);
    }

    public void A00(C13620mg r2) {
        C18450wi.A0H(r2, 0);
        r2.A8n("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
