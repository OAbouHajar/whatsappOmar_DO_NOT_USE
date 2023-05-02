package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lx  reason: invalid class name and case insensitive filesystem */
public class C35451lx implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(37);
    public final C35461ly A00;
    public final Integer A01;
    public final String A02;

    public C35451lx(C35461ly r1, Integer num, String str) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = r1;
    }

    public C35451lx(Parcel parcel) {
        this.A02 = parcel.readString();
        int readInt = parcel.readInt();
        this.A01 = readInt == -1 ? null : Integer.valueOf(readInt);
        this.A00 = (C35461ly) parcel.readParcelable(C35461ly.class.getClassLoader());
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c A[Catch:{ 1W9 -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b A[Catch:{ 1W9 -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1 A[Catch:{ 1W9 -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C35451lx A00(X.C28371Vv r9) {
        /*
            java.lang.String r5 = "kyc-rejection-code"
            r2 = 0
            java.lang.String r0 = "kyc-state"
            java.lang.String r4 = r9.A0N(r0, r2)     // Catch:{ 1W9 -> 0x00a4 }
            java.lang.String r0 = "kyc-actions-requested"
            X.1Vv r3 = r9.A0J(r0)     // Catch:{ 1W9 -> 0x00a4 }
            if (r3 == 0) goto L_0x0064
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ 1W9 -> 0x00a4 }
            r6.<init>()     // Catch:{ 1W9 -> 0x00a4 }
            java.lang.String r0 = "obligation"
            java.lang.String r1 = r3.A0M(r0)     // Catch:{ 1W9 -> 0x00a4 }
            java.lang.String r0 = "upload-document"
            java.util.List r0 = r3.A0O(r0)     // Catch:{ 1W9 -> 0x00a4 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ 1W9 -> 0x00a4 }
        L_0x0027:
            boolean r0 = r8.hasNext()     // Catch:{ 1W9 -> 0x00a4 }
            if (r0 == 0) goto L_0x0066
            java.lang.Object r7 = r8.next()     // Catch:{ 1W9 -> 0x00a4 }
            X.1Vv r7 = (X.C28371Vv) r7     // Catch:{ 1W9 -> 0x00a4 }
            java.lang.String r0 = "type"
            java.lang.String r7 = r7.A0M(r0)     // Catch:{ 1W9 -> 0x00a4 }
            java.lang.String r0 = "PROOF_OF_IDENTITY"
            boolean r0 = r0.equals(r7)     // Catch:{ 1W9 -> 0x00a4 }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "UPLOAD_DOC_IDENTITY"
        L_0x0044:
            r6.add(r0)     // Catch:{ 1W9 -> 0x00a4 }
            goto L_0x0027
        L_0x0048:
            java.lang.String r0 = "PROOF_OF_ADDRESS"
            boolean r0 = r0.equals(r7)     // Catch:{ 1W9 -> 0x00a4 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "UPLOAD_DOC_ADDRESS"
            goto L_0x0044
        L_0x0053:
            java.lang.String r1 = "PAY: KycActionsRequested/fromProtocolTreeNode non-supported action type: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1W9 -> 0x00a4 }
            r0.<init>(r1)     // Catch:{ 1W9 -> 0x00a4 }
            r0.append(r7)     // Catch:{ 1W9 -> 0x00a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ 1W9 -> 0x00a4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1W9 -> 0x00a4 }
        L_0x0064:
            r3 = r2
            goto L_0x0086
        L_0x0066:
            java.lang.String r0 = "verify-card"
            X.1Vv r0 = r3.A0J(r0)     // Catch:{ 1W9 -> 0x00a4 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "VERIFY_CARD"
            r6.add(r0)     // Catch:{ 1W9 -> 0x00a4 }
        L_0x0074:
            java.lang.String r0 = "provide-ssn-last4"
            X.1Vv r0 = r3.A0J(r0)     // Catch:{ 1W9 -> 0x00a4 }
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "PROVIDE_SSN_LAST4"
            r6.add(r0)     // Catch:{ 1W9 -> 0x00a4 }
        L_0x0081:
            X.1ly r3 = new X.1ly     // Catch:{ 1W9 -> 0x00a4 }
            r3.<init>(r1, r6)     // Catch:{ 1W9 -> 0x00a4 }
        L_0x0086:
            java.lang.String r0 = r9.A0N(r5, r2)     // Catch:{ 1W9 -> 0x00a4 }
            if (r0 == 0) goto L_0x00a1
            r0 = 0
            int r0 = r9.A0A(r5, r0)     // Catch:{ 1W9 -> 0x00a4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 1W9 -> 0x00a4 }
        L_0x0095:
            boolean r0 = X.AnonymousClass1ZW.A0E(r4)     // Catch:{ 1W9 -> 0x00a4 }
            if (r0 != 0) goto L_0x00aa
            X.1lx r0 = new X.1lx     // Catch:{ 1W9 -> 0x00a4 }
            r0.<init>(r3, r1, r4)     // Catch:{ 1W9 -> 0x00a4 }
            goto L_0x00a3
        L_0x00a1:
            r1 = r2
            goto L_0x0095
        L_0x00a3:
            return r0
        L_0x00a4:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentKycInfo/fromProtocolTreeNode "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00aa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35451lx.A00(X.1Vv):X.1lx");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        Integer num = this.A01;
        parcel.writeInt(num != null ? num.intValue() : -1);
        parcel.writeParcelable(this.A00, i2);
    }
}
