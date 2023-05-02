package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.2ia  reason: invalid class name and case insensitive filesystem */
public final class C54982ia extends C16470t7 {
    public Long A00;

    public C54982ia() {
        super(3178, new AnonymousClass00F(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID), 2, 37887164);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamClockSkewDifferenceT {");
        C16470t7.appendFieldToStringBuilder(sb, "clockSkewHourly", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
