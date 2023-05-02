package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5hN  reason: invalid class name and case insensitive filesystem */
public final class C111765hN extends C35511m3 {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(3);
    public int A00 = 1;
    public C35301lh A01;
    public C35301lh A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public C111765hN() {
    }

    public C111765hN(Parcel parcel) {
        super(parcel);
        this.A02 = C110105dW.A0I(parcel);
        this.A03 = parcel.readString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004b, code lost:
        if (r1 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r1 != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass173 r6, X.C28371Vv r7, int r8) {
        /*
            r5 = this;
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r0 = "user"
            r4 = 0
            java.lang.String r0 = r7.A0N(r0, r4)
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)
            r5.A05 = r0
            X.2gP r2 = X.C110105dW.A0L()
            java.lang.String r0 = "vpa"
            java.lang.String r1 = r7.A0N(r0, r4)
            java.lang.String r0 = "upiHandle"
            X.1lh r0 = X.C110105dW.A0J(r2, r3, r1, r0)
            r5.A02 = r0
            java.lang.String r0 = "vpa-id"
            java.lang.String r0 = r7.A0N(r0, r4)
            r5.A03 = r0
            X.2gP r2 = X.C110105dW.A0L()
            java.lang.String r0 = "user-name"
            java.lang.String r1 = r7.A0N(r0, r4)
            java.lang.String r0 = "accountHolderName"
            X.1lh r0 = X.C110105dW.A0J(r2, r3, r1, r0)
            r5.A01 = r0
            java.lang.String r0 = "nodal"
            java.lang.String r0 = r7.A0N(r0, r4)
            r3 = 1
            java.lang.String r2 = "1"
            if (r0 == 0) goto L_0x004d
            boolean r1 = r0.equals(r2)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r5.A04 = r0
            java.lang.String r0 = "nodal-allowed"
            java.lang.String r0 = r7.A0N(r0, r4)
            if (r0 == 0) goto L_0x005f
            boolean r1 = r0.equals(r2)
            r0 = 0
            if (r1 == 0) goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            r5.A05 = r0
            java.lang.String r0 = "notif-allowed"
            java.lang.String r0 = r7.A0N(r0, r4)
            if (r0 == 0) goto L_0x0071
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0071
            r3 = 0
        L_0x0071:
            r5.A06 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111765hN.A01(X.173, X.1Vv, int):void");
    }

    public void A02(List list, int i2) {
        throw new UnsupportedOperationException("IndiaUpiContactData toNetwork not supported");
    }

    public String A03() {
        try {
            String A032 = super.A03();
            JSONObject A0K = A032 != null ? C13700nu.A0K(A032) : C13700nu.A0J();
            A0K.put("v", this.A00);
            if (!C39841t9.A03(this.A02)) {
                C110115dX.A11(this.A02, "vpaHandle", A0K);
            }
            String str = this.A03;
            if (str != null) {
                A0K.put("vpaId", str);
            }
            if (!C39841t9.A03(this.A01)) {
                C110115dX.A11(this.A01, "legalName", A0K);
            }
            return A0K.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiContactData toDBString threw: ", e2);
            return null;
        }
    }

    public void A04(String str) {
        Class<String> cls = String.class;
        super.A04(str);
        if (str != null) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                int optInt = A0K.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A02 = C110105dW.A0J(C110105dW.A0L(), cls, A0K.optString("vpaHandle", (String) null), "upiHandle");
                    this.A03 = A0K.optString("vpaId", (String) null);
                    this.A01 = C110105dW.A0J(C110105dW.A0L(), cls, A0K.optString("legalName", (String) null), "accountHolderName");
                }
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiContactData fromDBString threw: ", e2);
            }
        }
    }

    public int A05() {
        return 1;
    }

    public String A07() {
        C35301lh r0 = this.A02;
        return (String) (r0 == null ? null : r0.A00);
    }

    public void A08(int i2) {
    }

    public void A09(String str) {
        this.A02 = C110105dW.A0K(str);
    }

    public void A0A(boolean z2) {
    }

    public boolean A0B() {
        return false;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ ver: ");
        A0r.append(this.A00);
        A0r.append(" jid: ");
        A0r.append(this.A05);
        A0r.append(" vpaHandle: ");
        A0r.append(this.A02);
        A0r.append(" nodal: ");
        A0r.append(this.A04);
        A0r.append(" nodalAllowed: ");
        A0r.append(this.A05);
        A0r.append(" notifAllowed: ");
        A0r.append(this.A06);
        return AnonymousClass000.A0h(" ]", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeString(this.A03);
    }
}
