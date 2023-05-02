package com.facebook.redex;

import X.AnonymousClass22J;
import X.C214214a;

public class RunnableRunnableShape1S0300000_I0_1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape1S0300000_I0_1(C214214a r2, AnonymousClass22J r3, AnonymousClass22J r4) {
        this.A03 = 44;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public RunnableRunnableShape1S0300000_I0_1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0062, code lost:
        if (r4.A09.A09(r1) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x082c, code lost:
        if (r4 != null) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0896, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0899, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f4, code lost:
        r1.A0H(r4, java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0b83, code lost:
        if (r1.equals("audio") == false) goto L_0x0b5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0b8c, code lost:
        if (r1.equals("image") == false) goto L_0x0b5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0b96, code lost:
        if (r1.equals("video") == false) goto L_0x0b5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0ba5, code lost:
        if (r3 != 29) goto L_0x0b5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0e48, code lost:
        r4 = new X.C28381Vw(r3.A0C, r3.A0L, r3.A0Q);
        r2 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0219, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021c, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:305:0x08fd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:360:0x0a8c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:455:0x0c57 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:460:0x0c5c */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0b70  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0bd5  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0bd8  */
    /* JADX WARNING: Removed duplicated region for block: B:660:0x11fb A[Catch:{ InterruptedException -> 0x1231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x121b A[Catch:{ InterruptedException -> 0x1231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:665:0x122a A[Catch:{ InterruptedException -> 0x1231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x122e A[Catch:{ InterruptedException -> 0x1231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:785:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02ca  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:449:0x0c4c=Splitter:B:449:0x0c4c, B:460:0x0c5c=Splitter:B:460:0x0c5c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r7 = r34
            int r0 = r7.A03
            switch(r0) {
                case 0: goto L_0x052a;
                case 1: goto L_0x0017;
                case 2: goto L_0x0540;
                case 3: goto L_0x0043;
                case 4: goto L_0x0560;
                case 5: goto L_0x082f;
                case 6: goto L_0x084e;
                case 7: goto L_0x0874;
                case 8: goto L_0x08a1;
                case 9: goto L_0x008e;
                case 10: goto L_0x0903;
                case 11: goto L_0x0a1b;
                case 12: goto L_0x0a2f;
                case 13: goto L_0x00c3;
                case 14: goto L_0x00fc;
                case 15: goto L_0x0122;
                case 16: goto L_0x0a9a;
                case 17: goto L_0x0164;
                case 18: goto L_0x018a;
                case 19: goto L_0x0aac;
                case 20: goto L_0x0abc;
                case 21: goto L_0x01ff;
                case 22: goto L_0x0ada;
                case 23: goto L_0x0afc;
                case 24: goto L_0x0b29;
                case 25: goto L_0x021d;
                case 26: goto L_0x0b39;
                case 27: goto L_0x024a;
                case 28: goto L_0x0c75;
                case 29: goto L_0x0cc7;
                case 30: goto L_0x0d89;
                case 31: goto L_0x033d;
                case 32: goto L_0x038a;
                case 33: goto L_0x0de9;
                case 34: goto L_0x0f30;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x040c;
                case 38: goto L_0x0442;
                case 39: goto L_0x0fd8;
                case 40: goto L_0x0471;
                case 41: goto L_0x1030;
                case 42: goto L_0x1153;
                case 43: goto L_0x1238;
                case 44: goto L_0x126b;
                case 45: goto L_0x129f;
                case 46: goto L_0x12cb;
                case 47: goto L_0x12f5;
                case 48: goto L_0x04a7;
                case 49: goto L_0x135f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r7.A00
            X.12h r2 = (X.C209712h) r2
            java.lang.Object r1 = r7.A01
            X.1lo r1 = (X.C35361lo) r1
            java.lang.Object r0 = r7.A02
            X.2Ih r0 = (X.C47272Ih) r0
            r2.A03(r1, r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r4 = r7.A00
            X.1D0 r4 = (X.AnonymousClass1D0) r4
            java.lang.Object r3 = r7.A01
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r7.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.0xq r1 = r4.A0D
            r0 = 0
            r1.A0A(r3, r0)
            X.1SP r0 = r4.A0L
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0033:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.5Sk r0 = (X.C109505Sk) r0
            r0.ANv(r2)
            goto L_0x0033
        L_0x0043:
            java.lang.Object r6 = r7.A00
            X.14t r6 = (X.C216114t) r6
            java.lang.Object r5 = r7.A01
            X.0sH r5 = (X.C16010sH) r5
            java.lang.Object r3 = r7.A02
            X.0rv r3 = (X.C15830rv) r3
            X.0sP r4 = r6.A03
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r1 = r5.A08(r0)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r1 == 0) goto L_0x0064
            X.0sO r0 = r4.A09
            boolean r0 = r0.A09(r1)
            r2 = 1
            if (r0 != 0) goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            X.0rv r1 = r5.A0E
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.C16030sJ.A0R(r1)
            if (r0 != 0) goto L_0x0016
            r0 = -1
            boolean r0 = r4.A0S(r5, r0)
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = r5.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0016
        L_0x0082:
            if (r2 == 0) goto L_0x0016
            X.0vd r2 = r6.A05
            X.0sL r3 = (X.C16050sL) r3
            r1 = 0
            r0 = 3
            r2.A0A(r3, r1, r0)
            return
        L_0x008e:
            java.lang.Object r3 = r7.A00
            X.16u r3 = (X.C221416u) r3
            java.lang.Object r1 = r7.A01
            X.1cE r1 = (X.C30361cE) r1
            java.lang.Object r4 = r7.A02
            X.0sN r4 = (X.C16060sN) r4
            X.0us r0 = r3.A08
            r0.A09(r1)
            X.0sK r0 = r3.A00
            r0.A0B()
            X.1Za r0 = r0.A04
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = r4.getRawString()
            X.1Yb r0 = X.C28851Ya.A02(r0)
            X.1dH r2 = new X.1dH
            r2.<init>(r0, r1)
            X.11s r1 = r3.A05
            r0 = 0
            boolean r0 = r1.A0g(r2, r0)
            if (r0 == 0) goto L_0x0016
            X.0w1 r1 = r3.A01
            r0 = 4
            goto L_0x00f4
        L_0x00c3:
            java.lang.Object r3 = r7.A00
            X.0ul r3 = (X.C17240ul) r3
            java.lang.Object r1 = r7.A01
            X.1cE r1 = (X.C30361cE) r1
            java.lang.Object r4 = r7.A02
            X.0sN r4 = (X.C16060sN) r4
            X.0sO r0 = r3.A0a
            r0.A04(r1)
            X.0sK r0 = r3.A08
            r0.A0B()
            X.1Za r0 = r0.A04
            X.1Yb r1 = X.C28851Ya.A02(r0)
            java.lang.String r0 = r4.getRawString()
            X.1dH r2 = new X.1dH
            r2.<init>(r1, r0)
            X.11s r1 = r3.A0O
            r0 = 0
            boolean r0 = r1.A0g(r2, r0)
            if (r0 == 0) goto L_0x0016
            X.0w1 r1 = r3.A09
            r0 = 1
        L_0x00f4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0H(r4, r0)
            return
        L_0x00fc:
            java.lang.Object r0 = r7.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r3 = r7.A01
            X.0sN r3 = (X.C16060sN) r3
            java.lang.Object r2 = r7.A02
            X.1cE r2 = (X.C30361cE) r2
            X.18R r0 = r0.A0k
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0112:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            r0.A00(r2, r3)
            goto L_0x0112
        L_0x0122:
            java.lang.Object r5 = r7.A00
            X.0ul r5 = (X.C17240ul) r5
            java.lang.Object r8 = r7.A01
            X.0sL r8 = (X.C16050sL) r8
            java.lang.Object r4 = r7.A02
            java.util.Map r4 = (java.util.Map) r4
            X.18P r6 = r5.A0V
            X.0t3 r0 = r5.A0L
            long r2 = r0.A00()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.util.List r0 = r6.A00(r8, r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x0141:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r3.next()
            X.1bh r2 = (X.C30071bh) r2
            X.1Vw r0 = r2.A11
            X.0rv r0 = r0.A00
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0141
            r0 = 1
            r2.A07 = r0
            r0 = 0
            r2.A01 = r0
            X.0t6 r0 = r5.A0T
            r0.A0a(r2)
            goto L_0x0141
        L_0x0164:
            java.lang.Object r0 = r7.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r3 = r7.A01
            X.0sN r3 = (X.C16060sN) r3
            java.lang.Object r2 = r7.A02
            X.1cE r2 = (X.C30361cE) r2
            X.18R r0 = r0.A0k
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x017a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            r0.A00(r2, r3)
            goto L_0x017a
        L_0x018a:
            java.lang.Object r2 = r7.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r7.A01
            X.0sc r0 = (X.C16190sc) r0
            java.lang.Object r9 = r7.A02
            X.12X r9 = (X.AnonymousClass12X) r9
            java.lang.String r1 = "Profile Pictures"
            java.io.File r8 = r0.A07(r1)
            java.io.File r0 = r2.getCacheDir()
            java.io.File r7 = new java.io.File
            r7.<init>(r0, r1)
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x0016
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x01b4
            r7.mkdirs()
        L_0x01b4:
            java.io.File[] r6 = r8.listFiles()
            if (r6 == 0) goto L_0x0016
            int r5 = r6.length
            r4 = 0
        L_0x01bc:
            if (r4 >= r5) goto L_0x01ec
            r3 = r6[r4]
            java.lang.String r2 = r3.getName()
            java.lang.String r0 = ".jpg"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x01e9
            java.io.File r1 = new java.io.File
            r1.<init>(r7, r2)
            r1.getAbsolutePath()
            r1.exists()
            r3.getAbsolutePath()
            r1.getAbsolutePath()
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x01e6
            X.AnonymousClass1XI.A0M(r9, r3, r1)
        L_0x01e6:
            r3.delete()
        L_0x01e9:
            int r4 = r4 + 1
            goto L_0x01bc
        L_0x01ec:
            java.lang.String r1 = ".nomedia"
            java.io.File r0 = new java.io.File
            r0.<init>(r8, r1)
            r0.delete()
            boolean r0 = r8.delete()
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "app-init/moveprofilephotos/rmdir/failed"
            goto L_0x0219
        L_0x01ff:
            java.lang.Object r0 = r7.A00
            X.16v r0 = (X.C221516v) r0
            java.lang.Object r8 = r7.A01
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.Object r6 = r7.A02
            java.io.File r6 = (java.io.File) r6
            java.lang.String r5 = "ReferenceCountedFileManager/deleteFileFromMediaProvider"
            if (r8 == 0) goto L_0x0016
            X.01V r0 = r0.A02
            android.content.ContentResolver r4 = r0.A0C()
            if (r4 != 0) goto L_0x1374
            java.lang.String r0 = "ReferenceCountedFileManager/deleteFileFromMediaProvider content resolver is null"
        L_0x0219:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x021d:
            java.lang.Object r3 = r7.A00
            X.2Ra r3 = (X.AnonymousClass2Ra) r3
            java.lang.Object r1 = r7.A01
            X.2Rc r1 = (X.C49112Rc) r1
            java.lang.Object r2 = r7.A02
            X.4XG r2 = (X.AnonymousClass4XG) r2
            com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r1.A0H
            android.view.View r0 = r0.A00
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0016
            r1.A03()
            com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r3.A0E
            r0 = 1
            r1.A05(r0)
            r2.A00()
            r2.A03()
            r1 = 1284(0x504, float:1.799E-42)
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r3.A0H
            r0.setSystemUiVisibility(r1)
            return
        L_0x024a:
            java.lang.Object r2 = r7.A00
            X.2eJ r2 = (X.C52702eJ) r2
            java.lang.Object r5 = r7.A01
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            java.lang.Object r6 = r7.A02
            X.2uK r6 = (X.C58892uK) r6
            X.0sK r1 = r2.A03
            com.whatsapp.jid.UserJid r0 = r5.getUserJid()
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x031e
            X.1br r0 = r2.A0j
            com.whatsapp.jid.UserJid r1 = r0.A0l
        L_0x0266:
            X.137 r0 = r2.A0N
            int r4 = r6.A00
            r3 = 1
            r2 = r4 & 1
            if (r2 == r3) goto L_0x0270
            r3 = 0
        L_0x0270:
            r11 = 0
            if (r3 == 0) goto L_0x031b
            X.1Ww r10 = r6.A06
        L_0x0275:
            long r13 = r6.A04
            r3 = 4
            r2 = r4 & 4
            if (r2 != r3) goto L_0x027e
            X.1Ww r11 = r6.A05
        L_0x027e:
            long r15 = r6.A03
            X.27P r2 = r6.A07
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>(r2)
            X.27R r9 = new X.27R
            r9.<init>(r10, r11, r12, r13, r15)
            com.whatsapp.jid.UserJid r4 = r5.getUserJid()
            byte r2 = r5.device
            if (r2 != 0) goto L_0x0303
            X.1Ww r2 = r9.A03
            if (r2 != 0) goto L_0x0303
            long r12 = r9.A01
            X.0z2 r3 = r0.A0D
            long r5 = r3.A04(r4)
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0303
            java.lang.String r2 = "DeviceADVInfoHandler/handleADVMetadata hash is null, try to remove all devices"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1p6 r8 = r3.A09(r4)
            com.whatsapp.jid.DeviceJid r7 = r4.getPrimaryDevice()
            r5 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            X.0vs r2 = X.C17930vs.of(r7, r2)
            if (r8 != 0) goto L_0x02f2
            r10 = 0
        L_0x02be:
            r5 = 0
            r3.A0I(r2, r10, r4, r5)
        L_0x02c2:
            X.0sK r8 = r0.A01
            boolean r2 = r8.A0I(r1)
            if (r2 == 0) goto L_0x0325
            long r5 = r9.A00
            X.0z2 r7 = r0.A0D
            long r3 = r7.A04(r1)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0325
            java.util.Set r2 = r7.A0D(r1)
            int r3 = r2.size()
            r2 = 1
            if (r3 <= r2) goto L_0x0325
            boolean r2 = r8.A0G()
            if (r2 != 0) goto L_0x0325
            java.lang.String r1 = "DeviceADVInfoHandler/handleADVMetadata detect larger self timestamp, mark the list as dirty"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.0yp r0 = r0.A03
            r0.A00()
            return
        L_0x02f2:
            int r11 = r8.A00
            r5 = 1
            long r12 = r12 + r5
            r14 = 0
            r16 = 0
            r18 = 0
            X.1p6 r10 = new X.1p6
            r10.<init>(r11, r12, r14, r16, r18)
            goto L_0x02be
        L_0x0303:
            X.0sK r2 = r0.A01
            boolean r2 = r2.A0I(r4)
            if (r2 != 0) goto L_0x02c2
            long r2 = r9.A01
            X.0z2 r5 = r0.A0D
            long r6 = r5.A04(r4)
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x02c2
            r0.A0A(r4, r2)
            goto L_0x02c2
        L_0x031b:
            r10 = r11
            goto L_0x0275
        L_0x031e:
            r1.A0B()
            X.1ZT r1 = r1.A05
            goto L_0x0266
        L_0x0325:
            if (r1 == 0) goto L_0x0016
            boolean r2 = r8.A0I(r1)
            if (r2 != 0) goto L_0x0016
            long r5 = r9.A00
            X.0z2 r2 = r0.A0D
            long r3 = r2.A04(r1)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0016
            r0.A0A(r1, r5)
            return
        L_0x033d:
            java.lang.Object r4 = r7.A00
            X.28e r4 = (X.C453728e) r4
            java.lang.Object r0 = r7.A01
            java.lang.Object r2 = r7.A02
            X.0ve r2 = (X.C17790ve) r2
            r5 = 0
            boolean r1 = r4.AHa(r5)
            r4.AeB(r0)
            boolean r0 = r4.AHa(r5)
            if (r1 != 0) goto L_0x0016
            if (r0 == 0) goto L_0x0016
            X.15j r3 = r2.A00
            java.lang.String r7 = r4.AE0()
            r10 = 1
            X.0xU r2 = r3.A01
            boolean r0 = r2.A0X()
            if (r0 == 0) goto L_0x0016
            X.15i r1 = r3.A04
            java.lang.String r0 = "nux"
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0016
            X.0t3 r0 = r3.A03
            long r8 = r0.A00()
            X.1og r4 = new X.1og
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r10)
            X.15h r1 = r3.A02
            java.util.List r0 = java.util.Collections.singletonList(r4)
            java.util.Set r0 = r1.A04(r0)
            r2.A0V(r0)
            return
        L_0x038a:
            java.lang.Object r5 = r7.A00
            X.1Tv r5 = (X.C27971Tv) r5
            java.lang.Object r4 = r7.A01
            X.1ci r4 = (X.C30641ci) r4
            java.lang.Object r1 = r7.A02
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = "paymentStepUpInfo"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            X.1lf r3 = (X.C35281lf) r3
            X.0wT r6 = r5.A09
            org.json.JSONObject r0 = r3.A02()
            java.lang.String r2 = r0.toString()
            android.content.SharedPreferences r0 = r6.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payment_step_up_info"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            X.0tz r0 = r5.A01
            X.2KI r7 = X.C115275pU.A00(r0, r3)
            X.0w7 r0 = r5.A04
            r0.A04(r7)
            r2 = 0
            android.content.SharedPreferences r0 = r6.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payment_step_up_update_ack"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            X.13O r2 = r5.A0D
            java.lang.String r1 = r3.A02
            X.109 r0 = r2.A07
            r0.A01(r1)
            X.0pt r3 = r2.A01
            X.1Tx r2 = r2.A08
            r1 = 5
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A0K(r0)
            X.17f r0 = r5.A05
            X.0ug r0 = r0.A03
            r0.A0E(r4)
            X.0wS r0 = r5.A0C
            X.19r r0 = r0.A03()
            X.69a r6 = r0.ACC()
            if (r6 == 0) goto L_0x0016
            r0 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 0
            java.lang.String r10 = "push_notification"
            r11 = r9
            r6.AKI(r7, r8, r9, r10, r11)
            return
        L_0x040c:
            java.lang.Object r3 = r7.A00
            X.12h r3 = (X.C209712h) r3
            java.lang.Object r2 = r7.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r7.A02
            X.2Ig r1 = (X.C47262Ig) r1
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x139a
            r1.ATm(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0425:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            r2.next()
            X.12g r0 = r3.A0A
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0438:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0425
            r1.next()
            goto L_0x0438
        L_0x0442:
            java.lang.Object r4 = r7.A00
            X.1MB r4 = (X.AnonymousClass1MB) r4
            java.lang.Object r1 = r7.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r7.A02
            java.util.List r0 = (java.util.List) r0
            r4.A04(r1)
            java.util.Iterator r3 = r0.iterator()
        L_0x0455:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r3.next()
            X.01Q r2 = (X.AnonymousClass01Q) r2
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x0455
            X.1Vt r0 = (X.AnonymousClass1Vt) r0
            java.lang.String r1 = r0.A0K
            java.lang.Object r0 = r2.A01
            X.1Vw r0 = (X.C28381Vw) r0
            r4.A03(r0, r1)
            goto L_0x0455
        L_0x0471:
            java.lang.Object r4 = r7.A02
            X.125 r4 = (X.AnonymousClass125) r4
            java.util.HashMap r0 = r4.A06
            java.lang.Object r3 = r7.A01
            X.0rv r3 = (X.C15830rv) r3
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "presencemgr/timeout/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.Object r1 = r7.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A06(r3, r1)
            X.127 r0 = r4.A01
            r0.A04(r3)
            return
        L_0x04a7:
            java.lang.Object r5 = r7.A00
            X.1Tu r5 = (X.C27961Tu) r5
            java.lang.Object r4 = r7.A01
            X.1ci r4 = (X.C30641ci) r4
            java.lang.Object r1 = r7.A02
            X.1Vv r1 = (X.C28371Vv) r1
            com.whatsapp.jid.Jid r0 = r4.A01
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.of(r0)
            X.AnonymousClass00B.A06(r10)
            X.1Yb r6 = X.C28851Ya.A02(r10)
            X.0xT r0 = r5.A05
            java.util.concurrent.locks.Lock r9 = r0.A02(r6)
            if (r9 == 0) goto L_0x04cb
            r9.lock()     // Catch:{ all -> 0x139e }
        L_0x04cb:
            X.11s r3 = r5.A03     // Catch:{ all -> 0x139e }
            X.1WL r7 = r3.A0B(r6)     // Catch:{ all -> 0x139e }
            java.lang.String r0 = "identity"
            X.1Vv r8 = r1.A0J(r0)     // Catch:{ all -> 0x139e }
            java.lang.String r0 = "registration"
            X.1Vv r0 = r1.A0J(r0)     // Catch:{ all -> 0x139e }
            if (r7 == 0) goto L_0x0512
            if (r8 == 0) goto L_0x0516
            if (r0 == 0) goto L_0x0516
            X.0pd r2 = r5.A06     // Catch:{ all -> 0x139e }
            r1 = 1296(0x510, float:1.816E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x139e }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x139e }
            if (r0 == 0) goto L_0x0516
            byte[] r2 = r8.A01     // Catch:{ all -> 0x139e }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x139e }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x139e }
            r1 = 5
            X.1cD r0 = new X.1cD     // Catch:{ all -> 0x139e }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x139e }
            X.1WL r2 = new X.1WL     // Catch:{ all -> 0x139e }
            r2.<init>(r0)     // Catch:{ all -> 0x139e }
            X.1cD r1 = r2.A00     // Catch:{ all -> 0x139e }
            X.1cD r0 = r7.A00     // Catch:{ all -> 0x139e }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x139e }
            if (r0 != 0) goto L_0x0512
            r3.A0U(r6)     // Catch:{ all -> 0x139e }
            r3.A0R(r2, r6)     // Catch:{ all -> 0x139e }
        L_0x0512:
            r5.A03(r4)     // Catch:{ all -> 0x139e }
            goto L_0x0524
        L_0x0516:
            X.1HD r3 = r5.A01     // Catch:{ all -> 0x139e }
            r2 = 1
            com.whatsapp.jid.DeviceJid[] r1 = new com.whatsapp.jid.DeviceJid[r2]     // Catch:{ all -> 0x139e }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x139e }
            r0 = 8
            r3.A04(r1, r0, r2)     // Catch:{ all -> 0x139e }
            goto L_0x0512
        L_0x0524:
            if (r9 == 0) goto L_0x0016
            r9.unlock()
            return
        L_0x052a:
            java.lang.Object r1 = r7.A00
            X.17A r1 = (X.AnonymousClass17A) r1
            java.lang.Object r0 = r7.A01
            X.0tZ r0 = (X.C16740tZ) r0
            java.lang.Object r3 = r7.A02
            X.03L r2 = r1.A00
            long r0 = r0.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06(r0, r3)
            return
        L_0x0540:
            java.lang.Object r3 = r7.A00
            X.1Rr r3 = (X.C27421Rr) r3
            java.lang.Object r2 = r7.A01
            X.0rx r2 = (X.C15840rx) r2
            java.lang.Object r0 = r7.A02
            X.0tZ r0 = (X.C16740tZ) r0
            long r0 = r0.A13
            r2.A0A = r0
            X.0ts r0 = r3.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0556, Error | RuntimeException -> 0x13a5 }
            r0.A09(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0556, Error | RuntimeException -> 0x13a5 }
            return
        L_0x0556:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r3.A04
            r0.A02()
            return
        L_0x0560:
            java.lang.Object r6 = r7.A00
            X.0t6 r6 = (X.C16460t6) r6
            java.lang.Object r8 = r7.A01
            X.1Vw r8 = (X.C28381Vw) r8
            java.lang.Object r5 = r7.A02
            X.1Vt r5 = (X.AnonymousClass1Vt) r5
            X.0th r0 = r6.A0K
            X.0tZ r4 = r0.A03(r8)
            r10 = 1
            if (r4 == 0) goto L_0x0597
            X.0tq r0 = r6.A0v
            X.0tf r1 = r0.get()
            r0.A04()     // Catch:{ all -> 0x0591 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x0591 }
            boolean r0 = r0.A0D(r1)     // Catch:{ all -> 0x0591 }
            if (r0 == 0) goto L_0x058b
            java.lang.String r0 = r5.A0K     // Catch:{ all -> 0x0591 }
            r6.A0h(r4, r0, r10)     // Catch:{ all -> 0x0591 }
        L_0x058b:
            r1.close()
            X.1Vt r3 = r4.A0L
            goto L_0x0598
        L_0x0591:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0a92 }
            goto L_0x0a92
        L_0x0597:
            r3 = 0
        L_0x0598:
            X.0wS r0 = r6.A1f
            r0.A06()
            X.16r r7 = r0.A08
            java.lang.String r20 = " ts: "
            if (r3 == 0) goto L_0x07d6
            int r0 = r3.A02
            r33 = r0
            java.lang.String r0 = r3.A0J
            r19 = r0
            boolean r0 = r3.A0H()
            if (r0 == 0) goto L_0x0628
            boolean r0 = r5.A0H()
            if (r0 != 0) goto L_0x0628
        L_0x05b7:
            int r9 = r5.A03
            long r0 = r5.A06
            X.1W2 r2 = r5.A0A
            boolean r0 = r3.A0I(r2, r9, r0)
            java.lang.String r9 = " new: "
            if (r0 != 0) goto L_0x05f5
            if (r10 != 0) goto L_0x05f5
            java.lang.String r0 = "msgstore/updateMessagePaymentTransaction/PAY nochange: old status: "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            int r0 = r3.A02
            r4.append(r0)
            r4.append(r9)
            int r0 = r5.A02
            r4.append(r0)
            java.lang.String r0 = " old ts: "
            r4.append(r0)
            long r0 = r3.A06
            r4.append(r0)
            java.lang.String r0 = " new ts: "
            r4.append(r0)
            long r0 = r5.A06
            r4.append(r0)
        L_0x05ef:
            java.lang.String r0 = r4.toString()
            goto L_0x0896
        L_0x05f5:
            java.lang.String r2 = r3.A0K
            if (r2 != 0) goto L_0x060d
            java.lang.String r0 = r5.A0K
            r3.A0K = r0
        L_0x05fd:
            int r13 = r5.A02
            long r0 = r5.A06
            java.lang.String r12 = r5.A0H
            java.lang.String r11 = r5.A0J
            java.lang.String r10 = r5.A0F
            X.1W2 r9 = r5.A0A
            r2 = 16
            monitor-enter(r3)
            goto L_0x062a
        L_0x060d:
            java.lang.String r1 = r5.A0K
            if (r1 == 0) goto L_0x05fd
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x05fd
            java.lang.String r0 = "msgstore/updateMessagePaymentTransaction/PAY nochange: id's not equal, old trans id: "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r2)
            r4.append(r9)
            r4.append(r1)
            goto L_0x05ef
        L_0x0628:
            r10 = 0
            goto L_0x05b7
        L_0x062a:
            r21 = r3
            r22 = r12
            r23 = r11
            r24 = r10
            r25 = r13
            r26 = r0
            r21.A07(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0646 }
            if (r9 == 0) goto L_0x0649
            X.1W2 r0 = r3.A0A     // Catch:{ all -> 0x0646 }
            if (r0 == 0) goto L_0x0643
            r0.A0T(r9)     // Catch:{ all -> 0x0646 }
            goto L_0x0649
        L_0x0643:
            r3.A0A = r9     // Catch:{ all -> 0x0646 }
            goto L_0x0649
        L_0x0646:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x0649:
            monitor-exit(r3)
            int r1 = r3.A03
            r0 = 5
            if (r1 != r0) goto L_0x07a3
            java.lang.String r0 = r8.A01
            boolean r0 = r7.A0l(r5, r3, r0)
            r4.A0L = r5
            r3.A04(r5)
        L_0x065a:
            if (r0 == 0) goto L_0x081d
            int r1 = r5.A02
            r0 = r33
            if (r1 == r0) goto L_0x0687
            X.15Y r13 = r6.A1e
            X.1Vw r9 = r4.A11
            long r11 = r4.A0I
            X.0yz r0 = r13.A05
            X.0rv r10 = r9.A00
            X.0tZ r0 = r0.A01(r10)
            X.AnonymousClass00B.A06(r0)
            X.1Vw r0 = r0.A11
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r9.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0690
            X.1Vo r3 = r13.A0A
            java.lang.String r1 = "Do not insert system message if last message is the transaction message."
            r0 = 0
            r3.A03(r0, r1)
        L_0x0687:
            java.lang.String r0 = "msgStore/updateMessagePaymentTransaction/PAY updated transaction status to: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            goto L_0x0802
        L_0x0690:
            X.15p r1 = r13.A0B
            java.lang.String r8 = r1.A0N(r3)
            java.lang.String r7 = r1.A0Q(r3)
            java.lang.String r18 = r1.A0J(r3)
            boolean r0 = r9.A02
            r32 = r0
            int r0 = r3.A02
            r21 = r0
            long r15 = r3.A06
            X.1Vy r0 = r3.A08
            if (r0 != 0) goto L_0x079f
            X.0tz r0 = r13.A04
            android.content.Context r14 = r0.A00
            r0 = 2131892363(0x7f12188b, float:1.9419472E38)
            java.lang.String r24 = r14.getString(r0)
        L_0x06b7:
            X.1Vy r0 = r3.A08
            r17 = 1
            if (r0 != 0) goto L_0x0797
            r27 = 1
        L_0x06bf:
            r22 = r8
            r23 = r7
            r25 = r21
            r26 = r33
            r28 = r11
            r30 = r15
            r21 = r1
            java.lang.String r0 = r21.A0Y(r22, r23, r24, r25, r26, r27, r28, r30, r32)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0687
            X.1Vo r15 = r13.A0A
            java.lang.String r0 = "generatePaymentStatusChangeMessageIfNeeded receiverName:"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r0)
            r14.append(r8)
            java.lang.String r0 = " senderName:"
            r14.append(r0)
            r14.append(r7)
            java.lang.String r0 = " newStatus:"
            r14.append(r0)
            int r0 = r3.A02
            r14.append(r0)
            java.lang.String r0 = " oldStatus:"
            r14.append(r0)
            r0 = r33
            r14.append(r0)
            java.lang.String r0 = " initTs:"
            r14.append(r0)
            r14.append(r11)
            java.lang.String r0 = " updateTs:"
            r14.append(r0)
            long r0 = r3.A06
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            r15.A06(r0)
            X.122 r14 = r13.A0C
            X.AnonymousClass00B.A06(r10)
            X.0t3 r0 = r13.A03
            long r0 = r0.A00()
            r13 = 37
            X.1sL r10 = r14.A08(r10, r13, r0)
            X.1sN r10 = (X.C39371sN) r10
            java.lang.String r0 = r3.A0K
            r10.A03 = r0
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.String.valueOf(r33)
            r14 = 0
            r1[r14] = r0
            r1[r17] = r19
            int r0 = r3.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13 = 2
            r1[r13] = r0
            r0 = 3
            r1[r0] = r8
            r0 = 4
            r1[r0] = r7
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r7 = ";"
            java.lang.String r0 = android.text.TextUtils.join(r7, r0)
            r10.A01 = r0
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r10.A02 = r0
            long r0 = r3.A06
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.A04 = r0
            r10.A02 = r9
            java.lang.String[] r8 = new java.lang.String[r13]
            X.1Vy r0 = r3.A08
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x078c
            r0 = r1
        L_0x076f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8[r14] = r0
            X.1Vy r0 = r3.A08
            if (r0 != 0) goto L_0x077b
            r18 = r1
        L_0x077b:
            r8[r17] = r18
            java.util.List r0 = java.util.Arrays.asList(r8)
            java.lang.String r0 = android.text.TextUtils.join(r7, r0)
            r10.A00 = r0
            r6.A0w(r10, r2)
            goto L_0x0687
        L_0x078c:
            java.math.BigDecimal r0 = r0.A00
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x076f
        L_0x0797:
            java.math.BigDecimal r0 = r0.A00
            int r27 = r0.intValue()
            goto L_0x06bf
        L_0x079f:
            r24 = r18
            goto L_0x06b7
        L_0x07a3:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x07b7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
            r4.A0L = r5
            boolean r0 = r7.A0n(r0)
            goto L_0x065a
        L_0x07b7:
            X.1Vt r8 = r4.A0L
            if (r8 == 0) goto L_0x081d
            X.1Vw r1 = r4.A11
            X.1W2 r0 = r5.A0A
            if (r0 == 0) goto L_0x07d2
            long r12 = r0.A09()
            int r11 = r0.A05()
        L_0x07c9:
            r10 = r33
            r9 = r1
            boolean r0 = r7.A0m(r8, r9, r10, r11, r12)
            goto L_0x065a
        L_0x07d2:
            r12 = 0
            r11 = 0
            goto L_0x07c9
        L_0x07d6:
            r2 = 16
            java.lang.String r0 = r5.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x082c
            X.17g r4 = r6.A1g
            r0 = 0
            r3 = 0
            X.0tZ r4 = r4.A01(r8, r3, r0)
            java.lang.String r0 = r5.A0K
            r4.A0n = r0
            r4.A0L = r5
            java.lang.String r1 = r7.A0Q(r4, r3)
            java.lang.String r0 = "msgStore/updateMessagePaymentTransaction/PAY added new transaction with trans id: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r0 = " status: "
            r3.append(r0)
        L_0x0802:
            int r0 = r5.A02
            r3.append(r0)
            r0 = r20
            r3.append(r0)
            long r0 = r5.A06
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17E r0 = r6.A0e
            r0.A00(r4, r2)
        L_0x081d:
            X.17F r1 = r6.A0a
            boolean r0 = r1.A0P()
            if (r0 == 0) goto L_0x0828
            r1.A0O(r4)
        L_0x0828:
            r6.A0c(r4)
            return
        L_0x082c:
            if (r4 == 0) goto L_0x0828
            goto L_0x081d
        L_0x082f:
            java.lang.Object r4 = r7.A00
            X.1Sn r4 = (X.C27631Sn) r4
            java.lang.Object r3 = r7.A01
            X.0tZ r3 = (X.C16740tZ) r3
            java.lang.Object r2 = r7.A02
            X.0tZ r2 = (X.C16740tZ) r2
            X.17H r1 = r4.A0G
            X.1Vw r0 = r3.A11
            r1.A03(r0)
            r1.A02(r2)
            X.0rt r0 = r4.A06
            r0.A0E(r2)
            r0 = 1
            r3.A15 = r0
            return
        L_0x084e:
            java.lang.Object r5 = r7.A00
            X.1Sc r5 = (X.C27531Sc) r5
            java.lang.Object r4 = r7.A01
            X.0tZ r4 = (X.C16740tZ) r4
            java.lang.Object r3 = r7.A02
            X.0tZ r3 = (X.C16740tZ) r3
            X.0xq r2 = r5.A0C
            java.util.List r1 = java.util.Collections.singletonList(r4)
            r0 = 0
            r2.A0A(r1, r0)
            X.0rt r0 = r5.A04
            r0.A0E(r3)
            X.17Z r2 = r5.A03
            X.1Vw r0 = r4.A11
            X.0rv r1 = r0.A00
            r0 = 0
            r2.A03(r1, r0)
            return
        L_0x0874:
            java.lang.Object r4 = r7.A00
            X.11H r4 = (X.AnonymousClass11H) r4
            java.lang.Object r3 = r7.A01
            X.0rv r3 = (X.C15830rv) r3
            java.lang.Object r2 = r7.A02
            X.1jl r2 = (X.C34141jl) r2
            X.0rt r0 = r4.A02
            X.0rx r1 = r0.A06(r3)
            if (r1 != 0) goto L_0x089a
            java.lang.String r1 = "groupchatstore/updateGroupChatInfoInBackgroundIfExists/chat does not exist: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x0896:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x089a:
            r1.A0a = r2
            r0 = 0
            r4.A02(r1, r3, r0)
            return
        L_0x08a1:
            java.lang.Object r9 = r7.A00
            X.0us r9 = (X.C17310us) r9
            java.lang.Object r8 = r7.A01
            X.1cE r8 = (X.C30361cE) r8
            java.lang.Object r2 = r7.A02
            java.util.Map r2 = (java.util.Map) r2
            X.11J r0 = r9.A07
            X.0sN r1 = r8.A06
            java.util.concurrent.ConcurrentHashMap r0 = r0.A03
            java.lang.Object r6 = r0.get(r1)
            X.1cE r6 = (X.C30361cE) r6
            X.0tq r0 = r9.A09
            X.0tf r5 = r0.A02()
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x08fe }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x08f9 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x08f9 }
        L_0x08cb:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x08f9 }
            if (r0 == 0) goto L_0x08ef
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x08f9 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x08f9 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x08f9 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x08f9 }
            r1 = r8
            if (r6 == 0) goto L_0x08e1
            r1 = r6
        L_0x08e1:
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x08f9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x08f9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x08f9 }
            r9.A0B(r1, r2, r0)     // Catch:{ all -> 0x08f9 }
            goto L_0x08cb
        L_0x08ef:
            r4.A00()     // Catch:{ all -> 0x08f9 }
            r4.close()     // Catch:{ all -> 0x08fe }
            r5.close()
            return
        L_0x08f9:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x08fd }
        L_0x08fd:
            throw r0     // Catch:{ all -> 0x08fe }
        L_0x08fe:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0a92 }
            throw r0
        L_0x0903:
            java.lang.Object r0 = r7.A00
            X.2Ok r0 = (X.C48672Ok) r0
            java.lang.Object r2 = r7.A01
            X.1WF r2 = (X.AnonymousClass1WF) r2
            java.lang.Object r7 = r7.A02
            X.0yO r6 = r0.A01
            java.lang.Object r5 = r6.A0O
            monitor-enter(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a18 }
            r1.<init>()     // Catch:{ all -> 0x0a18 }
            java.lang.String r0 = "companion-device-manager/critical sync successful. DeviceJid: "
            r1.append(r0)     // Catch:{ all -> 0x0a18 }
            X.1WN r3 = r2.A01     // Catch:{ all -> 0x0a18 }
            com.whatsapp.jid.DeviceJid r8 = r3.A06     // Catch:{ all -> 0x0a18 }
            r1.append(r8)     // Catch:{ all -> 0x0a18 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a18 }
            java.lang.Iterable r0 = r6.A01()     // Catch:{ all -> 0x0a18 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0a18 }
        L_0x0932:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0a18 }
            if (r0 == 0) goto L_0x0942
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0a18 }
            X.1WC r0 = (X.AnonymousClass1WC) r0     // Catch:{ all -> 0x0a18 }
            r0.A03(r2)     // Catch:{ all -> 0x0a18 }
            goto L_0x0932
        L_0x0942:
            X.16R r2 = r6.A06     // Catch:{ all -> 0x0a18 }
            r1 = 2
            java.lang.String r0 = "CompanionDevice"
            android.location.Location r4 = r2.A02(r0, r1)     // Catch:{ all -> 0x0a18 }
            if (r4 == 0) goto L_0x09f7
            long r9 = r4.getTime()     // Catch:{ all -> 0x0a18 }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r9 = r9 + r0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0a18 }
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x09f7
            java.lang.String r0 = "CompanionDevice/location/last "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a18 }
            r2.<init>(r0)     // Catch:{ all -> 0x0a18 }
            long r0 = r4.getTime()     // Catch:{ all -> 0x0a18 }
            r2.append(r0)     // Catch:{ all -> 0x0a18 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0a18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a18 }
            r6.A08(r4, r3)     // Catch:{ all -> 0x0a18 }
        L_0x0975:
            X.0rz r4 = r6.A0D     // Catch:{ all -> 0x0a18 }
            java.lang.String r3 = r8.getRawString()     // Catch:{ all -> 0x0a18 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0a18 }
            X.01D r0 = r4.A01     // Catch:{ all -> 0x0a18 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0a18 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0a18 }
            java.lang.String r2 = "companion_device_verification_ids"
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)     // Catch:{ all -> 0x0a18 }
            if (r0 == 0) goto L_0x09a3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a18 }
            r1.<init>()     // Catch:{ all -> 0x0a18 }
            r1.append(r0)     // Catch:{ all -> 0x0a18 }
            java.lang.String r0 = ","
            r1.append(r0)     // Catch:{ all -> 0x0a18 }
            r1.append(r3)     // Catch:{ all -> 0x0a18 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0a18 }
        L_0x09a3:
            r4.A1A(r2, r3)     // Catch:{ all -> 0x0a18 }
            X.0tz r0 = r6.A0C     // Catch:{ all -> 0x0a18 }
            android.content.Context r11 = r0.A00     // Catch:{ all -> 0x0a18 }
            java.lang.Class<com.obwhatsapp.companiondevice.CompanionDeviceVerificationReceiver> r12 = com.obwhatsapp.companiondevice.CompanionDeviceVerificationReceiver.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0a18 }
            r1.<init>(r11, r12)     // Catch:{ all -> 0x0a18 }
            r10 = 0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r0 = X.C42341xd.A01(r11, r10, r1, r0)     // Catch:{ all -> 0x0a18 }
            if (r0 != 0) goto L_0x09eb
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x0a18 }
            r0.<init>()     // Catch:{ all -> 0x0a18 }
            double r8 = r0.nextDouble()     // Catch:{ all -> 0x0a18 }
            r0 = 4712059816451768320(0x4164997000000000, double:1.08E7)
            double r8 = r8 * r0
            long r3 = (long) r8     // Catch:{ all -> 0x0a18 }
            long r3 = r3 + r13
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0a18 }
            long r1 = r1 + r3
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0a18 }
            r3.<init>(r11, r12)     // Catch:{ all -> 0x0a18 }
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r3 = X.C42341xd.A01(r11, r10, r3, r0)     // Catch:{ all -> 0x0a18 }
            X.12r r0 = r6.A09     // Catch:{ all -> 0x0a18 }
            boolean r0 = r0.A01(r3, r10, r1)     // Catch:{ all -> 0x0a18 }
            if (r0 != 0) goto L_0x09eb
            java.lang.String r0 = "CompanionDevice/scheduleCompanionDeviceVerificationAlarm AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0a18 }
        L_0x09eb:
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x0a18 }
            X.16Q r0 = r6.A0H     // Catch:{ all -> 0x0a18 }
            X.1iM r0 = r0.A04     // Catch:{ all -> 0x0a18 }
            r0.A03(r7)     // Catch:{ all -> 0x0a18 }
            monitor-exit(r5)     // Catch:{ all -> 0x0a18 }
            goto L_0x0a17
        L_0x09f7:
            X.4gQ r4 = new X.4gQ     // Catch:{ all -> 0x0a18 }
            r4.<init>(r3, r6)     // Catch:{ all -> 0x0a18 }
            android.os.Handler r3 = r6.A04     // Catch:{ all -> 0x0a18 }
            r1 = 12
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ all -> 0x0a18 }
            r0.<init>(r6, r1, r4)     // Catch:{ all -> 0x0a18 }
            r3.post(r0)     // Catch:{ all -> 0x0a18 }
            r0 = 11
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r2 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ all -> 0x0a18 }
            r2.<init>(r6, r0, r4)     // Catch:{ all -> 0x0a18 }
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0a18 }
            goto L_0x0975
        L_0x0a17:
            return
        L_0x0a18:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0a18 }
            throw r1
        L_0x0a1b:
            java.lang.Object r2 = r7.A00
            X.19P r2 = (X.AnonymousClass19P) r2
            java.lang.Object r1 = r7.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r7.A02
            java.util.Collection r0 = (java.util.Collection) r0
            X.0uz r0 = X.C17380uz.copyOf((java.util.Collection) r0)
            r2.A01(r0, r1)
            return
        L_0x0a2f:
            java.lang.Object r1 = r7.A00
            X.1RS r1 = (X.AnonymousClass1RS) r1
            java.lang.Object r6 = r7.A01
            X.1WE r6 = (X.AnonymousClass1WE) r6
            java.lang.Object r7 = r7.A02
            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7
            X.1XS r5 = r1.A00
            java.lang.Object r0 = r5.A00()
            if (r0 != 0) goto L_0x0a96
            X.AnonymousClass00B.A00()
            X.19K r0 = r1.A02
            X.0tf r4 = r0.get()
            X.0tg r8 = r4.A02     // Catch:{ all -> 0x0a8d }
            java.lang.String r3 = "SELECT DISTINCT (device_id) FROM msg_history_sync WHERE status=?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0a8d }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0a8d }
            r2[r1] = r0     // Catch:{ all -> 0x0a8d }
            android.database.Cursor r3 = r8.A08(r3, r2)     // Catch:{ all -> 0x0a8d }
            if (r3 == 0) goto L_0x0a93
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0a88 }
            r2.<init>()     // Catch:{ all -> 0x0a88 }
        L_0x0a65:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0a88 }
            if (r0 == 0) goto L_0x0a81
            java.lang.String r0 = "device_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0a88 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0a88 }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch:{ all -> 0x0a88 }
            if (r1 == 0) goto L_0x0a65
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0a88 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0a88 }
            goto L_0x0a65
        L_0x0a81:
            r5.A04(r2)     // Catch:{ all -> 0x0a88 }
            r3.close()     // Catch:{ all -> 0x0a8d }
            goto L_0x0a93
        L_0x0a88:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0a8c }
        L_0x0a8c:
            throw r0     // Catch:{ all -> 0x0a8d }
        L_0x0a8d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0a92 }
            throw r0
        L_0x0a92:
            throw r0
        L_0x0a93:
            r4.close()
        L_0x0a96:
            r5.A03(r6, r7)
            return
        L_0x0a9a:
            java.lang.Object r0 = r7.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r2 = r7.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r7.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.0sO r0 = r0.A0a
            r0.A07(r1, r2)
            return
        L_0x0aac:
            java.lang.Object r2 = r7.A00
            X.0wL r2 = (X.C18220wL) r2
            java.lang.Object r1 = r7.A01
            X.1XP r1 = (X.AnonymousClass1XP) r1
            java.lang.Object r0 = r7.A02
            X.1f0 r0 = (X.C31771f0) r0
            r2.A09(r1, r0)
            return
        L_0x0abc:
            java.lang.Object r3 = r7.A00
            X.0wL r3 = (X.C18220wL) r3
            java.lang.Object r2 = r7.A01
            X.1XP r2 = (X.AnonymousClass1XP) r2
            java.lang.Object r1 = r7.A02
            X.21B r1 = (X.AnonymousClass21B) r1
            X.1XS r0 = r2.A0H
            r0.A04(r1)
            java.lang.String r0 = r2.A0U
            if (r0 != 0) goto L_0x0ad6
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0ad6
            return
        L_0x0ad6:
            r3.A0C(r2, r1)
            return
        L_0x0ada:
            java.lang.Object r5 = r7.A00
            X.1Gj r5 = (X.C24551Gj) r5
            java.lang.Object r4 = r7.A01
            X.0tZ r4 = (X.C16740tZ) r4
            java.lang.Object r3 = r7.A02
            X.4FN r3 = (X.AnonymousClass4FN) r3
            X.17o r2 = r5.A01
            long r0 = r4.A13
            byte[] r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0af2
            r4.A1F = r0
        L_0x0af2:
            X.4Vk r1 = r5.A01(r4)
            X.37g r0 = r3.A00
            r0.A05 = r1
            return
        L_0x0afc:
            java.lang.Object r1 = r7.A00
            X.0tZ r1 = (X.C16740tZ) r1
            java.lang.Object r4 = r7.A01
            byte[] r4 = (byte[]) r4
            java.lang.Object r0 = r7.A02
            X.1qT r0 = (X.C38241qT) r0
            X.0tm r3 = r1.A0F()
            X.1XK r2 = r0.A09
            boolean r1 = r0.A0U
            boolean r0 = X.C221516v.A01(r2)
            if (r0 != 0) goto L_0x0b22
            X.1XK r0 = X.AnonymousClass1XK.A0S
            if (r2 == r0) goto L_0x0b22
            boolean r0 = X.C31831f6.A02(r2)
            if (r0 == 0) goto L_0x0b27
            if (r1 == 0) goto L_0x0b27
        L_0x0b22:
            r0 = 1
        L_0x0b23:
            r3.A03(r4, r0)
            return
        L_0x0b27:
            r0 = 0
            goto L_0x0b23
        L_0x0b29:
            java.lang.Object r2 = r7.A00
            X.1HP r2 = (X.AnonymousClass1HP) r2
            java.lang.Object r1 = r7.A01
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r0 = r7.A02
            java.util.Random r0 = (java.util.Random) r0
            r2.A00(r1, r0)
            return
        L_0x0b39:
            java.lang.Object r4 = r7.A00
            com.obwhatsapp.mediaview.MediaViewFragment r4 = (com.obwhatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r10 = r7.A01
            X.0tY r10 = (X.C16730tY) r10
            java.lang.Object r6 = r7.A02
            java.io.File r6 = (java.io.File) r6
            byte r3 = r10.A10
            java.lang.String r2 = r10.A06
            r1 = 3
            r12 = 2
            r0 = 1
            if (r2 == 0) goto L_0x0b99
            java.lang.String r0 = "/"
            java.lang.String[] r1 = r2.split(r0)
            r0 = 0
            r1 = r1[r0]
            int r0 = r1.hashCode()
            switch(r0) {
                case 93166550: goto L_0x0b7d;
                case 100313435: goto L_0x0b86;
                case 112202875: goto L_0x0b8f;
                default: goto L_0x0b5e;
            }
        L_0x0b5e:
            java.lang.String r1 = "mediaview/save-media-unsupported-mimetype-"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
        L_0x0b6c:
            boolean r0 = r4.A1h
            if (r0 == 0) goto L_0x0b73
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0b73:
            X.0pt r2 = r4.A0I
            r1 = 2131891333(0x7f121485, float:1.9417383E38)
            r0 = 0
            r2.A0A(r1, r0)
            return
        L_0x0b7d:
            java.lang.String r0 = "audio"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0ba8
            goto L_0x0b5e
        L_0x0b86:
            java.lang.String r0 = "image"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0bad
            goto L_0x0b5e
        L_0x0b8f:
            java.lang.String r0 = "video"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0bb2
            goto L_0x0b5e
        L_0x0b99:
            if (r3 == r0) goto L_0x0bad
            if (r3 == r12) goto L_0x0ba8
            if (r3 == r1) goto L_0x0bb2
            r0 = 13
            if (r3 == r0) goto L_0x0bb2
            r0 = 29
            if (r3 == r0) goto L_0x0bad
            goto L_0x0b5e
        L_0x0ba8:
            java.lang.String r9 = android.os.Environment.DIRECTORY_MUSIC
            android.net.Uri r8 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            goto L_0x0bb6
        L_0x0bad:
            java.lang.String r9 = android.os.Environment.DIRECTORY_PICTURES
            android.net.Uri r8 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x0bb6
        L_0x0bb2:
            java.lang.String r9 = android.os.Environment.DIRECTORY_MOVIES
            android.net.Uri r8 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
        L_0x0bb6:
            X.0tz r0 = r4.A0h
            android.content.Context r5 = r0.A00
            java.lang.String r3 = r6.getName()
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r9)
            java.lang.String r0 = "Whatsapp"
            java.io.File r11 = new java.io.File
            r11.<init>(r1, r0)
            boolean r0 = r11.exists()
            if (r0 != 0) goto L_0x0bd8
            boolean r0 = r11.mkdirs()
            if (r0 != 0) goto L_0x0bd8
            java.lang.String r1 = "mediaview/save-media-destination-file-null"
            goto L_0x0b6c
        L_0x0bd8:
            java.io.File r1 = new java.io.File
            r1.<init>(r11, r3)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0c20
            java.lang.String r2 = "\\."
            java.lang.String[] r1 = r3.split(r2, r12)
            r0 = 0
            r7 = r1[r0]
            java.lang.String[] r1 = r3.split(r2, r12)
            r0 = 1
            r3 = r1[r0]
            r2 = 1
        L_0x0bf4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = "("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")."
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r11, r0)
            boolean r0 = r1.exists()
            r0 = r0 ^ 1
            int r2 = r2 + 1
            if (r0 != 0) goto L_0x0c20
            goto L_0x0bf4
        L_0x0c20:
            java.lang.String r0 = r10.A06
            android.content.ContentValues r1 = X.AnonymousClass472.A00(r1, r9, r0)
            if (r8 == 0) goto L_0x0c33
            android.content.ContentResolver r0 = r5.getContentResolver()
            android.net.Uri r1 = r0.insert(r8, r1)
            boolean r3 = r4.A1h
            goto L_0x0c37
        L_0x0c33:
            java.lang.String r1 = "mediaview/save-media-context-or-media-uri-null"
            goto L_0x0b6c
        L_0x0c37:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0c5d }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0c5d }
            android.content.ContentResolver r0 = r5.getContentResolver()     // Catch:{ all -> 0x0c58 }
            java.io.OutputStream r1 = r0.openOutputStream(r1)     // Catch:{ all -> 0x0c58 }
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x0c51 }
            if (r1 == 0) goto L_0x0c4c
            r1.close()     // Catch:{ all -> 0x0c58 }
        L_0x0c4c:
            r2.close()     // Catch:{ Exception -> 0x0c5d }
            r3 = 1
            goto L_0x0c66
        L_0x0c51:
            r0 = move-exception
            if (r1 == 0) goto L_0x0c57
            r1.close()     // Catch:{ all -> 0x0c57 }
        L_0x0c57:
            throw r0     // Catch:{ all -> 0x0c58 }
        L_0x0c58:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0c5c }
        L_0x0c5c:
            throw r0     // Catch:{ Exception -> 0x0c5d }
        L_0x0c5d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0c65
            java.lang.String r0 = "mediasave/save-media-io-exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0c65:
            r3 = 0
        L_0x0c66:
            r2 = 0
            X.0pt r1 = r4.A0I
            r0 = 2131891333(0x7f121485, float:1.9417383E38)
            if (r3 == 0) goto L_0x0c71
            r0 = 2131891334(0x7f121486, float:1.9417385E38)
        L_0x0c71:
            r1.A0A(r0, r2)
            return
        L_0x0c75:
            java.lang.Object r3 = r7.A00
            X.2Fj r3 = (X.AnonymousClass2Fj) r3
            java.lang.Object r5 = r7.A01
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.Object r4 = r7.A02
            X.1iE r4 = (X.C33221iE) r4
            X.0sK r0 = r3.A04
            r0.A0B()
            X.1Za r0 = r0.A04
            X.AnonymousClass00B.A06(r0)
            X.1Yb r2 = X.C28851Ya.A02(r0)
            java.lang.String r0 = r5.getRawString()
            X.1dH r1 = new X.1dH
            r1.<init>(r2, r0)
            X.11s r0 = r3.A08
            X.1n0 r0 = r0.A0C(r1)
            byte[] r3 = r0.A01
            X.AnonymousClass00B.A06(r3)
            X.1Wm r0 = r4.A00
            X.1iD r0 = (X.C33211iD) r0
            X.2tY r0 = r0.A0h
            if (r0 != 0) goto L_0x0cad
            X.2tY r0 = X.C58472tY.A03
        L_0x0cad:
            X.1Wr r2 = r0.A0U()
            X.3fL r2 = (X.C69623fL) r2
            java.lang.String r0 = r5.getRawString()
            r2.A06(r0)
            int r1 = r3.length
            r0 = 0
            X.1Ww r0 = X.C28631Ww.A01(r3, r0, r1)
            r2.A05(r0)
            r4.A0B(r2)
            return
        L_0x0cc7:
            java.lang.Object r6 = r7.A00
            X.0pj r6 = (X.C14770pj) r6
            java.lang.Object r8 = r7.A01
            X.0rv r8 = (X.C15830rv) r8
            java.lang.Object r7 = r7.A02
            X.0tZ r7 = (X.C16740tZ) r7
            java.util.Map r0 = r6.A0U
            java.lang.Object r4 = r0.get(r8)
            java.util.List r4 = (java.util.List) r4
            r3 = 1
            if (r4 != 0) goto L_0x0ce5
            java.util.List r4 = r6.A06(r8, r3)
            r0.put(r8, r4)
        L_0x0ce5:
            java.util.Iterator r2 = r4.iterator()
        L_0x0ce9:
            boolean r0 = r2.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x0d06
            java.lang.Object r0 = r2.next()
            X.1ps r0 = (X.C37871ps) r0
            X.0tZ r0 = r0.A00
            X.1Vw r1 = r0.A11
            X.1Vw r0 = r7.A11
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ce9
        L_0x0d02:
            X.C14770pj.A00(r4)
            return
        L_0x0d06:
            boolean r0 = r7 instanceof X.C38831rU
            if (r0 == 0) goto L_0x0d7d
            X.1Vw r0 = r7.A11
            X.0rv r9 = r0.A00
            r0 = r7
            X.1rU r0 = (X.C38831rU) r0
            java.lang.String r2 = r0.A01
            X.1Vw r1 = new X.1Vw
            r1.<init>(r9, r2, r5)
        L_0x0d18:
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x0d62
            java.lang.Object r9 = r4.get(r5)
            X.1ps r9 = (X.C37871ps) r9
            X.0tZ r0 = r9.A00
            X.1Vw r0 = r0.A11
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0d42
            boolean r0 = r9 instanceof X.C45982Bw
            if (r0 == 0) goto L_0x0d7a
            X.2Bw r9 = (X.C45982Bw) r9
            X.23a r0 = r9.A00
            X.0tZ r0 = r0.A01
            X.1Vw r0 = r0.A11
            java.lang.String r0 = r0.A01
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0d7a
        L_0x0d42:
            if (r5 < 0) goto L_0x0d62
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x0d62
            X.0pd r2 = r6.A0M
            r1 = 1818(0x71a, float:2.548E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0d72
            r4.remove(r5)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0d62
            r6.A09(r8)
        L_0x0d62:
            int r1 = r4.size()
            r0 = 7
            if (r1 <= r0) goto L_0x0d02
            int r0 = r4.size()
            int r0 = r0 - r3
            r4.remove(r0)
            goto L_0x0d62
        L_0x0d72:
            X.1ps r0 = r6.A02(r7)
            r4.set(r5, r0)
            goto L_0x0d62
        L_0x0d7a:
            int r5 = r5 + 1
            goto L_0x0d18
        L_0x0d7d:
            boolean r0 = r7 instanceof X.C38791rQ
            if (r0 != 0) goto L_0x0d62
            X.1ps r0 = r6.A02(r7)
            r4.add(r5, r0)
            goto L_0x0d62
        L_0x0d89:
            java.lang.Object r0 = r7.A00
            X.0pj r0 = (X.C14770pj) r0
            java.lang.Object r9 = r7.A01
            X.0tZ r9 = (X.C16740tZ) r9
            java.lang.Object r2 = r7.A02
            if (r9 != 0) goto L_0x0da0
            java.util.Map r1 = r0.A0U
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
            return
        L_0x0da0:
            java.util.Map r0 = r0.A0U
            java.lang.Object r8 = r0.get(r2)
            java.util.List r8 = (java.util.List) r8
            X.C14770pj.A00(r8)
            if (r8 == 0) goto L_0x0dd4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r8.iterator()
        L_0x0db6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0dd0
            java.lang.Object r5 = r6.next()
            X.1ps r5 = (X.C37871ps) r5
            X.0tZ r0 = r5.A00
            long r3 = r0.A14
            long r1 = r9.A14
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0db6
            r7.add(r5)
            goto L_0x0db6
        L_0x0dd0:
            r8.removeAll(r7)
            goto L_0x0de5
        L_0x0dd4:
            java.lang.String r1 = "messagenotification/cache/reset/list null for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0de5:
            X.C14770pj.A00(r8)
            return
        L_0x0de9:
            java.lang.Object r8 = r7.A00
            X.1Tv r8 = (X.C27971Tv) r8
            java.lang.Object r6 = r7.A01
            X.1ci r6 = (X.C30641ci) r6
            java.lang.Object r1 = r7.A02
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = "paymentTransactionInfo"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            X.2H9 r0 = (X.AnonymousClass2H9) r0
            X.1Vt r3 = r0.A00
            X.1Vo r7 = r8.A0E
            java.lang.String r0 = "onPaymentTransactionStatusUpdate"
            r7.A06(r0)
            java.lang.String r0 = r3.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0e3c
            java.lang.String r0 = "Handle transaction error: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.A0J
            r1.append(r0)
            java.lang.String r0 = " trans Id: "
            r1.append(r0)
            java.lang.String r0 = r3.A0K
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.A06(r0)
            X.0wS r0 = r8.A0C
            X.19r r0 = r0.A03()
            X.19b r1 = r0.AB6()
            if (r1 == 0) goto L_0x0e3c
            java.lang.String r0 = r3.A0J
            r1.AHN(r0)
        L_0x0e3c:
            X.0rv r0 = r3.A0C
            if (r0 == 0) goto L_0x0e68
            java.lang.String r0 = r3.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0e68
            X.0rv r2 = r3.A0C
            boolean r1 = r3.A0Q
            java.lang.String r0 = r3.A0L
            X.1Vw r4 = new X.1Vw
            r4.<init>(r2, r0, r1)
            X.0t6 r2 = r8.A02
            X.0th r1 = r2.A0K
            X.0tZ r0 = r1.A03(r4)
            if (r0 == 0) goto L_0x0e68
            boolean r0 = r1.A06(r0)
            if (r0 != 0) goto L_0x0e68
            r2.A0O(r3, r4)
            goto L_0x0eff
        L_0x0e68:
            X.13O r9 = r8.A0D
            int r1 = r3.A03
            r5 = 1
            r0 = 3
            if (r1 == r0) goto L_0x0e72
            if (r1 != r5) goto L_0x0e81
        L_0x0e72:
            X.16r r0 = r9.A02
            boolean r0 = r0.A0k(r3)
            if (r0 != 0) goto L_0x0e81
            X.1Vo r1 = r9.A0G
            java.lang.String r0 = "payments contact table NOT updated"
            r1.A06(r0)
        L_0x0e81:
            X.16r r2 = r9.A02
            java.lang.String r1 = r3.A0L
            java.lang.String r0 = r3.A0K
            X.1Vt r4 = r2.A0M(r1, r0)
            X.0wS r0 = r9.A0F
            X.19r r0 = r0.A03()
            r0.A8Y(r3, r4)
            if (r4 != 0) goto L_0x0ea5
            int r1 = r3.A03
            r0 = 20
            if (r1 == r0) goto L_0x0ea0
            r0 = 40
            if (r1 != r0) goto L_0x0ea5
        L_0x0ea0:
            X.0wT r0 = r9.A0B
            r0.A0N(r5)
        L_0x0ea5:
            java.lang.String r0 = r3.A0L
            boolean r0 = r2.A0l(r3, r4, r0)
            if (r0 == 0) goto L_0x0ee8
            java.lang.String r1 = r3.A0L
            java.lang.String r0 = r3.A0K
            X.1Vt r5 = r2.A0M(r1, r0)
            if (r5 == 0) goto L_0x0eff
            X.1Vo r2 = r9.A0G
            java.lang.String r0 = "updatePaymentInfoWithoutMessage updated transaction with trans id: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A0K
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            X.107 r4 = r9.A06
            X.0sq r2 = r4.A0B
            r1 = 13
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r4, r1, r5)
            r2.Acl(r0)
            X.0pt r2 = r9.A01
            r1 = 19
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r9, r1, r5)
            r2.A0K(r0)
            goto L_0x0eff
        L_0x0ee8:
            X.1Vo r2 = r9.A0G
            java.lang.String r0 = "updatePaymentInfoWithoutMessage transaction was not updated: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.A0K
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 0
            r2.A03(r0, r1)
        L_0x0eff:
            X.1W2 r0 = r3.A0A     // Catch:{ Exception -> 0x0f22 }
            if (r0 == 0) goto L_0x0f28
            X.1lz r0 = r0.A00     // Catch:{ Exception -> 0x0f22 }
            if (r0 == 0) goto L_0x0f28
            java.lang.String r0 = r0.A02     // Catch:{ Exception -> 0x0f22 }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0f22 }
            X.1GO r5 = r8.A0F     // Catch:{ Exception -> 0x0f22 }
            X.2fU r0 = r5.A02()     // Catch:{ Exception -> 0x0f22 }
            if (r0 == 0) goto L_0x0f28
            X.2fV r0 = r0.A08     // Catch:{ Exception -> 0x0f22 }
            long r1 = r0.A01     // Catch:{ Exception -> 0x0f22 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0f28
            r0 = 0
            r5.A08(r0, r3)     // Catch:{ Exception -> 0x0f22 }
            goto L_0x0f28
        L_0x0f22:
            r1 = move-exception
            java.lang.String r0 = "PAY: onPaymentTransactionStatusUpdate error"
            r7.A0A(r0, r1)
        L_0x0f28:
            X.17f r0 = r8.A05
            X.0ug r0 = r0.A03
            r0.A0E(r6)
            return
        L_0x0f30:
            java.lang.Object r5 = r7.A00
            X.1Tv r5 = (X.C27971Tv) r5
            java.lang.Object r4 = r7.A01
            X.1ci r4 = (X.C30641ci) r4
            java.lang.Object r1 = r7.A02
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = "paymentKycInfo"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            X.1lx r2 = (X.C35451lx) r2
            X.0wT r3 = r5.A09
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r1 = "state"
            java.lang.String r0 = r2.A02     // Catch:{ JSONException -> 0x0f94 }
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x0f94 }
            java.lang.String r1 = "rejection-code"
            java.lang.Integer r0 = r2.A01     // Catch:{ JSONException -> 0x0f94 }
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x0f94 }
            X.1ly r9 = r2.A00     // Catch:{ JSONException -> 0x0f94 }
            if (r9 == 0) goto L_0x0f99
            java.lang.String r7 = "actions-requested"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0f94 }
            r6.<init>()     // Catch:{ JSONException -> 0x0f94 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0f94 }
            r2.<init>()     // Catch:{ JSONException -> 0x0f94 }
            java.lang.String r1 = "obligation"
            java.lang.String r0 = r9.A00     // Catch:{ JSONException -> 0x0f8b }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0f8b }
            java.util.List r0 = r9.A01     // Catch:{ JSONException -> 0x0f8b }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ JSONException -> 0x0f8b }
        L_0x0f77:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0f8b }
            if (r0 == 0) goto L_0x0f85
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x0f8b }
            r2.put(r0)     // Catch:{ JSONException -> 0x0f8b }
            goto L_0x0f77
        L_0x0f85:
            java.lang.String r0 = "actions"
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x0f8b }
            goto L_0x0f90
        L_0x0f8b:
            java.lang.String r0 = "PAY: PaymentKycActionsRequested toJson threw exception"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x0f94 }
        L_0x0f90:
            r8.put(r7, r6)     // Catch:{ JSONException -> 0x0f94 }
            goto L_0x0f99
        L_0x0f94:
            java.lang.String r0 = "PAY: PaymentKycInfo toJson threw exception"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0f99:
            java.lang.String r2 = r8.toString()
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payment_kyc_info"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            r2 = 0
            android.content.SharedPreferences r0 = r3.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payment_kyc_update_ack"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            X.13O r0 = r5.A0D
            X.109 r3 = r0.A07
            X.0sq r2 = r3.A08
            r1 = 49
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            X.17f r0 = r5.A05
            X.0ug r0 = r0.A03
            r0.A0E(r4)
            return
        L_0x0fd8:
            java.lang.Object r3 = r7.A00
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r6 = r7.A01
            X.1IJ r6 = (X.AnonymousClass1IJ) r6
            java.lang.Object r5 = r7.A02
            X.4PZ r2 = X.C88114Zy.A03
            java.lang.String r1 = "query"
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x1028
            java.util.Map r0 = (java.util.Map) r0
            X.4Zy r2 = r2.A00(r1, r0)
            java.lang.String r0 = "args"
            java.lang.Object r4 = r3.get(r0)
            boolean r1 = r4 instanceof java.util.Map
            r0 = 0
            if (r1 == 0) goto L_0x1026
            java.util.Map r4 = (java.util.Map) r4
        L_0x0fff:
            X.1II r3 = r6.A01
            java.lang.String r1 = "client"
            java.util.Map r0 = r2.A01
            if (r0 != 0) goto L_0x101f
            r0 = 0
        L_0x1008:
            X.22M r2 = X.AnonymousClass22M.A00
            X.1IH r1 = r3.A00()
            java.util.Map r3 = r3.A02(r0, r1, r2, r4)
            X.0pt r2 = r6.A00
            r1 = 25
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r5, r1, r3)
            r2.A0K(r0)
            return
        L_0x101f:
            java.lang.Object r0 = r0.get(r1)
            X.4Zy r0 = (X.C88114Zy) r0
            goto L_0x1008
        L_0x1026:
            r4 = r0
            goto L_0x0fff
        L_0x1028:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x1030:
            java.lang.Object r8 = r7.A00
            X.1Ml r8 = (X.C26131Ml) r8
            java.lang.Object r9 = r7.A01
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r10 = r7.A02
            java.lang.String r6 = r8.A02()
            if (r6 == 0) goto L_0x1066
            java.util.Set r0 = r8.A03()
        L_0x1044:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r9)
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x1052:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x106c
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.remove(r1)
            if (r0 != 0) goto L_0x1052
            r15.add(r1)
            goto L_0x1052
        L_0x1066:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            goto L_0x1044
        L_0x106c:
            X.0ug r5 = r8.A01
            java.lang.String r4 = r5.A02()
            java.lang.String r2 = r8.A04
            int r1 = r3.size()
            int r0 = r15.size()
            int r1 = r1 + r0
            X.1Vv[] r11 = new X.C28371Vv[r1]
            X.1lL[] r6 = X.C26111Mj.A00(r2, r6)
            java.lang.String r1 = "action"
            java.lang.String r0 = "add"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r0 = "remove"
            X.1lL r14 = new X.1lL
            r14.<init>((java.lang.String) r1, (java.lang.String) r0)
            java.util.Iterator r18 = r3.iterator()
            r17 = 0
            r16 = 0
        L_0x109b:
            boolean r0 = r18.hasNext()
            java.lang.String r13 = "user"
            java.lang.String r3 = "jid"
            r12 = 2
            r7 = 1
            if (r0 == 0) goto L_0x10c3
            java.lang.Object r0 = r18.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.1lL[] r1 = new X.C35081lL[r12]
            r1[r17] = r2
            X.1lL r12 = new X.1lL
            r12.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r3)
            r1[r7] = r12
            X.1Vv r0 = new X.1Vv
            r0.<init>(r13, r1)
            r11[r16] = r0
            int r16 = r16 + 1
            goto L_0x109b
        L_0x10c3:
            java.util.Iterator r15 = r15.iterator()
        L_0x10c7:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x10e8
            java.lang.Object r2 = r15.next()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.1lL[] r1 = new X.C35081lL[r12]
            r1[r17] = r14
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r3)
            r1[r7] = r0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r13, r1)
            r11[r16] = r0
            int r16 = r16 + 1
            goto L_0x10c7
        L_0x10e8:
            java.lang.String r0 = "category"
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r6, (X.C28371Vv[]) r11)
            r0 = 0
            java.lang.String r3 = "privacy"
            X.1Vv r11 = new X.1Vv
            r11.<init>((X.C28371Vv) r1, (java.lang.String) r3, (X.C35081lL[]) r0)
            r0 = 4
            X.1lL[] r6 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r4)
            r6[r17] = r0
            X.1ks r2 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r6[r7] = r0
            java.lang.String r1 = "xmlns"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r3)
            r6[r12] = r0
            r3 = 3
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r6[r3] = r0
            java.lang.String r0 = "iq"
            X.1Vv r2 = new X.1Vv
            r2.<init>((X.C28371Vv) r11, (java.lang.String) r0, (X.C35081lL[]) r6)
            com.facebook.redex.IDxRCallbackShape14S0300000_2_I1 r1 = new com.facebook.redex.IDxRCallbackShape14S0300000_2_I1
            r1.<init>(r10, r8, r9, r7)
            boolean r0 = r8 instanceof X.AnonymousClass2ZL
            if (r0 == 0) goto L_0x1142
            r9 = 292(0x124, float:4.09E-43)
        L_0x1139:
            r10 = 32000(0x7d00, double:1.581E-319)
            r6 = r1
            r7 = r2
            r8 = r4
            r5.A0B(r6, r7, r8, r9, r10)
            return
        L_0x1142:
            boolean r0 = r8 instanceof X.AnonymousClass2ZA
            if (r0 == 0) goto L_0x1149
            r9 = 289(0x121, float:4.05E-43)
            goto L_0x1139
        L_0x1149:
            boolean r0 = r8 instanceof X.C26121Mk
            if (r0 == 0) goto L_0x1150
            r9 = 228(0xe4, float:3.2E-43)
            goto L_0x1139
        L_0x1150:
            r9 = 294(0x126, float:4.12E-43)
            goto L_0x1139
        L_0x1153:
            java.lang.Object r6 = r7.A00
            X.0zF r6 = (X.C19940zF) r6
            java.lang.Object r5 = r7.A01
            X.4L0 r5 = (X.AnonymousClass4L0) r5
            java.lang.Object r2 = r7.A02
            X.4MY r2 = (X.AnonymousClass4MY) r2
            r0 = 2
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
            r9.<init>(r0)
            com.whatsapp.jid.UserJid r7 = r5.A00
            X.0zC r3 = r6.A04
            X.4IX r10 = new X.4IX
            r10.<init>(r6, r9)
            X.0zA r0 = r3.A01
            X.0pd r1 = r0.A00
            r0 = 2024(0x7e8, float:2.836E-42)
            X.0tM r8 = X.C16620tM.A02
            boolean r0 = r1.A0E(r8, r0)
            if (r0 != 0) goto L_0x11d5
            r3 = 0
            X.0zF r1 = r10.A00
            java.util.concurrent.CountDownLatch r0 = r10.A01
            r1.A02 = r3
            r0.countDown()
        L_0x1186:
            X.0zE r3 = r6.A03
            X.4IW r10 = new X.4IW
            r10.<init>(r6, r9)
            r0 = 0
            X.C18450wi.A0H(r7, r0)
            X.0zA r0 = r3.A01
            X.0pd r1 = r0.A00
            r0 = 2696(0xa88, float:3.778E-42)
            boolean r0 = r1.A0E(r8, r0)
            if (r0 != 0) goto L_0x11a8
            r4 = 0
        L_0x119e:
            X.0zF r1 = r10.A00
            java.util.concurrent.CountDownLatch r0 = r10.A01
            r1.A01 = r4
            r0.countDown()
            goto L_0x11ec
        L_0x11a8:
            X.0zD r3 = r3.A00
            X.0uP r0 = r3.A01
            X.1Vq r1 = r0.A00(r7)
            r4 = 0
            if (r1 == 0) goto L_0x119e
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x11bd
            java.lang.String r4 = "smb"
            goto L_0x119e
        L_0x11bd:
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x119e
            X.0uc r4 = r3.A00
            r0 = 2
            com.facebook.redex.IDxSListenerShape362S0100000_2_I1 r3 = new com.facebook.redex.IDxSListenerShape362S0100000_2_I1
            r3.<init>(r10, r0)
            r1 = 0
            com.facebook.redex.IDxPCallbackShape80S0200000_2_I1 r0 = new com.facebook.redex.IDxPCallbackShape80S0200000_2_I1
            r0.<init>(r3, r1, r4)
            r4.A03(r0, r7)
            goto L_0x11ec
        L_0x11d5:
            X.0zB r1 = r3.A00
            r0 = 0
            X.C18450wi.A0H(r7, r0)
            X.0uc r4 = r1.A00
            r3 = 0
            com.facebook.redex.IDxSListenerShape362S0100000_2_I1 r1 = new com.facebook.redex.IDxSListenerShape362S0100000_2_I1
            r1.<init>(r10, r0)
            com.facebook.redex.IDxPCallbackShape80S0200000_2_I1 r0 = new com.facebook.redex.IDxPCallbackShape80S0200000_2_I1
            r0.<init>(r1, r3, r4)
            r4.A03(r0, r7)
            goto L_0x1186
        L_0x11ec:
            r9.await()     // Catch:{ InterruptedException -> 0x1231 }
            X.0zA r0 = r6.A05     // Catch:{ InterruptedException -> 0x1231 }
            X.0pd r1 = r0.A00     // Catch:{ InterruptedException -> 0x1231 }
            r0 = 2697(0xa89, float:3.78E-42)
            boolean r0 = r1.A0E(r8, r0)     // Catch:{ InterruptedException -> 0x1231 }
            if (r0 == 0) goto L_0x122e
            java.lang.String r7 = r7.getRawString()     // Catch:{ InterruptedException -> 0x1231 }
        L_0x11ff:
            java.lang.String r8 = r6.A01     // Catch:{ InterruptedException -> 0x1231 }
            java.lang.String r9 = r6.A02     // Catch:{ InterruptedException -> 0x1231 }
            java.lang.String r10 = r5.A01     // Catch:{ InterruptedException -> 0x1231 }
            boolean r0 = r5.A02     // Catch:{ InterruptedException -> 0x1231 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch:{ InterruptedException -> 0x1231 }
            X.4aD r3 = new X.4aD     // Catch:{ InterruptedException -> 0x1231 }
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ InterruptedException -> 0x1231 }
            X.0xA r1 = r2.A03     // Catch:{ InterruptedException -> 0x1231 }
            int r0 = r2.A00     // Catch:{ InterruptedException -> 0x1231 }
            int r5 = r2.A01     // Catch:{ InterruptedException -> 0x1231 }
            int r6 = r2.A02     // Catch:{ InterruptedException -> 0x1231 }
            if (r0 == 0) goto L_0x122a
            X.0z9 r4 = r1.A00     // Catch:{ InterruptedException -> 0x1231 }
            r7 = 3
        L_0x121e:
            r8 = 1
            com.facebook.redex.RunnableRunnableShape0S0203000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0203000_I0     // Catch:{ InterruptedException -> 0x1231 }
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ InterruptedException -> 0x1231 }
            X.0sq r0 = r4.A01     // Catch:{ InterruptedException -> 0x1231 }
            r0.Acl(r2)     // Catch:{ InterruptedException -> 0x1231 }
            goto L_0x1230
        L_0x122a:
            X.0z9 r4 = r1.A00     // Catch:{ InterruptedException -> 0x1231 }
            r7 = 2
            goto L_0x121e
        L_0x122e:
            r7 = 0
            goto L_0x11ff
        L_0x1230:
            return
        L_0x1231:
            r1 = move-exception
            java.lang.String r0 = "CatalogOperationsQplEventAnnotations creation interrupted"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x1238:
            java.lang.Object r2 = r7.A00
            X.1Mm r2 = (X.C26141Mm) r2
            java.lang.Object r1 = r7.A01
            X.22J r1 = (X.AnonymousClass22J) r1
            java.lang.Object r0 = r7.A02
            X.22J r0 = (X.AnonymousClass22J) r0
            X.5Fa r5 = new X.5Fa
            r5.<init>(r2, r1)
            X.5FZ r4 = new X.5FZ
            r4.<init>(r2, r0)
            X.01J r0 = r2.A02
            java.lang.Object r3 = r0.get()
            X.13Z r3 = (X.AnonymousClass13Z) r3
            X.13Y r1 = r3.A01
            r2 = 0
            com.facebook.redex.IDxRProviderShape347S0100000_2_I1 r0 = new com.facebook.redex.IDxRProviderShape347S0100000_2_I1
            r0.<init>(r3, r2)
            X.4ys r1 = r1.A71(r0)
            com.facebook.redex.IDxRCallbacksShape75S0200000_2_I1 r0 = new com.facebook.redex.IDxRCallbacksShape75S0200000_2_I1
            r0.<init>(r5, r2, r4)
            r1.Aah(r0)
            return
        L_0x126b:
            java.lang.Object r8 = r7.A00
            X.14a r8 = (X.C214214a) r8
            java.lang.Object r6 = r7.A02
            X.22J r6 = (X.AnonymousClass22J) r6
            java.lang.Object r5 = r7.A01
            X.22J r5 = (X.AnonymousClass22J) r5
            X.01J r0 = r8.A03
            java.lang.Object r3 = r0.get()
            X.14T r3 = (X.AnonymousClass14T) r3
            X.13Y r2 = r3.A01
            r1 = 3
            com.facebook.redex.IDxRProviderShape347S0100000_2_I1 r0 = new com.facebook.redex.IDxRProviderShape347S0100000_2_I1
            r0.<init>(r3, r1)
            X.4ys r4 = r2.A71(r0)
            X.3It r3 = new X.3It
            r3.<init>(r8, r6, r5)
            X.5Fd r2 = new X.5Fd
            r2.<init>(r8, r6)
            r1 = 0
            com.facebook.redex.IDxRCallbacksShape75S0200000_2_I1 r0 = new com.facebook.redex.IDxRCallbacksShape75S0200000_2_I1
            r0.<init>(r3, r1, r2)
            r4.Aah(r0)
            return
        L_0x129f:
            java.lang.Object r5 = r7.A00
            X.12F r5 = (X.AnonymousClass12F) r5
            java.lang.Object r4 = r7.A01
            X.0sH r4 = (X.C16010sH) r4
            java.lang.Object r3 = r7.A02
            r0 = 0
            r4.A0A = r0
            X.0sG r0 = r5.A08
            r0.A0N(r4)
            X.0vc r1 = r5.A0O
            X.1ui r0 = r1.A01
            r0.A01(r3)
            X.1ui r0 = r1.A02
            r0.A01(r3)
            X.0pt r2 = r5.A04
            r1 = 46
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r5, r4, r3, r1)
            r2.A0K(r0)
            return
        L_0x12cb:
            java.lang.Object r2 = r7.A00
            X.12F r2 = (X.AnonymousClass12F) r2
            java.lang.Object r4 = r7.A01
            X.0sH r4 = (X.C16010sH) r4
            java.lang.Object r3 = r7.A02
            X.0rv r3 = (X.C15830rv) r3
            X.120 r0 = r2.A0A
            boolean r1 = r0.A05(r4)
            X.12A r0 = r2.A0B
            X.120 r0 = r0.A05
            r0.A04(r4)
            if (r1 == 0) goto L_0x12ef
            X.12B r2 = r2.A0N
            int r1 = r4.A05
            r0 = 2
            r2.A01(r3, r1, r0)
            return
        L_0x12ef:
            X.0ub r0 = r2.A09
            r0.A04(r3)
            return
        L_0x12f5:
            java.lang.Object r5 = r7.A00
            X.12F r5 = (X.AnonymousClass12F) r5
            java.lang.Object r1 = r7.A01
            X.0rv r1 = (X.C15830rv) r1
            java.lang.Object r6 = r7.A02
            X.1ci r6 = (X.C30641ci) r6
            X.0sG r0 = r5.A08
            X.18c r0 = r0.A06
            java.util.ArrayList r7 = r0.A0B(r1)
            boolean r0 = r7.isEmpty()
            r4 = 1
            if (r0 != 0) goto L_0x133b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x1319:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1330
            java.lang.Object r1 = r2.next()
            X.0sH r1 = (X.C16010sH) r1
            boolean r0 = r1.A0i
            if (r0 == 0) goto L_0x1319
            r0 = 0
            r1.A0i = r0
            r3.add(r1)
            goto L_0x1319
        L_0x1330:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x133b
            X.0xU r0 = r5.A07
            r0.A0T(r3, r4)
        L_0x133b:
            X.11o r1 = r5.A0K
            long r3 = r6.A00
            r0 = 2
            X.1d2 r1 = r1.A00(r0, r3)
            if (r1 == 0) goto L_0x134a
            r0 = 5
            r1.A00(r0)
        L_0x134a:
            X.0ug r5 = r5.A0I
            java.lang.String r2 = r6.A07
            boolean r0 = r7.isEmpty()
            r1 = r0 ^ 1
            com.whatsapp.jid.Jid r0 = r6.A01
            android.os.Message r1 = X.AnonymousClass294.A00(r0, r2, r3, r1)
            r0 = 0
            r5.A09(r1, r0)
            return
        L_0x135f:
            java.lang.Object r2 = r7.A00
            X.1RV r2 = (X.AnonymousClass1RV) r2
            java.lang.Object r0 = r7.A01
            X.0tZ r0 = (X.C16740tZ) r0
            java.lang.Object r1 = r7.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.A00(r0)
            X.0pt r0 = r2.A00
            r0.A0K(r1)
            return
        L_0x1374:
            java.lang.String r3 = "_data=?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x1395, RuntimeException -> 0x1384 }
            r1 = 0
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x1395, RuntimeException -> 0x1384 }
            r2[r1] = r0     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x1395, RuntimeException -> 0x1384 }
            r4.delete(r8, r3, r2)     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x1395, RuntimeException -> 0x1384 }
            return
        L_0x1384:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x1394
            java.lang.String r0 = "android.os.DeadSystemException"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x1394
            goto L_0x1396
        L_0x1394:
            throw r2
        L_0x1395:
            r2 = move-exception
        L_0x1396:
            com.whatsapp.util.Log.e(r5, r2)
            return
        L_0x139a:
            r1.AQQ()
            return
        L_0x139e:
            r1 = move-exception
            if (r9 == 0) goto L_0x13a9
            r9.unlock()
            throw r1
        L_0x13a5:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x13a9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S0300000_I0_1.run():void");
    }
}
