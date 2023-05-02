package X;

/* renamed from: X.18G  reason: invalid class name */
public class AnonymousClass18G {
    public final C16490t9 A00;
    public final AnonymousClass18F A01;

    public AnonymousClass18G(C16490t9 r1, AnonymousClass18F r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00() {
        AnonymousClass18F r5 = this.A01;
        synchronized (r5.A03) {
            r5.A00().edit().putInt("sticker_pack_delete_count", r5.A00().getInt("sticker_pack_delete_count", 0) + 1).apply();
        }
    }

    public void A01() {
        AnonymousClass18F r5 = this.A01;
        synchronized (r5.A04) {
            r5.A00().edit().putInt("sticker_search_opened_count", r5.A00().getInt("sticker_search_opened_count", 0) + 1).apply();
        }
    }
}
