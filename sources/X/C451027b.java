package X;

import java.util.AbstractCollection;

/* renamed from: X.27b  reason: invalid class name and case insensitive filesystem */
public final class C451027b extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public String A0I;

    public C451027b() {
        super(1006, new AnonymousClass00F(1, 20, 100), 0, -1);
    }

    public static boolean A00(C451027b r2, AbstractCollection abstractCollection) {
        r2.A0F = Long.valueOf((long) abstractCollection.size());
        return abstractCollection.isEmpty();
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(20, this.A05);
        r3.AdT(10, this.A06);
        r3.AdT(19, this.A07);
        r3.AdT(22, this.A08);
        r3.AdT(14, this.A09);
        r3.AdT(16, this.A0A);
        r3.AdT(17, this.A0B);
        r3.AdT(12, this.A00);
        r3.AdT(21, this.A0C);
        r3.AdT(6, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(15, this.A0D);
        r3.AdT(7, this.A0E);
        r3.AdT(8, this.A03);
        r3.AdT(11, this.A0F);
        r3.AdT(13, this.A0G);
        r3.AdT(18, this.A0H);
        r3.AdT(9, this.A04);
        r3.AdT(1, this.A0I);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamContactSyncEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncBusinessResponseNew", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncChangedVersionRowCount", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncDeviceResponseNew", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncDisappearingModeResponseNew", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncErrorCode", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncFailureProtocol", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncLatency", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncNoop", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncPayResponseNew", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncRequestClearWaSyncData", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncRequestIsUrgent", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncRequestProtocol", this.A0D);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncRequestRetryCount", this.A0E);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncRequestShouldRetry", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncRequestedCount", this.A0F);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncResponseCount", this.A0G);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncStatusResponseNew", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncSuccess", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "contactSyncType", this.A0I);
        sb.append("}");
        return sb.toString();
    }
}
