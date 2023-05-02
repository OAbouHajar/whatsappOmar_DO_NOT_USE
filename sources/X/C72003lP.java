package X;

import android.view.View;

/* renamed from: X.3lP  reason: invalid class name and case insensitive filesystem */
public class C72003lP extends C31301dt {
    public final View.OnClickListener A00;

    public C72003lP(View.OnClickListener onClickListener) {
        super(AnonymousClass428.A0c);
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C72003lP) obj).A00);
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1K(A1Z, super.hashCode());
        return AnonymousClass3K2.A08(this.A00, A1Z);
    }
}
