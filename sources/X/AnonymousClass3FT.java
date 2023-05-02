package X;

import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3FT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FT implements C30881d7 {
    public final /* synthetic */ C28861Yb A00;
    public final /* synthetic */ C28001Ty A01;
    public final /* synthetic */ C30641ci A02;

    public /* synthetic */ AnonymousClass3FT(C28861Yb r1, C28001Ty r2, C30641ci r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void AHO(byte[] bArr) {
        StringBuilder A0o;
        String str;
        char c2;
        C28001Ty r7 = this.A01;
        C30641ci r2 = this.A02;
        C28861Yb r6 = this.A00;
        byte[] A022 = C454929a.A02((C30861d5) null, (C30841d3) null, bArr);
        if (A022 == null) {
            A0o = AnonymousClass000.A0o();
            str = "axolotl derived invalid plaintext; stanzaKey=";
        } else {
            try {
                C33211iD A0U = C33211iD.A0U(A022);
                List A09 = C41061vA.A09(A0U);
                if (A09.size() != 0) {
                    A0o = AnonymousClass000.A0r("axolotl received an invalid protobuf; stanzaKey=");
                    A0o.append(r2);
                    A0o.append("; messageTypes=");
                    A0o.append(A09);
                    Log.w(A0o.toString());
                } else if ((A0U.A00 & 16384) == 16384) {
                    Log.i(AnonymousClass000.A0g("axolotl received sender key distribution message; stanzaKey=", r2));
                    C58472tY r5 = A0U.A0g;
                    if (r5 == null) {
                        r5 = C58472tY.A03;
                    }
                    int i2 = r5.A00;
                    if ((i2 & 1) == 1 && (i2 & 2) == 2) {
                        C30981dH r4 = new C30981dH(r6, C34941l7.A00.getRawString());
                        C208211s r3 = r7.A03;
                        byte[] A04 = r5.A01.A04();
                        Lock A03 = r3.A0I.A03(r4);
                        if (A03 == null) {
                            try {
                                r3.A0H.A00();
                            } catch (Throwable th) {
                                if (A03 != null) {
                                    A03.unlock();
                                }
                                throw th;
                            }
                        } else {
                            A03.lock();
                        }
                        C35981mo r0 = r3.A00;
                        try {
                            C36401nU r32 = new C36401nU(A04);
                            C36391nT r02 = new C36391nT(r0.A00.A01);
                            C36061mw A023 = C31811f4.A02(r4);
                            synchronized (C36191n9.A00) {
                                C36181n8 r52 = r02.A00;
                                C31881fB A002 = r52.A00(A023);
                                int i3 = r32.A00;
                                int i4 = r32.A01;
                                byte[][] bArr2 = r32.A04;
                                C36251nF r11 = r32.A02;
                                LinkedList linkedList = A002.A00;
                                linkedList.addFirst(new C36211nB(r11, C36501ne.A00, bArr2, i3, i4));
                                if (linkedList.size() > 5) {
                                    linkedList.removeLast();
                                }
                                r52.A01(A023, A002);
                            }
                            c2 = 0;
                        } catch (C36171n7 e2) {
                            Log.w("axolotl", e2);
                            c2 = 64529;
                        } catch (C36161n6 e3) {
                            Log.w("axolotl", e3);
                            c2 = 64531;
                        }
                        if (A03 != null) {
                            A03.unlock();
                        }
                        if (c2 == 64531) {
                            A0o = AnonymousClass000.A0o();
                            str = "axolotl received invalid sender key distribution message; stanzaKey=";
                        } else if (c2 == 64529) {
                            A0o = AnonymousClass000.A0o();
                            str = "axolotl received legacy sender key distribution message; stanzaKey=";
                        } else {
                            return;
                        }
                    } else {
                        A0o = AnonymousClass000.A0o();
                        str = "axolotl received incomplete sender key distribution message; stanzaKey=";
                    }
                } else {
                    return;
                }
            } catch (C29791bD e4) {
                Log.w(AnonymousClass000.A0g("axolotl derived plaintext does not represent valid protocol buffer; stanzaKey=", r2), e4);
                return;
            }
        }
        A0o.append(str);
        A0o.append(r2);
        Log.w(A0o.toString());
    }
}
