package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.60s  reason: invalid class name and case insensitive filesystem */
public class C1202060s implements C46042Cc {
    public final C18300wT A00;

    public C1202060s(C18300wT r1) {
        this.A00 = r1;
    }

    public static final void A00(AnonymousClass173 r7, C28371Vv r8, C28371Vv r9, ArrayList arrayList, int i2) {
        int length;
        int i3 = 0;
        if (i2 == 2) {
            C28371Vv[] r6 = r9.A03;
            if (r6 != null) {
                int length2 = r6.length;
                while (i3 < length2) {
                    C28371Vv r2 = r6[i3];
                    if (r2 != null) {
                        if ("bank".equals(r2.A00)) {
                            C111805hR r0 = new C111805hR();
                            r0.A01(r7, r8, 2);
                            r0.A01(r7, r2, 2);
                            arrayList.add(r0);
                        } else if ("psp".equals(r2.A00) || "psp-routing".equals(r2.A00)) {
                            C111775hO r02 = new C111775hO();
                            r02.A01(r7, r2, 2);
                            arrayList.add(r02);
                        }
                    }
                    i3++;
                }
            }
        } else if (i2 == 4) {
            C28371Vv[] r3 = r9.A03;
            if (r3 != null && (length = r3.length) > 0) {
                do {
                    C28371Vv r1 = r3[i3];
                    if (r1 != null) {
                        C111805hR r03 = new C111805hR();
                        r03.A01(r7, r1, 4);
                        arrayList.add(r03);
                    }
                    i3++;
                } while (i3 < length);
            }
        } else if (i2 != 5) {
            StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaProtoParser got action: ");
            A0r.append(i2);
            Log.i(AnonymousClass000.A0h("; nothing to do", A0r));
        } else {
            C111775hO r04 = new C111775hO();
            r04.A01(r7, r9, 5);
            arrayList.add(r04);
        }
    }

    public ArrayList AaD(AnonymousClass173 r10, C28371Vv r11) {
        int i2;
        boolean z2;
        C28371Vv A0X = C110115dX.A0X(r11);
        ArrayList A0u = AnonymousClass000.A0u();
        if (A0X == null) {
            Log.w("PAY: IndiaProtoParser empty account node");
        } else {
            String A0N = A0X.A0N("wa-support-phone-number", (String) null);
            if (!TextUtils.isEmpty(A0N)) {
                this.A00.A0K(A0N);
            }
            String A0N2 = A0X.A0N("action", (String) null);
            if ("upi-batch".equalsIgnoreCase(A0N2)) {
                i2 = 1;
            } else if ("upi-get-banks".equalsIgnoreCase(A0N2)) {
                i2 = 2;
            } else if ("upi-register-vpa".equalsIgnoreCase(A0N2)) {
                i2 = 4;
            } else if ("upi-list-keys".equalsIgnoreCase(A0N2)) {
                i2 = 5;
            } else if ("upi-check-mpin".equalsIgnoreCase(A0N2)) {
                i2 = 6;
            } else if ("pay-precheck".equalsIgnoreCase(A0N2)) {
                i2 = 8;
            } else {
                boolean equalsIgnoreCase = "upi-get-psp-routing-and-list-keys".equalsIgnoreCase(A0N2);
                i2 = 0;
                if (equalsIgnoreCase) {
                    i2 = 10;
                }
            }
            int i3 = 0;
            if (i2 == 1 || i2 == 10) {
                C28371Vv[] r8 = A0X.A03;
                if (r8 != null) {
                    while (i3 < r8.length) {
                        C28371Vv r2 = r8[i3];
                        if (r2 != null) {
                            String str = r2.A00;
                            switch (str.hashCode()) {
                                case -384112062:
                                    z2 = str.equals("psp-config");
                                    break;
                                case 3288564:
                                    if (str.equals("keys")) {
                                        A00(r10, A0X, r2, A0u, 5);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 93503927:
                                    z2 = str.equals("banks");
                                    break;
                            }
                            if (z2) {
                                A00(r10, A0X, r2, A0u, 2);
                            }
                        }
                        i3++;
                    }
                }
            } else if (i2 == 2) {
                A00(r10, A0X, A0X, A0u, 2);
                C28371Vv[] r22 = A0X.A03;
                if (r22 != null) {
                    while (i3 < r22.length) {
                        C28371Vv r1 = r22[i3];
                        if (r1 != null && "psp-config".equals(r1.A00)) {
                            A00(r10, A0X, r1, A0u, 2);
                        }
                        i3++;
                    }
                }
            } else {
                A00(r10, A0X, A0X, A0u, i2);
                return A0u;
            }
        }
        return A0u;
    }
}
