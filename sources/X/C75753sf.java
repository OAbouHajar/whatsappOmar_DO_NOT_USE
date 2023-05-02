package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.3sf  reason: invalid class name and case insensitive filesystem */
public final class C75753sf extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;

    public C75753sf() {
        super(2496, new AnonymousClass00F(1000, SearchActionVerificationClientService.NOTIFICATION_ID, 20000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(10, this.A01);
        r3.AdT(1, this.A03);
        r3.AdT(6, this.A00);
        r3.AdT(3, this.A04);
        r3.AdT(8, this.A05);
        r3.AdT(5, this.A06);
        r3.AdT(9, this.A02);
        r3.AdT(7, this.A07);
        r3.AdT(4, this.A08);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamReceiptStanzaReceive {");
        String str = null;
        Integer num = this.A01;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(A0r, "messageType", str);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaDuration", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaHasOrphaned", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaOfflineCount", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaProcessedCount", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaRetryVer", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaStage", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaTotalCount", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "receiptStanzaType", this.A08);
        return AnonymousClass000.A0h("}", A0r);
    }
}
