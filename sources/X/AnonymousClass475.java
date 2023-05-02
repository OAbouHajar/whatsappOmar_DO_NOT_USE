package X;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.475  reason: invalid class name */
public class AnonymousClass475 {
    public static void A00(C103044zw r14, byte[] bArr, boolean z2) {
        String str;
        byte b2;
        String str2;
        String str3;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        short s2 = wrap.getShort();
        wrap.get(new byte[32]);
        byte[] bArr2 = new byte[((short) ((short) AnonymousClass3K4.A09(wrap)))];
        wrap.get(bArr2);
        short s3 = wrap.getShort();
        byte b3 = wrap.get();
        C89254bq r6 = new C89254bq(AnonymousClass3K2.A1Z(wrap));
        C86024Qx A00 = r6.A00(43);
        if (A00 != null) {
            Set set = AnonymousClass4ZF.A01;
            byte[] bArr3 = A00.A01;
            if (set.contains(Short.valueOf((short) C32311g7.A01(bArr3)))) {
                byte[] bArr4 = r14.A0n;
                if (bArr4 == null || C32311g7.A04(bArr3, bArr4)) {
                    Set set2 = z2 ? AnonymousClass4ZF.A03 : AnonymousClass4ZF.A04;
                    HashSet hashSet = new HashSet(r6.A03.keySet());
                    hashSet.removeAll(set2);
                    if (hashSet.size() != 0) {
                        str3 = "Unexpected extension provided by the server";
                    } else {
                        Short sh = AnonymousClass4ZF.A00;
                        b2 = 80;
                        if (s2 != 771) {
                            StringBuilder A0r = AnonymousClass000.A0r("Unexpected protocol version");
                            A0r.append(s2);
                            A0r.append(" != ");
                            str2 = AnonymousClass000.A0f(sh, A0r);
                        } else if (C32311g7.A04(r14.A0l, bArr2)) {
                            short s4 = r14.A0V;
                            if (s4 != 0 && s4 != s3) {
                                str3 = "Cipher suite in server hello does not match HelloRetryRequest cipher suite.";
                            } else if (s3 != 4865) {
                                str2 = "Server selected invalid cipher suite";
                            } else if (b3 == 0) {
                                C86024Qx A002 = r6.A00(51);
                                if (A002 != null) {
                                    ByteBuffer wrap2 = ByteBuffer.wrap(A002.A01);
                                    short s5 = wrap2.getShort();
                                    if (s5 == 29) {
                                        if (!z2) {
                                            byte[] bArr5 = new byte[2];
                                            wrap2.get(bArr5);
                                            int A01 = C32311g7.A01(bArr5);
                                            if (A01 == 32) {
                                                byte[] bArr6 = new byte[32];
                                                r14.A0m = bArr6;
                                                wrap2.get(bArr6);
                                            } else {
                                                StringBuilder A0r2 = AnonymousClass000.A0r("Key length mismatch ");
                                                A0r2.append(A01);
                                                str2 = C13680ns.A0i(" != ", A0r2, 32);
                                            }
                                        }
                                        C86024Qx A003 = r6.A00(41);
                                        if (!(r14.A0C.A03 == null || A003 == null)) {
                                            if (C32311g7.A01(A003.A01) <= 0) {
                                                r14.A0b = true;
                                                r14.A0g = true;
                                            } else {
                                                str2 = AnonymousClass000.A0g("Incorrect PSK index value chosen by server ", A003);
                                            }
                                        }
                                        if (z2) {
                                            r14.A0n = bArr3;
                                            r14.A0V = s3;
                                            r14.A0W = s5;
                                            C86024Qx A004 = r6.A00(44);
                                            if (A004 != null) {
                                                r14.A0k = AnonymousClass3K2.A1Z(ByteBuffer.wrap(A004.A01));
                                            }
                                        }
                                        if (wrap.hasRemaining()) {
                                            str2 = "Server Hello has more bytes than expected.";
                                        } else {
                                            return;
                                        }
                                    } else {
                                        str2 = "Key share algorithm mismatch.";
                                    }
                                } else {
                                    str = "Key share extension not found.";
                                }
                            } else {
                                str2 = "Invalid compression method.0";
                            }
                        } else {
                            str2 = "Bad session id";
                        }
                    }
                } else {
                    str3 = "Supported version in server hello does not match HelloRetryRequest supported version.";
                }
                throw AnonymousClass3K2.A0S(str3, (byte) 47);
            }
            b2 = 110;
            str2 = "Server sent an unsupported version.";
            throw AnonymousClass3K2.A0S(str2, b2);
        }
        str = "Supported version extension not found.";
        throw AnonymousClass3K2.A0S(str, (byte) 109);
    }
}
