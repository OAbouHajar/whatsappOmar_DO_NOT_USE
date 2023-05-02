package com.obwhatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass027;
import X.AnonymousClass1SO;
import X.AnonymousClass1WA;
import X.AnonymousClass2OJ;
import X.AnonymousClass3AO;
import X.AnonymousClass4DY;
import X.AnonymousClass53L;
import X.C14710pd;
import X.C16000sG;
import X.C16070sO;
import X.C16080sP;
import X.C16620tM;
import X.C26811Ph;
import X.C30801cy;
import X.C32001fU;
import X.C37921px;
import X.C448926b;
import X.C49562Tu;
import X.C49802Vw;
import X.C49872Wg;
import X.C50012Xh;
import X.C50032Xj;
import X.C85904Ql;
import android.graphics.Point;
import android.graphics.Rect;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CallGridViewModel extends C49562Tu {
    public int A00;
    public Rect A01;
    public UserJid A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass027 A05;
    public final AnonymousClass027 A06;
    public final AnonymousClass027 A07 = new AnonymousClass027(new C49802Vw());
    public final AnonymousClass027 A08 = new AnonymousClass027((Object) null);
    public final AnonymousClass027 A09;
    public final AnonymousClass027 A0A;
    public final AnonymousClass027 A0B;
    public final AnonymousClass027 A0C = new AnonymousClass027(new C50032Xj());
    public final C448926b A0D;
    public final AnonymousClass4DY A0E;
    public final AnonymousClass1SO A0F;
    public final C85904Ql A0G;
    public final C26811Ph A0H;
    public final C16000sG A0I;
    public final C16080sP A0J;
    public final C16070sO A0K;
    public final C14710pd A0L;
    public final AnonymousClass2OJ A0M;
    public final AnonymousClass2OJ A0N;
    public final AnonymousClass2OJ A0O;
    public final AnonymousClass2OJ A0P = new AnonymousClass2OJ(Boolean.TRUE);
    public final AnonymousClass2OJ A0Q;
    public final AnonymousClass2OJ A0R;
    public final AnonymousClass2OJ A0S;
    public final AnonymousClass2OJ A0T;
    public final AnonymousClass2OJ A0U;
    public final AnonymousClass2OJ A0V;
    public final AnonymousClass2OJ A0W;
    public final C30801cy A0X;
    public final C30801cy A0Y;
    public final VoipCameraManager A0Z;
    public final LinkedHashMap A0a;
    public final Map A0b;
    public final AnonymousClass01J A0c;
    public final AnonymousClass01J A0d;
    public final boolean A0e;
    public final boolean A0f;

    public CallGridViewModel(C448926b r8, AnonymousClass1SO r9, C26811Ph r10, C16000sG r11, C16080sP r12, AnonymousClass013 r13, C16070sO r14, C14710pd r15, VoipCameraManager voipCameraManager, AnonymousClass01J r17, AnonymousClass01J r18) {
        Boolean bool = Boolean.FALSE;
        this.A0R = new AnonymousClass2OJ(bool);
        this.A0S = new AnonymousClass2OJ(bool);
        this.A0G = new C85904Ql();
        this.A05 = new AnonymousClass027(0L);
        this.A0A = new AnonymousClass027((Object) null);
        C30801cy r2 = new C30801cy();
        this.A0Y = r2;
        AnonymousClass2OJ r6 = new AnonymousClass2OJ(bool);
        this.A0O = r6;
        this.A0Q = new AnonymousClass2OJ(bool);
        this.A0N = new AnonymousClass2OJ(C49872Wg.A03);
        this.A06 = new AnonymousClass027((Object) null);
        this.A0U = new AnonymousClass2OJ(bool);
        this.A0W = new AnonymousClass2OJ(Integer.valueOf(R.style.style0390));
        this.A0M = new AnonymousClass2OJ(new C50012Xh(R.dimen.dimen083d, !((Boolean) this.A0R.A01()).booleanValue() ? 14 : 0, ((Boolean) r6.A01()).booleanValue()));
        this.A0T = new AnonymousClass2OJ(new Rect());
        this.A0V = new AnonymousClass2OJ(bool);
        this.A02 = null;
        this.A0b = new HashMap();
        this.A0X = new C30801cy();
        AnonymousClass4DY r1 = new AnonymousClass4DY(this);
        this.A0E = r1;
        this.A0L = r15;
        this.A0I = r11;
        this.A0Z = voipCameraManager;
        this.A0J = r12;
        this.A0K = r14;
        this.A0d = r17;
        this.A0c = r18;
        this.A0H = r10;
        this.A0F = r9;
        C16620tM r4 = C16620tM.A02;
        boolean A0E2 = r15.A0E(r4, 2222);
        this.A0f = A0E2;
        this.A0e = r15.A0E(r4, 2594);
        this.A0a = new LinkedHashMap();
        this.A0B = new AnonymousClass027();
        this.A09 = new AnonymousClass027();
        r2.A0B(new ArrayList());
        this.A0D = r8;
        r8.A02(this);
        if (A0E2) {
            r10.A02 = this;
        } else {
            r8.A0E.add(r1);
        }
        boolean z2 = !r13.A0T();
        AnonymousClass027 r22 = this.A0C;
        Object A012 = r22.A01();
        AnonymousClass00B.A06(A012);
        C50032Xj r16 = (C50032Xj) A012;
        r16.A01 = R.dimen.dimen083d;
        if (r16.A08 != z2 || !r16.A07) {
            r16.A08 = z2;
            r16.A07 = true;
            r22.A0B(r16);
        }
    }

    public static int A01(C32001fU r2) {
        if (r2.A0A) {
            return 2;
        }
        if (r2.A0E) {
            return 3;
        }
        int i2 = r2.A05;
        if (i2 == 2) {
            return 9;
        }
        if (r2.A0D) {
            return 5;
        }
        return i2 == 6 ? 7 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r6.A0B != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A02(X.AnonymousClass3AY r6) {
        /*
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            com.whatsapp.voipcalling.CallState r1 = r6.A06
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0010
            boolean r0 = r6.A0B
            r4 = 1
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            X.0vs r0 = r6.A01
            X.0uz r0 = r0.entrySet()
            X.1Ub r3 = r0.iterator()
        L_0x001b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            X.1fU r0 = (X.C32001fU) r0
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r2.getValue()
            X.1fU r0 = (X.C32001fU) r0
            int r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x001b
            if (r4 == 0) goto L_0x001b
        L_0x003e:
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r5.put(r1, r0)
            goto L_0x001b
        L_0x004a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel.A02(X.3AY):java.util.Map");
    }

    public void A04() {
        C448926b r0 = this.A0D;
        r0.A03(this);
        r0.A0E.remove(this.A0E);
        if (this.A0f) {
            C26811Ph r1 = this.A0H;
            r1.A02 = null;
            r1.A00();
        }
    }

    public final Point A07(C32001fU r5) {
        int i2;
        int i3;
        int i4;
        if (r5.A0G) {
            VoipCameraManager voipCameraManager = this.A0Z;
            Point adjustedCameraPreviewSize = voipCameraManager.getAdjustedCameraPreviewSize(AnonymousClass53L.A00);
            return (adjustedCameraPreviewSize == null && r5.A05 == 6) ? voipCameraManager.lastAdjustedCameraPreviewSize : adjustedCameraPreviewSize;
        }
        int i5 = 0;
        if (r5.A0H && (i4 = this.A00) >= 0) {
            i5 = i4 * 90;
        }
        if (((((r5.A04 * 90) - i5) + 360) % 360) % 180 != 0) {
            i2 = r5.A03;
            i3 = r5.A06;
        } else {
            i2 = r5.A06;
            i3 = r5.A03;
        }
        return new Point(i2, i3);
    }

    public final void A08() {
        int i2;
        AnonymousClass2OJ r4 = this.A0M;
        if (this.A04) {
            i2 = R.dimen.dimen0115;
        } else {
            boolean booleanValue = ((Boolean) this.A0R.A01()).booleanValue();
            i2 = R.dimen.dimen083d;
            if (booleanValue) {
                i2 = R.dimen.dimen083e;
            }
        }
        boolean booleanValue2 = ((Boolean) this.A0O.A01()).booleanValue();
        int i3 = 0;
        if (!((Boolean) this.A0R.A01()).booleanValue()) {
            i3 = 14;
        }
        r4.A0B(new C50012Xh(i2, i3, booleanValue2));
    }

    public final void A09() {
        AnonymousClass027 r1;
        Object arrayList;
        LinkedHashMap linkedHashMap = this.A0a;
        ArrayList arrayList2 = new ArrayList(linkedHashMap.values());
        if (!((Boolean) this.A0R.A01()).booleanValue() || linkedHashMap.size() <= 8) {
            this.A0B.A0B(arrayList2);
            r1 = this.A09;
            arrayList = new ArrayList();
        } else {
            this.A0B.A0B(arrayList2.subList(0, 6));
            r1 = this.A09;
            arrayList = arrayList2.subList(6, arrayList2.size());
        }
        r1.A0B(arrayList);
    }

    public final void A0A() {
        int i2;
        if (this.A04) {
            i2 = R.style.style038e;
        } else {
            boolean booleanValue = ((Boolean) this.A0R.A01()).booleanValue();
            i2 = R.style.style0390;
            if (booleanValue) {
                i2 = R.style.style038c;
            }
        }
        this.A0W.A0B(Integer.valueOf(i2));
    }

    public final void A0B(C32001fU r8) {
        int i2;
        int i3;
        Point A072;
        C49802Vw r5 = new C49802Vw();
        if (!r8.A0G || r8.A05 == 6) {
            i2 = 5;
            i3 = 7;
        } else {
            i2 = 9;
            i3 = 16;
        }
        Point point = new Point(i2, i3);
        if (!(r8.A05 == 6 || (A072 = A07(r8)) == null)) {
            int i4 = A072.x;
            int i5 = A072.y;
            if (((float) i4) / ((float) i5) > ((float) point.x) / ((float) point.y)) {
                point.x = i4;
                point.y = i5;
            }
        }
        r5.A01 = point.x;
        r5.A00 = point.y;
        this.A07.A0B(r5);
    }

    public final void A0C(C32001fU r5) {
        Point A072 = A07(r5);
        if (A072 != null) {
            AnonymousClass027 r2 = this.A0C;
            Object A012 = r2.A01();
            AnonymousClass00B.A06(A012);
            C50032Xj r1 = (C50032Xj) A012;
            r1.A05 = A072.x;
            r1.A03 = A072.y;
            r2.A0B(r1);
        }
    }

    public final void A0D(C32001fU r5) {
        if (((Boolean) this.A0S.A01()).booleanValue() && A02(this.A0D.A04()).size() <= 2) {
            if (r5.A0G) {
                this.A0Q.A0B(this.A0O.A01());
                return;
            }
            Point A072 = A07(r5);
            if (A072 != null) {
                AnonymousClass2OJ r3 = this.A0Q;
                int i2 = A072.x;
                int i3 = A072.y;
                boolean z2 = false;
                if (i2 > i3) {
                    z2 = true;
                }
                r3.A0B(Boolean.valueOf(z2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x028e, code lost:
        if (r7 >= -1) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02bf, code lost:
        if (r13 != 2) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c9, code lost:
        if (r10 != null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0311, code lost:
        if (r12 == false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0328, code lost:
        if (r14 >= r0) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0347, code lost:
        if (r10 == null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0355, code lost:
        if (r4.A03 != false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03a0, code lost:
        if (((java.lang.Boolean) r35.A01()).booleanValue() != false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03b0, code lost:
        if (r11 == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0410, code lost:
        if (r17 == false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r4.A04 != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x050e, code lost:
        if (r5 != null) goto L_0x0510;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0513, code lost:
        if (r0 == null) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0516, code lost:
        if (r0 == r5) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0518, code lost:
        r5 = r0.getWidth() / 40;
        r8 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0520, code lost:
        if (r5 < 8) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0522, code lost:
        r8 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0524, code lost:
        if (r5 > 16) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0526, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0527, code lost:
        com.whatsapp.filter.FilterUtils.blurNative(r0, r8, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0546, code lost:
        if (r0.A0L != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0551, code lost:
        if (r23 != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x059e, code lost:
        if (r18 == false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x093c, code lost:
        if (r1 <= ((java.lang.Number) r8.first).intValue()) goto L_0x093e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0113, code lost:
        if (r2.equals(r4.A02) == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0148, code lost:
        if (r0 == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0161, code lost:
        if (r8.isCameraOpen() == false) goto L_0x054a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0167, code lost:
        if (r8.getLastCachedFrame() == null) goto L_0x054a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x07c6  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0866  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x08e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.AnonymousClass3AY r39, boolean r40) {
        /*
            r38 = this;
            r37 = r39
            java.util.Map r21 = A02(r37)
            r0 = r37
            boolean r0 = r0.A0F
            r18 = r0
            r2 = 2
            if (r0 != 0) goto L_0x003b
            int r0 = r21.size()
            if (r0 > r2) goto L_0x003b
            java.util.HashMap r4 = new java.util.HashMap
            r0 = r21
            r4.<init>(r0)
            java.util.Collection r0 = r21.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x0024:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r3.next()
            X.1fU r1 = (X.C32001fU) r1
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x0024
            com.whatsapp.jid.UserJid r0 = r1.A07
            r4.remove(r0)
        L_0x0039:
            r21 = r4
        L_0x003b:
            r4 = r38
            X.2OJ r0 = r4.A0R
            r36 = r0
            java.lang.Object r0 = r36.A01()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = r18
            if (r0 == r1) goto L_0x0054
            java.util.Map r0 = r4.A0b
            r0.clear()
        L_0x0054:
            com.whatsapp.jid.UserJid r0 = r4.A02
            if (r0 == 0) goto L_0x005e
            int r0 = r21.size()
            if (r0 <= r2) goto L_0x007a
        L_0x005e:
            java.util.Collection r0 = r21.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x0066:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r2.next()
            X.1fU r1 = (X.C32001fU) r1
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x0066
            com.whatsapp.jid.UserJid r0 = r1.A07
            r4.A02 = r0
        L_0x007a:
            r0 = r37
            boolean r0 = r0.A0D
            r23 = r0
            r3 = 1
            if (r0 == 0) goto L_0x0088
            boolean r0 = r4.A04
            r5 = 1
            if (r0 == 0) goto L_0x0089
        L_0x0088:
            r5 = 0
        L_0x0089:
            X.2OJ r0 = r4.A0V
            r35 = r0
            java.lang.Object r0 = r35.A01()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == r5) goto L_0x00ba
            X.027 r2 = r4.A0C
            java.lang.Object r1 = r2.A01()
            X.AnonymousClass00B.A06(r1)
            X.2Xj r1 = (X.C50032Xj) r1
            r0 = 2131167293(0x7f07083d, float:1.7948856E38)
            if (r5 == 0) goto L_0x00ac
            r0 = 2131166744(0x7f070618, float:1.7947742E38)
        L_0x00ac:
            r1.A01 = r0
            r2.A0B(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r0 = r35
            r0.A0B(r1)
        L_0x00ba:
            r24 = 0
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.Collection r0 = r21.values()
            java.util.Iterator r25 = r0.iterator()
        L_0x00ce:
            boolean r0 = r25.hasNext()
            if (r0 == 0) goto L_0x0569
            java.lang.Object r26 = r25.next()
            r0 = r26
            X.1fU r0 = (X.C32001fU) r0
            r26 = r0
            java.util.LinkedHashMap r1 = r4.A0a
            com.whatsapp.jid.UserJid r2 = r0.A07
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0555
            java.lang.Object r0 = r1.get(r2)
            X.1px r0 = (X.C37921px) r0
            android.util.Pair r15 = r0.A05
        L_0x00f0:
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x00fb
            r0 = r19
            r0.add(r2)
        L_0x00fb:
            int r1 = r21.size()
            if (r18 == 0) goto L_0x0115
            if (r23 == 0) goto L_0x0107
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0109
        L_0x0107:
            if (r1 <= r3) goto L_0x0115
        L_0x0109:
            r0 = 4
            if (r1 >= r0) goto L_0x0115
            com.whatsapp.jid.UserJid r0 = r4.A02
            boolean r0 = r2.equals(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0116
        L_0x0115:
            r6 = 0
        L_0x0116:
            int r5 = r21.size()
            X.0pd r0 = r4.A0L
            r34 = r0
            r7 = 2331(0x91b, float:3.266E-42)
            X.0tM r22 = X.C16620tM.A02
            r1 = r0
            r0 = r22
            int r1 = r1.A03(r0, r7)
            if (r1 == 0) goto L_0x054d
            boolean r0 = X.C30341cC.A0O(r34)
            if (r0 != 0) goto L_0x054d
            if (r5 < r1) goto L_0x0551
        L_0x0133:
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x014a
            X.027 r1 = r4.A08
            java.lang.Object r0 = r1.A01()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r1.A01()
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x014b
        L_0x014a:
            r1 = 0
        L_0x014b:
            if (r18 == 0) goto L_0x01c4
            int r7 = r21.size()
            r0 = r26
            boolean r5 = r0.A0G
            if (r5 == 0) goto L_0x0544
            boolean r0 = r4.A0f
            com.whatsapp.voipcalling.camera.VoipCameraManager r8 = r4.A0Z
            if (r0 != 0) goto L_0x0163
            boolean r0 = r8.isCameraOpen()
            if (r0 == 0) goto L_0x054a
        L_0x0163:
            X.2cs r0 = r8.getLastCachedFrame()
            if (r0 == 0) goto L_0x054a
        L_0x0169:
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x054a
            r0 = r26
            int r8 = r0.A05
            r0 = 6
            if (r8 == r0) goto L_0x019d
            r0 = 2
            if (r8 == r0) goto L_0x019d
            if (r5 == 0) goto L_0x018f
            r0 = r26
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x019d
            boolean r0 = r4.A0f
            if (r0 == 0) goto L_0x018b
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r4.A0Z
            boolean r0 = r0.isCameraOpen()
            if (r0 == 0) goto L_0x019d
        L_0x018b:
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x019d
        L_0x018f:
            boolean r0 = r4.A0f
            if (r0 != 0) goto L_0x0197
            r0 = 8
            if (r7 > r0) goto L_0x054a
        L_0x0197:
            r0 = r26
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x054a
        L_0x019d:
            r0 = 1
        L_0x019e:
            java.util.Map r7 = r4.A0b
            if (r0 == 0) goto L_0x053f
            boolean r0 = r7.containsKey(r2)
            if (r0 != 0) goto L_0x01c4
            X.26b r0 = r4.A0D
            if (r5 == 0) goto L_0x04ba
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A0D
            X.2cs r13 = r0.getLastCachedFrame()
            r0 = 0
            if (r13 != 0) goto L_0x041a
            java.lang.String r5 = "voip/CallDatasource/getSelfLastFrameBitmap/ no cached frame"
            com.whatsapp.util.Log.i((java.lang.String) r5)
        L_0x01bb:
            java.lang.String r5 = "voip/CallGridViewModel/cacheLastFrame no bitmap"
            com.whatsapp.util.Log.i((java.lang.String) r5)
        L_0x01c1:
            r7.put(r2, r0)
        L_0x01c4:
            r0 = r37
            boolean r0 = r0.A0C
            r17 = r0
            int r14 = r21.size()
            r0 = r37
            X.0sL r5 = r0.A03
            X.0sG r0 = r4.A0I
            X.0sH r7 = r0.A0A(r2)
            int r13 = A01(r26)
            r0 = r26
            int r8 = r0.A05
            r0 = 6
            r12 = 0
            if (r8 != r0) goto L_0x01e5
            r12 = 1
        L_0x01e5:
            r0 = r26
            boolean r11 = r0.A0G
            r8 = 2
            r9 = 0
            if (r13 != r8) goto L_0x03d6
            r0 = 2131892989(0x7f121afd, float:1.9420742E38)
            if (r18 == 0) goto L_0x01f5
            r0 = 2131892990(0x7f121afe, float:1.9420744E38)
        L_0x01f5:
            java.lang.Object[] r8 = new java.lang.Object[r9]
        L_0x01f7:
            X.3y9 r10 = new X.3y9
            r10.<init>(r8, r0)
        L_0x01fc:
            r9 = 1
            if (r18 == 0) goto L_0x03c3
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x03d3
            r0 = r26
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x03d3
            if (r10 != 0) goto L_0x03d3
        L_0x020b:
            X.3AO r8 = new X.3AO
            r8.<init>(r7, r2)
            r8.A0E = r11
            r8.A05 = r15
            r8.A0C = r6
            r8.A08 = r1
            r0 = r18
            r8.A0F = r0
            r0 = r26
            boolean r0 = r0.A0H
            r8.A0D = r0
            if (r18 != 0) goto L_0x03c0
            X.1SO r7 = r4.A0F
            boolean r0 = r7.A01(r2)
            if (r0 != 0) goto L_0x0281
            r15 = 0
            if (r5 == 0) goto L_0x0243
            X.0sO r0 = r4.A0K
            X.0us r0 = r0.A07
            X.1cE r0 = r0.A04(r5)
            X.1ck r0 = r0.A05(r2)
            if (r0 == 0) goto L_0x0243
            int r0 = r0.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x0243:
            r5 = 0
            X.C18450wi.A0H(r2, r5)
            if (r15 != 0) goto L_0x03ba
            java.util.List r0 = X.AnonymousClass1SO.A00
            boolean r15 = r0.isEmpty()
            if (r15 != 0) goto L_0x0561
            java.lang.Object r0 = r0.remove(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            int r16 = r0.intValue()
        L_0x025b:
            java.util.List r0 = X.AnonymousClass1SO.A00
            int r0 = r0.size()
            if (r0 != 0) goto L_0x027a
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r15 = 21
            X.22s r5 = X.C008203t.A03(r5, r15)
            java.util.List r5 = X.C003101j.A0B(r5)
            java.util.Collections.shuffle(r5)
            r0.addAll(r5)
            X.AnonymousClass1SO.A00 = r0
        L_0x027a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r7.put(r2, r0)
        L_0x0281:
            java.lang.Integer r0 = r7.A00(r2)
            X.AnonymousClass00B.A06(r0)
            int r7 = r0.intValue()
            r0 = -1
            r5 = 0
            if (r7 < r0) goto L_0x0291
        L_0x0290:
            r5 = 1
        L_0x0291:
            java.lang.String r0 = "colorIndex should be no less than -1"
            X.AnonymousClass00B.A0B(r0, r5)
            r8.A01 = r7
            r0 = r17
            r8.A09 = r0
            r5 = 2131101986(0x7f060922, float:1.7816397E38)
            if (r9 != 0) goto L_0x02ae
            r0 = 2
            r5 = 2131101967(0x7f06090f, float:1.7816359E38)
            if (r13 == r0) goto L_0x02ae
            r0 = 3
            r5 = -1
            if (r13 != r0) goto L_0x02ae
            r5 = 2131101963(0x7f06090b, float:1.781635E38)
        L_0x02ae:
            r8.A00 = r5
            r8.A0O = r9
            r5 = 3
            r0 = 0
            if (r13 != r5) goto L_0x02b7
            r0 = 1
        L_0x02b7:
            r8.A0J = r0
            if (r9 != 0) goto L_0x02c1
            if (r13 == r5) goto L_0x02c1
            r5 = 2
            r0 = 0
            if (r13 != r5) goto L_0x02c2
        L_0x02c1:
            r0 = 1
        L_0x02c2:
            r8.A0I = r0
            r8.A06 = r10
            if (r17 != 0) goto L_0x02cb
            r0 = 1
            if (r10 == 0) goto L_0x02cc
        L_0x02cb:
            r0 = 0
        L_0x02cc:
            r8.A0M = r0
            r0 = r1 ^ 1
            r8.A0P = r0
            r8.A07 = r12
            int r0 = r4.A00
            int r0 = r0 * -90
            r8.A02 = r0
            java.util.Map r0 = r4.A0b
            java.lang.Object r0 = r0.get(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r8.A04 = r0
            r0 = 1
            if (r18 == 0) goto L_0x03b7
            if (r6 == 0) goto L_0x02eb
            if (r14 > r3) goto L_0x02ed
        L_0x02eb:
            if (r1 == 0) goto L_0x03b7
        L_0x02ed:
            r8.A0K = r0
            r7 = 1
            if (r18 == 0) goto L_0x03a4
            r9 = 2331(0x91b, float:3.266E-42)
            r5 = r34
            r0 = r22
            int r0 = r5.A03(r0, r9)
            if (r0 == 0) goto L_0x0392
            boolean r5 = X.C30341cC.A0O(r34)
            if (r5 != 0) goto L_0x0392
            if (r14 < r0) goto L_0x0396
        L_0x0306:
            r8.A0L = r7
            r0 = r26
            boolean r0 = r0.A0C
            r8.A0B = r0
            if (r18 == 0) goto L_0x0313
            r0 = 1
            if (r12 != 0) goto L_0x0314
        L_0x0313:
            r0 = 0
        L_0x0314:
            r8.A0R = r0
            r7 = 2388(0x954, float:3.346E-42)
            r5 = r34
            r0 = r22
            int r0 = r5.A03(r0, r7)
            r5 = 1
            if (r18 == 0) goto L_0x0390
            if (r14 < r0) goto L_0x038e
            if (r1 != 0) goto L_0x032a
            r0 = 4
        L_0x0328:
            if (r14 < r0) goto L_0x038e
        L_0x032a:
            r8.A0H = r5
            r0 = r26
            int r0 = r0.A00
            r8.A03 = r0
            boolean r0 = r4.A0f
            r5 = 0
            if (r0 != 0) goto L_0x037a
            if (r14 <= r3) goto L_0x033a
        L_0x0339:
            r5 = 1
        L_0x033a:
            r8.A0S = r5
            boolean r5 = r4.A04
            r8.A0A = r5
            boolean r0 = r4.A0e
            r8.A0G = r0
            if (r5 == 0) goto L_0x0349
            r0 = 1
            if (r10 != 0) goto L_0x034a
        L_0x0349:
            r0 = 0
        L_0x034a:
            r8.A0Q = r0
            if (r5 != 0) goto L_0x0357
            if (r18 == 0) goto L_0x0357
            if (r11 == 0) goto L_0x0357
            boolean r5 = r4.A03
            r0 = 1
            if (r5 != 0) goto L_0x0358
        L_0x0357:
            r0 = 0
        L_0x0358:
            r8.A0N = r0
            X.1px r5 = r8.A00()
            r0 = r20
            r0.add(r5)
            if (r1 == 0) goto L_0x036c
            r0 = r26
            r4.A0B(r0)
            r24 = r2
        L_0x036c:
            r0 = r26
            if (r6 == 0) goto L_0x0375
            r4.A0C(r0)
            goto L_0x00ce
        L_0x0375:
            r4.A0D(r0)
            goto L_0x00ce
        L_0x037a:
            if (r14 <= r3) goto L_0x033a
            if (r11 == 0) goto L_0x0387
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r4.A0Z
            X.2cs r0 = r0.getLastCachedFrame()
            if (r0 == 0) goto L_0x0339
            goto L_0x033a
        L_0x0387:
            r0 = r26
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x033a
            goto L_0x0339
        L_0x038e:
            r5 = 0
            goto L_0x032a
        L_0x0390:
            r0 = 3
            goto L_0x0328
        L_0x0392:
            if (r14 <= r3) goto L_0x0396
            goto L_0x0306
        L_0x0396:
            java.lang.Object r0 = r35.A01()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03b4
            goto L_0x0306
        L_0x03a4:
            r9 = 1111(0x457, float:1.557E-42)
            r5 = r34
            r0 = r22
            boolean r0 = r5.A0E(r0, r9)
            if (r0 == 0) goto L_0x03b4
            if (r11 != 0) goto L_0x03b4
            goto L_0x0306
        L_0x03b4:
            r7 = 0
            goto L_0x0306
        L_0x03b7:
            r0 = 0
            goto L_0x02ed
        L_0x03ba:
            int r16 = r15.intValue()
            goto L_0x025b
        L_0x03c0:
            r7 = -1
            goto L_0x0290
        L_0x03c3:
            r0 = r26
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x03d3
            r8 = 2
            if (r14 <= r8) goto L_0x020b
            r0 = 3
            if (r13 == r0) goto L_0x03d3
            if (r13 == r8) goto L_0x03d3
            goto L_0x020b
        L_0x03d3:
            r9 = 0
            goto L_0x020b
        L_0x03d6:
            r0 = 3
            if (r13 != r0) goto L_0x03e3
            r0 = 2131892839(0x7f121a67, float:1.9420438E38)
            if (r18 == 0) goto L_0x01f5
            r0 = 2131893004(0x7f121b0c, float:1.9420772E38)
            goto L_0x01f5
        L_0x03e3:
            r0 = 9
            if (r13 != r0) goto L_0x03ec
            r0 = 2131893002(0x7f121b0a, float:1.9420768E38)
            goto L_0x01f5
        L_0x03ec:
            r0 = 5
            if (r13 != r0) goto L_0x0417
            if (r6 != 0) goto L_0x0417
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x040e
            if (r12 != 0) goto L_0x040e
            if (r14 != r8) goto L_0x040e
            if (r1 != 0) goto L_0x040e
            X.0sP r0 = r4.A0J
            java.lang.String r0 = r0.A0C(r7)
            if (r0 == 0) goto L_0x0412
            if (r11 != 0) goto L_0x0412
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r9] = r0
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            goto L_0x01f7
        L_0x040e:
            if (r18 != 0) goto L_0x0417
            if (r17 != 0) goto L_0x0417
        L_0x0412:
            r0 = 2131893000(0x7f121b08, float:1.9420764E38)
            goto L_0x01f5
        L_0x0417:
            r10 = 0
            goto L_0x01fc
        L_0x041a:
            java.lang.String r5 = "voip/CallDatasource/getSelfLastFrameBitmap start. size: "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r5)
            int r5 = r13.A03
            r8.append(r5)
            java.lang.String r9 = "x"
            r8.append(r9)
            int r5 = r13.A01
            r8.append(r5)
            java.lang.String r5 = " format = "
            r8.append(r5)
            int r5 = r13.A00
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            int r11 = r13.A00
            byte[] r10 = r13.A05
            int r8 = r13.A03
            int r5 = r13.A01
            int[] r11 = X.C30341cC.A0Q(r10, r11, r8, r5)
            if (r11 == 0) goto L_0x01bb
            int r10 = r13.A03     // Catch:{ OutOfMemoryError -> 0x04b5 }
            int r8 = r13.A01     // Catch:{ OutOfMemoryError -> 0x04b5 }
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x04b5 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r11, r10, r8, r5)     // Catch:{ OutOfMemoryError -> 0x04b5 }
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            boolean r12 = r13.A04
            r11 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x046a
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x046a:
            r8.preScale(r11, r10)
            int r10 = r13.A02
            float r10 = (float) r10
            r8.postRotate(r10)
            r28 = 0
            int r30 = r5.getWidth()     // Catch:{ OutOfMemoryError -> 0x04ad }
            int r31 = r5.getHeight()     // Catch:{ OutOfMemoryError -> 0x04ad }
            r29 = 0
            r33 = 1
            r27 = r5
            r32 = r8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ OutOfMemoryError -> 0x04ad }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x04ad }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x04ad }
            java.lang.String r8 = "voip/CallDatasource/getSelfLastFrameBitmap/screenshot done. size: "
            r10.append(r8)     // Catch:{ OutOfMemoryError -> 0x04ad }
            int r8 = r5.getWidth()     // Catch:{ OutOfMemoryError -> 0x04ad }
            r10.append(r8)     // Catch:{ OutOfMemoryError -> 0x04ad }
            r10.append(r9)     // Catch:{ OutOfMemoryError -> 0x04ad }
            int r8 = r5.getHeight()     // Catch:{ OutOfMemoryError -> 0x04ad }
            r10.append(r8)     // Catch:{ OutOfMemoryError -> 0x04ad }
            java.lang.String r8 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x04ad }
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ OutOfMemoryError -> 0x04ad }
            goto L_0x0516
        L_0x04ad:
            r9 = move-exception
            java.lang.String r8 = "voip/CallDatasource/getSelfLastFrameBitmap OOM when creating result bitmap"
            com.whatsapp.util.Log.i(r8, r9)
            goto L_0x050e
        L_0x04b5:
            r8 = move-exception
            java.lang.String r5 = "voip/CallDatasource/getSelfLastFrameBitmap OOM when creating raw bitmap"
            goto L_0x0531
        L_0x04ba:
            r0 = r26
            int r9 = r0.A06
            if (r9 == 0) goto L_0x0536
            int r8 = r0.A03
            if (r8 == 0) goto L_0x0536
            r0 = 0
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x052d }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r9, r8, r5)     // Catch:{ OutOfMemoryError -> 0x052d }
            if (r5 == 0) goto L_0x0504
            boolean r8 = com.whatsapp.voipcalling.Voip.dumpLastVideoFrame(r2, r5)
            if (r8 == 0) goto L_0x0504
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r9 = r26
            int r9 = r9.A04
            int r9 = r9 * 90
            int r9 = -r9
            float r9 = (float) r9
            r8.preRotate(r9)
            r28 = 0
            int r30 = r5.getWidth()     // Catch:{ OutOfMemoryError -> 0x04fc }
            int r31 = r5.getHeight()     // Catch:{ OutOfMemoryError -> 0x04fc }
            r29 = 0
            r33 = 1
            r27 = r5
            r32 = r8
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ OutOfMemoryError -> 0x04fc }
            if (r8 == r5) goto L_0x050c
            goto L_0x050b
        L_0x04fc:
            r9 = move-exception
            java.lang.String r8 = "voip/CallDatasource/getPeerLastFrameBitmap OOM when creating result bitmap"
            com.whatsapp.util.Log.i(r8, r9)
            goto L_0x0510
        L_0x0504:
            java.lang.String r8 = "voip/CallDatasource/getPeerLastFrameBitmap dumpLastVideoFrame failed"
            com.whatsapp.util.Log.i((java.lang.String) r8)
            goto L_0x050e
        L_0x050b:
            r0 = r5
        L_0x050c:
            r5 = r0
            r0 = r8
        L_0x050e:
            if (r5 == 0) goto L_0x0513
        L_0x0510:
            r5.recycle()
        L_0x0513:
            if (r0 == 0) goto L_0x01bb
            goto L_0x0518
        L_0x0516:
            if (r0 != r5) goto L_0x0510
        L_0x0518:
            int r5 = r0.getWidth()
            int r5 = r5 / 40
            r8 = 8
            if (r5 < r8) goto L_0x0527
            r8 = 16
            if (r5 > r8) goto L_0x0527
            r8 = r5
        L_0x0527:
            r5 = 2
            com.whatsapp.filter.FilterUtils.blurNative(r0, r8, r5)
            goto L_0x01c1
        L_0x052d:
            r8 = move-exception
            java.lang.String r5 = "voip/CallDatasource/getPeerLastFrameBitmap OOM when creating raw bitmap"
        L_0x0531:
            com.whatsapp.util.Log.i(r5, r8)
            goto L_0x01bb
        L_0x0536:
            java.lang.String r0 = "voip/CallDatasource/getLastFrameBitmap cancelled due to bad participant info or video size"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            goto L_0x01bb
        L_0x053f:
            r7.remove(r2)
            goto L_0x01c4
        L_0x0544:
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x054a
            goto L_0x0169
        L_0x054a:
            r0 = 0
            goto L_0x019e
        L_0x054d:
            if (r5 <= r3) goto L_0x0551
            goto L_0x0133
        L_0x0551:
            if (r23 == 0) goto L_0x014a
            goto L_0x0133
        L_0x0555:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r15 = new android.util.Pair
            r15.<init>(r0, r0)
            goto L_0x00f0
        L_0x0561:
            java.lang.String r1 = "List is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0569:
            X.027 r2 = r4.A08
            java.lang.Object r1 = r2.A01()
            r0 = r24
            if (r1 == r0) goto L_0x0576
            r2.A0B(r0)
        L_0x0576:
            java.lang.Object r0 = r36.A01()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = r18
            if (r1 == r0) goto L_0x05ae
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            r0 = r36
            r0.A0B(r1)
            X.2OJ r1 = r4.A0S
            X.01J r0 = r4.A0d
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x05a0
            r0 = 1
            if (r18 != 0) goto L_0x05a1
        L_0x05a0:
            r0 = 0
        L_0x05a1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0B(r0)
            r4.A08()
            r4.A0A()
        L_0x05ae:
            java.util.LinkedHashMap r0 = r4.A0a
            r22 = r0
            java.util.Set r0 = r22.keySet()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r0)
            java.util.Set r0 = r21.keySet()
            r5.removeAll(r0)
            boolean r0 = r4.A0f
            if (r0 == 0) goto L_0x05dc
            java.util.Iterator r2 = r5.iterator()
        L_0x05ca:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05dc
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1Ph r0 = r4.A0H
            r0.A02(r1)
            goto L_0x05ca
        L_0x05dc:
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x0603
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0603
            if (r40 != 0) goto L_0x0603
            r3 = 0
        L_0x05eb:
            java.util.Iterator r5 = r20.iterator()
        L_0x05ef:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0999
            java.lang.Object r2 = r5.next()
            X.1px r2 = (X.C37921px) r2
            com.whatsapp.jid.UserJid r1 = r2.A0U
            r0 = r22
            r0.put(r1, r2)
            goto L_0x05ef
        L_0x0603:
            X.2OJ r0 = r4.A0O
            java.lang.Object r0 = r0.A01()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            if (r18 == 0) goto L_0x0776
            int r2 = r20.size()
            r0 = 8
            if (r2 <= r0) goto L_0x0776
            r5 = 0
            r2 = 0
        L_0x061b:
            int r0 = r20.size()
            if (r2 >= r0) goto L_0x06e4
            r0 = r20
            java.lang.Object r0 = r0.get(r2)
            X.1px r0 = (X.C37921px) r0
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x06e0
            r0 = r20
            java.lang.Object r11 = r0.get(r2)
            X.1px r11 = (X.C37921px) r11
            r0.remove(r2)
        L_0x0638:
            X.AnonymousClass00B.A06(r11)
            r0 = 10
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r2 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r2.<init>(r0)
            r0 = r20
            java.util.Collections.sort(r0, r2)
            r2 = 5
            java.util.List r0 = r0.subList(r5, r2)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            int r0 = r9.size()
            int r8 = r0 + 1
            int r7 = X.C89574cT.A01(r8, r1)
            int r13 = X.C89574cT.A02(r8, r1)
            X.1px[] r10 = new X.C37921px[r8]
            android.util.Pair r6 = r11.A05
            int r12 = r8 + -1
            java.lang.Object r0 = r6.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r13 + -1
            if (r0 != r1) goto L_0x06c5
            java.lang.Object r0 = r6.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            int r0 = r7 + -1
            if (r6 != r0) goto L_0x06c5
        L_0x067d:
            r10[r12] = r11
            r11 = 0
        L_0x0680:
            int r0 = r9.size()
            if (r11 >= r0) goto L_0x06e7
            java.lang.Object r6 = r9.get(r11)
            X.1px r6 = (X.C37921px) r6
            android.util.Pair r0 = r6.A05
            java.lang.Object r1 = r0.first
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 >= r13) goto L_0x06c2
            java.lang.Object r1 = r0.second
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 >= r7) goto L_0x06c2
            java.lang.Object r1 = r0.first
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 * r7
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r1 + r0
            if (r1 < 0) goto L_0x06c2
            if (r1 >= r12) goto L_0x06c2
            r0 = r10[r1]
            if (r0 != 0) goto L_0x06c2
            r10[r1] = r6
            r9.remove(r11)
            goto L_0x0680
        L_0x06c2:
            int r11 = r11 + 1
            goto L_0x0680
        L_0x06c5:
            X.3AO r6 = new X.3AO
            r6.<init>(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            int r0 = r7 + -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r11, r1)
            r6.A05 = r0
            X.1px r11 = r6.A00()
            goto L_0x067d
        L_0x06e0:
            int r2 = r2 + 1
            goto L_0x061b
        L_0x06e4:
            r11 = 0
            goto L_0x0638
        L_0x06e7:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0721
            r6 = 0
        L_0x06ee:
            if (r6 >= r8) goto L_0x0721
            r0 = r10[r6]
            if (r0 != 0) goto L_0x0772
            java.lang.Object r0 = r9.get(r5)
            X.1px r0 = (X.C37921px) r0
            X.3AO r12 = new X.3AO
            r12.<init>(r0)
            int r0 = r6 / r7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            int r0 = r6 % r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r11, r1)
            r12.A05 = r0
            X.1px r0 = r12.A00()
            r10[r6] = r0
            r9.remove(r5)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0772
        L_0x0721:
            java.util.List r0 = java.util.Arrays.asList(r10)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            int r1 = r20.size()
            r0 = r20
            java.util.List r0 = r0.subList(r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r1 = 9
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            java.util.Iterator r8 = r2.iterator()
        L_0x0747:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x097e
            java.lang.Object r0 = r8.next()
            X.1px r0 = (X.C37921px) r0
            X.3AO r7 = new X.3AO
            r7.<init>(r0)
            r0 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r7.A05 = r0
            X.1px r0 = r7.A00()
            r6.add(r0)
            int r5 = r5 + 1
            goto L_0x0747
        L_0x0772:
            int r6 = r6 + 1
            goto L_0x06ee
        L_0x0776:
            r6 = r20
            int r0 = r20.size()
            if (r0 == 0) goto L_0x097e
            int r0 = r20.size()
            if (r0 == r3) goto L_0x097e
            int r0 = r20.size()
            int r11 = X.C89574cT.A01(r0, r1)
            int r0 = r20.size()
            int r17 = X.C89574cT.A02(r0, r1)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r7 = r20.size()
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r7 == r3) goto L_0x07b5
            r5 = 2
            if (r7 != r5) goto L_0x080b
            r0 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x07b5:
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r6, r6)
        L_0x07ba:
            java.util.Iterator r13 = r20.iterator()
            r7 = 0
        L_0x07bf:
            boolean r0 = r13.hasNext()
            r5 = -1
            if (r0 == 0) goto L_0x0861
            java.lang.Object r6 = r13.next()
            X.1px r6 = (X.C37921px) r6
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x07d2
            r7 = r6
            goto L_0x07bf
        L_0x07d2:
            android.util.Pair r12 = r6.A05
            java.lang.Object r0 = r12.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x0807
            java.lang.Object r2 = r12.second
            r0 = r2
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x0807
            if (r0 >= r11) goto L_0x0807
            boolean r0 = r10.containsKey(r2)
            if (r0 != 0) goto L_0x07fb
            java.lang.Object r2 = r12.second
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.put(r2, r0)
        L_0x07fb:
            java.lang.Object r0 = r12.second
            java.lang.Object r0 = r10.get(r0)
            java.util.List r0 = (java.util.List) r0
            r0.add(r6)
            goto L_0x07bf
        L_0x0807:
            r9.add(r6)
            goto L_0x07bf
        L_0x080b:
            r2 = 3
            if (r7 != r2) goto L_0x0816
            if (r1 != 0) goto L_0x0851
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r0, r6)
            goto L_0x07ba
        L_0x0816:
            r0 = 12
            if (r7 >= r0) goto L_0x0847
            int r0 = X.C89574cT.A01(r7, r1)
            int r6 = r0 - r3
            int r5 = X.C89574cT.A02(r7, r1)
            if (r7 == r3) goto L_0x0845
            if (r6 >= r0) goto L_0x0845
            if (r7 > r2) goto L_0x0839
            r5 = 1
        L_0x082b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r2, r0)
            goto L_0x07ba
        L_0x0839:
            int r2 = r5 + -1
            int r0 = r0 * r2
            int r7 = r7 - r0
            if (r7 > r6) goto L_0x0840
            r5 = r2
        L_0x0840:
            if (r6 != r6) goto L_0x082b
            int r5 = r5 + -1
            goto L_0x082b
        L_0x0845:
            r5 = 0
            goto L_0x082b
        L_0x0847:
            if (r1 == 0) goto L_0x0858
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0851:
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r6, r0)
            goto L_0x07ba
        L_0x0858:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0851
        L_0x0861:
            int r15 = r11 + -1
        L_0x0863:
            r2 = 0
            if (r15 < 0) goto L_0x08dc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x087c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.put(r6, r0)
        L_0x087c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object r14 = r10.get(r0)
            java.util.List r14 = (java.util.List) r14
            r6 = 11
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r6)
            java.util.Collections.sort(r14, r0)
            int r13 = r20.size()
            int r12 = X.C89574cT.A02(r13, r1)
            int r6 = X.C89574cT.A01(r13, r1)
            if (r13 == r3) goto L_0x08da
            if (r15 >= r6) goto L_0x08da
            r0 = 3
            if (r13 > r0) goto L_0x08cb
            r12 = 1
        L_0x08a4:
            int r0 = r14.size()
            if (r12 > r0) goto L_0x08c3
            int r0 = r14.size()
            java.util.List r0 = r14.subList(r12, r0)
            r9.addAll(r2, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            java.util.List r0 = r14.subList(r2, r12)
            r10.put(r6, r0)
        L_0x08c0:
            int r15 = r15 + -1
            goto L_0x0863
        L_0x08c3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r10.put(r0, r14)
            goto L_0x08c0
        L_0x08cb:
            int r16 = r12 + -1
            int r0 = r16 * r6
            int r13 = r13 - r0
            if (r13 > r15) goto L_0x08d4
            r12 = r16
        L_0x08d4:
            int r6 = r6 - r3
            if (r15 != r6) goto L_0x08a4
            int r12 = r12 + -1
            goto L_0x08a4
        L_0x08da:
            r12 = 0
            goto L_0x08a4
        L_0x08dc:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1 = 0
        L_0x08e2:
            r0 = r17
            if (r1 >= r0) goto L_0x0965
            r12 = 0
        L_0x08e7:
            if (r12 >= r11) goto L_0x0961
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.Object r14 = r10.get(r0)
            java.util.List r14 = (java.util.List) r14
            if (r7 == 0) goto L_0x0928
            java.lang.Object r0 = r8.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r1 != r0) goto L_0x0928
            java.lang.Object r0 = r8.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r12 != r0) goto L_0x0928
            r0 = r7
        L_0x090a:
            X.3AO r14 = new X.3AO
            r14.<init>(r0)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r15, r13)
            r14.A05 = r0
            X.1px r0 = r14.A00()
            r6.add(r0)
        L_0x0925:
            int r12 = r12 + 1
            goto L_0x08e7
        L_0x0928:
            java.lang.Object r0 = r8.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r12 != r0) goto L_0x093e
            java.lang.Object r0 = r8.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r13 = r1 + -1
            if (r1 > r0) goto L_0x093f
        L_0x093e:
            r13 = r1
        L_0x093f:
            if (r14 == 0) goto L_0x0956
            int r0 = r14.size()
            if (r13 >= r0) goto L_0x0956
            java.lang.Object r0 = r14.get(r13)
            if (r0 == 0) goto L_0x0956
            java.lang.Object r0 = r14.get(r13)
        L_0x0951:
            X.1px r0 = (X.C37921px) r0
            if (r0 == 0) goto L_0x0925
            goto L_0x090a
        L_0x0956:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0925
            java.lang.Object r0 = r9.remove(r2)
            goto L_0x0951
        L_0x0961:
            int r1 = r1 + 1
            goto L_0x08e2
        L_0x0965:
            if (r7 == 0) goto L_0x097e
            java.lang.Object r0 = r8.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x097e
            java.lang.Object r0 = r8.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x097e
            r6.add(r7)
        L_0x097e:
            r20 = r6
            int r0 = r22.size()
            if (r18 == 0) goto L_0x0994
            if (r0 != r3) goto L_0x0997
        L_0x0988:
            r22.clear()
            X.2OJ r1 = r4.A0U
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B(r0)
            goto L_0x05eb
        L_0x0994:
            if (r0 != 0) goto L_0x0997
            goto L_0x0988
        L_0x0997:
            r3 = 0
            goto L_0x0988
        L_0x0999:
            r1 = 12
            if (r18 == 0) goto L_0x099f
            r1 = 9
        L_0x099f:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x09b4
            if (r3 != 0) goto L_0x09b4
            int r0 = r22.size()
            if (r0 <= r1) goto L_0x09b4
            X.1cy r1 = r4.A0Y
            r0 = r19
            r1.A0B(r0)
        L_0x09b4:
            r4.A09()
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x09db
            int r1 = r22.size()
            r0 = 8
            if (r1 <= r0) goto L_0x09db
            int r0 = r22.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x09cb:
            X.027 r1 = r4.A06
            java.lang.Object r0 = r1.A01()
            boolean r0 = X.C34901l3.A00(r0, r2)
            if (r0 != 0) goto L_0x09da
            r1.A0B(r2)
        L_0x09da:
            return
        L_0x09db:
            r2 = 0
            goto L_0x09cb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0E(X.3AY, boolean):void");
    }

    public void A0F(C37921px r9) {
        if (!r9.A0F) {
            return;
        }
        if (r9.A08) {
            A0G(r9.A0U);
        } else if (r9.A0C) {
            LinkedHashMap linkedHashMap = this.A0a;
            if (linkedHashMap.size() == 2) {
                boolean z2 = false;
                for (Object next : linkedHashMap.keySet()) {
                    Object obj = linkedHashMap.get(next);
                    AnonymousClass00B.A06(obj);
                    C37921px r2 = (C37921px) obj;
                    AnonymousClass3AO r1 = new AnonymousClass3AO(r2);
                    r1.A0C = !r2.A0C;
                    linkedHashMap.put(next, r1.A00());
                    if (!r2.A0C) {
                        this.A02 = r2.A0U;
                        z2 = true;
                    }
                }
                if (z2) {
                    A0E(this.A0D.A04(), false);
                }
            }
        }
    }

    public final void A0G(UserJid userJid) {
        AnonymousClass027 r4 = this.A08;
        Object A012 = r4.A01();
        if (A012 == null || userJid.equals(A012)) {
            C37921px r0 = (C37921px) this.A0a.get(userJid);
            if (r0 == null) {
                Log.w("voip/CallGridViewModel//toggleFocusedView participant not found");
                if (A012 != null) {
                    r4.A0B((Object) null);
                } else {
                    return;
                }
            } else {
                if (r0.A08) {
                    userJid = null;
                }
                r4.A0B(userJid);
            }
            A0E(this.A0D.A04(), false);
            return;
        }
        Log.e("voip/CallGridViewModel//toggleFocusedView previous focused participant must be cleared before switching");
    }

    public void A0H(List list) {
        C448926b r3 = this.A0D;
        Set set = r3.A0G;
        if (!set.containsAll(list) || set.size() != list.size()) {
            set.clear();
            set.addAll(list);
            AnonymousClass1WA r2 = r3.A0C;
            r2.A00();
            r2.execute(new RunnableRunnableShape4S0100000_I0_3(r3, 42));
        }
    }

    public void A0I(boolean z2) {
        boolean z3;
        C448926b r3 = this.A0D;
        Iterator it = r3.A01().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next() == this) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        if (z2) {
            if (!z3) {
                r3.A02(this);
            }
            A0E(r3.A04(), false);
            return;
        }
        if (z3) {
            r3.A03(this);
        }
        this.A0B.A0B(new ArrayList());
        this.A08.A0B((Object) null);
        this.A02 = null;
        if (this.A0f) {
            this.A0H.A00();
        }
    }
}
