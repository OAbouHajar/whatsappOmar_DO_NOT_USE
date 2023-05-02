package X;

import android.content.Intent;
import java.util.Set;

/* renamed from: X.03E  reason: invalid class name */
public final class AnonymousClass03E extends AnonymousClass038 {
    public final Intent A00;
    public final Set A01;

    public /* synthetic */ AnonymousClass03E(Intent intent, Set set, int i2, int i3) {
        super(i2, i3);
        this.A00 = intent;
        this.A01 = C003101j.A0F(set);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof AnonymousClass03E) && super.equals(obj) && super.equals(obj)) {
                AnonymousClass03E r5 = (AnonymousClass03E) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }
}
