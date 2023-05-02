package X;

import android.os.Bundle;

@Deprecated
/* renamed from: X.4qg  reason: invalid class name and case insensitive filesystem */
public class C97854qg implements AnonymousClass5TV {
    public static final C97854qg A02 = new C97854qg(new AnonymousClass4ZY());
    public final String A00;
    public final boolean A01;

    public C97854qg(AnonymousClass4ZY r2) {
        this.A01 = r2.A00.booleanValue();
        this.A00 = r2.A01;
    }

    public final Bundle A00() {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("consumer_package", (String) null);
        A0D.putBoolean("force_save_dialog", this.A01);
        A0D.putString("log_session_id", this.A00);
        return A0D;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C97854qg) {
                C97854qg r5 = (C97854qg) obj;
                if (this.A01 != r5.A01 || !AnonymousClass45A.A00(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = null;
        objArr[1] = Boolean.valueOf(this.A01);
        return AnonymousClass000.A0F(this.A00, objArr, 2);
    }
}
