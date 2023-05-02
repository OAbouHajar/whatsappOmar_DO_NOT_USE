package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.camera.CameraBottomSheetBehavior;
import com.obwhatsapp.camera.DragGalleryStripIndicator;

/* renamed from: X.2iP  reason: invalid class name and case insensitive filesystem */
public class C54872iP extends C54882iQ {
    public boolean A00 = false;
    public final /* synthetic */ C14550pN A01;
    public final /* synthetic */ C29251aI A02;
    public final /* synthetic */ AnonymousClass2V7 A03;

    public C54872iP(C14550pN r2, C29251aI r3, AnonymousClass2V7 r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A01(View view, float f2) {
        C29251aI r2 = this.A02;
        float f3 = 1.0f - f2;
        r2.A05.setAlpha(f3);
        AnonymousClass2V9 r1 = r2.A0H;
        if (r1.A02) {
            r1.A01.setAlpha(f3);
        }
        r2.A0J.A04.setAlpha(f3);
        r2.A0I.A01.setBackgroundColor(((int) (255.0f * f2)) << 24);
        AnonymousClass2V7 r22 = this.A03;
        if (r22.A07.getConfiguration().orientation != 2) {
            r22.A0A.setAlpha(f3);
            DragGalleryStripIndicator dragGalleryStripIndicator = r22.A03;
            if (dragGalleryStripIndicator != null) {
                dragGalleryStripIndicator.setAlpha(f3);
            }
        }
        r22.A09.setAlpha(f2);
    }

    public void A02(View view, int i2) {
        boolean z2;
        AnonymousClass2V7 r3 = this.A03;
        r3.A04(true);
        C29251aI r9 = this.A02;
        boolean z3 = this.A00;
        AnonymousClass01A r7 = r9.A0b;
        int i3 = 0;
        boolean z4 = false;
        if (i2 != 4) {
            z4 = true;
        }
        r7.A0o(z4);
        if (i2 == 3) {
            if (!z3 && (r7 instanceof C50452Zp)) {
                C29261aJ r0 = r9.A0D;
                ((C50452Zp) r7).Aeb(r0.A03, r0.A06, r0.A07);
            }
            r9.A0n.A0K().putBoolean("show_camera_gallery_tip", false).apply();
            r9.A05.setVisibility(4);
            z2 = r9.A0w;
            if (z2) {
                CameraBottomSheetBehavior cameraBottomSheetBehavior = r9.A0G.A0B;
                if (cameraBottomSheetBehavior.A02) {
                    cameraBottomSheetBehavior.A00 = true;
                }
            }
        } else {
            r9.A05.setVisibility(0);
            z2 = r9.A0w;
            if (z2 && r9.A0D.A01 != 1) {
                CameraBottomSheetBehavior cameraBottomSheetBehavior2 = r9.A0G.A0B;
                if (cameraBottomSheetBehavior2.A02) {
                    cameraBottomSheetBehavior2.A00 = false;
                }
            }
        }
        AnonymousClass2V9 r02 = r9.A0H;
        if (i2 == 3) {
            i3 = 4;
        }
        r02.A01(i3);
        if (i2 == 4) {
            if (z3 && (r7 instanceof C50452Zp)) {
                C29261aJ r03 = r9.A0D;
                ((C50452Zp) r7).AFr(r03.A03, r03.A07);
            }
            r9.A0F.A09(!r9.A0D.A07.isEmpty(), r9.A0D.A07.size());
            AnonymousClass2VD r5 = r9.A0I;
            r5.A01.setBackgroundColor(r9.A0m.A00.getResources().getColor(R.color.color08f1));
        }
        View view2 = r9.A09;
        if (view2 != null && !z2) {
            if (i2 != 4) {
                view2.setSystemUiVisibility(1024);
            } else if (r9.A0S) {
                view2.setSystemUiVisibility(4);
            }
        }
        if (i2 == 3) {
            C14550pN r1 = this.A01;
            C434920f.A04(r1, R.color.color045d);
            C434920f.A05(r1, R.color.color04f0, 1);
            View view3 = r3.A01;
            if (view3 != null) {
                view3.setVisibility(4);
            }
            r3.A0A.setVisibility(4);
            this.A00 = true;
        } else {
            C14550pN r4 = this.A01;
            C434920f.A08(r4.getWindow(), false);
            C434920f.A03(r4, R.color.color064b);
            boolean z5 = r3.A0C;
            int i4 = R.color.color0792;
            if (z5) {
                i4 = R.color.color00ec;
            }
            C434920f.A05(r4, i4, 2);
            View view4 = r3.A01;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            r3.A0A.setVisibility(0);
            if (i2 == 4) {
                if (this.A00) {
                    r3.A00();
                }
                this.A00 = false;
                r3.A09.setVisibility(4);
                return;
            }
        }
        r3.A09.setVisibility(0);
    }
}
