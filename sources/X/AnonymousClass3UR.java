package X;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.3UR  reason: invalid class name */
public final class AnonymousClass3UR extends Timeline {
    public static final C86924Ur A05;
    public static final Object A06 = C13690nt.A0Y();
    public final long A00;
    public final long A01;
    public final AnonymousClass4SO A02;
    public final C86924Ur A03;
    public final boolean A04;

    static {
        C86284Rz r1 = new C86284Rz();
        r1.A02 = "SinglePeriodTimeline";
        r1.A00 = Uri.EMPTY;
        A05 = r1.A00();
    }

    public AnonymousClass3UR(C86924Ur r2, long j2, boolean z2, boolean z3) {
        AnonymousClass4SO r0 = z3 ? r2.A01 : null;
        this.A00 = j2;
        this.A01 = j2;
        this.A04 = z2;
        this.A03 = r2;
        this.A02 = r0;
    }

    public C89324by A0A(C89324by r9, int i2, long j2) {
        C90524eJ.A00(i2, 1);
        Object obj = C89324by.A0F;
        C89324by r0 = r9;
        r0.A00(this.A02, this.A03, obj, this.A01, this.A04, false);
        return r9;
    }
}
