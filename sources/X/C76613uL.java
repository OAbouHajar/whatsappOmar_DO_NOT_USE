package X;

import java.util.List;

/* renamed from: X.3uL  reason: invalid class name and case insensitive filesystem */
public final class C76613uL extends C810946u {
    public final List A00;

    public C76613uL(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76613uL) && C18450wi.A0R(this.A00, ((C76613uL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.A00, AnonymousClass000.A0r("ScreenshotsInfo(screenshotUploadResultList="));
    }
}
