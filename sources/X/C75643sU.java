package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.3sU  reason: invalid class name and case insensitive filesystem */
public final class C75643sU extends C16470t7 {
    public Double A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;

    public C75643sU() {
        super(1012, new AnonymousClass00F(1, SearchActionVerificationClientService.NOTIFICATION_ID, 1000000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A04);
        r3.AdT(1, this.A05);
        r3.AdT(6, this.A06);
        r3.AdT(9, this.A01);
        r3.AdT(8, this.A02);
        r3.AdT(3, this.A07);
        r3.AdT(5, this.A03);
        r3.AdT(2, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamVideoPlay {");
        C16470t7.appendFieldToStringBuilder(A0r, "videoAge", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "videoDuration", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "videoInitialBufferingT", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "videoPlayOrigin", C13690nt.A0d(this.A01));
        String str = null;
        Integer num = this.A02;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(A0r, "videoPlaySurface", str);
        C16470t7.appendFieldToStringBuilder(A0r, "videoPlayT", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "videoPlayType", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "videoSize", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}