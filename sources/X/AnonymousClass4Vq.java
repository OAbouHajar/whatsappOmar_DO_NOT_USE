package X;

import android.graphics.Bitmap;

/* renamed from: X.4Vq  reason: invalid class name */
public final class AnonymousClass4Vq {
    public final Bitmap A00;
    public final String A01;

    public AnonymousClass4Vq(Bitmap bitmap, String str) {
        this.A00 = bitmap;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Vq) {
                AnonymousClass4Vq r5 = (AnonymousClass4Vq) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K3.A0H(this.A00) + AnonymousClass000.A0G(this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarProfilePhotoPoseViewData(bitmapPose=");
        A0r.append(this.A00);
        A0r.append(", emojis=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
