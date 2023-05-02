package X;

import com.obwhatsapp.gallery.NewMediaPickerFragment;
import com.obwhatsapp.gallerypicker.MediaPicker;
import com.obwhatsapp.gallerypicker.MediaPickerFragment;

/* renamed from: X.2vZ  reason: invalid class name and case insensitive filesystem */
public abstract class C59232vZ extends C14530pL {
    public boolean A00 = false;

    public C59232vZ() {
        C13680ns.A1G(this, 67);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            MediaPicker mediaPicker = (MediaPicker) this;
            C49132Rg r3 = (C49132Rg) C14570pP.A1S(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, mediaPicker);
            C14530pL.A0b(r3, r1, mediaPicker, C14550pN.A0v(r1));
            C50462Zq r12 = new C50462Zq(new NewMediaPickerFragment());
            new MediaPickerFragment();
            Object obj = r12.reference;
            C18450wi.A0B(obj);
            AnonymousClass01A r0 = (AnonymousClass01A) obj;
            C16340ss.A01(r0);
            mediaPicker.A00 = r0;
        }
    }
}
