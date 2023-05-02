package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4VC  reason: invalid class name */
public final class AnonymousClass4VC {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Timeline A06;
    public final Timeline A07;
    public final C30271c3 A08;
    public final C30271c3 A09;

    public AnonymousClass4VC(Timeline timeline, Timeline timeline2, C30271c3 r3, C30271c3 r4, int i2, int i3, long j2, long j3, long j4, long j5) {
        this.A04 = j2;
        this.A07 = timeline;
        this.A01 = i2;
        this.A09 = r3;
        this.A03 = j3;
        this.A06 = timeline2;
        this.A00 = i3;
        this.A08 = r4;
        this.A02 = j4;
        this.A05 = j5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4VC.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4VC r7 = (AnonymousClass4VC) obj;
            if (!(this.A04 == r7.A04 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A02 == r7.A02 && this.A05 == r7.A05 && AnonymousClass45Q.A00(this.A07, r7.A07) && AnonymousClass45Q.A00(this.A09, r7.A09) && AnonymousClass45Q.A00(this.A06, r7.A06) && AnonymousClass45Q.A00(this.A08, r7.A08))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        objArr[0] = Long.valueOf(this.A04);
        objArr[1] = this.A07;
        AnonymousClass3K2.A1W(objArr, this.A01);
        objArr[3] = this.A09;
        objArr[4] = Long.valueOf(this.A03);
        objArr[5] = this.A06;
        objArr[6] = Integer.valueOf(this.A00);
        objArr[7] = this.A08;
        objArr[8] = Long.valueOf(this.A02);
        return AnonymousClass000.A0F(Long.valueOf(this.A05), objArr, 9);
    }
}
