package X;

import com.obwhatsapp.data.ProfilePhotoChange;

/* renamed from: X.1sH  reason: invalid class name and case insensitive filesystem */
public class C39321sH extends AnonymousClass1WU {
    public ProfilePhotoChange A00;
    public String A01;

    public C39321sH(C28381Vw r2, long j2) {
        super(r2, 6, j2);
    }

    public void A0k(String str) {
        A14(str);
    }

    public String A13() {
        String str;
        synchronized (this.A12) {
            str = this.A01;
        }
        return str;
    }

    public void A14(String str) {
        synchronized (this.A12) {
            this.A01 = str;
        }
    }
}
