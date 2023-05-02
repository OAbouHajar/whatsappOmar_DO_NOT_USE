package X;

/* renamed from: X.2gb  reason: invalid class name and case insensitive filesystem */
public class C53972gb implements C19370yK {
    public final /* synthetic */ AnonymousClass1WD A00;
    public final /* synthetic */ AnonymousClass11S A01;

    public C53972gb(AnonymousClass1WD r1, AnonymousClass11S r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AYg() {
        this.A00.A02(Boolean.FALSE);
    }

    public void AYh() {
        AnonymousClass11S r1 = this.A01;
        AnonymousClass11P r8 = r1.A04;
        Long A002 = r8.A00("critical_block");
        long longValue = A002 != null ? A002.longValue() : 0;
        r8.A00("critical_unblock_low");
        if (r8.A06("critical_block") && longValue >= 1) {
            r1.A03.A02(2);
        }
        if (r8.A06("critical_block") && longValue >= 1 && r8.A06("critical_unblock_low")) {
            this.A00.A02(Boolean.TRUE);
        }
    }
}
