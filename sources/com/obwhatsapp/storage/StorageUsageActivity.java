package com.obwhatsapp.storage;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass0Ri;
import X.AnonymousClass0SJ;
import X.AnonymousClass15P;
import X.AnonymousClass17I;
import X.AnonymousClass1CW;
import X.AnonymousClass1YJ;
import X.AnonymousClass267;
import X.AnonymousClass2Ao;
import X.AnonymousClass2Rf;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16480t8;
import X.C16490t9;
import X.C16900tq;
import X.C17200uh;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C24841Hm;
import X.C25781Lc;
import X.C25791Ld;
import X.C26101Mi;
import X.C28711Xg;
import X.C30801cy;
import X.C41721wT;
import X.C41731wU;
import X.C41751wb;
import X.C41761wc;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.dmsetting.DisappearingMessagesSettingActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class StorageUsageActivity extends C14530pL {
    public static final long A0S = TimeUnit.MINUTES.toMillis(1);
    public int A00;
    public RecyclerView A01;
    public RunnableRunnableShape11S0200000_I0_9 A02;
    public AnonymousClass267 A03;
    public C16000sG A04;
    public C16080sP A05;
    public AnonymousClass2Ao A06;
    public C17200uh A07;
    public C16460t6 A08;
    public AnonymousClass17I A09;
    public C16480t8 A0A;
    public C16900tq A0B;
    public C24841Hm A0C;
    public C26101Mi A0D;
    public C16490t9 A0E;
    public C25781Lc A0F;
    public AnonymousClass1YJ A0G;
    public C41721wT A0H;
    public C41731wU A0I;
    public C25791Ld A0J;
    public AnonymousClass1CW A0K;
    public String A0L;
    public ArrayList A0M;
    public List A0N;
    public boolean A0O;
    public final C41761wc A0P;
    public final C30801cy A0Q;
    public final Set A0R;

    public class WrappedLinearLayoutManager extends LinearLayoutManager {
        public WrappedLinearLayoutManager() {
            super(1);
        }

        public void A0t(AnonymousClass0SJ r3, AnonymousClass0Ri r4) {
            try {
                super.A0t(r3, r4);
            } catch (IndexOutOfBoundsException e2) {
                Log.e("WrappedLinearLayoutManager", e2);
            }
        }
    }

    public StorageUsageActivity() {
        this(0);
        this.A0Q = new C30801cy();
        this.A0R = new HashSet();
        this.A0M = new ArrayList();
        this.A0P = new C41751wb(this);
    }

    public StorageUsageActivity(int i2) {
        this.A0O = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 101));
    }

    public static /* synthetic */ void A02(Intent intent, StorageUsageActivity storageUsageActivity) {
        String className = intent.getComponent() != null ? intent.getComponent().getClassName() : null;
        if (StorageUsageGalleryActivity.class.getName().equals(className)) {
            storageUsageActivity.startActivityForResult(intent, 0);
        } else if (DisappearingMessagesSettingActivity.class.getName().equals(className)) {
            storageUsageActivity.startActivity(intent);
        }
    }

    public static /* synthetic */ void A03(StorageUsageActivity storageUsageActivity, List list, List list2, boolean z2) {
        AnonymousClass267 r0;
        synchronized (storageUsageActivity) {
            char c2 = 2;
            if (storageUsageActivity.A0L != null && list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c2 = 1;
                        break;
                    }
                    C15830rv A012 = ((C28711Xg) list.get(((Integer) it.next()).intValue())).A01();
                    C16000sG r02 = storageUsageActivity.A04;
                    AnonymousClass00B.A06(A012);
                    C16010sH A082 = r02.A08(A012);
                    if (A082 != null && storageUsageActivity.A05.A0T(A082, storageUsageActivity.A0N, true)) {
                        break;
                    }
                }
            } else if (!z2) {
                c2 = 0;
            }
            if (list2 == null || ((r0 = storageUsageActivity.A03) != null && r0.A06() && c2 == 2)) {
                if (list == null) {
                    list = new ArrayList();
                } else if (!TextUtils.isEmpty(storageUsageActivity.A0L)) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C15830rv A013 = ((C28711Xg) list.get(i2)).A01();
                        C16000sG r03 = storageUsageActivity.A04;
                        AnonymousClass00B.A06(A013);
                        C16010sH A083 = r03.A08(A013);
                        if (A083 != null && storageUsageActivity.A05.A0T(A083, storageUsageActivity.A0N, true)) {
                            arrayList.add(list.get(i2));
                        }
                    }
                    list = arrayList;
                }
            }
            if (c2 != 1) {
                storageUsageActivity.A05.A0K(new RunnableRunnableShape2S0300000_I0_2(storageUsageActivity, list, list2, 16));
            }
        }
    }

    public void A1q() {
        if (!this.A0O) {
            this.A0O = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A0E = (C16490t9) r1.AQz.get();
            this.A07 = (C17200uh) r1.A52.get();
            this.A0K = (AnonymousClass1CW) r1.AD9.get();
            this.A04 = (C16000sG) r1.A4x.get();
            this.A05 = (C16080sP) r1.AQ9.get();
            this.A08 = (C16460t6) r1.A5k.get();
            this.A0F = new C25781Lc();
            this.A0A = (C16480t8) r1.AEF.get();
            this.A0J = (C25791Ld) r1.AFY.get();
            this.A0B = (C16900tq) r1.AFT.get();
            this.A0C = (C24841Hm) r1.ANv.get();
            this.A09 = (AnonymousClass17I) r1.ADw.get();
            this.A0D = (C26101Mi) r1.AQU.get();
        }
    }

    public final void A35(int i2) {
        this.A0R.add(Integer.valueOf(i2));
        AnonymousClass1YJ r0 = this.A0G;
        C14870pt r3 = r0.A0D;
        Runnable runnable = r0.A0O;
        r3.A0J(runnable);
        r3.A0L(runnable, 1000);
    }

    public final void A36(int i2) {
        Set set = this.A0R;
        set.remove(Integer.valueOf(i2));
        AnonymousClass1YJ r4 = this.A0G;
        boolean z2 = false;
        if (set.size() != 0) {
            z2 = true;
        }
        C14870pt r3 = r4.A0D;
        Runnable runnable = r4.A0O;
        r3.A0J(runnable);
        if (z2) {
            r3.A0L(runnable, 1000);
        } else {
            r4.A0I(2, false);
        }
    }

    public final void A37(Runnable runnable) {
        this.A05.A0K(new RunnableRunnableShape11S0200000_I0_9(this, 2, runnable));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && i3 == 1) {
            C15830rv A022 = C15830rv.A02(intent.getStringExtra("jid"));
            int intExtra = intent.getIntExtra("gallery_type", -1);
            long longExtra = intent.getLongExtra("memory_size", -1);
            long longExtra2 = intent.getLongExtra("deleted_size", -1);
            if (longExtra >= 0) {
                if (longExtra2 > 0) {
                    this.A05.Acl(new RunnableRunnableShape15S0100000_I0_14(this, 17));
                    this.A05.Acl(new RunnableRunnableShape15S0100000_I0_14(this, 18));
                    this.A05.Acl(new RunnableRunnableShape15S0100000_I0_14(this, 19));
                }
                if (intExtra == 0 && A022 != null) {
                    AnonymousClass1YJ r5 = this.A0G;
                    for (C28711Xg r3 : r5.A05) {
                        if (r3.A01().equals(A022)) {
                            r3.A00.A0G = longExtra;
                            Collections.sort(r5.A05);
                            r5.A01();
                            return;
                        }
                    }
                }
            }
        }
    }

    public void onBackPressed() {
        AnonymousClass267 r0 = this.A03;
        if (r0 == null || !r0.A06()) {
            super.onBackPressed();
            return;
        }
        this.A0L = null;
        this.A0N = null;
        this.A03.A05(true);
        AnonymousClass1YJ r5 = this.A0G;
        r5.A08 = false;
        int A0F2 = r5.A0F();
        r5.A0I(1, true);
        r5.A0H();
        r5.A0I(4, true);
        if (r5.A0J.A01()) {
            r5.A0I(8, true);
        }
        r5.A01.A04((Object) null, r5.A0C() - A0F2, A0F2);
        this.A01.A0Z(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0183, code lost:
        if (r4.getBoolean("LIST_IS_NOT_FULL", false) != false) goto L_0x0185;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r1 = r30
            r4 = r31
            super.onCreate(r4)
            java.lang.String r0 = "storage-usage-activity/create"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t3 r3 = r1.A05
            X.1CW r2 = r1.A0K
            X.1wT r0 = new X.1wT
            r0.<init>(r3, r2)
            r1.A0H = r0
            r0 = 2131889318(0x7f120ca6, float:1.9413296E38)
            r1.setTitle(r0)
            r0 = 2131558487(0x7f0d0057, float:1.8742291E38)
            r1.setContentView((int) r0)
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r5 = r1.findViewById(r0)
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r1.Aem(r5)
            r0 = 0
            r1.A0L = r0
            r1.A0N = r0
            X.013 r3 = r1.A01
            r0 = 2131365943(0x7f0a1037, float:1.8351766E38)
            android.view.View r8 = r1.findViewById(r0)
            r2 = 10
            com.facebook.redex.IDxTListenerShape170S0100000_2_I0 r0 = new com.facebook.redex.IDxTListenerShape170S0100000_2_I0
            r0.<init>(r1, r2)
            X.267 r6 = new X.267
            r7 = r1
            r9 = r0
            r10 = r5
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r1.A03 = r6
            X.02i r0 = r1.x()
            X.AnonymousClass00B.A06(r0)
            r6 = 1
            r0.A0N(r6)
            X.1cy r13 = r1.A0Q
            r2 = 290(0x122, float:4.06E-43)
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r1, (int) r2)
            r13.A0A(r1, r0)
            X.0uh r2 = r1.A07
            java.lang.String r0 = "storage-usage-activity"
            X.2Ao r0 = r2.A04(r1, r0)
            r1.A06 = r0
            android.content.Intent r2 = r1.getIntent()
            java.lang.String r0 = "session_id"
            java.lang.String r28 = r2.getStringExtra(r0)
            android.content.Intent r3 = r1.getIntent()
            java.lang.String r2 = "entry_point"
            r0 = -1
            int r29 = r3.getIntExtra(r2, r0)
            r0 = 2131362969(0x7f0a0499, float:1.8345734E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.A01 = r0
            r5 = 0
            com.obwhatsapp.storage.StorageUsageActivity$WrappedLinearLayoutManager r12 = new com.obwhatsapp.storage.StorageUsageActivity$WrappedLinearLayoutManager
            r12.<init>()
            X.0pt r0 = r1.A05
            r18 = r0
            X.0so r0 = r1.A03
            r17 = r0
            X.0sq r0 = r1.A05
            r16 = r0
            X.0t9 r15 = r1.A0E
            X.0s5 r14 = r1.A06
            X.0sG r11 = r1.A04
            X.0sP r10 = r1.A05
            X.013 r9 = r1.A01
            X.1Lc r8 = r1.A0F
            X.2Ao r7 = r1.A06
            X.1Mi r3 = r1.A0D
            r0 = 17
            com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6 r2 = new com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6
            r2.<init>(r1, r0)
            X.1YJ r0 = new X.1YJ
            r27 = r16
            r23 = r3
            r24 = r15
            r25 = r8
            r26 = r13
            r19 = r11
            r20 = r10
            r21 = r7
            r22 = r9
            r15 = r12
            r16 = r17
            r17 = r18
            r18 = r14
            r13 = r0
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.A0G = r0
            androidx.recyclerview.widget.RecyclerView r0 = r1.A01
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r3 = r1.A01
            X.02j r2 = r3.A0R
            boolean r0 = r2 instanceof X.AnonymousClass0Fd
            if (r0 == 0) goto L_0x00ef
            X.0Fd r2 = (X.AnonymousClass0Fd) r2
            r2.A00 = r5
        L_0x00ef:
            X.1YJ r0 = r1.A0G
            r3.setAdapter(r0)
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = r0.widthPixels
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            int r3 = java.lang.Math.max(r2, r0)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131167165(0x7f0707bd, float:1.7948596E38)
            int r2 = r2.getDimensionPixelSize(r0)
            int r0 = r2 >> 1
            int r3 = r3 + r0
            int r3 = r3 / r2
            int r0 = java.lang.Math.max(r6, r3)
            r1.A00 = r0
            X.0t6 r8 = r1.A08
            X.0t8 r10 = r1.A0A
            X.1Ld r13 = r1.A0J
            X.0tq r11 = r1.A0B
            X.17I r9 = r1.A09
            X.1wT r12 = r1.A0H
            X.1wU r7 = new X.1wU
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.A0I = r7
            X.0sq r3 = r1.A05
            r2 = 16
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r1, r2)
            r3.Acl(r0)
            r1.A35(r5)
            r0 = 2
            r1.A35(r0)
            r1.A35(r6)
            if (r31 == 0) goto L_0x0185
            java.lang.String r8 = "LIST_OF_CONTACTS"
            java.util.ArrayList r0 = r4.getParcelableArrayList(r8)
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = "SAVED_AT_TIMESTAMP"
            long r2 = r4.getLong(r0)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            long r2 = A0S
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0185
            java.util.ArrayList r6 = r4.getParcelableArrayList(r8)
            r1.A0M = r6
            X.1YJ r3 = r1.A0G
            java.lang.String r2 = r1.A0L
            java.util.List r0 = r1.A0N
            r3.A05 = r6
            r3.A04 = r2
            r3.A06 = r0
            r0 = 1
            r3.A07 = r0
            r3.A01()
            java.lang.String r0 = "LIST_IS_NOT_FULL"
            boolean r0 = r4.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x0195
        L_0x0185:
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r2 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r2.<init>(r1)
            r1.A02 = r2
            X.0sq r0 = r1.A05
            r0.Acl(r2)
            r0 = 3
            r1.A35(r0)
        L_0x0195:
            X.1Hm r0 = r1.A0C
            X.1wc r2 = r1.A0P
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A09
            r0.add(r2)
            X.0t3 r5 = r1.A05
            X.0sq r2 = r1.A05
            X.0sb r4 = r1.A04
            X.0t9 r6 = r1.A0E
            X.1CW r0 = r1.A0K
            X.56M r3 = new X.56M
            r7 = r0
            r8 = r28
            r9 = r29
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.Acl(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.storage.StorageUsageActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01 = null;
        this.A06.A00();
        C24841Hm r0 = this.A0C;
        r0.A09.remove(this.A0P);
        this.A0R.clear();
        RunnableRunnableShape11S0200000_I0_9 runnableRunnableShape11S0200000_I0_9 = this.A02;
        if (runnableRunnableShape11S0200000_I0_9 != null) {
            ((AtomicBoolean) runnableRunnableShape11S0200000_I0_9.A00).set(true);
        }
        AnonymousClass1YJ r2 = this.A0G;
        r2.A0D.A0J(r2.A0O);
        r2.A0I(2, false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        onSearchRequested();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.A0M.isEmpty()) {
            bundle.putLong("SAVED_AT_TIMESTAMP", System.currentTimeMillis());
            ArrayList arrayList = this.A0M;
            if (arrayList.size() > 200) {
                bundle.putParcelableArrayList("LIST_OF_CONTACTS", new ArrayList(arrayList.subList(0, 200)));
                bundle.putBoolean("LIST_IS_NOT_FULL", true);
                return;
            }
            bundle.putParcelableArrayList("LIST_OF_CONTACTS", arrayList);
        }
    }

    public boolean onSearchRequested() {
        AnonymousClass267 r0 = this.A03;
        if (r0 == null) {
            return false;
        }
        r0.A02();
        AnonymousClass1YJ r6 = this.A0G;
        r6.A08 = true;
        int A0F2 = r6.A0F();
        r6.A0I(1, false);
        r6.A0I(3, false);
        r6.A0I(4, false);
        if (r6.A0J.A01()) {
            r6.A0I(8, false);
        }
        r6.A01.A04((Object) null, r6.A0C() - 1, A0F2 + 1);
        this.A03.A06.findViewById(R.id.search_back).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 18));
        return false;
    }
}
