package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.2C1  reason: invalid class name */
public final class AnonymousClass2C1 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public AnonymousClass2C1() {
        super(2170, new AnonymousClass00F(1, SearchActionVerificationClientService.NOTIFICATION_ID, 20000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidMessageTargetPerf {");
        C16470t7.appendFieldToStringBuilder(sb, "durationReceiptT", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mediaType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "targetStage", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}
