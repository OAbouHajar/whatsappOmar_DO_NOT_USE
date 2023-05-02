package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.36X  reason: invalid class name */
public class AnonymousClass36X extends C16690tT {
    public final C23241Ba A00;
    public final C16080sP A01;
    public final C14730pf A02;
    public final AnonymousClass1M0 A03;
    public final C16010sH A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public final boolean A07;

    public AnonymousClass36X(Context context, C14600pS r3, C23241Ba r4, C16080sP r5, C14730pf r6, AnonymousClass1M0 r7, C16010sH r8, boolean z2) {
        this.A05 = C13690nt.A0h(context);
        this.A02 = r6;
        this.A06 = C13690nt.A0h(r3);
        this.A07 = z2;
        this.A03 = r7;
        this.A01 = r5;
        this.A04 = r8;
        this.A00 = r4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:365|366|370|371|372|373) */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0379, code lost:
        r0 = r6.A06.A00.getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0383, code lost:
        r0 = r6.A06.A00.getString(com.obwhatsapp.R.string.str0657);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0530, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0532, code lost:
        r9.append(org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x06e9, code lost:
        if (r0 == false) goto L_0x06eb;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x0222 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x022b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:372:0x069d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:379:0x06a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:393:0x06c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:398:0x06cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x017e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0183 */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b6 A[Catch:{ IOException -> 0x01bd, all -> 0x021e }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0525 A[Catch:{ IOException -> 0x0629, all -> 0x0691 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0589 A[Catch:{ IOException -> 0x0629, all -> 0x0691 }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0618 A[SYNTHETIC, Splitter:B:342:0x0618] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x075b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x075c  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0776  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:151:0x0222=Splitter:B:151:0x0222, B:146:0x021a=Splitter:B:146:0x021a} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:153:0x0223=Splitter:B:153:0x0223, B:158:0x022b=Splitter:B:158:0x022b} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:367:0x0695=Splitter:B:367:0x0695, B:372:0x069d=Splitter:B:372:0x069d} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:379:0x06a6=Splitter:B:379:0x06a6, B:374:0x069e=Splitter:B:374:0x069e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r36) {
        /*
            r35 = this;
            r7 = r35
            java.lang.ref.WeakReference r0 = r7.A05
            java.lang.Object r20 = r0.get()
            r0 = r20
            android.content.Context r0 = (android.content.Context) r0
            r20 = r0
            r21 = 0
            if (r0 == 0) goto L_0x082a
            X.0sH r0 = r7.A04
            r34 = r0
            X.0rv r23 = X.C16010sH.A01(r34)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r25 = r0.toString()
            X.1M0 r6 = r7.A03
            boolean r0 = r7.A07
            r22 = r0
            r12 = 0
            X.1Zf r24 = new X.1Zf
            r0 = r24
            r0.<init>((boolean) r12)
            java.lang.String r1 = "EmailMessageStore/loadMessagesForEmail/"
            r0 = r23
            java.lang.String r1 = X.AnonymousClass000.A0g(r1, r0)
            r0 = r24
            r0.A04(r1)
            X.0sb r8 = r6.A00
            r0 = r25
            java.io.File r5 = r8.A0I(r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            r3 = 0
            r2 = 40000(0x9c40, float:5.6052E-41)
            if (r22 == 0) goto L_0x0051
            r2 = 10000(0x2710, float:1.4013E-41)
        L_0x0051:
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.0tq r0 = r6.A0A     // Catch:{ SQLiteException -> 0x022c }
            X.0tf r33 = r0.get()     // Catch:{ SQLiteException -> 0x022c }
            r0 = r33
            X.0tg r11 = r0.A02     // Catch:{ all -> 0x0227 }
            java.lang.String r10 = X.AnonymousClass1WW.A08     // Catch:{ all -> 0x0227 }
            r0 = 2
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0227 }
            X.0ts r1 = r6.A08     // Catch:{ all -> 0x0227 }
            r0 = r23
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x0227 }
            X.C13700nu.A0e(r9, r12, r0)     // Catch:{ all -> 0x0227 }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0227 }
            r0 = 1
            r9[r0] = r1     // Catch:{ all -> 0x0227 }
            android.database.Cursor r11 = r11.A08(r10, r9)     // Catch:{ all -> 0x0227 }
            if (r11 == 0) goto L_0x0223
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x021a
            java.util.HashSet r10 = X.C13680ns.A0o()     // Catch:{ all -> 0x021e }
            r16 = 0
            r9 = 0
        L_0x008a:
            X.0t6 r1 = r6.A09     // Catch:{ all -> 0x021e }
            r0 = r23
            X.0tZ r12 = r1.A0G(r11, r0)     // Catch:{ all -> 0x021e }
            if (r12 == 0) goto L_0x0212
            int r9 = r9 + 1
            r0 = 128(0x80, double:6.32E-322)
            long r16 = r16 + r0
            byte r1 = r12.A10     // Catch:{ all -> 0x021e }
            r0 = 1
            r32 = 0
            r30 = 0
            if (r1 == r0) goto L_0x0193
            r0 = 2
            if (r1 == r0) goto L_0x0193
            r0 = 3
            if (r1 == r0) goto L_0x0193
            r0 = 4
            if (r1 == r0) goto L_0x00e2
            r0 = 9
            if (r1 == r0) goto L_0x0193
            r0 = 20
            if (r1 == r0) goto L_0x0193
            r0 = 23
            if (r1 == r0) goto L_0x0193
            r0 = 37
            if (r1 == r0) goto L_0x0193
            r0 = 13
            if (r1 == r0) goto L_0x0193
            r0 = 14
            if (r1 == r0) goto L_0x00e2
            r0 = 25
            if (r1 == r0) goto L_0x0193
            r0 = 26
            if (r1 == r0) goto L_0x0193
            r0 = 28
            if (r1 == r0) goto L_0x0193
            r0 = 29
            if (r1 == r0) goto L_0x0193
            boolean r0 = r12.A0w()     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x01c3
            byte[] r0 = r12.A11()     // Catch:{ all -> 0x021e }
            int r0 = r0.length     // Catch:{ all -> 0x021e }
            long r0 = (long) r0     // Catch:{ all -> 0x021e }
            goto L_0x01ba
        L_0x00e2:
            boolean r15 = r12 instanceof X.C38741rL     // Catch:{ all -> 0x021e }
            if (r15 == 0) goto L_0x0127
            r0 = r12
            X.1rL r0 = (X.C38741rL) r0     // Catch:{ all -> 0x021e }
            java.lang.String r14 = r0.A00     // Catch:{ all -> 0x021e }
        L_0x00eb:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x021e }
            java.lang.String r1 = ""
            if (r14 == 0) goto L_0x00f9
            java.lang.String r0 = "[?:\\/*\"<>|\\x00-\\x1F]"
            java.lang.String r1 = r14.replaceAll(r0, r1)     // Catch:{ all -> 0x021e }
        L_0x00f9:
            r13.append(r1)     // Catch:{ all -> 0x021e }
            java.lang.String r0 = ".vcf"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r13)     // Catch:{ all -> 0x021e }
            java.io.File r13 = r8.A0N(r0)     // Catch:{ all -> 0x021e }
            boolean r0 = r13.exists()     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x0120
            long r28 = r13.lastModified()     // Catch:{ all -> 0x021e }
            long r26 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x021e }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r26 = r26 - r0
            int r0 = (r28 > r26 ? 1 : (r28 == r26 ? 0 : -1))
            if (r0 >= 0) goto L_0x0120
            X.AnonymousClass1XI.A0N(r13)     // Catch:{ all -> 0x021e }
        L_0x0120:
            boolean r0 = r13.exists()     // Catch:{ all -> 0x021e }
            if (r0 != 0) goto L_0x018a
            goto L_0x0134
        L_0x0127:
            boolean r0 = r12 instanceof X.C38811rS     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x0131
            r0 = r12
            X.1rS r0 = (X.C38811rS) r0     // Catch:{ all -> 0x021e }
            java.lang.String r14 = r0.A00     // Catch:{ all -> 0x021e }
            goto L_0x00eb
        L_0x0131:
            r14 = r21
            goto L_0x00eb
        L_0x0134:
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0184 }
            r14.<init>(r13)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x017f }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x017f }
            r1.<init>(r14, r0)     // Catch:{ all -> 0x017f }
            if (r15 == 0) goto L_0x0143
            goto L_0x0160
        L_0x0143:
            boolean r0 = r12 instanceof X.C38811rS     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0170
            r0 = r12
            X.1rS r0 = (X.C38811rS) r0     // Catch:{ all -> 0x017a }
            java.util.List r0 = r0.A12()     // Catch:{ all -> 0x017a }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x017a }
        L_0x0152:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = X.AnonymousClass000.A0m(r15)     // Catch:{ all -> 0x017a }
            r1.write(r0)     // Catch:{ all -> 0x017a }
            goto L_0x0152
        L_0x0160:
            r0 = r12
            X.1rL r0 = (X.C38741rL) r0     // Catch:{ all -> 0x017a }
            java.lang.String r15 = r0.A12()     // Catch:{ all -> 0x017a }
            if (r15 == 0) goto L_0x0143
            java.lang.String r0 = r0.A12()     // Catch:{ all -> 0x017a }
            r1.write(r0)     // Catch:{ all -> 0x017a }
        L_0x0170:
            r1.flush()     // Catch:{ all -> 0x017a }
            r1.close()     // Catch:{ all -> 0x017f }
            r14.close()     // Catch:{ IOException -> 0x0184 }
            goto L_0x018a
        L_0x017a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x017e }
        L_0x017e:
            throw r0     // Catch:{ all -> 0x017f }
        L_0x017f:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0183 }
        L_0x0183:
            throw r0     // Catch:{ IOException -> 0x0184 }
        L_0x0184:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getExportChatMessagesFile/vcard-msgs/write-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021e }
        L_0x018a:
            boolean r0 = r4.contains(r13)     // Catch:{ all -> 0x021e }
            if (r0 != 0) goto L_0x01c3
            r32 = r13
            goto L_0x01b0
        L_0x0193:
            if (r22 == 0) goto L_0x01c3
            boolean r0 = r12 instanceof X.C16730tY     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x01c3
            r0 = r12
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x021e }
            X.0ta r0 = r0.A02     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x01c3
            java.io.File r1 = r0.A0F     // Catch:{ all -> 0x021e }
            if (r1 == 0) goto L_0x01c3
            boolean r0 = r0.A0P     // Catch:{ IOException -> 0x01bd }
            if (r0 != 0) goto L_0x01ae
            boolean r0 = r8.A0T(r1)     // Catch:{ IOException -> 0x01bd }
            if (r0 == 0) goto L_0x01c3
        L_0x01ae:
            r32 = r1
        L_0x01b0:
            boolean r0 = r32.exists()     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x01c3
            long r0 = r32.length()     // Catch:{ all -> 0x021e }
        L_0x01ba:
            long r30 = r30 + r0
            goto L_0x01c3
        L_0x01bd:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getExportChatMessagesFile/unexpected exception"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x021e }
        L_0x01c3:
            java.lang.Long r1 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x021e }
            X.01Q r13 = new X.01Q     // Catch:{ all -> 0x021e }
            r0 = r32
            r13.<init>(r0, r1)     // Catch:{ all -> 0x021e }
            java.lang.Object r1 = r13.A00     // Catch:{ all -> 0x021e }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x021e }
            java.lang.Object r0 = r13.A01     // Catch:{ all -> 0x021e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x021e }
            long r13 = r0.longValue()     // Catch:{ all -> 0x021e }
            long r16 = r16 + r13
            if (r9 >= r2) goto L_0x021a
            r13 = 15000000(0xe4e1c0, double:7.4109847E-317)
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x021a
            java.lang.String r0 = "_id"
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x021e }
            long r18 = r11.getLong(r0)     // Catch:{ all -> 0x021e }
            if (r1 == 0) goto L_0x0212
            boolean r0 = r1.exists()     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x0212
            boolean r0 = r10.contains(r1)     // Catch:{ all -> 0x021e }
            if (r0 != 0) goto L_0x0212
            r4.add(r3, r1)     // Catch:{ all -> 0x021e }
            r10.add(r1)     // Catch:{ all -> 0x021e }
            boolean r0 = r12 instanceof X.C16730tY     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x0212
            X.0tY r12 = (X.C16730tY) r12     // Catch:{ all -> 0x021e }
            X.0ta r0 = r12.A02     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x0212
            boolean r0 = r0.A0Z     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x0212
            goto L_0x0219
        L_0x0212:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x021e }
            if (r0 != 0) goto L_0x008a
            goto L_0x021a
        L_0x0219:
            r3 = 2
        L_0x021a:
            r11.close()     // Catch:{ all -> 0x0227 }
            goto L_0x0223
        L_0x021e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0222 }
        L_0x0222:
            throw r0     // Catch:{ all -> 0x0227 }
        L_0x0223:
            r33.close()     // Catch:{ SQLiteException -> 0x022c }
            goto L_0x0232
        L_0x0227:
            r0 = move-exception
            r33.close()     // Catch:{ all -> 0x022b }
        L_0x022b:
            throw r0     // Catch:{ SQLiteException -> 0x022c }
        L_0x022c:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getStartIdAndCollectFiles/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0232:
            r1 = 2
            if (r3 == r1) goto L_0x06ec
            java.io.FileOutputStream r26 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x06ce, IOException -> 0x06db }
            r0 = r26
            r0.<init>(r5)     // Catch:{ FileNotFoundException -> 0x06ce, IOException -> 0x06db }
            java.lang.String r2 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x06c9 }
            java.io.OutputStreamWriter r27 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x06c9 }
            r1 = r27
            r1.<init>(r0, r2)     // Catch:{ all -> 0x06c9 }
            r3 = 0
            r16 = 0
            X.0tq r0 = r6.A0A     // Catch:{ SQLiteException -> 0x06a7 }
            X.0tf r29 = r0.get()     // Catch:{ SQLiteException -> 0x06a7 }
            r0 = r29
            X.0tg r9 = r0.A02     // Catch:{ all -> 0x06a2 }
            java.lang.String r8 = X.AnonymousClass1WW.A09     // Catch:{ all -> 0x06a2 }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x06a2 }
            X.0ts r1 = r6.A08     // Catch:{ all -> 0x06a2 }
            r0 = r23
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x06a2 }
            X.C13700nu.A0e(r2, r3, r0)     // Catch:{ all -> 0x06a2 }
            java.lang.String r1 = java.lang.Long.toString(r18)     // Catch:{ all -> 0x06a2 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x06a2 }
            android.database.Cursor r31 = r9.A08(r8, r2)     // Catch:{ all -> 0x06a2 }
            if (r31 == 0) goto L_0x069e
            boolean r0 = r31.moveToFirst()     // Catch:{ all -> 0x0699 }
            if (r0 == 0) goto L_0x0695
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0699 }
            r30 = 0
        L_0x027b:
            X.0t6 r1 = r6.A09     // Catch:{ all -> 0x0691 }
            r0 = r31
            r2 = r23
            X.0tZ r8 = r1.A0G(r0, r2)     // Catch:{ all -> 0x0691 }
            if (r8 == 0) goto L_0x0688
            int r30 = r30 + 1
            boolean r11 = X.C16030sJ.A0L(r23)     // Catch:{ all -> 0x0691 }
            X.013 r2 = r6.A07     // Catch:{ all -> 0x0691 }
            X.0t3 r10 = r6.A05     // Catch:{ all -> 0x0691 }
            long r0 = r8.A0I     // Catch:{ all -> 0x0691 }
            long r0 = r10.A02(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r10 = X.C28891Zc.A05(r2, r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.C47672Jx.A00(r2, r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.C42681yF.A05(r2, r10, r0)     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = " - "
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            boolean r0 = X.C38621r6.A0p(r8)     // Catch:{ all -> 0x0691 }
            if (r0 != 0) goto L_0x02c5
            X.1Vw r0 = r8.A11     // Catch:{ all -> 0x0691 }
            boolean r1 = r0.A02     // Catch:{ all -> 0x0691 }
            if (r1 == 0) goto L_0x063c
            X.0sK r0 = r6.A01     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.A07()     // Catch:{ all -> 0x0691 }
        L_0x02bd:
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = ": "
            r9.append(r0)     // Catch:{ all -> 0x0691 }
        L_0x02c5:
            byte r13 = r8.A10     // Catch:{ all -> 0x0691 }
            java.lang.String r12 = "\n"
            r1 = 1
            r18 = 0
            if (r13 == r1) goto L_0x04e3
            r0 = 2
            if (r13 == r0) goto L_0x04e3
            r0 = 3
            if (r13 == r0) goto L_0x04e3
            r0 = 4
            if (r13 == r0) goto L_0x04a7
            r0 = 5
            if (r13 == r0) goto L_0x0468
            r0 = 20
            if (r13 == r0) goto L_0x04e3
            r0 = 21
            if (r13 == r0) goto L_0x044b
            r0 = 23
            if (r13 == r0) goto L_0x04e3
            r0 = 52
            if (r13 == r0) goto L_0x043c
            r0 = 57
            if (r13 == r0) goto L_0x043c
            r0 = 66
            if (r13 == r0) goto L_0x03d7
            r0 = 25
            if (r13 == r0) goto L_0x04e3
            r0 = 26
            if (r13 == r0) goto L_0x04e3
            r0 = 36
            if (r13 == r0) goto L_0x03b7
            r0 = 37
            if (r13 == r0) goto L_0x04e3
            r0 = 44
            if (r13 == r0) goto L_0x0390
            r0 = 45
            if (r13 == r0) goto L_0x043c
            r0 = 54
            if (r13 == r0) goto L_0x043c
            r0 = 55
            if (r13 == r0) goto L_0x043c
            r0 = 62
            if (r13 == r0) goto L_0x043c
            r0 = 63
            if (r13 == r0) goto L_0x043c
            switch(r13) {
                case 9: goto L_0x04e3;
                case 10: goto L_0x035d;
                case 11: goto L_0x0383;
                case 12: goto L_0x0343;
                case 13: goto L_0x04e3;
                case 14: goto L_0x04a7;
                case 15: goto L_0x0350;
                case 16: goto L_0x032c;
                default: goto L_0x031d;
            }     // Catch:{ all -> 0x0691 }
        L_0x031d:
            switch(r13) {
                case 28: goto L_0x04e3;
                case 29: goto L_0x04e3;
                case 30: goto L_0x0468;
                case 31: goto L_0x0383;
                default: goto L_0x0320;
            }     // Catch:{ all -> 0x0691 }
        L_0x0320:
            if (r13 == 0) goto L_0x0557
            r0 = 27
            if (r13 == r0) goto L_0x0557
            r0 = 32
            if (r13 == r0) goto L_0x0557
            goto L_0x054e
        L_0x032c:
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0691 }
            r0 = 2131887989(0x7f120775, float:1.94106E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            r0 = r8
            X.1rV r0 = (X.C38841rV) r0     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0577
            goto L_0x0532
        L_0x0343:
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0691 }
            r0 = 2131887602(0x7f1205f2, float:1.9409816E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x0350:
            X.1Vw r0 = r8.A11     // Catch:{ all -> 0x0691 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0691 }
            r1 = 2131891317(0x7f121475, float:1.941735E38)
            if (r0 == 0) goto L_0x0379
            r1 = 2131891318(0x7f121476, float:1.9417353E38)
            goto L_0x0379
        L_0x035d:
            r0 = r8
            X.1rO r0 = (X.C38771rO) r0     // Catch:{ all -> 0x0691 }
            int r0 = r0.A15()     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0376
            if (r0 == r1) goto L_0x0372
            r2 = 2
            r1 = 2131892820(0x7f121a54, float:1.94204E38)
            if (r0 == r2) goto L_0x0379
            r1 = 2131892680(0x7f1219c8, float:1.9420115E38)
            goto L_0x0379
        L_0x0372:
            r1 = 2131892677(0x7f1219c5, float:1.942011E38)
            goto L_0x0379
        L_0x0376:
            r1 = 2131892818(0x7f121a52, float:1.9420395E38)
        L_0x0379:
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x0383:
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0691 }
            r0 = 2131887703(0x7f120657, float:1.941002E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x0390:
            r1 = r8
            X.1rn r1 = (X.C39021rn) r1     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r1.A07     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.C47612Jr.A02(r2, r1)     // Catch:{ all -> 0x0691 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0691 }
            if (r2 != 0) goto L_0x03a8
            r9.append(r12)     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
        L_0x03a8:
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x0691 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0691 }
            if (r0 != 0) goto L_0x0577
            r9.append(r12)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x03b7:
            r11 = r8
            X.1ri r11 = (X.C38971ri) r11     // Catch:{ all -> 0x0691 }
            X.15Z r10 = r6.A02     // Catch:{ all -> 0x0691 }
            X.1Vw r2 = r8.A11     // Catch:{ all -> 0x0691 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x03d4
            X.0sK r0 = r6.A01     // Catch:{ all -> 0x0691 }
            r0.A0B()     // Catch:{ all -> 0x0691 }
            X.1ZT r2 = r0.A05     // Catch:{ all -> 0x0691 }
        L_0x03c9:
            int r0 = r11.A00     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r10.A06(r2, r0, r1)     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x0577
        L_0x03d4:
            X.0rv r2 = r2.A00     // Catch:{ all -> 0x0691 }
            goto L_0x03c9
        L_0x03d7:
            r2 = r8
            X.1s2 r2 = (X.C39171s2) r2     // Catch:{ all -> 0x0691 }
            X.0tz r14 = r6.A06     // Catch:{ all -> 0x0691 }
            r0 = 2131890917(0x7f1212e5, float:1.941654E38)
            java.lang.String r0 = r14.A02(r0)     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            r9.append(r12)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            r9.append(r12)     // Catch:{ all -> 0x0691 }
            java.util.List r0 = r2.A05     // Catch:{ all -> 0x0691 }
            java.util.Iterator r28 = r0.iterator()     // Catch:{ all -> 0x0691 }
        L_0x03f7:
            boolean r0 = r28.hasNext()     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0577
            java.lang.Object r2 = r28.next()     // Catch:{ all -> 0x0691 }
            X.1sn r2 = (X.C39631sn) r2     // Catch:{ all -> 0x0691 }
            java.lang.Object[] r15 = new java.lang.Object[r1]     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0691 }
            r15[r3] = r0     // Catch:{ all -> 0x0691 }
            r11 = 2131889815(0x7f120e97, float:1.9414304E38)
            android.content.Context r10 = r14.A00     // Catch:{ all -> 0x0691 }
            android.content.res.Resources r0 = r10.getResources()     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.getString(r11, r15)     // Catch:{ all -> 0x0691 }
            X.C13700nu.A0a(r9, r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = "("
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            android.content.res.Resources r11 = r10.getResources()     // Catch:{ all -> 0x0691 }
            r10 = 2131755235(0x7f1000e3, float:1.9141344E38)
            int r2 = r2.A00     // Catch:{ all -> 0x0691 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0691 }
            X.AnonymousClass000.A1M(r0, r2, r3)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r11.getQuantityString(r10, r2, r0)     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = ")"
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            r9.append(r12)     // Catch:{ all -> 0x0691 }
            goto L_0x03f7
        L_0x043c:
            r0 = r8
            X.0tj r0 = (X.C16840tj) r0     // Catch:{ all -> 0x0691 }
            X.1xE r0 = X.C42091xD.A01(r0)     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0577
            java.lang.String r0 = r0.A08(r2)     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x044b:
            r0 = r8
            X.1rX r0 = (X.C38861rX) r0     // Catch:{ all -> 0x0691 }
            java.lang.String r2 = r0.A00     // Catch:{ all -> 0x0691 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0691 }
            if (r0 != 0) goto L_0x0577
            X.16r r1 = r6.A0B     // Catch:{ all -> 0x0691 }
            r0 = r21
            X.1Vt r1 = r1.A0M(r2, r0)     // Catch:{ all -> 0x0691 }
            if (r1 == 0) goto L_0x0577
            X.15p r0 = r6.A0C     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.A0R(r1, r8)     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x0468:
            r15 = r8
            X.1rM r15 = (X.C38751rM) r15     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r15.A15()     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x047b
            java.lang.String r0 = r15.A15()     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            r9.append(r12)     // Catch:{ all -> 0x0691 }
        L_0x047b:
            java.lang.String r0 = r15.A02     // Catch:{ all -> 0x0691 }
            if (r0 != 0) goto L_0x0574
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r14 = r0.A00     // Catch:{ all -> 0x0691 }
            r11 = 2131887990(0x7f120776, float:1.9410603E38)
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = "https://maps.google.com/?q="
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0691 }
            double r0 = r15.A00     // Catch:{ all -> 0x0691 }
            r2.append(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = ","
            r2.append(r0)     // Catch:{ all -> 0x0691 }
            double r0 = r15.A01     // Catch:{ all -> 0x0691 }
            r2.append(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.C13680ns.A0d(r14, r0, r10, r3, r11)     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x04a7:
            boolean r0 = r8 instanceof X.C38741rL     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x04d6
            r0 = r8
            X.1rL r0 = (X.C38741rL) r0     // Catch:{ all -> 0x0691 }
            java.lang.String r11 = r0.A00     // Catch:{ all -> 0x0691 }
        L_0x04b0:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0691 }
            java.lang.String r2 = ""
            if (r11 == 0) goto L_0x04be
            java.lang.String r0 = "[?:\\/*\"<>|\\x00-\\x1F]"
            java.lang.String r2 = r11.replaceAll(r0, r2)     // Catch:{ all -> 0x0691 }
        L_0x04be:
            r10.append(r2)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = ".vcf"
            java.lang.String r11 = X.AnonymousClass000.A0h(r0, r10)     // Catch:{ all -> 0x0691 }
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r10 = r0.A00     // Catch:{ all -> 0x0691 }
            r2 = 2131887988(0x7f120774, float:1.9410599E38)
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.C13680ns.A0d(r10, r11, r0, r3, r2)     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x04d6:
            boolean r0 = r8 instanceof X.C38811rS     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x04e0
            r0 = r8
            X.1rS r0 = (X.C38811rS) r0     // Catch:{ all -> 0x0691 }
            java.lang.String r11 = r0.A00     // Catch:{ all -> 0x0691 }
            goto L_0x04b0
        L_0x04e0:
            r11 = r21
            goto L_0x04b0
        L_0x04e3:
            r11 = r8
            X.0tY r11 = (X.C16730tY) r11     // Catch:{ all -> 0x0691 }
            if (r22 == 0) goto L_0x0542
            boolean r0 = r11.A18()     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0536
            X.0ta r0 = X.C16730tY.A00(r11)     // Catch:{ all -> 0x0691 }
            java.io.File r14 = r0.A0F     // Catch:{ all -> 0x0691 }
            X.AnonymousClass00B.A06(r14)     // Catch:{ all -> 0x0691 }
            long r18 = r14.length()     // Catch:{ all -> 0x0691 }
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r10 = r0.A00     // Catch:{ all -> 0x0691 }
            r2 = 2131887988(0x7f120774, float:1.9410599E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r14.getName()     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.C13680ns.A0d(r10, r0, r1, r3, r2)     // Catch:{ all -> 0x0691 }
        L_0x050c:
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r11.A13()     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0521
            boolean r1 = X.C42551xz.A04(r11)     // Catch:{ all -> 0x0691 }
            if (r1 != 0) goto L_0x0521
            r9.append(r12)     // Catch:{ all -> 0x0691 }
        L_0x051e:
            r9.append(r0)     // Catch:{ all -> 0x0691 }
        L_0x0521:
            boolean r0 = r8 instanceof X.C38891ra     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0577
            r0 = r8
            X.1ra r0 = (X.C38891ra) r0     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.A1C()     // Catch:{ all -> 0x0691 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0691 }
            if (r1 != 0) goto L_0x0577
        L_0x0532:
            r9.append(r12)     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x0536:
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0691 }
            r0 = 2131888294(0x7f1208a6, float:1.941122E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x050c
        L_0x0542:
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0691 }
            r0 = 2131888294(0x7f1208a6, float:1.941122E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x051e
        L_0x054e:
            java.lang.String r0 = "EmailMessageStore/processmessage/type/unknown: "
            java.lang.String r0 = X.C13680ns.A0c(r13, r0)     // Catch:{ all -> 0x0691 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0691 }
        L_0x0557:
            X.1Vt r0 = r8.A0L     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0567
            X.15p r0 = r6.A0C     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.A0V(r8, r1)     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            r9.append(r12)     // Catch:{ all -> 0x0691 }
        L_0x0567:
            boolean r0 = r8 instanceof X.AnonymousClass1WU     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x05a8
            X.15Z r1 = r6.A02     // Catch:{ all -> 0x0691 }
            r0 = r8
            X.1WU r0 = (X.AnonymousClass1WU) r0     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r1.A0C(r0, r3)     // Catch:{ all -> 0x0691 }
        L_0x0574:
            r9.append(r0)     // Catch:{ all -> 0x0691 }
        L_0x0577:
            X.1sA r0 = r8.A0E()     // Catch:{ all -> 0x0691 }
            X.1sB r1 = r0.A00     // Catch:{ all -> 0x0691 }
            r0 = r21
            java.lang.String r0 = X.C42551xz.A02(r1, r0)     // Catch:{ all -> 0x0691 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0691 }
            if (r1 != 0) goto L_0x05f0
            java.lang.String r1 = r9.toString()     // Catch:{ all -> 0x0691 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0691 }
            if (r1 != 0) goto L_0x0596
            r9.append(r12)     // Catch:{ all -> 0x0691 }
        L_0x0596:
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            X.1sA r0 = r8.A0E()     // Catch:{ all -> 0x0691 }
            X.1sB r0 = r0.A00     // Catch:{ all -> 0x0691 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0691 }
            java.util.List r10 = r0.A02     // Catch:{ all -> 0x0691 }
            r9.append(r12)     // Catch:{ all -> 0x0691 }
            goto L_0x05bf
        L_0x05a8:
            boolean r0 = r8 instanceof X.C30571cb     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x05b4
            r0 = r8
            X.1cb r0 = (X.C30571cb) r0     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.A18()     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x05b4:
            int r0 = r8.A03()     // Catch:{ all -> 0x0691 }
            if (r0 == r1) goto L_0x0577
            java.lang.String r0 = r8.A0I()     // Catch:{ all -> 0x0691 }
            goto L_0x0574
        L_0x05bf:
            r14 = 0
        L_0x05c0:
            int r0 = r10.size()     // Catch:{ all -> 0x0691 }
            if (r14 >= r0) goto L_0x05f0
            int r2 = r14 + 1
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r15 = r0.A00     // Catch:{ all -> 0x0691 }
            r11 = 2131886890(0x7f12032a, float:1.9408372E38)
            java.lang.Object[] r1 = X.C13680ns.A1b()     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = ""
            java.lang.String r0 = X.C13680ns.A0c(r2, r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.C13680ns.A0d(r15, r0, r1, r3, r11)     // Catch:{ all -> 0x0691 }
            X.C13700nu.A0a(r9, r0)     // Catch:{ all -> 0x0691 }
            java.lang.Object r0 = r10.get(r14)     // Catch:{ all -> 0x0691 }
            X.1t7 r0 = (X.C39821t7) r0     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
            r9.append(r12)     // Catch:{ all -> 0x0691 }
            r14 = r2
            goto L_0x05c0
        L_0x05f0:
            if (r13 != 0) goto L_0x0610
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r8.A10(r0)     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x0610
            java.lang.String r0 = " "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0691 }
            X.0tz r1 = r6.A06     // Catch:{ all -> 0x0691 }
            r0 = 2131888295(0x7f1208a7, float:1.9411221E38)
            java.lang.String r0 = r1.A02(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ all -> 0x0691 }
            r9.append(r0)     // Catch:{ all -> 0x0691 }
        L_0x0610:
            long r16 = r16 + r18
            int r0 = r9.length()     // Catch:{ all -> 0x0691 }
            if (r0 <= 0) goto L_0x0688
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0629 }
            r0.append(r9)     // Catch:{ IOException -> 0x0629 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r12, r0)     // Catch:{ IOException -> 0x0629 }
            r0 = r27
            r0.write(r1)     // Catch:{ IOException -> 0x0629 }
            goto L_0x0681
        L_0x0629:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x067c
            boolean r0 = X.C13690nt.A1T(r1)     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x067c
            java.lang.String r0 = "loadforemail/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0691 }
            throw r1     // Catch:{ all -> 0x0691 }
        L_0x063c:
            if (r11 == 0) goto L_0x063f
            goto L_0x064a
        L_0x063f:
            X.0sP r10 = r6.A04     // Catch:{ all -> 0x0691 }
            X.0sG r1 = r6.A03     // Catch:{ all -> 0x0691 }
            X.0rv r0 = r0.A00     // Catch:{ all -> 0x0691 }
            X.0sH r0 = r1.A0A(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x0658
        L_0x064a:
            X.0rv r1 = r8.A0B()     // Catch:{ all -> 0x0691 }
            if (r1 == 0) goto L_0x065e
            X.0sP r10 = r6.A04     // Catch:{ all -> 0x0691 }
            X.0sG r0 = r6.A03     // Catch:{ all -> 0x0691 }
            X.0sH r0 = r0.A0A(r1)     // Catch:{ all -> 0x0691 }
        L_0x0658:
            java.lang.String r0 = r10.A08(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x02bd
        L_0x065e:
            java.lang.String r0 = "EmailMessageStore/appendDateTimeAndName/missing_rmt_src:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.C38621r6.A0J(r8)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0691 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0691 }
            X.0tz r0 = r6.A06     // Catch:{ all -> 0x0691 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0691 }
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x02bd
        L_0x067c:
            java.lang.String r0 = "EmailMessageStore/collectMessages/txt-msgs/write-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0691 }
        L_0x0681:
            int r0 = r9.length()     // Catch:{ all -> 0x0691 }
            r9.delete(r3, r0)     // Catch:{ all -> 0x0691 }
        L_0x0688:
            boolean r0 = r31.moveToNext()     // Catch:{ all -> 0x0691 }
            if (r0 != 0) goto L_0x027b
            r3 = r30
            goto L_0x0695
        L_0x0691:
            r0 = move-exception
            r3 = r30
            goto L_0x069a
        L_0x0695:
            r31.close()     // Catch:{ all -> 0x06a2 }
            goto L_0x069e
        L_0x0699:
            r0 = move-exception
        L_0x069a:
            r31.close()     // Catch:{ all -> 0x069d }
        L_0x069d:
            throw r0     // Catch:{ all -> 0x06a2 }
        L_0x069e:
            r29.close()     // Catch:{ SQLiteException -> 0x06a7 }
            goto L_0x06ad
        L_0x06a2:
            r0 = move-exception
            r29.close()     // Catch:{ all -> 0x06a6 }
        L_0x06a6:
            throw r0     // Catch:{ SQLiteException -> 0x06a7 }
        L_0x06a7:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/collectMessages/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x06c4 }
        L_0x06ad:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x06c4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x06c4 }
            X.01Q r2 = new X.01Q     // Catch:{ all -> 0x06c4 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x06c4 }
            r27.flush()     // Catch:{ all -> 0x06c4 }
            r27.close()     // Catch:{ all -> 0x06c9 }
            r26.close()     // Catch:{ FileNotFoundException -> 0x06ce, IOException -> 0x06db }
            goto L_0x06f2
        L_0x06c4:
            r0 = move-exception
            r27.close()     // Catch:{ all -> 0x06c8 }
        L_0x06c8:
            throw r0     // Catch:{ all -> 0x06c9 }
        L_0x06c9:
            r0 = move-exception
            r26.close()     // Catch:{ all -> 0x06cd }
        L_0x06cd:
            throw r0     // Catch:{ FileNotFoundException -> 0x06ce, IOException -> 0x06db }
        L_0x06ce:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail cannot create attachment file"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            X.4Zc r5 = new X.4Zc
            r5.<init>((int) r0)
            goto L_0x0749
        L_0x06db:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x06eb
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            r1 = 3
            if (r0 != 0) goto L_0x06ec
        L_0x06eb:
            r1 = 4
        L_0x06ec:
            X.4Zc r5 = new X.4Zc
            r5.<init>((int) r1)
            goto L_0x0749
        L_0x06f2:
            X.0t3 r0 = r6.A05
            long r0 = r0.A00()
            boolean r0 = r5.setLastModified(r0)
            if (r0 != 0) goto L_0x0707
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail failed to set timestamp for "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r5)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0707:
            java.lang.Object r0 = r2.A00
            int r6 = X.AnonymousClass000.A0D(r0)
            java.lang.Object r0 = r2.A01
            long r0 = X.C13700nu.A01(r0)
            long r2 = r5.length()
            long r0 = r0 + r2
            r2 = 0
            r4.add(r2, r5)
            java.lang.String r2 = "EmailMessageStore/loadMessagesForEmail/total count:"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r2)
            r3.append(r6)
            java.lang.String r2 = "/total attach file:"
            r3.append(r2)
            int r2 = r4.size()
            r3.append(r2)
            java.lang.String r2 = "/total size:"
            r3.append(r2)
            r3.append(r0)
            X.C13680ns.A1V(r3)
            r24.A01()
            if (r6 != 0) goto L_0x0744
            r4.clear()
        L_0x0744:
            X.4Zc r5 = new X.4Zc
            r5.<init>((java.util.List) r4)
        L_0x0749:
            int r4 = r5.A00
            r3 = 4
            r2 = 2
            if (r4 != r2) goto L_0x075c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L_0x0753:
            r0 = r21
            android.util.Pair r0 = X.C13690nt.A0I(r0, r1)
        L_0x0759:
            if (r0 == 0) goto L_0x0776
            return r0
        L_0x075c:
            r1 = 1
            r0 = 3
            if (r4 != r0) goto L_0x0765
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0753
        L_0x0765:
            if (r4 != r3) goto L_0x076c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x0753
        L_0x076c:
            if (r4 != r1) goto L_0x0773
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x0753
        L_0x0773:
            r0 = r21
            goto L_0x0759
        L_0x0776:
            java.util.List r1 = r5.A01
            X.0sP r2 = r7.A01
            r0 = r34
            java.lang.String r8 = r2.A08(r0)
            r4 = 2131887986(0x7f120772, float:1.9410595E38)
            r5 = 2131887986(0x7f120772, float:1.9410595E38)
            r7 = 1
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r2 = 0
            r0 = r20
            java.lang.String r4 = X.C13680ns.A0d(r0, r8, r3, r2, r4)
            java.lang.String r3 = "[?:\\\\/*\"<>|]"
            java.lang.String r0 = ""
            java.lang.String r6 = r4.replaceAll(r3, r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A0w(r1)
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r0 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r0)
            java.lang.String r0 = com.obwhatsapp.contentprovider.MediaProvider.A0C
            android.net.Uri$Builder r3 = r3.authority(r0)
            java.lang.String r0 = "export_chat"
            android.net.Uri$Builder r3 = r3.appendPath(r0)
            java.lang.String r0 = r23.getRawString()
            android.net.Uri$Builder r3 = r3.appendEncodedPath(r0)
            r0 = r25
            android.net.Uri$Builder r0 = r3.appendEncodedPath(r0)
            android.net.Uri r0 = r0.build()
            r4.add(r0)
            r9 = 1
        L_0x07c9:
            int r0 = r1.size()
            if (r9 >= r0) goto L_0x07f0
            java.lang.Object r3 = r1.get(r9)     // Catch:{ IllegalArgumentException -> 0x07e1 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ IllegalArgumentException -> 0x07e1 }
            r0 = r20
            android.net.Uri r0 = X.AnonymousClass1XI.A01(r0, r3)     // Catch:{ IllegalArgumentException -> 0x07e1 }
            r4.add(r0)     // Catch:{ IllegalArgumentException -> 0x07e1 }
            int r9 = r9 + 1
            goto L_0x07c9
        L_0x07e1:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            java.lang.Integer r1 = X.C13680ns.A0a()
            r0 = r21
            android.util.Pair r21 = X.C13690nt.A0I(r0, r1)
            return r21
        L_0x07f0:
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            android.content.Intent r0 = X.C13700nu.A02(r0)
            android.content.Intent r1 = r0.setFlags(r7)
            java.lang.String r0 = "text/*"
            android.content.Intent r3 = r1.setType(r0)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = r20
            java.lang.String r1 = X.C13680ns.A0d(r0, r8, r1, r2, r5)
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            android.content.Intent r5 = r3.putExtra(r0, r1)
            r3 = 2131887985(0x7f120771, float:1.9410593E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = r20
            java.lang.String r1 = X.C13680ns.A0d(r0, r6, r1, r2, r3)
            java.lang.String r0 = "android.intent.extra.TEXT"
            android.content.Intent r1 = r5.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.STREAM"
            android.content.Intent r0 = r1.putParcelableArrayListExtra(r0, r4)
            android.util.Pair r21 = X.C13680ns.A0F(r0, r2)
        L_0x082a:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36X.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r0 != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r2 != 4) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r8) {
        /*
            r7 = this;
            android.util.Pair r8 = (android.util.Pair) r8
            if (r8 == 0) goto L_0x002f
            java.lang.Object r3 = r8.first
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.Object r0 = r8.second
            int r2 = X.AnonymousClass000.A0D(r0)
            if (r2 == 0) goto L_0x0072
            r0 = 1
            if (r2 == r0) goto L_0x0030
            r0 = 3
            if (r2 == r0) goto L_0x0099
            r0 = 4
            r1 = 2131888290(0x7f1208a2, float:1.9411211E38)
            if (r2 == r0) goto L_0x001f
        L_0x001c:
            r1 = 2131888289(0x7f1208a1, float:1.941121E38)
        L_0x001f:
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r0 = r0.get()
            X.0pS r0 = (X.C14600pS) r0
            if (r0 == 0) goto L_0x002f
            r0.Ac1()
            r0.Afg(r1)
        L_0x002f:
            return
        L_0x0030:
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.0pS r4 = (X.C14600pS) r4
            if (r4 == 0) goto L_0x002f
            java.lang.ref.WeakReference r0 = r7.A05
            java.lang.Object r3 = r0.get()
            android.content.Context r3 = (android.content.Context) r3
            r4.Ac1()
            if (r3 == 0) goto L_0x002f
            boolean r0 = X.C14730pf.A00()
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            if (r0 == 0) goto L_0x0068
            r0 = 2131888291(0x7f1208a3, float:1.9411213E38)
            X.C13690nt.A0t(r3, r2, r1, r0)
            r0 = 2131891179(0x7f1213eb, float:1.941707E38)
        L_0x005c:
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r4.Afh(r0)
            return
        L_0x0068:
            r0 = 2131888292(0x7f1208a4, float:1.9411215E38)
            X.C13690nt.A0t(r3, r2, r1, r0)
            r0 = 2131891180(0x7f1213ec, float:1.9417073E38)
            goto L_0x005c
        L_0x0072:
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.0pS r4 = (X.C14600pS) r4
            java.lang.ref.WeakReference r0 = r7.A05
            java.lang.Object r2 = r0.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r3 == 0) goto L_0x0099
            if (r4 == 0) goto L_0x0099
            if (r2 == 0) goto L_0x0099
            r4.Ac1()
            X.1Ba r1 = r7.A00
            r0 = 2131891438(0x7f1214ee, float:1.9417596E38)
            java.lang.String r5 = r2.getString(r0)
            r6 = 0
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0099:
            boolean r0 = r7.A07
            r1 = 2131888293(0x7f1208a5, float:1.9411217E38)
            if (r0 != 0) goto L_0x001f
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36X.A0A(java.lang.Object):void");
    }
}
