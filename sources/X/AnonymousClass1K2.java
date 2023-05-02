package X;

import android.util.Base64;
import com.facebook.redex.IDxEWrapperShape173S0100000_2_I0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1K2  reason: invalid class name */
public class AnonymousClass1K2 extends C25251Jb {
    public final AnonymousClass1K1 A00;

    public AnonymousClass1K2(AnonymousClass1K1 r4) {
        super("bk.action.apt.PleEncrypt");
        this.A00 = r4;
    }

    public /* bridge */ /* synthetic */ Object A8l(C14950q3 r16, C99354tt r17, C14970q5 r18) {
        if (r17.A00.equals("bk.action.apt.PleEncrypt")) {
            HashMap hashMap = new HashMap();
            List list = r16.A00;
            C31201dg r9 = (C31201dg) list.get(0);
            String A0J = r9.A0J(41);
            String A0J2 = r9.A0J(35);
            Long valueOf = Long.valueOf(r9.A0B(-1, 36));
            Long valueOf2 = Long.valueOf(r9.A0B(-1, 38));
            hashMap.put("purpose", A0J);
            hashMap.put("publicKey", A0J2);
            hashMap.put("serverTimestamp", valueOf);
            hashMap.put("validTilTimestamp", valueOf2);
            String str = (String) list.get(1);
            C31421e9 r2 = ((C31411e8) list.get(2)).A00;
            C31421e9 r1 = ((C31411e8) list.get(3)).A00;
            IDxEWrapperShape173S0100000_2_I0 iDxEWrapperShape173S0100000_2_I0 = new IDxEWrapperShape173S0100000_2_I0(r2, 8);
            try {
                String str2 = (String) hashMap.get("purpose");
                if (str2 != null) {
                    byte[] decode = Base64.decode((String) hashMap.get("publicKey"), 8);
                    Long l2 = (Long) hashMap.get("serverTimestamp");
                    if (l2 != null) {
                        Long l3 = (Long) hashMap.get("validTilTimestamp");
                        if (l3 != null) {
                            int length = decode.length;
                            if (length == 32) {
                                byte[] copyOf = Arrays.copyOf(decode, length);
                                long longValue = l2.longValue();
                                if (longValue <= 0) {
                                    StringBuilder sb = new StringBuilder("Invalid value for serverTimestamp: ");
                                    sb.append(l2);
                                    throw new IllegalArgumentException(sb.toString());
                                } else if (l3.longValue() > 0) {
                                    byte[] bArr = new byte[24];
                                    C87714Yg.A00.nextBytes(bArr);
                                    C36011mr A002 = C28851Ya.A00();
                                    byte[] A01 = C46872Gp.A01(C46862Go.A01(Arrays.copyOf(copyOf, copyOf.length), A002.A00.A01), bArr, str.getBytes());
                                    byte[] bArr2 = A002.A01.A01;
                                    int length2 = bArr2.length + 24 + A01.length;
                                    ByteBuffer allocate = ByteBuffer.allocate(str2.getBytes().length + 5 + 8 + length2 + 16);
                                    allocate.order(ByteOrder.BIG_ENDIAN);
                                    allocate.put((byte) 4);
                                    allocate.putInt(4);
                                    allocate.putInt(0);
                                    allocate.putInt(str2.length());
                                    allocate.put(str2.getBytes());
                                    allocate.putInt(8);
                                    allocate.putLong(longValue);
                                    allocate.putInt(length2);
                                    allocate.put(bArr2);
                                    allocate.put(bArr);
                                    allocate.put(A01);
                                    if (!allocate.hasRemaining()) {
                                        String encodeToString = Base64.encodeToString(allocate.array(), 8);
                                        C14960q4 A02 = AnonymousClass1K6.A02(r18);
                                        C14940q2 r12 = new C14940q2();
                                        r12.A02(encodeToString, 0);
                                        C14980q6.A00(A02, new C14950q3(r12.A00), (C14930q1) iDxEWrapperShape173S0100000_2_I0.A00);
                                        return null;
                                    }
                                    throw new IllegalStateException("Ciphertext array not fully written");
                                } else {
                                    StringBuilder sb2 = new StringBuilder("Invalid value for validTilTime: ");
                                    sb2.append(l3);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder("Invalid length for serverPublicKey: ");
                                sb3.append(length);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        } else {
                            throw new NullPointerException("validTilTimestamp must not be null");
                        }
                    } else {
                        throw new NullPointerException("serverTimestamp must not be null");
                    }
                } else {
                    throw new NullPointerException("purpose must not be null");
                }
            } catch (RuntimeException unused) {
                C14960q4 A022 = AnonymousClass1K6.A02(r18);
                C14940q2 r13 = new C14940q2();
                r13.A02(0, 0);
                C14980q6.A00(A022, new C14950q3(r13.A00), (C14930q1) new IDxEWrapperShape173S0100000_2_I0(r1, 7).A00);
            }
        }
        return null;
    }
}
