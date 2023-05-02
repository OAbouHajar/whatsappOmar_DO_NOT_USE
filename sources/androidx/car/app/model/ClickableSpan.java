package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11710jD;

public final class ClickableSpan extends CarSpan {
    public final C11710jD mOnClickDelegate = null;

    public boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate));
        if (((ClickableSpan) obj).mOnClickDelegate != null) {
            z2 = false;
        }
        return AnonymousClass09S.A01(valueOf, z2);
    }

    public int hashCode() {
        boolean z2 = true;
        Object[] objArr = new Object[1];
        if (this.mOnClickDelegate != null) {
            z2 = false;
        }
        return AnonymousClass000.A0F(Boolean.valueOf(z2), objArr, 0);
    }

    public String toString() {
        return "[clickable]";
    }
}
