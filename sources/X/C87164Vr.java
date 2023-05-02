package X;

import java.util.List;

/* renamed from: X.4Vr  reason: invalid class name and case insensitive filesystem */
public final class C87164Vr {
    public C37771pi A00;
    public List A01;

    public C87164Vr(C37771pi r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87164Vr) {
                C87164Vr r5 = (C87164Vr) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K3.A0H(this.A00) + AnonymousClass000.A0C(this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("StickerPreviewState(stickerPack=");
        A0r.append(this.A00);
        A0r.append(", stickerPreviewItems=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
