package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.4yY  reason: invalid class name and case insensitive filesystem */
public class C102194yY implements C109635Sz {
    public final float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ MediaViewBaseFragment A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r4.A1R() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C102194yY(android.view.View r3, com.obwhatsapp.mediaview.MediaViewBaseFragment r4) {
        /*
            r2 = this;
            r2.A02 = r4
            r2.A01 = r3
            r2.<init>()
            X.29g r0 = r4.A0B
            boolean r0 = r0 instanceof X.AnonymousClass33A
            if (r0 != 0) goto L_0x0016
            boolean r1 = r4.A1R()
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0018:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102194yY.<init>(android.view.View, com.obwhatsapp.mediaview.MediaViewBaseFragment):void");
    }

    public boolean AIj(View view) {
        return AnonymousClass000.A1Y(view, this.A02.A04);
    }

    public void APs(View view) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        C455529g r1 = mediaViewBaseFragment.A0B;
        if (((r1 instanceof AnonymousClass33A) || !mediaViewBaseFragment.A1R()) && (r1 instanceof C455429f)) {
            mediaViewBaseFragment.A09.setAlpha(0.0f);
        }
        mediaViewBaseFragment.A1H();
    }

    public void AQA(int i2) {
        this.A02.A1J(i2);
    }

    public void AX7(View view) {
        C14630pV r0 = (C14630pV) this.A02.A0C();
        if (r0 != null) {
            r0.AYZ();
        }
    }

    public void AXK(View view, float f2) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        C14630pV r1 = (C14630pV) mediaViewBaseFragment.A0C();
        if (r1 != null && !r1.isFinishing()) {
            r1.APw();
            float f3 = 1.0f - f2;
            float f4 = this.A00;
            float f5 = f3 < f4 ? 0.0f : (f3 - f4) / (1.0f - f4);
            this.A01.setAlpha(f5);
            mediaViewBaseFragment.A06.setAlpha(f5);
            if ((mediaViewBaseFragment.A0B instanceof AnonymousClass33A) || !mediaViewBaseFragment.A1R()) {
                mediaViewBaseFragment.A09.setAlpha(f5);
            }
            int childCount = mediaViewBaseFragment.A09.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                mediaViewBaseFragment.A09.getChildAt(i2).findViewById(R.id.footer).setAlpha(f5 * f5);
            }
            mediaViewBaseFragment.A1P(true, true);
        }
    }
}
