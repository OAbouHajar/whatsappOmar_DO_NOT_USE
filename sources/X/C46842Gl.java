package X;

import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.2Gl  reason: invalid class name and case insensitive filesystem */
public class C46842Gl {
    public final C16300so A00;
    public final C14710pd A01;
    public final C46822Gj A02;
    public final C46852Gm A03;

    public C46842Gl(C16300so r1, C14710pd r2, C46822Gj r3, C46852Gm r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static void A00(OutputStream outputStream, int i2) {
        if (i2 < 0 || i2 >= 256) {
            StringBuilder sb = new StringBuilder("value out of range; value=");
            sb.append(i2);
            throw new IOException(sb.toString());
        }
        outputStream.write(i2 & MotionEventCompat.ACTION_MASK);
    }

    public static void A01(OutputStream outputStream, int i2) {
        int i3 = 0;
        if (i2 != 0) {
            if (i2 < 256) {
                outputStream.write(248);
                A00(outputStream, i2);
                return;
            } else if (i2 < 65536) {
                outputStream.write(249);
                outputStream.write((65280 & i2) >> 8);
                i3 = i2 & MotionEventCompat.ACTION_MASK;
            } else {
                StringBuilder sb = new StringBuilder("list too long; count=");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
        }
        outputStream.write(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if ((r5 % 2) != r9) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        r4 = r4 - r9;
        r3[r4] = (byte) (r3[r4] | 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ac, code lost:
        r10.write(r6);
        r10.write(((r5 & 1) << 7) | r3.length);
        r11 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.io.OutputStream r10, byte[] r11, boolean r12) {
        /*
            int r5 = r11.length
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r5 < r0) goto L_0x002c
            r0 = 254(0xfe, float:3.56E-43)
            r10.write(r0)
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            r0 = r0 & r5
            int r0 = r0 >> 24
            r10.write(r0)
            r0 = 16711680(0xff0000, float:2.3418052E-38)
        L_0x0014:
            r0 = r0 & r5
            int r0 = r0 >> 16
            r10.write(r0)
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r5
            int r0 = r0 >> 8
            r10.write(r0)
            r0 = r5 & 255(0xff, float:3.57E-43)
            r10.write(r0)
        L_0x0028:
            r10.write(r11)
            return
        L_0x002c:
            r0 = 256(0x100, float:3.59E-43)
            if (r5 < r0) goto L_0x0038
            r0 = 253(0xfd, float:3.55E-43)
            r10.write(r0)
            r0 = 983040(0xf0000, float:1.377532E-39)
            goto L_0x0014
        L_0x0038:
            if (r12 == 0) goto L_0x005f
            r6 = 255(0xff, float:3.57E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r5 >= r0) goto L_0x005f
            int r0 = r5 + 1
            int r4 = r0 >> 1
            byte[] r3 = new byte[r4]
            r8 = 0
        L_0x0047:
            r9 = 1
            if (r8 >= r5) goto L_0x00a0
            byte r0 = r11[r8]
            switch(r0) {
                case 45: goto L_0x0087;
                case 46: goto L_0x0087;
                case 47: goto L_0x004f;
                case 48: goto L_0x0084;
                case 49: goto L_0x0084;
                case 50: goto L_0x0084;
                case 51: goto L_0x0084;
                case 52: goto L_0x0084;
                case 53: goto L_0x0084;
                case 54: goto L_0x0084;
                case 55: goto L_0x0084;
                case 56: goto L_0x0084;
                case 57: goto L_0x0084;
                default: goto L_0x004f;
            }
        L_0x004f:
            r6 = 251(0xfb, float:3.52E-43)
            byte[] r3 = new byte[r4]
            r8 = 0
        L_0x0054:
            r9 = 1
            if (r8 >= r5) goto L_0x00a0
            byte r0 = r11[r8]
            switch(r0) {
                case 48: goto L_0x0068;
                case 49: goto L_0x0068;
                case 50: goto L_0x0068;
                case 51: goto L_0x0068;
                case 52: goto L_0x0068;
                case 53: goto L_0x0068;
                case 54: goto L_0x0068;
                case 55: goto L_0x0068;
                case 56: goto L_0x0068;
                case 57: goto L_0x0068;
                default: goto L_0x005c;
            }
        L_0x005c:
            switch(r0) {
                case 65: goto L_0x006b;
                case 66: goto L_0x006b;
                case 67: goto L_0x006b;
                case 68: goto L_0x006b;
                case 69: goto L_0x006b;
                case 70: goto L_0x006b;
                default: goto L_0x005f;
            }
        L_0x005f:
            r0 = 252(0xfc, float:3.53E-43)
            r10.write(r0)
            A00(r10, r5)
            goto L_0x0028
        L_0x0068:
            int r7 = r0 + -48
            goto L_0x006f
        L_0x006b:
            int r0 = r0 + -65
            int r7 = r0 + 10
        L_0x006f:
            r0 = -1
            if (r7 == r0) goto L_0x005f
            int r2 = r8 >> 1
            byte r1 = r3[r2]
            int r0 = r8 % 2
            int r9 = r9 - r0
            int r0 = r9 << 2
            int r7 = r7 << r0
            byte r0 = (byte) r7
            r0 = r0 | r1
            byte r0 = (byte) r0
            r3[r2] = r0
            int r8 = r8 + 1
            goto L_0x0054
        L_0x0084:
            int r7 = r0 + -48
            goto L_0x008b
        L_0x0087:
            int r0 = r0 + -45
            int r7 = r0 + 10
        L_0x008b:
            r0 = -1
            if (r7 == r0) goto L_0x004f
            int r2 = r8 >> 1
            byte r1 = r3[r2]
            int r0 = r8 % 2
            int r9 = r9 - r0
            int r0 = r9 << 2
            int r7 = r7 << r0
            byte r0 = (byte) r7
            r0 = r0 | r1
            byte r0 = (byte) r0
            r3[r2] = r0
            int r8 = r8 + 1
            goto L_0x0047
        L_0x00a0:
            int r0 = r5 % 2
            if (r0 != r9) goto L_0x00ac
            int r4 = r4 - r9
            byte r0 = r3[r4]
            r0 = r0 | 15
            byte r0 = (byte) r0
            r3[r4] = r0
        L_0x00ac:
            r10.write(r6)
            r0 = r5 & 1
            int r1 = r0 << 7
            int r0 = r3.length
            r1 = r1 | r0
            r10.write(r1)
            r11 = r3
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46842Gl.A02(java.io.OutputStream, byte[], boolean):void");
    }

    public final void A03(Jid jid, OutputStream outputStream) {
        int agent = jid.getAgent();
        if (agent > 0 || jid.getDevice() > 0) {
            outputStream.write(247);
            A00(outputStream, agent);
            A00(outputStream, jid.getDevice());
            A06(outputStream, jid.user, true, false);
        } else if (jid.isProtocolCompliant()) {
            outputStream.write(250);
            if (TextUtils.isEmpty(jid.user)) {
                outputStream.write((byte) 0);
            } else {
                A06(outputStream, jid.user, true, false);
            }
            A06(outputStream, jid.getServer(), false, false);
        } else {
            StringBuilder sb = new StringBuilder("frame-tree-node-writer/writeJid/failed to write jid: ");
            sb.append(jid);
            Log.e(sb.toString());
            throw new IOException("failed to write jid");
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C28371Vv r19, int r20) {
        /*
            r18 = this;
            r0 = r20 & 1
            r8 = 1
            r4 = 0
            r11 = 0
            if (r0 == 0) goto L_0x0008
            r11 = 1
        L_0x0008:
            r7 = 2
            r0 = r20 & 2
            r2 = 0
            if (r0 == 0) goto L_0x000f
            r2 = 1
        L_0x000f:
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r1)
            if (r2 != 0) goto L_0x001b
            r0.write(r4)
        L_0x001b:
            r5 = r18
            r3 = r19
            r5.A05(r3, r0)
            byte[] r14 = r0.toByteArray()
            if (r2 == 0) goto L_0x005c
            int r6 = r14.length
            byte[] r0 = new byte[r8]
            r0[r4] = r7
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0055 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0055 }
            java.util.zip.DeflaterOutputStream r1 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0050 }
            r1.<init>(r2)     // Catch:{ all -> 0x0050 }
            r2.write(r0)     // Catch:{ all -> 0x004b }
            r1.write(r14, r4, r6)     // Catch:{ all -> 0x004b }
            r1.close()     // Catch:{ all -> 0x004b }
            byte[] r14 = r2.toByteArray()     // Catch:{ all -> 0x004b }
            r1.close()     // Catch:{ all -> 0x0050 }
            r2.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x005c
        L_0x004b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x005c:
            int r15 = r14.length
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r15 <= r0) goto L_0x00e1
            java.lang.String r8 = ")"
            java.lang.String r7 = "(type="
            java.lang.String r10 = "null"
            java.lang.String r9 = "type"
            X.0pd r2 = r5.A01
            r1 = 1151(0x47f, float:1.613E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r2 = r3.A00     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = r3.A0N(r9, r10)     // Catch:{ Exception -> 0x00db }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db }
            r0.<init>()     // Catch:{ Exception -> 0x00db }
            r0.append(r2)     // Catch:{ Exception -> 0x00db }
            r0.append(r7)     // Catch:{ Exception -> 0x00db }
            r0.append(r1)     // Catch:{ Exception -> 0x00db }
            r0.append(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x00db }
            X.1Vv r0 = r3.A0I(r4)     // Catch:{ Exception -> 0x00db }
            if (r0 == 0) goto L_0x00ba
            java.lang.String r3 = r0.A00     // Catch:{ Exception -> 0x00db }
            java.lang.String r2 = r0.A0N(r9, r10)     // Catch:{ Exception -> 0x00db }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db }
            r1.<init>()     // Catch:{ Exception -> 0x00db }
            r1.append(r6)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch:{ Exception -> 0x00db }
            r1.append(r3)     // Catch:{ Exception -> 0x00db }
            r1.append(r7)     // Catch:{ Exception -> 0x00db }
            r1.append(r2)     // Catch:{ Exception -> 0x00db }
            r1.append(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00db }
        L_0x00ba:
            int r0 = r15 / 1024
            int r2 = r0 / 1024
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db }
            r1.<init>()     // Catch:{ Exception -> 0x00db }
            r1.append(r6)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = ", size: "
            r1.append(r0)     // Catch:{ Exception -> 0x00db }
            r1.append(r2)     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x00db }
            X.0so r2 = r5.A00     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = "message-exceed-16mb-v2"
            r0 = 1
            r2.AcB(r1, r3, r0)     // Catch:{ Exception -> 0x00db }
            goto L_0x00e1
        L_0x00db:
            r1 = move-exception
            java.lang.String r0 = "FrameTreeNodeWriter.logMessageExceeds16Mb"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e1:
            X.2Gm r2 = r5.A03
            X.2Gy r0 = r2.A01
            X.2Gz r12 = r0.A04
            java.util.concurrent.atomic.AtomicLong r0 = r0.A01
            long r16 = r0.getAndIncrement()
            byte[] r13 = new byte[r4]
            byte[] r1 = r12.A01(r13, r14, r15, r16)
            java.io.OutputStream r0 = r2.A00
            r0.write(r1)
            if (r11 == 0) goto L_0x00fd
            r0.flush()
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46842Gl.A04(X.1Vv, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6.length <= 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C28371Vv r11, java.io.OutputStream r12) {
        /*
            r10 = this;
            X.1Vv[] r6 = r11.A03
            r5 = 0
            r8 = 1
            if (r6 == 0) goto L_0x000a
            int r0 = r6.length
            r2 = 1
            if (r0 > 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            byte[] r7 = r11.A01
            if (r7 == 0) goto L_0x0027
            int r2 = r2 + 1
            if (r2 <= r8) goto L_0x0027
            java.lang.String r1 = "more than one source of inner data for node; countValues="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            X.1lL[] r4 = r11.A0Q()
            if (r4 != 0) goto L_0x0060
            r0 = 0
        L_0x002e:
            int r0 = r0 + 1
            int r0 = r0 + r2
            A01(r12, r0)
            java.lang.String r0 = r11.A00
            r10.A06(r12, r0, r5, r8)
            if (r4 == 0) goto L_0x0064
            int r9 = r4.length
            r3 = 0
        L_0x003d:
            if (r3 >= r9) goto L_0x0064
            r2 = r4[r3]
            java.lang.String r0 = r2.A02
            r10.A06(r12, r0, r5, r5)
            com.whatsapp.jid.Jid r1 = r2.A01
            byte r0 = r2.A00
            if (r8 != r0) goto L_0x005a
            if (r1 == 0) goto L_0x005a
            boolean r0 = r1.isProtocolCompliant()
            if (r0 == 0) goto L_0x005a
            r10.A03(r1, r12)
        L_0x0057:
            int r3 = r3 + 1
            goto L_0x003d
        L_0x005a:
            java.lang.String r0 = r2.A03
            r10.A06(r12, r0, r8, r8)
            goto L_0x0057
        L_0x0060:
            int r0 = r4.length
            int r0 = r0 << 1
            goto L_0x002e
        L_0x0064:
            if (r7 == 0) goto L_0x006a
            A02(r12, r7, r5)
        L_0x0069:
            return
        L_0x006a:
            if (r6 == 0) goto L_0x0069
            int r1 = r6.length
            if (r1 <= 0) goto L_0x0069
            A01(r12, r1)
        L_0x0072:
            r0 = r6[r5]
            r10.A05(r0, r12)
            int r5 = r5 + 1
            if (r5 >= r1) goto L_0x0069
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46842Gl.A05(X.1Vv, java.io.OutputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009f, code lost:
        if (r11 != null) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.io.OutputStream r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.util.Map r0 = X.AnonymousClass2H3.A00
            if (r0 != 0) goto L_0x0056
            java.lang.Class<X.2H3> r8 = X.AnonymousClass2H3.class
            monitor-enter(r8)
            java.util.Map r0 = X.AnonymousClass2H3.A00     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0055
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0052 }
            r7.<init>()     // Catch:{ all -> 0x0052 }
            r3 = 0
            r2 = 0
        L_0x0012:
            java.lang.String[] r1 = X.AnonymousClass2H2.A00     // Catch:{ all -> 0x0052 }
            int r0 = r1.length     // Catch:{ all -> 0x0052 }
            if (r2 >= r0) goto L_0x002a
            r1 = r1[r2]     // Catch:{ all -> 0x0052 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0027
            X.2H4 r0 = new X.2H4     // Catch:{ all -> 0x0052 }
            r0.<init>(r3, r2, r3)     // Catch:{ all -> 0x0052 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0052 }
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x002a:
            r6 = 0
        L_0x002b:
            java.lang.String[][] r1 = X.AnonymousClass2H2.A01     // Catch:{ all -> 0x0052 }
            int r0 = r1.length     // Catch:{ all -> 0x0052 }
            if (r6 >= r0) goto L_0x004f
            r5 = r1[r6]     // Catch:{ all -> 0x0052 }
            r4 = 0
        L_0x0033:
            int r0 = r5.length     // Catch:{ all -> 0x0052 }
            if (r4 >= r0) goto L_0x004c
            r3 = r5[r4]     // Catch:{ all -> 0x0052 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0049
            int r2 = r6 + 236
            r1 = 1
            X.2H4 r0 = new X.2H4     // Catch:{ all -> 0x0052 }
            r0.<init>(r2, r4, r1)     // Catch:{ all -> 0x0052 }
            r7.put(r3, r0)     // Catch:{ all -> 0x0052 }
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x004c:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x004f:
            X.AnonymousClass2H3.A00 = r7     // Catch:{ all -> 0x0052 }
            goto L_0x0055
        L_0x0052:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0055:
            monitor-exit(r8)
        L_0x0056:
            java.util.Map r0 = X.AnonymousClass2H3.A00
            java.lang.Object r2 = r0.get(r11)
            X.2H4 r2 = (X.AnonymousClass2H4) r2
            if (r2 != 0) goto L_0x00ad
            if (r13 == 0) goto L_0x009f
            if (r11 == 0) goto L_0x00a8
            r0 = 64
            int r1 = r11.indexOf(r0)
            r0 = 1
            if (r1 >= r0) goto L_0x009a
            java.lang.String r0 = "s.whatsapp.net"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0084
            X.1ks r1 = X.C34791ks.A00
        L_0x0078:
            if (r1 == 0) goto L_0x00a1
            boolean r0 = r1.isProtocolCompliant()
            if (r0 == 0) goto L_0x00a1
            r9.A03(r1, r10)
            return
        L_0x0084:
            java.lang.String r0 = "g.us"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x008f
            X.1l9 r1 = X.C34961l9.A00
            goto L_0x0078
        L_0x008f:
            java.lang.String r0 = "call"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00a1
            X.1lA r1 = X.C34971lA.A00
            goto L_0x0078
        L_0x009a:
            com.whatsapp.jid.Jid r1 = com.whatsapp.jid.Jid.getNullable(r11)
            goto L_0x0078
        L_0x009f:
            if (r11 == 0) goto L_0x00a8
        L_0x00a1:
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            byte[] r0 = r11.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            A02(r10, r0, r12)
            return
        L_0x00ad:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00bd
            short r1 = r2.A01
            if (r1 < 0) goto L_0x00d2
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x00d2
            byte r0 = (byte) r1
            r10.write(r0)
        L_0x00bd:
            short r1 = r2.A00
            if (r1 < 0) goto L_0x00ca
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x00ca
            byte r0 = (byte) r1
            r10.write(r0)
            return
        L_0x00ca:
            java.lang.String r1 = "invalid token"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            java.lang.String r1 = "invalid token"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46842Gl.A06(java.io.OutputStream, java.lang.String, boolean, boolean):void");
    }
}
