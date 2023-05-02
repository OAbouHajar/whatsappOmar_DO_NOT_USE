package X;

/* renamed from: X.1wT  reason: invalid class name and case insensitive filesystem */
public class C41721wT {
    public final C16440t3 A00;
    public final AnonymousClass1CW A01;

    public C41721wT(C16440t3 r1, AnonymousClass1CW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C41771wd A00() {
        AnonymousClass4OL r2 = new AnonymousClass4OL();
        if (A02("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME")) {
            r2.A04 = this.A01.A01("STORAGE_USAGE_MEDIA_SIZE");
        }
        if (A02("STORAGE_USAGE_LARGE_FILES_CACHE_TIME")) {
            AnonymousClass1CW r1 = this.A01;
            r2.A03 = r1.A01("STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE");
            r2.A01 = r1.A00("STORAGE_USAGE_LARGE_FILES_COUNT");
            r2.A06 = r1.A03("STORAGE_USAGE_LARGE_FILES_ROW_IDS");
        }
        if (A02("STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME")) {
            AnonymousClass1CW r12 = this.A01;
            r2.A02 = r12.A01("STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE");
            r2.A00 = r12.A00("STORAGE_USAGE_FORWARDED_FILES_COUNT");
            r2.A05 = r12.A03("STORAGE_USAGE_FORWARDED_FILES_ROW_IDS");
        }
        return new C41771wd(r2);
    }

    public final void A01(String str) {
        this.A01.A05(str, String.valueOf(this.A00.A00()));
    }

    public final boolean A02(String str) {
        Long A012 = this.A01.A01(str);
        return A012 != null && this.A00.A00() - A012.longValue() <= 2592000000L;
    }
}
