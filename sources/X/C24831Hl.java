package X;

/* renamed from: X.1Hl  reason: invalid class name and case insensitive filesystem */
public class C24831Hl {
    public final C16920ts A00;
    public final C16460t6 A01;
    public final C221616w A02;
    public final AnonymousClass17I A03;
    public final AnonymousClass17H A04;
    public final C16900tq A05;

    public C24831Hl(C16920ts r1, C16460t6 r2, C221616w r3, AnonymousClass17I r4, AnonymousClass17H r5, C16900tq r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
    }

    public static final void A00(C83694Hr r4, C15830rv r5, int i2, int i3) {
        C15860rz r3 = r4.A01.A03;
        r3.A0K().putString("storage_usage_deletion_jid", r5.getRawString()).apply();
        r3.A0K().putInt("storage_usage_deletion_current_msg_cnt", i3).putInt("storage_usage_deletion_all_msg_cnt", i2).apply();
        r4.A00.AVM(i3, i2);
    }
}
