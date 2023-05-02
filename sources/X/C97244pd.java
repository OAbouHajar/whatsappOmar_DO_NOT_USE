package X;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.4pd  reason: invalid class name and case insensitive filesystem */
public abstract class C97244pd implements C108285Nj {
    public C93724jf A00(AnonymousClass3Ub r16, ByteBuffer byteBuffer) {
        String str;
        C35731mP[] r1;
        C97194pY r0;
        CharsetDecoder charsetDecoder;
        CharsetDecoder charsetDecoder2;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (this instanceof AnonymousClass3V3) {
            return ((AnonymousClass3V3) this).A06(byteBuffer2.array(), byteBuffer2.limit());
        }
        if (this instanceof AnonymousClass3V2) {
            AnonymousClass3V2 r3 = (AnonymousClass3V2) this;
            try {
                charsetDecoder = r3.A01;
                str = charsetDecoder.decode(byteBuffer2).toString();
            } catch (CharacterCodingException unused) {
                r3.A01.reset();
                byteBuffer2.rewind();
                try {
                    charsetDecoder = r3.A00;
                    str = charsetDecoder.decode(byteBuffer2).toString();
                } catch (CharacterCodingException unused2) {
                    str = null;
                    r3.A00.reset();
                    byteBuffer2.rewind();
                } catch (Throwable th) {
                    th = th;
                    charsetDecoder2 = r3.A00;
                    charsetDecoder2.reset();
                    byteBuffer2.rewind();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                charsetDecoder2 = r3.A01;
                charsetDecoder2.reset();
                byteBuffer2.rewind();
                throw th;
            }
            charsetDecoder.reset();
            byteBuffer2.rewind();
            byte[] bArr = new byte[byteBuffer2.limit()];
            byteBuffer2.get(bArr);
            String str2 = null;
            if (str == null) {
                r1 = new C35731mP[1];
                r0 = new C97194pY((String) null, (String) null, bArr);
            } else {
                Matcher matcher = AnonymousClass3V2.A02.matcher(str);
                String str3 = null;
                for (int i2 = 0; matcher.find(i2); i2 = matcher.end()) {
                    String A0a = AnonymousClass3K4.A0a(matcher.group(1));
                    String group = matcher.group(2);
                    if (A0a != null) {
                        if (A0a.equals("streamurl")) {
                            str3 = group;
                        } else if (A0a.equals("streamtitle")) {
                            str2 = group;
                        }
                    }
                }
                r1 = new C35731mP[1];
                r0 = new C97194pY(str2, str3, bArr);
            }
            r1[0] = r0;
            return new C93724jf(r1);
        } else if (this instanceof AnonymousClass3V0) {
            C90504eH r02 = new C90504eH(byteBuffer2.array(), byteBuffer2.limit());
            return new C93724jf(new C97224pb(r02.A0M(), r02.A0M(), Arrays.copyOfRange(r02.A02, r02.A01, r02.A00), r02.A0I(), r02.A0I()));
        } else if (byteBuffer2.get() != 116) {
            return null;
        } else {
            C90204dh r9 = new C90204dh(byteBuffer2.array(), byteBuffer2.limit());
            r9.A08(12);
            int A04 = r9.A04(12);
            C90524eJ.A04(AnonymousClass000.A1P(r9.A00));
            int i3 = (r9.A02 + A04) - 4;
            r9.A09(C90204dh.A01(r9, 44, 12));
            r9.A08(16);
            ArrayList A0u = AnonymousClass000.A0u();
            while (true) {
                C90524eJ.A04(AnonymousClass000.A1P(r9.A00));
                String str4 = null;
                if (r9.A02 >= i3) {
                    break;
                }
                r9.A08(48);
                int A042 = r9.A04(8);
                int A01 = C90204dh.A01(r9, 4, 12);
                C90524eJ.A04(AnonymousClass000.A1P(r9.A00));
                int i4 = r9.A02 + A01;
                String str5 = null;
                while (true) {
                    C90524eJ.A04(AnonymousClass000.A1P(r9.A00));
                    if (r9.A02 >= i4) {
                        break;
                    }
                    int A043 = r9.A04(8);
                    int A044 = r9.A04(8);
                    C90524eJ.A04(AnonymousClass000.A1P(r9.A00));
                    int i5 = r9.A02 + A044;
                    if (A043 == 2) {
                        int A045 = r9.A04(16);
                        r9.A08(8);
                        if (A045 != 3) {
                        }
                        while (true) {
                            C90524eJ.A04(AnonymousClass000.A1P(r9.A00));
                            if (r9.A02 >= i5) {
                                break;
                            }
                            int A046 = r9.A04(8);
                            Charset charset = AnonymousClass4BH.A01;
                            byte[] bArr2 = new byte[A046];
                            r9.A0B(bArr2, A046);
                            str4 = new String(bArr2, charset);
                            int A047 = r9.A04(8);
                            for (int i6 = 0; i6 < A047; i6++) {
                                r9.A09(r9.A04(8));
                            }
                        }
                    } else if (A043 == 21) {
                        Charset charset2 = AnonymousClass4BH.A01;
                        byte[] bArr3 = new byte[A044];
                        r9.A0B(bArr3, A044);
                        str5 = new String(bArr3, charset2);
                    }
                    r9.A07(i5 << 3);
                }
                r9.A07(i4 << 3);
                if (!(str4 == null || str5 == null)) {
                    A0u.add(new C97164pV(A042, AnonymousClass000.A0h(str5, AnonymousClass000.A0q(str4))));
                }
            }
            if (!A0u.isEmpty()) {
                return new C93724jf((List) A0u);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2.arrayOffset() != 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C93724jf A7j(X.AnonymousClass3Ub r4) {
        /*
            r3 = this;
            java.nio.ByteBuffer r2 = r4.A01
            int r0 = r2.position()
            if (r0 != 0) goto L_0x0015
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L_0x0015
            int r1 = r2.arrayOffset()
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            X.C90524eJ.A03(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r4.flags
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1R(r0, r1)
            if (r0 == 0) goto L_0x0026
            r0 = 0
            return r0
        L_0x0026:
            X.4jf r0 = r3.A00(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97244pd.A7j(X.3Ub):X.4jf");
    }
}
