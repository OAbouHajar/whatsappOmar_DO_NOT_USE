package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;

/* renamed from: X.5fO  reason: invalid class name and case insensitive filesystem */
public class C111135fO extends C118595uw {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C118595uw A01;
    public final /* synthetic */ C119325wu A02;
    public final /* synthetic */ AnonymousClass5zJ A03;
    public final /* synthetic */ boolean A04;

    public C111135fO(CaptureRequest.Builder builder, C118595uw r2, C119325wu r3, AnonymousClass5zJ r4, boolean z2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = builder;
        this.A03 = r4;
        this.A04 = z2;
    }

    public void A02(Exception exc) {
        this.A01.A02(exc);
        this.A02.A0A.A00((C118595uw) null, "restart_preview_video_recording_failed", new C1218266z(this));
    }

    public /* bridge */ /* synthetic */ void A03(Object obj) {
        this.A02.A00 = SystemClock.elapsedRealtime();
        this.A01.A03(obj);
    }
}
