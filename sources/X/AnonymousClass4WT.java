package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.4WT  reason: invalid class name */
public final class AnonymousClass4WT {
    public float A00 = 1.0f;
    public int A01;
    public AnonymousClass5L3 A02;
    public final AudioManager A03;
    public final C91764gS A04;

    public AnonymousClass4WT(Context context, Handler handler, AnonymousClass5L3 r5) {
        this.A03 = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.A02 = r5;
        this.A04 = new C91764gS(handler, this);
        this.A01 = 0;
    }

    public final void A00() {
        if (this.A01 != 0) {
            if (AnonymousClass3C1.A01 < 26) {
                this.A03.abandonAudioFocus(this.A04);
            }
            A02(0);
        }
    }

    public final void A01(int i2) {
        AnonymousClass5L3 r0 = this.A02;
        if (r0 != null) {
            AnonymousClass2PR r2 = ((C62543Dz) r0).A00;
            boolean AF3 = r2.AF3();
            int i3 = 1;
            if (AF3 && i2 != 1) {
                i3 = 2;
            }
            r2.A06(i2, i3, AF3);
        }
    }

    public final void A02(int i2) {
        if (this.A01 != i2) {
            this.A01 = i2;
            float f2 = 1.0f;
            if (i2 == 3) {
                f2 = 0.2f;
            }
            if (this.A00 != f2) {
                this.A00 = f2;
                AnonymousClass5L3 r0 = this.A02;
                if (r0 != null) {
                    AnonymousClass2PR r3 = ((C62543Dz) r0).A00;
                    r3.A09(Float.valueOf(r3.A00 * r3.A0M.A00), 1, 2);
                }
            }
        }
    }
}
