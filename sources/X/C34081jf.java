package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.1jf  reason: invalid class name and case insensitive filesystem */
public final class C34081jf extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;

    public C34081jf() {
        super(2450, new AnonymousClass00F(1000, 1000, SearchActionVerificationClientService.NOTIFICATION_ID), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A05);
        r3.AdT(7, this.A04);
        r3.AdT(5, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(8, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamDbPerf {");
        C16470t7.appendFieldToStringBuilder(sb, "androidPerfDuration", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "androidPerfName", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "dbSizeInMb", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "isMainMessageStoreMigrationCompleted", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "onMainThread", this.A01);
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "startupStage", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}
