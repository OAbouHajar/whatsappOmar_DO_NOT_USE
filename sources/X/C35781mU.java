package X;

import android.util.Pair;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.1mU  reason: invalid class name and case insensitive filesystem */
public class C35781mU {
    public static final InetSocketAddress A00;
    public static final InetSocketAddress A01;

    static {
        try {
            A00 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 8, 8}), 53);
            A01 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 4, 4}), 53);
        } catch (UnknownHostException e2) {
            throw new Error(e2);
        }
    }

    public static Pair A00(byte[] bArr, int i2) {
        int length;
        if (i2 < 0 || i2 >= (length = bArr.length)) {
            throw new UnknownHostException("offset is outside of the data array");
        }
        int i3 = -1;
        CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b2 = bArr[i2];
            int i4 = i2 + 1;
            if (((b2 >> 6) & 3) != 3) {
                if (b2 == 0) {
                    break;
                }
                i2 = i4 + b2;
                if (i2 < length) {
                    try {
                        sb.append(newDecoder.decode(ByteBuffer.wrap(bArr, i4, b2)).toString());
                        sb.append(".");
                    } catch (CharacterCodingException unused) {
                        throw new UnknownHostException("failed to parse canonical name");
                    }
                } else {
                    throw new UnknownHostException("failed to parse canonical name");
                }
            } else {
                int i5 = (b2 & 63) << 8;
                if (i4 < length) {
                    i3 = i5 + bArr[i4];
                } else {
                    throw new UnknownHostException("offset is outside of the data array, when getting a pointer");
                }
            }
        }
        return new Pair(sb, Integer.valueOf(i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0216, code lost:
        if (r4.getMessage().contains("libcore.io.ErrnoException: connect failed: EINVAL") == false) goto L_0x0218;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0226 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(java.lang.String r19, int r20) {
        /*
            r12 = 20000(0x4e20, float:2.8026E-41)
            java.lang.String r11 = " ms timeout"
            java.lang.String r10 = " with "
            java.lang.String r9 = "timed out while querying "
            java.lang.String r8 = "querying "
            java.lang.String r7 = " for "
            r1 = 2
            r0 = r20
            if (r0 >= r1) goto L_0x0256
            java.lang.String r4 = "\\."
            r3 = r19
            java.lang.String[] r0 = r3.split(r4)
            r1 = 1
            X.4ME[] r13 = new X.AnonymousClass4ME[r1]
            r6 = 0
            X.3B6 r5 = X.AnonymousClass3B6.A01(r0)
            int r0 = r5.A00
            int r2 = r0 + 4
            X.4ME r0 = new X.4ME
            r0.<init>(r5, r2, r1, r1)
            r13[r6] = r0
            X.3Bs r18 = X.C62123Bs.A01(r13)
            byte[] r13 = r18.A05()
            r2 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r2]
            r19 = r0
            java.net.DatagramPacket r6 = new java.net.DatagramPacket
            r6.<init>(r0, r2)
            boolean r0 = X.C41971wz.A09()
            r17 = r0 ^ 1
            if (r17 == 0) goto L_0x0072
            java.lang.String[] r0 = r3.split(r4)
            r15 = 1
            X.4ME[] r14 = new X.AnonymousClass4ME[r1]
            r16 = 0
            X.3B6 r5 = X.AnonymousClass3B6.A01(r0)
            r4 = 28
            int r0 = r5.A00
            int r1 = r0 + 4
            X.4ME r0 = new X.4ME
            r0.<init>(r5, r1, r4, r15)
            r14[r16] = r0
            X.3Bs r5 = X.C62123Bs.A01(r14)
            byte[] r14 = r5.A05()
            byte[] r4 = new byte[r2]
            java.net.DatagramPacket r1 = new java.net.DatagramPacket
            r1.<init>(r4, r2)
            goto L_0x0076
        L_0x0072:
            r1 = 0
            r4 = 0
            r14 = 0
            r5 = 0
        L_0x0076:
            java.net.DatagramSocket r2 = new java.net.DatagramSocket     // Catch:{ IOException -> 0x0227 }
            r2.<init>()     // Catch:{ IOException -> 0x0227 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.<init>()     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.append(r8)     // Catch:{ InterruptedIOException -> 0x00c4 }
            java.net.InetSocketAddress r15 = A00     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.append(r15)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.append(r7)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.append(r3)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.append(r10)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.append(r12)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.append(r11)     // Catch:{ InterruptedIOException -> 0x00c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedIOException -> 0x00c4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r2.connect(r15)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x00c4 }
            int r15 = r13.length     // Catch:{ InterruptedIOException -> 0x00c4 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.<init>(r13, r15)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r2.send(r0)     // Catch:{ InterruptedIOException -> 0x00c4 }
            if (r17 == 0) goto L_0x00c0
            X.AnonymousClass00B.A06(r14)     // Catch:{ InterruptedIOException -> 0x00c4 }
            int r15 = r14.length     // Catch:{ InterruptedIOException -> 0x00c4 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x00c4 }
            r0.<init>(r14, r15)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r2.send(r0)     // Catch:{ InterruptedIOException -> 0x00c4 }
            r2.receive(r1)     // Catch:{ InterruptedIOException -> 0x00c4 }
        L_0x00c0:
            r2.receive(r6)     // Catch:{ InterruptedIOException -> 0x00c4 }
            goto L_0x012f
        L_0x00c4:
            r16 = move-exception
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0222 }
            r15.<init>()     // Catch:{ all -> 0x0222 }
            r15.append(r9)     // Catch:{ all -> 0x0222 }
            java.net.InetSocketAddress r0 = A00     // Catch:{ all -> 0x0222 }
            r15.append(r0)     // Catch:{ all -> 0x0222 }
            r15.append(r7)     // Catch:{ all -> 0x0222 }
            r15.append(r3)     // Catch:{ all -> 0x0222 }
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x0222 }
            r0 = r16
            com.whatsapp.util.Log.i(r15, r0)     // Catch:{ all -> 0x0222 }
            r2.disconnect()     // Catch:{ AssertionError -> 0x01f0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.<init>()     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.append(r8)     // Catch:{ InterruptedIOException -> 0x01bd }
            java.net.InetSocketAddress r8 = A01     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.append(r8)     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.append(r7)     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.append(r3)     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.append(r10)     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.append(r12)     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.append(r11)     // Catch:{ InterruptedIOException -> 0x01bd }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedIOException -> 0x01bd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedIOException -> 0x01bd }
            r2.connect(r8)     // Catch:{ InterruptedIOException -> 0x01bd }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x01bd }
            X.AnonymousClass00B.A06(r13)     // Catch:{ InterruptedIOException -> 0x01bd }
            int r8 = r13.length     // Catch:{ InterruptedIOException -> 0x01bd }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.<init>(r13, r8)     // Catch:{ InterruptedIOException -> 0x01bd }
            r2.send(r0)     // Catch:{ InterruptedIOException -> 0x01bd }
            if (r17 == 0) goto L_0x012c
            X.AnonymousClass00B.A06(r14)     // Catch:{ InterruptedIOException -> 0x01bd }
            int r8 = r14.length     // Catch:{ InterruptedIOException -> 0x01bd }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x01bd }
            r0.<init>(r14, r8)     // Catch:{ InterruptedIOException -> 0x01bd }
            r2.send(r0)     // Catch:{ InterruptedIOException -> 0x01bd }
            r2.receive(r1)     // Catch:{ InterruptedIOException -> 0x01bd }
        L_0x012c:
            r2.receive(r6)     // Catch:{ InterruptedIOException -> 0x01bd }
        L_0x012f:
            r2.close()     // Catch:{ IOException -> 0x0227 }
            X.3Bs r7 = X.C62123Bs.A00(r19)
            if (r17 == 0) goto L_0x01a7
            X.3Bs r6 = X.C62123Bs.A00(r4)
        L_0x013c:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0 = r18
            X.4P2 r0 = r0.A01
            short r1 = r0.A01
            X.4P2 r0 = r7.A01
            short r2 = r0.A01
            if (r2 != r1) goto L_0x019c
            r12 = r19
            r9 = r7
        L_0x0150:
            r8 = r18
            r10 = r3
            r13 = r20
            A02(r8, r9, r10, r11, r12, r13)
        L_0x0158:
            if (r17 == 0) goto L_0x0178
            X.AnonymousClass00B.A06(r5)
            X.4P2 r0 = r5.A01
            short r1 = r0.A01
            if (r2 == r1) goto L_0x016e
            if (r6 == 0) goto L_0x0178
            X.4P2 r0 = r6.A01
            short r0 = r0.A01
            if (r0 != r1) goto L_0x0178
            r19 = r4
            r7 = r6
        L_0x016e:
            r1 = r5
            r2 = r7
            r4 = r11
            r5 = r19
            r6 = r20
            A02(r1, r2, r3, r4, r5, r6)
        L_0x0178:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = "resolved "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r11.size()
            r1.append(r0)
            java.lang.String r0 = " addresses using backup DNS for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r11
        L_0x019c:
            if (r6 == 0) goto L_0x0158
            X.4P2 r0 = r6.A01
            short r0 = r0.A01
            if (r0 != r1) goto L_0x0158
            r12 = r4
            r9 = r6
            goto L_0x0150
        L_0x01a7:
            r6 = 0
            goto L_0x013c
        L_0x01a9:
            java.lang.String r1 = "no addresses found for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        L_0x01bd:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0222 }
            r1.<init>()     // Catch:{ all -> 0x0222 }
            r1.append(r9)     // Catch:{ all -> 0x0222 }
            java.net.InetSocketAddress r0 = A01     // Catch:{ all -> 0x0222 }
            r1.append(r0)     // Catch:{ all -> 0x0222 }
            r1.append(r7)     // Catch:{ all -> 0x0222 }
            r1.append(r3)     // Catch:{ all -> 0x0222 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0222 }
            com.whatsapp.util.Log.i(r0, r4)     // Catch:{ all -> 0x0222 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0222 }
            r1.<init>()     // Catch:{ all -> 0x0222 }
            java.lang.String r0 = "timeout while trying to resolve "
            r1.append(r0)     // Catch:{ all -> 0x0222 }
            r1.append(r3)     // Catch:{ all -> 0x0222 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0222 }
            java.net.UnknownHostException r1 = new java.net.UnknownHostException     // Catch:{ all -> 0x0222 }
            r1.<init>(r0)     // Catch:{ all -> 0x0222 }
            goto L_0x0220
        L_0x01f0:
            r4 = move-exception
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0222 }
            java.lang.String r0 = "RIM"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x0218
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0222 }
            r0 = 17
            if (r1 < r0) goto L_0x0218
            r0 = 19
            if (r1 > r0) goto L_0x0218
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x0222 }
            if (r0 == 0) goto L_0x0218
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x0222 }
            java.lang.String r0 = "libcore.io.ErrnoException: connect failed: EINVAL"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x0222 }
            r0 = 1
            if (r1 != 0) goto L_0x0219
        L_0x0218:
            r0 = 0
        L_0x0219:
            if (r0 == 0) goto L_0x0221
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0222 }
            r1.<init>(r4)     // Catch:{ all -> 0x0222 }
        L_0x0220:
            throw r1     // Catch:{ all -> 0x0222 }
        L_0x0221:
            throw r4     // Catch:{ all -> 0x0222 }
        L_0x0222:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0226 }
        L_0x0226:
            throw r0     // Catch:{ IOException -> 0x0227 }
        L_0x0227:
            r2 = move-exception
            java.lang.String r0 = "unexpected IOException "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " while trying to resolve "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w(r0, r2)
            java.lang.String r1 = "ioexception while trying to resolve "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        L_0x0256:
            java.lang.String r1 = "failed to resolve cnames"
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35781mU.A01(java.lang.String, int):java.util.List");
    }

    public static void A02(C62123Bs r15, C62123Bs r16, String str, List list, byte[] bArr, int i2) {
        short length;
        C62123Bs r12 = r16;
        AnonymousClass4P2 r2 = r12.A01;
        String str2 = str;
        if (r2.A01 != r15.A01.A01) {
            StringBuilder sb = new StringBuilder("received response with unexpected id while trying to resolve ");
            sb.append(str2);
            throw new UnknownHostException(sb.toString());
        } else if (!r2.A0A) {
            StringBuilder sb2 = new StringBuilder("did not receive response from server while trying to resolve ");
            sb2.append(str2);
            throw new UnknownHostException(sb2.toString());
        } else if (r2.A0B) {
            StringBuilder sb3 = new StringBuilder("received truncated response while trying to resolve ");
            sb3.append(str2);
            throw new UnknownHostException(sb3.toString());
        } else if (r2.A06 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C85184Nl r9 = null;
            int i3 = 0;
            while (true) {
                C85184Nl[] r1 = r12.A02;
                List list2 = list;
                if (i3 < r1.length) {
                    C85184Nl r14 = r1[i3];
                    if (r14.A03 == 1) {
                        if (r14.A04 == 5) {
                            r9 = r14;
                        } else if (r14.A04 != 1 && r14.A04 != 28) {
                            StringBuilder sb4 = new StringBuilder("unexpected type returned while trying to resolve ");
                            sb4.append(str2);
                            throw new UnknownHostException(sb4.toString());
                        } else if (r14.A04 == 1 && ((short) r14.A05.length) != 4) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("unexpected record length returned while trying to resolve ");
                            sb5.append(str2);
                            throw new UnknownHostException(sb5.toString());
                        } else if (r14.A04 != 28 || (length = (short) r14.A05.length) == 16) {
                            AnonymousClass3B6 r13 = r14.A02;
                            StringBuilder sb6 = new StringBuilder();
                            for (String append : r13.A02) {
                                sb6.append(append);
                                sb6.append(FilenameUtils.EXTENSION_SEPARATOR);
                            }
                            short s2 = r13.A01;
                            if (s2 != 0) {
                                for (String append2 : AnonymousClass3B6.A00(r12.A00, s2).A02) {
                                    sb6.append(append2);
                                    sb6.append(FilenameUtils.EXTENSION_SEPARATOR);
                                }
                            }
                            if (sb6.length() > 0) {
                                sb6.setLength(sb6.length() - 1);
                            }
                            list2.add(new C35791mV(InetAddress.getByAddress(sb6.toString(), r14.A05), (((long) r14.A01) * 1000) + currentTimeMillis));
                            list2.get(list2.size() - 1);
                        } else {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("unexpected record length returned while trying to resolve ");
                            sb7.append(str2);
                            sb7.append(" ");
                            sb7.append(length);
                            throw new UnknownHostException(sb7.toString());
                        }
                        i3++;
                    } else {
                        StringBuilder sb8 = new StringBuilder("unexpected class returned while trying to resolve ");
                        sb8.append(str2);
                        throw new UnknownHostException(sb8.toString());
                    }
                } else if (list2.isEmpty() && r9 != null) {
                    Pair A002 = A00(r9.A05, 0);
                    StringBuilder sb9 = (StringBuilder) A002.first;
                    int intValue = ((Number) A002.second).intValue();
                    if (intValue != -1) {
                        sb9.append((CharSequence) A00(bArr, intValue).first);
                    }
                    String obj = sb9.toString();
                    if (!obj.equals(str2)) {
                        list2.addAll(A01(obj, i2 + 1));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        } else {
            StringBuilder sb10 = new StringBuilder("error code was set in response while trying to resolve ");
            sb10.append(str2);
            throw new UnknownHostException(sb10.toString());
        }
    }
}
