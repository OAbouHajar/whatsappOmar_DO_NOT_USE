package X;

import android.content.SharedPreferences;

/* renamed from: X.5Fa  reason: invalid class name and case insensitive filesystem */
public final class C106745Fa extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass22J $onSuccess;
    public final /* synthetic */ C26141Mm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106745Fa(C26141Mm r2, AnonymousClass22J r3) {
        super(1);
        this.this$0 = r2;
        this.$onSuccess = r3;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C93374j5 r4 = (C93374j5) obj;
        C18450wi.A0H(r4, 0);
        C13680ns.A0z(((SharedPreferences) ((C212013e) this.this$0.A04.get()).A01.getValue()).edit(), "pref_has_avatar_config", r4.A00);
        C14870pt.A03(this.this$0.A00, this.$onSuccess, r4, 41);
        return AnonymousClass22M.A00;
    }
}
