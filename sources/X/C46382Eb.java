package X;

/* renamed from: X.2Eb  reason: invalid class name and case insensitive filesystem */
public class C46382Eb extends C46372Ea implements AnonymousClass2EI {
    public C46382Eb(C16920ts r7, AnonymousClass17I r8, C24821Hk r9) {
        super(r7, r8, r9, "media_migration_fixer", 3);
    }

    public void A0G() {
        super.A0G();
        AnonymousClass11I r2 = this.A06;
        r2.A04("media_message_fixer_ready", 3);
        r2.A04("media_message_ready", 2);
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    public void onRollback() {
        this.A06.A03("media_message_fixer_ready");
    }
}
