package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.2IW  reason: invalid class name */
public final class AnonymousClass2IW extends C16470t7 {
    public Boolean A00;

    public AnonymousClass2IW() {
        super(2098, new AnonymousClass00F(1, 10, SearchActionVerificationClientService.NOTIFICATION_ID), 1, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamUiActionRealTime {");
        C16470t7.appendFieldToStringBuilder(sb, "chatdInternetConnectivity", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
