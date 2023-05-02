package com.obwhatsapp.status.playback;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass012;
import X.AnonymousClass01A;
import X.AnonymousClass01S;
import X.AnonymousClass11G;
import X.AnonymousClass1L1;
import X.AnonymousClass1P9;
import X.AnonymousClass1PA;
import X.AnonymousClass29C;
import X.AnonymousClass398;
import X.AnonymousClass3B1;
import X.AnonymousClass3Od;
import X.AnonymousClass4FE;
import X.AnonymousClass55y;
import X.C16220sf;
import X.C16260sj;
import X.C16490t9;
import X.C28381Vw;
import X.C41811wh;
import X.C41821wi;
import X.C43211zc;
import X.C43221ze;
import X.C47482Jd;
import X.C47502Jf;
import X.C55722kE;
import X.C75633sT;
import X.C85384Of;
import X.C94584l9;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class StatusPlaybackActivity extends C43221ze implements C43211zc {
    public static final Interpolator A0O = new C94584l9();
    public float A00 = 3.5f;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public int A05 = -1;
    public long A06;
    public ViewPager A07;
    public C16260sj A08;
    public AnonymousClass11G A09;
    public C28381Vw A0A;
    public C16220sf A0B;
    public AnonymousClass1L1 A0C;
    public AnonymousClass398 A0D;
    public AnonymousClass3Od A0E;
    public AnonymousClass1PA A0F;
    public AnonymousClass1P9 A0G;
    public Runnable A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K = false;
    public boolean A0L;
    public boolean A0M;
    public final Rect A0N = new Rect();

    public StatusPlaybackFragment A35() {
        int currentItem = this.A07.getCurrentItem();
        AnonymousClass398 r0 = this.A0D;
        if (r0 == null || currentItem < 0 || currentItem >= r0.A00.size()) {
            return null;
        }
        return A36((AnonymousClass4FE) this.A0D.A00.get(currentItem));
    }

    public final StatusPlaybackFragment A36(AnonymousClass4FE r6) {
        String rawString;
        if (r6 == null || (rawString = r6.A00.A0B.getRawString()) == null) {
            return null;
        }
        for (AnonymousClass01A r1 : A2E()) {
            if (r1 instanceof StatusPlaybackFragment) {
                StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) r1;
                UserJid userJid = ((StatusPlaybackContactFragment) statusPlaybackFragment).A0S;
                AnonymousClass00B.A06(userJid);
                if (rawString.equals(userJid.getRawString())) {
                    return statusPlaybackFragment;
                }
            }
        }
        return null;
    }

    public final void A37(int i2, String str, int i3) {
        int A002 = this.A0D.A00(str);
        if (A002 >= 0 && A002 < this.A0D.A00.size()) {
            if (A002 != this.A07.getCurrentItem()) {
                this.A0D.A00.remove(A002);
                int i4 = this.A01;
                if (A002 <= i4) {
                    this.A01 = i4 - 1;
                }
                int i5 = this.A05;
                if (A002 <= i5) {
                    this.A05 = i5 - 1;
                }
                this.A07.getAdapter().A06();
            } else if (this.A0I || A002 == this.A0D.A00.size() - 1) {
                finish();
            } else {
                this.A0H = new AnonymousClass55y(this, str, i2, i3);
                ASR(str, i2, i3, true);
            }
        }
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A01;
    }

    public boolean ASR(String str, int i2, int i3, boolean z2) {
        ViewPager viewPager;
        int i4;
        int A002 = this.A0D.A00(str);
        if (z2) {
            this.A03 = i2;
            this.A02 = i3;
            if (A002 >= this.A0D.A00.size() - 1 || this.A0I) {
                finish();
                return true;
            }
            this.A0E.A00 = this.A00;
            this.A00 = 3.5f;
            viewPager = this.A07;
            i4 = A002 + 1;
        } else if (A002 <= 0 || this.A0I) {
            return false;
        } else {
            this.A0E.A00 = this.A00;
            this.A00 = 3.5f;
            this.A03 = i2;
            this.A02 = i3;
            viewPager = this.A07;
            i4 = A002 - 1;
        }
        viewPager.A0F(i4, true);
        this.A0E.A00 = 0.0f;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            int r3 = r10.getKeyCode()
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x0078
            r1 = 24
            if (r3 == r1) goto L_0x0012
            r0 = 25
            if (r3 != r0) goto L_0x0078
        L_0x0012:
            X.1PA r8 = r9.A0F
            r7 = 1
            r2 = 0
            if (r3 != r1) goto L_0x0019
            r2 = 1
        L_0x0019:
            X.01V r0 = r8.A06
            android.media.AudioManager r6 = r0.A0G()
            if (r6 == 0) goto L_0x0056
            r5 = 3
            int r4 = r6.getStreamVolume(r5)
            int r3 = r6.getStreamMaxVolume(r5)
            r1 = 16
            if (r2 == 0) goto L_0x004e
            if (r4 >= r3) goto L_0x0054
            int r2 = r4 + 1
            r0 = 1
        L_0x0033:
            r6.adjustSuggestedStreamVolume(r0, r5, r1)
        L_0x0036:
            java.util.List r0 = r8.A04
            if (r0 == 0) goto L_0x0056
            java.util.Iterator r1 = r0.iterator()
        L_0x003e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r1.next()
            X.5S9 r0 = (X.AnonymousClass5S9) r0
            r0.AMt(r4, r2, r3)
            goto L_0x003e
        L_0x004e:
            if (r4 <= 0) goto L_0x0054
            int r2 = r4 + -1
            r0 = -1
            goto L_0x0033
        L_0x0054:
            r2 = r4
            goto L_0x0036
        L_0x0056:
            X.1PA r1 = r9.A0F
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0077
            r2 = 0
            r1.A05 = r2
            java.util.List r0 = r1.A04
            if (r0 == 0) goto L_0x0077
            java.util.Iterator r1 = r0.iterator()
        L_0x0067:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r1.next()
            X.5S9 r0 = (X.AnonymousClass5S9) r0
            r0.AMp(r2)
            goto L_0x0067
        L_0x0077:
            return r7
        L_0x0078:
            boolean r0 = super.dispatchKeyEvent(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.StatusPlaybackActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.A0E.isFinished() && this.A0E.timePassed() < (this.A0E.getDuration() >> 1)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            long eventTime = motionEvent.getEventTime() - this.A06;
            this.A00 = (eventTime == 0 || eventTime > 1000) ? 3.5f : ((((float) eventTime) * 2.5f) / 1000.0f) + 1.0f;
            this.A06 = motionEvent.getEventTime();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        boolean z2 = true;
        if (i2 == 10) {
            if (i3 != -1) {
                z2 = false;
            }
            this.A0L = z2;
        } else if (i2 != 151) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            this.A0J = true;
            AnonymousClass012 adapter = this.A07.getAdapter();
            AnonymousClass00B.A06(adapter);
            adapter.A06();
            this.A07.setCurrentItem(this.A04);
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        C41821wi A1J;
        StatusPlaybackFragment A35 = A35();
        if (!(A35 == null || !(A35 instanceof StatusPlaybackContactFragment) || (A1J = ((StatusPlaybackContactFragment) A35).A1J()) == null)) {
            C41811wh r3 = (C41811wh) A1J;
            BottomSheetBehavior bottomSheetBehavior = r3.A00;
            if (bottomSheetBehavior.A0B == 3) {
                bottomSheetBehavior.A0M(4);
                return;
            }
            C55722kE A0A2 = r3.A0A();
            if (A0A2.A0F.A0K()) {
                A0A2.A0F.setExpanded(false);
                A0A2.A02.setVisibility(A0A2.A0F.getVisibility());
                r3.A0D();
                return;
            }
            r3.A09();
        }
        this.A03 = 3;
        super.onBackPressed();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            super.onCreate(r0)
            android.view.Window r1 = r15.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r0, r0)
            android.view.Window r0 = r15.getWindow()
            X.C19980zJ.A05(r0)
            X.0pd r2 = r15.A0C
            r1 = 2511(0x9cf, float:3.519E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x002b
            android.view.Window r1 = r15.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
        L_0x002b:
            r0 = 2131559792(0x7f0d0570, float:1.8744938E38)
            r15.setContentView((int) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0050
            android.view.Window r1 = r15.getWindow()
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1.addFlags(r0)
            r0 = 2131365864(0x7f0a0fe8, float:1.8351605E38)
            android.view.View r2 = r15.findViewById(r0)
            r1 = 4
            com.facebook.redex.IDxIListenerShape217S0100000_2_I0 r0 = new com.facebook.redex.IDxIListenerShape217S0100000_2_I0
            r0.<init>(r15, r1)
            X.C004601z.A0k(r2, r0)
        L_0x0050:
            r0 = 2131364996(0x7f0a0c84, float:1.8349845E38)
            android.view.View r0 = r15.findViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r15.A07 = r0
            android.content.Context r2 = r0.getContext()
            android.view.animation.Interpolator r1 = A0O
            X.3Od r0 = new X.3Od
            r0.<init>(r2, r1)
            r15.A0E = r0
            r13 = 1
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = "mScroller"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x007b }
            r2.setAccessible(r13)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x007b }
            androidx.viewpager.widget.ViewPager r1 = r15.A07     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x007b }
            X.3Od r0 = r15.A0E     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x007b }
            r2.set(r1, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x007b }
        L_0x007b:
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            com.whatsapp.jid.UserJid r4 = X.C16030sJ.A02(r0)
            android.content.Intent r0 = r15.getIntent()
            X.1Vw r0 = X.AnonymousClass1yL.A02(r0)
            r15.A0A = r0
            r5 = 0
            r15.A04 = r5
            X.398 r2 = new X.398
            r2.<init>(r15)
            if (r0 != 0) goto L_0x01dd
            X.1jg r0 = X.C34091jg.A00
            if (r4 != r0) goto L_0x00e2
            X.11G r0 = r15.A09
            X.1dI r3 = r0.A05()
            if (r3 == 0) goto L_0x00c4
            boolean r0 = r3.A0C()
            if (r0 != 0) goto L_0x00c4
            X.1dI r1 = r3.A05()
            X.4FE r0 = new X.4FE
            r0.<init>(r1)
            r2.A01(r0)
            int r0 = r3.A02()
            if (r0 <= 0) goto L_0x00c2
            r5 = 1
        L_0x00c2:
            r15.A0M = r5
        L_0x00c4:
            java.util.List r0 = r2.A00
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01f9
            java.lang.String r1 = "statusplaybackactivity/create/no statuses for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r15.finish()
            return
        L_0x00e2:
            X.0sf r0 = r15.A0B
            boolean r0 = r0.A0R(r4)
            if (r0 != 0) goto L_0x01dd
            android.content.Intent r0 = r15.getIntent()
            java.lang.String r3 = "sorted_jids"
            boolean r0 = r0.hasExtra(r3)
            if (r0 == 0) goto L_0x012d
            X.11G r0 = r15.A09
            r0.A0B()
            java.util.concurrent.ConcurrentHashMap r0 = r0.A08
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            android.content.Intent r0 = r15.getIntent()
            java.util.ArrayList r0 = r0.getStringArrayListExtra(r3)
            java.util.List r0 = X.C16030sJ.A08(r1, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0114:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01be
            java.lang.Object r0 = r3.next()
            java.lang.Object r1 = r6.get(r0)
            X.1dI r1 = (X.C30991dI) r1
            X.4FE r0 = new X.4FE
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x0114
        L_0x012d:
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "single_contact_update"
            boolean r7 = r1.getBooleanExtra(r0, r5)
            X.11G r0 = r15.A09
            java.util.List r5 = r0.A07()
            r1 = 39
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r1)
            java.util.Collections.sort(r5, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x0151:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r1 = r3.next()
            X.1dI r1 = (X.C30991dI) r1
            com.whatsapp.jid.UserJid r0 = r1.A0B
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0151
            int r1 = r1.A02()
            r0 = 0
            if (r1 <= 0) goto L_0x016d
            r0 = 1
        L_0x016d:
            r15.A0M = r0
        L_0x016f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0173:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r3 = r5.next()
            X.1dI r3 = (X.C30991dI) r3
            boolean r0 = r3.A0B()
            if (r0 != 0) goto L_0x0173
            boolean r0 = r15.A0M
            if (r0 == 0) goto L_0x018f
            int r0 = r3.A02()
            if (r0 <= 0) goto L_0x0173
        L_0x018f:
            X.0sf r0 = r15.A0B
            com.whatsapp.jid.UserJid r1 = r3.A0B
            boolean r0 = r0.A0R(r1)
            if (r0 != 0) goto L_0x0173
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x01a1
            if (r7 != 0) goto L_0x0173
        L_0x01a1:
            r6.add(r3)
            goto L_0x0173
        L_0x01a5:
            java.util.Iterator r3 = r6.iterator()
        L_0x01a9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r1 = r3.next()
            X.1dI r1 = (X.C30991dI) r1
            X.4FE r0 = new X.4FE
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x01a9
        L_0x01be:
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "unseen_only"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            r15.A0M = r0
        L_0x01cb:
            boolean r0 = r15.A0M
            r0 = r0 ^ 1
            r15.A0I = r0
            java.lang.String r0 = r4.getRawString()
            int r0 = r2.A00(r0)
            r15.A04 = r0
            goto L_0x00c4
        L_0x01dd:
            X.11G r0 = r15.A09
            X.1dI r1 = r0.A06(r4)
            if (r1 == 0) goto L_0x00c4
            boolean r0 = r1.A0C()
            if (r0 != 0) goto L_0x00c4
            X.1dI r1 = r1.A05()
            X.4FE r0 = new X.4FE
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x00c4
        L_0x01f9:
            X.0sj r0 = r15.A08
            boolean r0 = r0.A0B()
            r15.A0J = r0
            if (r0 != 0) goto L_0x0221
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 >= r0) goto L_0x0268
            r10 = 2131890772(0x7f121254, float:1.9416245E38)
        L_0x020c:
            r9 = 2131890773(0x7f121255, float:1.9416247E38)
            r1 = 151(0x97, float:2.12E-43)
            r11 = 0
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L_0x0221
            r12 = 0
            r14 = 0
            android.content.Intent r0 = com.obwhatsapp.RequestPermissionActivity.A02(r8, r9, r10, r11, r12, r13, r14)
            r15.startActivityForResult(r0, r1)
        L_0x0221:
            r15.A0D = r2
            androidx.viewpager.widget.ViewPager r2 = r15.A07
            X.02C r1 = r15.AGM()
            X.2zh r0 = new X.2zh
            r0.<init>(r1, r15)
            r2.setAdapter(r0)
            androidx.viewpager.widget.ViewPager r1 = r15.A07
            int r0 = r15.A04
            r1.setCurrentItem(r0)
            int r0 = r15.A04
            r15.A01 = r0
            androidx.viewpager.widget.ViewPager r1 = r15.A07
            X.3Dk r0 = new X.3Dk
            r0.<init>(r15)
            r1.A0G(r0)
            androidx.viewpager.widget.ViewPager r2 = r15.A07
            r1 = 14
            com.facebook.redex.IDxTListenerShape167S0100000_2_I0 r0 = new com.facebook.redex.IDxTListenerShape167S0100000_2_I0
            r0.<init>(r15, r1)
            r2.setOnTouchListener(r0)
            X.1PA r3 = r15.A0F
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r3.A02 = r0
            X.01V r2 = r3.A06
            android.media.AudioManager r0 = r2.A0G()
            if (r0 == 0) goto L_0x0288
            goto L_0x0273
        L_0x0268:
            r0 = 33
            r10 = 2131890775(0x7f121257, float:1.9416251E38)
            if (r1 >= r0) goto L_0x020c
            r10 = 2131890774(0x7f121256, float:1.941625E38)
            goto L_0x020c
        L_0x0273:
            int r1 = r0.getRingerMode()     // Catch:{ RuntimeException -> 0x028c }
            r0 = 2
            if (r1 == r0) goto L_0x0288
            android.media.AudioManager r0 = r2.A0G()     // Catch:{ RuntimeException -> 0x028c }
            if (r0 == 0) goto L_0x0286
            boolean r0 = r0.isMusicActive()     // Catch:{ RuntimeException -> 0x028c }
            if (r0 != 0) goto L_0x0288
        L_0x0286:
            r0 = 1
            goto L_0x0289
        L_0x0288:
            r0 = 0
        L_0x0289:
            r3.A05 = r0     // Catch:{ RuntimeException -> 0x028c }
            goto L_0x0290
        L_0x028c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0290:
            androidx.viewpager.widget.ViewPager r0 = r15.A07
            r0.setKeepScreenOn(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.StatusPlaybackActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1PA r2 = this.A0F;
        Handler handler = r2.A02;
        if (handler != null) {
            handler.removeCallbacks(r2.A07);
        }
        r2.A01();
        if (r2.A04 != null) {
            r2.A04 = null;
        }
        AnonymousClass1L1 r5 = this.A0C;
        C47482Jd r0 = r5.A00;
        C47502Jf r4 = r5.A01;
        if (!(r0 == null || r4 == null)) {
            ArrayList arrayList = new ArrayList();
            for (C85384Of r6 : r4.A0D.values()) {
                C75633sT r22 = new C75633sT();
                r22.A05 = Long.valueOf(r6.A05);
                r22.A06 = Long.valueOf(r6.A06);
                r22.A01 = Integer.valueOf(r6.A02);
                r22.A02 = Long.valueOf((long) r6.A01);
                r22.A00 = Integer.valueOf(r6.A00);
                r22.A04 = Long.valueOf((long) r6.A04);
                r22.A03 = Long.valueOf((long) r6.A03);
                String str = r6.A07;
                r22.A07 = str;
                boolean isEmpty = TextUtils.isEmpty(str);
                C16490t9 r7 = r5.A09;
                if (isEmpty) {
                    r7.A05(r22);
                } else {
                    r7.A0B(r22, AnonymousClass3B1.A00, true);
                }
                arrayList.addAll(r6.A08.values());
            }
            r5.A0F.Acl(new RunnableRunnableShape2S0300000_I0_2(r5, r4, arrayList, 11));
            r5.A01 = null;
        }
        AnonymousClass1P9 r1 = this.A0G;
        AnonymousClass29C r02 = r1.A00;
        if (r02 != null) {
            r02.A09();
            r1.A00 = null;
        }
    }
}
