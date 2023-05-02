package X;

import android.content.Intent;
import android.os.SystemClock;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.37L  reason: invalid class name */
public class AnonymousClass37L extends C16690tT {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C16300so A03;
    public final C16180sb A04;
    public final C14870pt A05;
    public final AnonymousClass10X A06;
    public final C16760tb A07;
    public final C16440t3 A08;
    public final C16980tz A09;
    public final AnonymousClass013 A0A;
    public final C35541m6 A0B;
    public final C26051Md A0C;
    public final C17250um A0D;
    public final C14710pd A0E;
    public final C16490t9 A0F;
    public final AnonymousClass29Q A0G;
    public final C18210wK A0H;
    public final C17960vv A0I;
    public final C215614o A0J;
    public final C26241Mw A0K;
    public final C16740tZ A0L;
    public final AnonymousClass1MF A0M;
    public final AnonymousClass1A9 A0N;
    public final Collection A0O;
    public final HashSet A0P;
    public final List A0Q;
    public final List A0R;
    public final Map A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public AnonymousClass37L(C16300so r3, C16180sb r4, C14870pt r5, AnonymousClass10X r6, C16760tb r7, C16440t3 r8, C16980tz r9, AnonymousClass013 r10, C35541m6 r11, C26051Md r12, C17250um r13, C14710pd r14, C16490t9 r15, AnonymousClass29Q r16, C18210wK r17, C17960vv r18, C215614o r19, C26241Mw r20, AnonymousClass29O r21, C16740tZ r22, AnonymousClass1MF r23, AnonymousClass1A9 r24, Collection collection, HashSet hashSet, List list, List list2, Map map, int i2, long j2, long j3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(r21, true);
        this.A08 = r8;
        this.A09 = r9;
        this.A05 = r5;
        this.A03 = r3;
        this.A06 = r6;
        this.A0K = r20;
        this.A04 = r4;
        this.A0F = r15;
        this.A0D = r13;
        this.A07 = r7;
        this.A0J = r19;
        this.A0H = r17;
        this.A0C = r12;
        this.A0N = r24;
        this.A0I = r18;
        this.A0A = r10;
        this.A0M = r23;
        this.A0R = list;
        this.A0Q = list2;
        this.A0O = collection;
        this.A0G = r16;
        this.A0L = r22;
        this.A02 = j2;
        this.A0T = z2;
        this.A00 = i2;
        this.A0U = z3;
        this.A0S = map;
        this.A0P = hashSet;
        this.A0Z = z4;
        this.A0Y = z5;
        this.A0B = r11;
        this.A0W = z6;
        this.A0V = z7;
        this.A0X = z8;
        this.A01 = j3;
        this.A0E = r14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0371, code lost:
        if (r8 == null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0443, code lost:
        if (r1 == false) goto L_0x0445;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r39) {
        /*
            r38 = this;
            r0 = r38
            X.1Mw r2 = r0.A0K
            boolean r1 = r0.A0U
            r21 = r1
            X.17S r7 = r2.A00
            r3 = 453122092(0x1b02182c, float:1.0761158E-22)
            r2 = 1
            r7.ALF(r3, r2)
            java.lang.String r1 = "SEND_TASK_START"
            r7.AL9(r3, r1, r2)
            if (r21 == 0) goto L_0x05aa
            java.lang.String r1 = "ACTUAL_SEND"
        L_0x001a:
            r7.AL9(r3, r1, r2)
            java.util.HashMap r19 = X.AnonymousClass000.A0x()
            java.util.ArrayList r18 = X.AnonymousClass000.A0u()
            java.util.List r1 = r0.A0Q
            java.util.Iterator r20 = r1.iterator()
        L_0x002b:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x05b1
            java.lang.Object r2 = r20.next()
            android.net.Uri r2 = (android.net.Uri) r2
            X.29Q r5 = r0.A0G
            X.20I r4 = r5.A00(r2)
            boolean r11 = r0.A0Z
            if (r11 == 0) goto L_0x00ce
            java.io.File r8 = X.AnonymousClass1XI.A03(r2)
            if (r8 == 0) goto L_0x00af
            X.0sb r6 = r0.A04     // Catch:{ IOException -> 0x009f }
            java.lang.String r3 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x009f }
            X.1jH r1 = r6.A05()     // Catch:{ IOException -> 0x009f }
            java.io.File r1 = r1.A06     // Catch:{ IOException -> 0x009f }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x009f }
            boolean r1 = r3.startsWith(r1)     // Catch:{ IOException -> 0x009f }
            if (r1 != 0) goto L_0x0071
            java.lang.String r3 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x009f }
            X.1jH r1 = r6.A05()     // Catch:{ IOException -> 0x009f }
            java.io.File r1 = r1.A07     // Catch:{ IOException -> 0x009f }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x009f }
            boolean r1 = r3.startsWith(r1)     // Catch:{ IOException -> 0x009f }
            if (r1 == 0) goto L_0x00af
        L_0x0071:
            boolean r1 = r8.delete()     // Catch:{ IOException -> 0x009f }
            r8 = 0
            if (r1 != 0) goto L_0x0083
            X.0so r6 = r0.A03     // Catch:{ IOException -> 0x009f }
            java.lang.String r3 = "MediaComposerActivity/failed to delete capture"
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x009f }
            r6.AcB(r3, r1, r8)     // Catch:{ IOException -> 0x009f }
        L_0x0083:
            java.io.File r1 = r4.A04()     // Catch:{ IOException -> 0x009f }
            if (r1 == 0) goto L_0x0093
            java.io.File r1 = r4.A04()     // Catch:{ IOException -> 0x009f }
            boolean r1 = r1.exists()     // Catch:{ IOException -> 0x009f }
            if (r1 != 0) goto L_0x00af
        L_0x0093:
            X.0so r6 = r0.A03     // Catch:{ IOException -> 0x009f }
            java.lang.String r3 = "MediaComposerActivity/file missing"
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x009f }
            r6.AcB(r3, r1, r8)     // Catch:{ IOException -> 0x009f }
            goto L_0x00af
        L_0x009f:
            r1 = move-exception
            java.lang.String r8 = "MediaComposerActivity/deleteInternalCaptureForViewOnce"
            com.whatsapp.util.Log.e(r8, r1)
            X.0so r6 = r0.A03
            java.lang.String r3 = r1.getMessage()
            r1 = 1
            r6.AcB(r8, r3, r1)
        L_0x00af:
            boolean r1 = r0.A0Y
            if (r1 == 0) goto L_0x01a2
            java.io.File r1 = X.AnonymousClass1XI.A03(r2)
            r1.delete()     // Catch:{ Exception -> 0x00bc }
            goto L_0x01a2
        L_0x00bc:
            r1 = move-exception
            java.lang.String r8 = "MediaComposerActivity/deleteExternalViewOnceIfNewContent"
            com.whatsapp.util.Log.e(r8, r1)
            X.0so r6 = r0.A03
            java.lang.String r3 = r1.getMessage()
            r1 = 1
            r6.AcB(r8, r3, r1)
            goto L_0x01a2
        L_0x00ce:
            X.1A9 r3 = r0.A0N
            java.io.File r6 = X.AnonymousClass1XI.A03(r2)
            java.lang.String r1 = "mediafileutils/move "
            java.lang.String r1 = X.AnonymousClass000.A0g(r1, r6)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            if (r6 == 0) goto L_0x01a2
            java.lang.String r8 = r6.getName()     // Catch:{ IOException -> 0x0145 }
            X.0sb r9 = r3.A01     // Catch:{ IOException -> 0x0145 }
            java.lang.String r10 = r6.getCanonicalPath()     // Catch:{ IOException -> 0x0145 }
            X.1jH r1 = r9.A05()     // Catch:{ IOException -> 0x0145 }
            java.io.File r1 = r1.A06     // Catch:{ IOException -> 0x0145 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0145 }
            boolean r1 = r10.startsWith(r1)     // Catch:{ IOException -> 0x0145 }
            if (r1 == 0) goto L_0x0118
            X.1jH r1 = r9.A05()     // Catch:{ IOException -> 0x0145 }
            java.io.File r1 = r1.A05     // Catch:{ IOException -> 0x0145 }
            java.io.File r9 = X.C17970vw.A0F(r1, r8)     // Catch:{ IOException -> 0x0145 }
            X.0tB r1 = r3.A07     // Catch:{ IOException -> 0x0145 }
            X.AnonymousClass1XI.A0C(r1, r6, r9)     // Catch:{ IOException -> 0x0145 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0145 }
            java.lang.String r1 = "mediafileutils/moved image "
            r3.append(r1)     // Catch:{ IOException -> 0x0145 }
        L_0x0111:
            r3.append(r9)     // Catch:{ IOException -> 0x0145 }
            X.C13680ns.A1V(r3)     // Catch:{ IOException -> 0x0145 }
            goto L_0x0150
        L_0x0118:
            java.lang.String r10 = r6.getCanonicalPath()     // Catch:{ IOException -> 0x0145 }
            X.1jH r1 = r9.A05()     // Catch:{ IOException -> 0x0145 }
            java.io.File r1 = r1.A07     // Catch:{ IOException -> 0x0145 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0145 }
            boolean r1 = r10.startsWith(r1)     // Catch:{ IOException -> 0x0145 }
            if (r1 == 0) goto L_0x01a2
            X.1jH r1 = r9.A05()     // Catch:{ IOException -> 0x0145 }
            java.io.File r1 = r1.A0N     // Catch:{ IOException -> 0x0145 }
            java.io.File r9 = X.C17970vw.A0F(r1, r8)     // Catch:{ IOException -> 0x0145 }
            X.0tB r1 = r3.A07     // Catch:{ IOException -> 0x0145 }
            X.AnonymousClass1XI.A0C(r1, r6, r9)     // Catch:{ IOException -> 0x0145 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0145 }
            java.lang.String r1 = "mediafileutils/moved video"
            r3.append(r1)     // Catch:{ IOException -> 0x0145 }
            goto L_0x0111
        L_0x0145:
            r3 = move-exception
            java.lang.String r1 = "mediafileutils/unable to move capture to external "
            java.lang.String r1 = X.AnonymousClass000.A0g(r1, r6)
            com.whatsapp.util.Log.e(r1, r3)
            goto L_0x01a2
        L_0x0150:
            X.20I r8 = r5.A00(r2)
            java.util.Map r1 = r5.A00
            r1.remove(r2)
            android.net.Uri r1 = android.net.Uri.fromFile(r9)
            android.net.Uri$Builder r6 = r1.buildUpon()
            java.lang.String r3 = "rotation"
            java.lang.String r1 = r2.getQueryParameter(r3)
            if (r1 == 0) goto L_0x01f3
            java.lang.String r1 = r2.getQueryParameter(r3)
            int r1 = java.lang.Integer.parseInt(r1)
        L_0x0172:
            int r1 = r1 % 360
            if (r1 == 0) goto L_0x017d
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r6.appendQueryParameter(r3, r1)
        L_0x017d:
            java.lang.String r3 = "flip-h"
            java.lang.String r1 = r2.getQueryParameter(r3)
            if (r1 == 0) goto L_0x018c
            java.lang.String r1 = r2.getQueryParameter(r3)
            r6.appendQueryParameter(r3, r1)
        L_0x018c:
            android.net.Uri r2 = r6.build()
            X.20I r1 = new X.20I
            r1.<init>(r2, r8)
            r1.A0B(r9)
            r5.A03(r1)
            X.0tz r1 = r0.A09
            android.content.Context r1 = r1.A00
            X.C17970vw.A0K(r1, r2)
        L_0x01a2:
            java.lang.String r1 = "MediaComposerActivity/sendmedia/uri = "
            java.lang.String r1 = X.AnonymousClass000.A0g(r1, r2)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r4.A0F()
            r8 = 13
            if (r1 == 0) goto L_0x01e5
            r9 = 13
        L_0x01b5:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r9)
            r1 = r19
            java.lang.Object r1 = r1.get(r6)
            X.322 r1 = (X.AnonymousClass322) r1
            if (r1 != 0) goto L_0x01cc
            X.322 r1 = r0.A0C(r9, r11)
            r3 = r19
            r3.put(r6, r1)
        L_0x01cc:
            java.lang.Long r3 = r1.A0C
            long r14 = r3.longValue()
            r12 = 1
            long r14 = r14 + r12
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r1.A0C = r3
            r6 = 1
            if (r9 == r6) goto L_0x0247
            r3 = 3
            if (r9 == r3) goto L_0x01f6
            if (r9 == r8) goto L_0x01f6
            goto L_0x002b
        L_0x01e5:
            X.0vv r1 = r0.A0I
            byte r9 = r1.A01(r4)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r9)
            r4.A0C(r1)
            goto L_0x01b5
        L_0x01f3:
            r1 = 0
            goto L_0x0172
        L_0x01f6:
            r6 = 453122092(0x1b02182c, float:1.0761158E-22)
            r4 = 1
            java.lang.String r3 = "SEND_TASK_VIDEO_START"
            r7.AL9(r6, r3, r4)
            X.20I r12 = r5.A00(r2)
            android.graphics.Point r8 = r12.A02()
            monitor-enter(r12)
            long r3 = r12.A02     // Catch:{ all -> 0x05ae }
            monitor-exit(r12)
            int r6 = (int) r3
            r4 = 0
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>(r4, r6)
            if (r8 == 0) goto L_0x023c
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x023c
            int r3 = r8.x
            long r3 = (long) r3
            int r6 = r8.y
            long r8 = (long) r6
            r17 = 0
        L_0x0222:
            X.20I r5 = r5.A00(r2)
            java.io.File r16 = r5.A05()
            X.AnonymousClass00B.A06(r16)
            X.0ta r11 = new X.0ta
            r11.<init>()
            r5 = r16
            r11.A0F = r5
            r11.A0D = r3
            r11.A0E = r8
            monitor-enter(r12)
            goto L_0x0243
        L_0x023c:
            r8 = 0
            r3 = 0
            r17 = 1
            goto L_0x0222
        L_0x0243:
            boolean r5 = r12.A0E     // Catch:{ all -> 0x05ae }
            goto L_0x046a
        L_0x0247:
            java.lang.String r3 = "MediaComposerActivity/sendimage"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r5 = 453122092(0x1b02182c, float:1.0761158E-22)
            java.lang.String r3 = "SEND_TASK_IMAGE_START"
            r7.AL9(r5, r3, r6)
            X.1A9 r12 = r0.A0N
            java.io.File r5 = r4.A03()
            if (r5 == 0) goto L_0x02ad
            java.lang.Long r3 = r1.A08
            java.lang.Long r3 = X.C13690nt.A0X(r3)
            r1.A08 = r3
            java.io.File r3 = r4.A05()
            r12.A0d(r3)
            r3 = 0
            r4.A0B(r3)
        L_0x026f:
            X.AnonymousClass00B.A06(r5)
            android.net.Uri r3 = android.net.Uri.fromFile(r5)
            android.net.Uri$Builder r8 = r3.buildUpon()
            X.AnonymousClass1A9.A0Q(r8, r4)
            int r5 = r4.A00()
            java.lang.String r14 = r4.A08()
            X.0tz r3 = r0.A09
            android.content.Context r13 = r3.A00
            X.0um r10 = r0.A0D
            X.013 r9 = r0.A0A
            X.1MF r3 = r0.A0M
            X.3Bj r3 = X.C62033Bj.A03(r13, r9, r10, r3, r14)
            r30 = 0
            if (r5 != 0) goto L_0x0299
            if (r3 == 0) goto L_0x0377
        L_0x0299:
            java.util.List r10 = r0.A0R
            X.1kq r9 = X.C34771kq.A00
            boolean r10 = r10.contains(r9)
            X.14o r9 = r0.A0J
            X.1XN r10 = r9.A00(r6, r10)
            X.AnonymousClass00B.A06(r10)
            int r9 = r10.A00
            goto L_0x02b2
        L_0x02ad:
            java.io.File r5 = r4.A05()
            goto L_0x026f
        L_0x02b2:
            android.net.Uri r8 = r8.build()     // Catch:{ 20M | IOException -> 0x0366 }
            android.graphics.Bitmap r12 = r12.A0W(r8, r9, r9)     // Catch:{ 20M | IOException -> 0x0366 }
            if (r5 == 0) goto L_0x02d1
            boolean r8 = r12.isMutable()
            X.AnonymousClass00B.A0F(r8)
            r9 = 0
            X.1Md r8 = r0.A0C
            com.whatsapp.filter.FilterUtils.A00(r12, r8, r5, r9)
            java.lang.Long r8 = r1.A0B
            java.lang.Long r8 = X.C13690nt.A0X(r8)
            r1.A0B = r8
        L_0x02d1:
            if (r3 == 0) goto L_0x0344
            java.util.List r8 = r3.A06
            r16 = r8
            java.util.Iterator r9 = r16.iterator()
        L_0x02db:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L_0x02eb
            java.lang.Object r8 = r9.next()
            X.29l r8 = (X.C455829l) r8
            r8.A05()
            goto L_0x02db
        L_0x02eb:
            int r8 = r12.getWidth()
            r3.A01 = r8
            int r8 = r12.getHeight()
            r3.A00 = r8
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r12)
            int r8 = r3.A02
            int r13 = r12.getWidth()
            float r15 = (float) r13
            int r13 = r12.getHeight()
            float r14 = (float) r13
            float r13 = (float) r8
            android.graphics.RectF r8 = r3.A03
            float r25 = r8.width()
            float r26 = r8.height()
            r27 = 0
            r28 = 0
            r22 = r15
            r23 = r14
            r24 = r13
            android.graphics.Matrix r14 = X.C62033Bj.A00(r22, r23, r24, r25, r26, r27, r28)
            float r13 = r8.left
            float r13 = -r13
            float r8 = r8.top
            float r8 = -r8
            r14.preTranslate(r13, r8)
            r9.concat(r14)
            java.util.Iterator r13 = r16.iterator()
        L_0x0331:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x0341
            java.lang.Object r8 = r13.next()
            X.29l r8 = (X.C455829l) r8
            r8.A0P(r9)
            goto L_0x0331
        L_0x0341:
            r3.A09(r1)
        L_0x0344:
            X.0sb r8 = r0.A04
            java.io.File r9 = com.obwhatsapp.mediacomposer.ImageComposerFragment.A01(r2, r8)
            android.net.Uri r2 = android.net.Uri.fromFile(r9)
            android.net.Uri$Builder r8 = r2.buildUpon()
            int r2 = r10.A03     // Catch:{ IOException -> 0x036a }
            com.whatsapp.media.transcode.Mozjpeg r22 = X.AnonymousClass20E.A00     // Catch:{ IOException -> 0x036a }
            java.lang.String r24 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x036a }
            r27 = 0
            r26 = 1
            r23 = r12
            r25 = r2
            r22.A00(r23, r24, r25, r26, r27)     // Catch:{ IOException -> 0x036a }
            goto L_0x0371
        L_0x0366:
            r2 = move-exception
            java.lang.String r1 = "PrepareAndSendMediaTask/can't load image"
            goto L_0x036d
        L_0x036a:
            r2 = move-exception
            java.lang.String r1 = "PrepareAndSendMediaTask/can't compress bitmap"
        L_0x036d:
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x0373
        L_0x0371:
            if (r8 != 0) goto L_0x0377
        L_0x0373:
            r2 = r30
            goto L_0x04eb
        L_0x0377:
            int r2 = r4.A01()
            if (r2 != 0) goto L_0x03db
            java.io.File r2 = r4.A03()
            if (r2 != 0) goto L_0x03db
            if (r3 != 0) goto L_0x03db
            if (r5 != 0) goto L_0x03db
            java.lang.Long r2 = r1.A0D
            java.lang.Long r2 = X.C13690nt.A0X(r2)
            r1.A0D = r2
            r34 = 0
        L_0x0391:
            java.lang.String r1 = r4.A07()
            if (r1 == 0) goto L_0x03a6
            java.lang.String r1 = r4.A07()
            java.lang.String r2 = X.C40651uT.A05(r1)
            if (r2 == 0) goto L_0x03a6
            java.lang.String r1 = "caption"
            r8.appendQueryParameter(r1, r2)
        L_0x03a6:
            java.lang.String r2 = r4.A09()
            if (r2 == 0) goto L_0x03b1
            java.lang.String r1 = "mentions"
            r8.appendQueryParameter(r1, r2)
        L_0x03b1:
            android.net.Uri r2 = r8.build()
            if (r21 == 0) goto L_0x0460
            if (r3 == 0) goto L_0x03c3
            int r1 = r3.A01
            float r4 = (float) r1
            int r1 = r3.A00
            float r1 = (float) r1
            java.util.List r30 = r3.A05(r4, r1)
        L_0x03c3:
            X.0tZ r14 = r0.A0L
            if (r34 != 0) goto L_0x03d9
            if (r11 != 0) goto L_0x03d9
            java.util.Map r3 = r0.A0S
            android.net.Uri r1 = r8.build()
            java.lang.Object r8 = r3.get(r1)
            X.1XQ r8 = (X.AnonymousClass1XQ) r8
        L_0x03d5:
            java.lang.String r5 = "sendmedia/sendimages/share-failed/ "
            goto L_0x03e6
        L_0x03d9:
            r8 = 0
            goto L_0x03d5
        L_0x03db:
            java.lang.Long r2 = r1.A07
            java.lang.Long r2 = X.C13690nt.A0X(r2)
            r1.A07 = r2
            r34 = 1
            goto L_0x0391
        L_0x03e6:
            X.10X r13 = r0.A06     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            java.util.List r12 = r0.A0R     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            int r1 = r0.A00     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            int r31 = r0.A0B(r1)     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            boolean r9 = r0.A0T     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            X.1m6 r4 = r0.A0B     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            boolean r3 = r0.A0V     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            boolean r1 = r0.A0X     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            java.lang.String r10 = "mentions"
            java.lang.String r10 = r2.getQueryParameter(r10)     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            java.util.List r29 = X.C39501sa.A01(r10)     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            java.lang.String r10 = "caption"
            java.lang.String r27 = r2.getQueryParameter(r10)     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            r32 = 0
            r22 = r13
            r23 = r2
            r24 = r4
            r25 = r8
            r26 = r14
            r28 = r12
            r33 = r9
            r35 = r11
            r36 = r3
            r37 = r1
            r22.A02(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ IOException -> 0x0432, 20M -> 0x042a, OutOfMemoryError -> 0x044d, SecurityException -> 0x0422 }
            goto L_0x0460
        L_0x0422:
            r1 = move-exception
            com.whatsapp.util.Log.e(r5, r1)
            r5 = 2131889636(0x7f120de4, float:1.9413941E38)
            goto L_0x0454
        L_0x042a:
            r1 = move-exception
            com.whatsapp.util.Log.e(r5, r1)
            r5 = 2131888192(0x7f120840, float:1.9411012E38)
            goto L_0x0454
        L_0x0432:
            r3 = move-exception
            com.whatsapp.util.Log.e(r5, r3)
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L_0x0445
            boolean r1 = X.C13690nt.A1T(r3)
            r5 = 2131888210(0x7f120852, float:1.9411049E38)
            if (r1 != 0) goto L_0x0454
        L_0x0445:
            r5 = 2131891709(0x7f1215fd, float:1.9418146E38)
            X.0pt r4 = r0.A05
            r3 = 10
            goto L_0x0458
        L_0x044d:
            r1 = move-exception
            com.whatsapp.util.Log.e(r5, r1)
            r5 = 2131888213(0x7f120855, float:1.9411055E38)
        L_0x0454:
            X.0pt r4 = r0.A05
            r3 = 11
        L_0x0458:
            com.facebook.redex.RunnableRunnableShape1S0101000_I1 r1 = new com.facebook.redex.RunnableRunnableShape1S0101000_I1
            r1.<init>((X.AnonymousClass37L) r0, (int) r5, (int) r3)
            r4.A0K(r1)
        L_0x0460:
            r3 = 453122092(0x1b02182c, float:1.0761158E-22)
            java.lang.String r1 = "SEND_TASK_IMAGE_END"
            r7.AL9(r3, r1, r6)
            goto L_0x04eb
        L_0x046a:
            monitor-exit(r12)
            r11.A0N = r5
            java.lang.String r6 = r12.A08()
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            r10 = 0
            if (r5 != 0) goto L_0x05a7
            X.0tz r5 = r0.A09
            android.content.Context r5 = r5.A00
            r14 = r5
            X.0um r5 = r0.A0D
            r13 = r5
            X.013 r5 = r0.A0A
            r22 = r5
            X.1MF r5 = r0.A0M
            r15 = r6
            r6 = r22
            X.3Bj r13 = X.C62033Bj.A03(r14, r6, r13, r5, r15)
            if (r13 == 0) goto L_0x0491
            r17 = 0
        L_0x0491:
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r13 != 0) goto L_0x054f
            long r5 = r5 * r3
            r14 = 0
            int r13 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0547
            android.graphics.Bitmap r6 = X.C18830xK.A01(r16)
        L_0x04a0:
            r5 = 100
            byte[] r28 = X.C18830xK.A03(r6, r5)
            r27 = r10
        L_0x04a8:
            boolean r5 = r12.A0F()
            if (r5 == 0) goto L_0x0538
            r29 = 13
        L_0x04b0:
            if (r17 == 0) goto L_0x052f
            java.lang.Long r5 = r1.A0D
            java.lang.Long r5 = X.C13690nt.A0X(r5)
            r1.A0D = r5
        L_0x04ba:
            java.lang.String r1 = r12.A07()
            if (r1 == 0) goto L_0x04c8
            java.lang.String r1 = r12.A07()
            java.lang.String r10 = X.C40651uT.A05(r1)
        L_0x04c8:
            java.lang.String r6 = r12.A09()
            if (r21 == 0) goto L_0x04f2
            X.0pt r3 = r0.A05
            X.56O r1 = new X.56O
            r22 = r1
            r23 = r11
            r24 = r0
            r25 = r10
            r26 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r3.A0K(r1)
        L_0x04e2:
            r4 = 453122092(0x1b02182c, float:1.0761158E-22)
            r3 = 1
            java.lang.String r1 = "SEND_TASK_VIDEO_END"
            r7.AL9(r4, r1, r3)
        L_0x04eb:
            r1 = r18
            r1.add(r2)
            goto L_0x002b
        L_0x04f2:
            android.net.Uri$Builder r5 = r2.buildUpon()
            if (r10 == 0) goto L_0x04fd
            java.lang.String r1 = "caption"
            r5.appendQueryParameter(r1, r10)
        L_0x04fd:
            if (r6 == 0) goto L_0x0504
            java.lang.String r1 = "mentions"
            r5.appendQueryParameter(r1, r6)
        L_0x0504:
            r12 = 0
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0521
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0521
            java.lang.String r2 = java.lang.Long.toString(r3)
            java.lang.String r1 = "from"
            r5.appendQueryParameter(r1, r2)
            java.lang.String r2 = java.lang.Long.toString(r8)
            java.lang.String r1 = "to"
            r5.appendQueryParameter(r1, r2)
        L_0x0521:
            java.lang.String r2 = r11.A0H
            if (r2 == 0) goto L_0x052a
            java.lang.String r1 = "doodle"
            r5.appendQueryParameter(r1, r2)
        L_0x052a:
            android.net.Uri r2 = r5.build()
            goto L_0x04e2
        L_0x052f:
            java.lang.Long r5 = r1.A07
            java.lang.Long r5 = X.C13690nt.A0X(r5)
            r1.A07 = r5
            goto L_0x04ba
        L_0x0538:
            X.0vv r5 = r0.A0I
            byte r29 = r5.A01(r12)
            java.lang.Byte r5 = java.lang.Byte.valueOf(r29)
            r12.A0C(r5)
            goto L_0x04b0
        L_0x0547:
            r13 = r16
            android.graphics.Bitmap r6 = X.C18830xK.A02(r13, r5)
            goto L_0x04a0
        L_0x054f:
            java.io.File r14 = r11.A0F
            long r5 = r5 * r3
            android.graphics.Bitmap r14 = X.C18830xK.A02(r14, r5)
            if (r14 == 0) goto L_0x05a1
            boolean r5 = r14.isMutable()
            if (r5 != 0) goto L_0x0567
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            r5 = 1
            android.graphics.Bitmap r14 = r14.copy(r6, r5)
            if (r14 == 0) goto L_0x05a1
        L_0x0567:
            int r5 = r14.getWidth()
            float r6 = (float) r5
            int r5 = r14.getHeight()
            float r5 = (float) r5
            java.util.List r27 = r13.A05(r6, r5)
            r6 = 0
            r13.A07(r14, r6, r6, r6)
            r5 = 100
            byte[] r28 = X.C18830xK.A03(r14, r5)
        L_0x057f:
            r13.A09(r1)
            java.util.List r5 = r13.A06
            if (r5 == 0) goto L_0x058c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x058e
        L_0x058c:
            r6 = r17
        L_0x058e:
            java.lang.String r5 = X.C17970vw.A0H()
            r11.A0H = r5
            X.0sb r14 = r0.A04
            java.io.File r5 = X.C17970vw.A0E(r14, r5)
            r13.A0A(r5)
            r17 = r6
            goto L_0x04a8
        L_0x05a1:
            r6 = 0
            r28 = r10
            r27 = r10
            goto L_0x057f
        L_0x05a7:
            r13 = r10
            goto L_0x0491
        L_0x05aa:
            java.lang.String r1 = "INFO_UPDATE"
            goto L_0x001a
        L_0x05ae:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x05b1:
            r5 = 453122092(0x1b02182c, float:1.0761158E-22)
            r4 = 1
            java.lang.String r1 = "TASK_CLEAN_UP_START"
            r7.AL9(r5, r1, r4)
            java.util.HashSet r6 = r0.A0P
            java.util.Iterator r10 = r6.iterator()
        L_0x05c0:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x060a
            java.lang.Object r2 = r10.next()
            X.20I r2 = (X.AnonymousClass20I) r2
            X.0vv r1 = r0.A0I
            byte r8 = r1.A01(r2)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r2.A0C(r1)
            boolean r1 = r2.A0F()
            if (r1 == 0) goto L_0x05e1
            r8 = 13
        L_0x05e1:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r8)
            r1 = r19
            java.lang.Object r3 = r1.get(r2)
            X.322 r3 = (X.AnonymousClass322) r3
            if (r3 != 0) goto L_0x05fa
            boolean r1 = r0.A0Z
            X.322 r3 = r0.A0C(r8, r1)
            r1 = r19
            r1.put(r2, r3)
        L_0x05fa:
            java.lang.Long r1 = r3.A09
            long r8 = r1.longValue()
            r1 = 1
            long r8 = r8 + r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r3.A09 = r1
            goto L_0x05c0
        L_0x060a:
            X.1A9 r3 = r0.A0N
            java.util.Collection r2 = r0.A0O
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r2)
            X.AnonymousClass1A9.A0R(r3, r1, r6)
            java.lang.String r1 = "TASK_CLEAN_UP_END"
            r7.AL9(r5, r1, r4)
            java.util.Collection r1 = r19.values()
            java.util.Iterator r3 = r1.iterator()
        L_0x0623:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0635
            java.lang.Object r2 = r3.next()
            X.0t7 r2 = (X.C16470t7) r2
            X.0t9 r1 = r0.A0F
            r1.A05(r2)
            goto L_0x0623
        L_0x0635:
            java.lang.String r0 = "SEND_TASK_END"
            r7.AL9(r5, r0, r4)
            r0 = 2
            r7.AKy(r5, r4, r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37L.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AnonymousClass29O r5 = (AnonymousClass29O) A04(AnonymousClass29O.class);
        if (r5 != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r5;
            mediaComposerActivity.A05.A0J(mediaComposerActivity.A1U);
            if (mediaComposerActivity.getIntent().getBooleanExtra("send", true) && (C13690nt.A0k(mediaComposerActivity.A0l.A01).size() > 1 || C13690nt.A0k(mediaComposerActivity.A0l.A01).contains(C34771kq.A00))) {
                mediaComposerActivity.Agv(C13690nt.A0k(mediaComposerActivity.A0l.A01));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mediaComposerActivity.A1Y.remove(it.next());
            }
            mediaComposerActivity.A3A();
            Intent A092 = C13680ns.A09();
            A092.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            A092.putStringArrayListExtra("jids", C16030sJ.A06((Collection) mediaComposerActivity.A0l.A01.A01()));
            mediaComposerActivity.A02 = -1;
            mediaComposerActivity.setResult(-1, A092);
            int intExtra = mediaComposerActivity.getIntent().getIntExtra("product_origin", -1);
            if (mediaComposerActivity.getIntent().getBooleanExtra("smb_send_product", false) && intExtra == 3) {
                mediaComposerActivity.A05.A09(R.string.str1310, 0);
            }
            if (mediaComposerActivity.getIntent().getBooleanExtra("start_home", false)) {
                mediaComposerActivity.A2X(C14750ph.A03(mediaComposerActivity), true);
            } else {
                mediaComposerActivity.finish();
            }
        }
    }

    public final int A0B(int i2) {
        if (this.A0E.A0E(C16620tM.A02, 1516)) {
            if (i2 == 1) {
                return 2;
            }
            if (i2 == 2) {
                return 4;
            }
            if (i2 == 3) {
                return 3;
            }
            if (i2 == 5) {
                return 12;
            }
            if (i2 == 7) {
                return 1;
            }
            if (i2 == 30) {
                return 4;
            }
            switch (i2) {
                case 10:
                case 11:
                    return 4;
                case 12:
                case 18:
                    return 1;
                case 13:
                case 14:
                case 19:
                case 20:
                case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                    return 2;
                case 15:
                    return 10;
                case 16:
                case 17:
                    return 11;
            }
        } else if (i2 == 2 || i2 == 10 || i2 == 11) {
            return 4;
        } else {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                    return 5;
            }
        }
        return 0;
    }

    public final AnonymousClass322 A0C(byte b2, boolean z2) {
        List list = this.A0R;
        boolean contains = list.contains(C34771kq.A00);
        int size = list.size();
        int i2 = this.A00;
        long j2 = this.A02;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = this.A0W;
        boolean z4 = this.A0V;
        boolean z5 = this.A0X;
        return AnonymousClass38B.A00(b2, size, i2, j2, elapsedRealtime, this.A01, contains, z2, z3, z4, z5);
    }
}
