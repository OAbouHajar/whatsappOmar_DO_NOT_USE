package X;

import com.whatsapp.util.Log;

/* renamed from: X.2Il  reason: invalid class name and case insensitive filesystem */
public class C47312Il {
    public final C16300so A00;
    public final C17020u3 A01;

    public C47312Il(C16300so r1, C17020u3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(String str, Exception exc) {
        C16300so r2 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(exc.getClass().getSimpleName());
        sb.append(" : ");
        sb.append(exc.getMessage());
        r2.AcB("ClickToWhatsAppAdsConversionStore/getConversionFromJson", sb.toString(), false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(exc);
        Log.e(sb2.toString());
    }
}
