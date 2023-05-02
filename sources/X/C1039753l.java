package X;

import com.whatsapp.util.Log;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.53l  reason: invalid class name and case insensitive filesystem */
public final class C1039753l implements C109055Qn, C109065Qo, C109085Qq {
    public final C28371Vv A00;
    public final AnonymousClass4T8 A01;

    public C1039753l(C16300so r2, C28371Vv r3) {
        AnonymousClass3K3.A1G(r3);
        this.A01 = (AnonymousClass4T8) AnonymousClass3K2.A0b(r2, r3, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT);
        this.A00 = r3;
    }

    public void A4K(AnonymousClass4HW r2) {
        r2.A00 = "401";
        r2.A01 = "not-authorized";
    }

    public void A4P(C82694Du r3) {
        Log.i(C18450wi.A06("Fetching parent participants failed: ", "401"));
    }

    public void A4Q(AnonymousClass4QD r1) {
        r1.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1039753l.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1039753l) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
