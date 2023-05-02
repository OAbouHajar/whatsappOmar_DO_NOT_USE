package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.redex.IDxEventShape51S0200000_2_I1;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Dz  reason: invalid class name and case insensitive filesystem */
public final class C62543Dz implements AnonymousClass5TQ, AnonymousClass5TI, AnonymousClass5TJ, C108335No, C108295Nk, TextureView.SurfaceTextureListener, SurfaceHolder.Callback, AnonymousClass5L2, AnonymousClass5L3, AnonymousClass5LB {
    public final /* synthetic */ AnonymousClass2PR A00;

    public C62543Dz(AnonymousClass2PR r1) {
        this.A00 = r1;
    }

    public void AMk(String str, long j2, long j3) {
        this.A00.A0S.AMk(str, j2, j3);
    }

    public void AMl(String str) {
        this.A00.A0S.AMl(str);
    }

    public void AMm(C85484Oq r3) {
        AnonymousClass2PR r1 = this.A00;
        r1.A0S.AMm(r3);
        r1.A08 = null;
        r1.A0B = null;
    }

    public void AMn(C85484Oq r2) {
        AnonymousClass2PR r0 = this.A00;
        r0.A0B = r2;
        r0.A0S.AMn(r2);
    }

    public void AMo(C32491gT r2, C86944Ut r3) {
        AnonymousClass2PR r0 = this.A00;
        r0.A08 = r2;
        r0.A0S.AMo(r2, r3);
    }

    public void AMq(long j2) {
        this.A00.A0S.AMq(j2);
    }

    public void AMr(Exception exc) {
        this.A00.A0S.AMr(exc);
    }

    public void AMs(int i2, long j2, long j3) {
        this.A00.A0S.AMs(i2, j2, j3);
    }

    public void APH(List list) {
        AnonymousClass2PR r0 = this.A00;
        r0.A0E = list;
        Iterator it = r0.A0W.iterator();
        while (it.hasNext()) {
            ((C108335No) it.next()).APH(list);
        }
    }

    public void AQC(int i2, long j2) {
        this.A00.A0S.AQC(i2, j2);
    }

    public void AQo(boolean z2) {
        AnonymousClass2PR.A00(this.A00);
    }

    public void ASO(boolean z2) {
    }

    public /* synthetic */ void ASP(boolean z2) {
    }

    public /* synthetic */ void ATO(C86924Ur r1, int i2) {
    }

    public void ATl(C93724jf r6) {
        AnonymousClass2PR r4 = this.A00;
        C96224nz r3 = r4.A0S;
        AnonymousClass4VC A03 = r3.A03(r3.A06.A00);
        r3.A05(A03, new IDxEventShape51S0200000_2_I1(r6, 10, A03), 1007);
        Iterator it = r4.A0V.iterator();
        while (it.hasNext()) {
            ((C108295Nk) it.next()).ATl(r6);
        }
    }

    public void AUm(boolean z2, int i2) {
        AnonymousClass2PR.A00(this.A00);
    }

    public /* synthetic */ void AUo(C89214bm r1) {
    }

    public void AUq(int i2) {
        AnonymousClass2PR.A00(this.A00);
    }

    public /* synthetic */ void AUr(int i2) {
    }

    public /* synthetic */ void AUs(C804643y r1) {
    }

    public /* synthetic */ void AUt(boolean z2, int i2) {
    }

    public /* synthetic */ void AUy(int i2) {
    }

    public void AW5(Surface surface) {
        AnonymousClass2PR r1 = this.A00;
        r1.A0S.AW5(surface);
        if (r1.A05 == surface) {
            Iterator it = r1.A0X.iterator();
            while (it.hasNext()) {
                ((AnonymousClass3E0) ((C107705Lb) it.next())).A00.A09.setVisibility(8);
            }
        }
    }

    public /* synthetic */ void AWt() {
    }

    public void AXJ(boolean z2) {
        AnonymousClass2PR r1 = this.A00;
        if (r1.A0I != z2) {
            r1.A0I = z2;
            r1.A0S.AXJ(z2);
            Iterator it = r1.A0T.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0W("onSkipSilenceEnabledChanged");
            }
        }
    }

    public /* synthetic */ void AXd(List list) {
    }

    public /* synthetic */ void AYr(Timeline timeline, int i2) {
        C806544y.A00(this, timeline, i2);
    }

    public /* synthetic */ void AYs(Timeline timeline, Object obj, int i2) {
    }

    public /* synthetic */ void AZ8(C93604jT r1, AnonymousClass4TI r2) {
    }

    public void AZY(String str, long j2, long j3) {
        this.A00.A0S.AZY(str, j2, j3);
    }

    public void AZZ(String str) {
        this.A00.A0S.AZZ(str);
    }

    public void AZa(C85484Oq r3) {
        AnonymousClass2PR r1 = this.A00;
        r1.A0S.AZa(r3);
        r1.A09 = null;
        r1.A0C = null;
    }

    public void AZb(C85484Oq r2) {
        AnonymousClass2PR r0 = this.A00;
        r0.A0C = r2;
        r0.A0S.AZb(r2);
    }

    public void AZc(long j2, int i2) {
        this.A00.A0S.AZc(j2, i2);
    }

    public void AZd(C32491gT r2, C86944Ut r3) {
        AnonymousClass2PR r0 = this.A00;
        r0.A09 = r2;
        r0.A0S.AZd(r2, r3);
    }

    public void AZe(float f2, int i2, int i3, int i4) {
        AspectRatioFrameLayout aspectRatioFrameLayout;
        float f3;
        float f4;
        AnonymousClass2PR r1 = this.A00;
        r1.A0S.AZe(f2, i2, i3, i4);
        Iterator it = r1.A0X.iterator();
        while (it.hasNext()) {
            Log.i(C13680ns.A0c(i4, "WAExoPlayerView/onVideoSizeChanged/unappliedRotationDegrees="));
            C56852oj r2 = ((AnonymousClass3E0) ((C107705Lb) it.next())).A00;
            float f5 = 1.0f;
            if (!r2.A0E) {
                ((C63993Mi) r2.A0A).setRotationAngle(i4);
                if (i4 == 90 || i4 == 270) {
                    aspectRatioFrameLayout = r2.A0B;
                    if (i3 != 0) {
                        f3 = (float) i3;
                        f4 = ((float) i2) * f2;
                        f5 = f3 / f4;
                        aspectRatioFrameLayout.setAspectRatio(f5);
                    } else {
                        aspectRatioFrameLayout.setAspectRatio(f5);
                    }
                }
            }
            aspectRatioFrameLayout = r2.A0B;
            if (i3 != 0) {
                f3 = ((float) i2) * f2;
                f4 = (float) i3;
                f5 = f3 / f4;
                aspectRatioFrameLayout.setAspectRatio(f5);
            } else {
                aspectRatioFrameLayout.setAspectRatio(f5);
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        AnonymousClass2PR r2 = this.A00;
        r2.A07(new Surface(surfaceTexture), true);
        r2.A05(i2, i3);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass2PR r2 = this.A00;
        r2.A07((Surface) null, true);
        r2.A05(0, 0);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.A00.A05(i2, i3);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.A00.A05(i3, i4);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A07(surfaceHolder.getSurface(), false);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AnonymousClass2PR r2 = this.A00;
        r2.A07((Surface) null, false);
        r2.A05(0, 0);
    }
}
