package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.67F  reason: invalid class name */
public class AnonymousClass67F implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ CaptureRequest.Builder A03;
    public final /* synthetic */ AnonymousClass5zQ A04;
    public final /* synthetic */ AnonymousClass69J A05;
    public final /* synthetic */ C119325wu A06;
    public final /* synthetic */ AnonymousClass5zJ A07;
    public final /* synthetic */ AnonymousClass5vQ A08;
    public final /* synthetic */ String A09;

    public AnonymousClass67F(CaptureRequest.Builder builder, AnonymousClass5zQ r2, AnonymousClass69J r3, C119325wu r4, AnonymousClass5zJ r5, AnonymousClass5vQ r6, String str, int i2, int i3, long j2) {
        this.A06 = r4;
        this.A09 = str;
        this.A08 = r6;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = r2;
        this.A05 = r3;
        this.A03 = builder;
        this.A07 = r5;
        this.A02 = j2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C119325wu r4 = this.A06;
        String str = this.A09;
        AnonymousClass5vQ r9 = this.A08;
        int i2 = this.A00;
        int i3 = this.A01;
        C119235wl A012 = r4.A01(this.A03, this.A04, this.A05, this.A07, r9, str, i2, i3);
        r4.A06 = A012;
        A012.A02(C119235wl.A0I, Long.valueOf(this.A02));
        return r4.A06;
    }
}
