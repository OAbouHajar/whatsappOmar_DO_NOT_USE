package X;

import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.4w2  reason: invalid class name and case insensitive filesystem */
public final class C100684w2 implements C108595Op {
    public final C30521cU A00;

    public C100684w2(View view, C17160ud r9, C16080sP r10, AnonymousClass013 r11, C25781Lc r12) {
        r9.A05(C13680ns.A0K(view, R.id.contactpicker_row_photo), R.drawable.avatar_contact);
        C30521cU r1 = new C30521cU(view, r10, r11, r12, (int) R.id.contactpicker_row_name);
        this.A00 = r1;
        r1.A05();
    }

    public void ANe(C450226r r3) {
        this.A00.A0E(((C450326s) r3).A00);
    }
}
