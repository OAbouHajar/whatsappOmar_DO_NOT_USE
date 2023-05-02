package X;

/* renamed from: X.5Ge  reason: invalid class name and case insensitive filesystem */
public final class C107045Ge extends AnonymousClass5GI implements C12910lA {
    public final String A00;
    public final Throwable A01;

    public C107045Ge(String str, Throwable th) {
        this.A01 = th;
        this.A00 = str;
    }

    public C11340ia A02(int i2) {
        A07();
        throw AnonymousClass000.A0Z();
    }

    public boolean A03(AnonymousClass1UM r2) {
        A07();
        throw AnonymousClass000.A0Z();
    }

    public /* bridge */ /* synthetic */ void A05(Runnable runnable, AnonymousClass1UM r3) {
        A07();
        throw AnonymousClass000.A0Z();
    }

    public final void A07() {
        String A06;
        Throwable th = this.A01;
        if (th != null) {
            String str = this.A00;
            String str2 = "";
            if (!(str == null || (A06 = C18450wi.A06(". ", str)) == null)) {
                str2 = A06;
            }
            throw new IllegalStateException(C18450wi.A06("Module with the Main dispatcher had failed to initialize", str2), th);
        }
        throw AnonymousClass000.A0V("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public /* bridge */ /* synthetic */ void Ad6(AnonymousClass5GN r3, long j2) {
        A07();
        throw AnonymousClass000.A0Z();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Dispatchers.Main[missing");
        Throwable th = this.A01;
        A0r.append(th != null ? C18450wi.A06(", cause=", th) : "");
        return AnonymousClass3K2.A0m(A0r);
    }
}
