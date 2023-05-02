package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass11R;
import X.AnonymousClass11S;
import X.AnonymousClass11U;
import X.AnonymousClass11V;
import X.AnonymousClass11W;
import X.AnonymousClass135;
import X.AnonymousClass1CB;
import X.AnonymousClass1WE;
import X.AnonymousClass1WJ;
import X.AnonymousClass1XP;
import X.AnonymousClass21A;
import X.AnonymousClass21B;
import X.AnonymousClass28A;
import X.AnonymousClass2AK;
import X.AnonymousClass52S;
import X.C13680ns;
import X.C13700nu;
import X.C14600pS;
import X.C16590tJ;
import X.C16730tY;
import X.C16750ta;
import X.C18240wN;
import X.C30701co;
import X.C30761cu;
import X.C31681er;
import X.C31701et;
import X.C38331qc;
import X.C41701wR;
import X.C43051zG;
import X.C43251zh;
import X.C52422dm;
import X.C52472dr;
import X.C82704Dv;
import android.util.Pair;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.obwhatsapp.companiondevice.sync.HistorySyncWorker;
import com.obwhatsapp.companionmode.registration.CompanionBootstrapActivity;
import com.obwhatsapp.support.ReportSpamDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;

public class IDxNConsumerShape153S0100000_2_I0 implements AnonymousClass1WE {
    public Object A00;
    public final int A01;

    public IDxNConsumerShape153S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        int i2;
        AnonymousClass11R r1;
        int i3;
        C31701et r12;
        switch (this.A01) {
            case 0:
                ((LinkedDevicesSharedViewModel) this.A00).A0U.A0B(obj);
                return;
            case 1:
                AnonymousClass11W r13 = (AnonymousClass11W) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    int incrementAndGet = (r13.A0A.incrementAndGet() * 100) / 3;
                    Iterator A002 = C16590tJ.A00(r13);
                    while (A002.hasNext()) {
                        CompanionBootstrapActivity companionBootstrapActivity = ((C82704Dv) A002.next()).A00;
                        companionBootstrapActivity.runOnUiThread(new RunnableRunnableShape1S0101000_I1((Object) companionBootstrapActivity, incrementAndGet, 3));
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass11S r3 = (AnonymousClass11S) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    r1 = r3.A03;
                    i3 = 3;
                } else {
                    Iterator it = AnonymousClass1WJ.A09.iterator();
                    while (it.hasNext()) {
                        r3.A04.A02(AnonymousClass000.A0m(it));
                    }
                    r1 = r3.A03;
                    i3 = 0;
                }
                r1.A02(i3);
                return;
            case 3:
                HistorySyncWorker historySyncWorker = (HistorySyncWorker) this.A00;
                Map map = (Map) obj;
                historySyncWorker.A02 = map;
                if (map.containsValue(Boolean.TRUE)) {
                    historySyncWorker.A04();
                    return;
                }
                return;
            case 4:
                AnonymousClass11U r2 = (AnonymousClass11U) this.A00;
                r2.A08.A07(false);
                r2.A04.A0T.A08("archive");
                return;
            case 5:
                C52422dm r14 = ((AnonymousClass11U) this.A00).A03;
                synchronized (r14) {
                    r14.A00 = null;
                }
                return;
            case 6:
                C52472dr r15 = ((AnonymousClass11V) this.A00).A01;
                synchronized (r15) {
                    r15.A00 = null;
                }
                return;
            case 7:
                AnonymousClass1CB r6 = (AnonymousClass1CB) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    r6.A0K.A01(8);
                    AnonymousClass135 r5 = r6.A0e;
                    r5.A01();
                    if (r6.A0W.A0C(877)) {
                        r5.A0B.Ad4(r5.A0C, "ToSGatingRepository/requestRefresh", 0);
                    }
                    Iterator A003 = C16590tJ.A00(r6);
                    while (A003.hasNext()) {
                        ((AnonymousClass28A) A003.next()).A00();
                    }
                    return;
                }
                r6.A08("critical_sync_timeout", true, true);
                return;
            case 8:
                AnonymousClass2AK r0 = (AnonymousClass2AK) this.A00;
                r0.A0c.A08(r0.A0Y, new AnonymousClass52S(r0));
                return;
            case 9:
                AnonymousClass2AK r22 = (AnonymousClass2AK) this.A00;
                Boolean bool = (Boolean) obj;
                C14600pS r16 = r22.A02;
                if (!r16.AIm()) {
                    r16.Afc(ReportSpamDialogFragment.A01(r22.A0Y, (UserJid) null, (C41701wR) null, "overflow_menu_report", 1, bool.booleanValue(), true, true, true, true, false));
                    return;
                }
                return;
            case 10:
                AnonymousClass1XP r23 = (AnonymousClass1XP) this.A00;
                AnonymousClass21B r142 = (AnonymousClass21B) obj;
                AnonymousClass21A r02 = r23.A01;
                if (r02 != null) {
                    C43251zh r17 = r02.A01;
                    synchronized (r17) {
                        r17.A0C = true;
                    }
                }
                int i4 = r142.A00;
                if (i4 == 0) {
                    i4 = 0;
                }
                r23.A0A.A04(Integer.valueOf(i4));
                return;
            case 11:
                C30701co r03 = (C30701co) this.A00;
                C31701et r143 = (C31701et) obj;
                r03.A0A(r143);
                r03.A0B(r143);
                return;
            case 12:
                C30701co r4 = (C30701co) this.A00;
                StringBuilder A0r = AnonymousClass000.A0r("MediaDownload/oncancelled; mediaHash=");
                A0r.append(r4.A0a.A0F);
                A0r.append(" url=");
                A0r.append(r4.A04);
                C13680ns.A1V(A0r);
                C31701et r04 = new C31701et(13, (String) null, false);
                r4.A0D(r04);
                r4.A0A(r04);
                return;
            case 13:
                C30701co r42 = (C30701co) this.A00;
                if (obj instanceof IOException) {
                    r12 = new C31701et(9, (String) null, false);
                    r42.A0D(r12);
                    r42.A0A(r12);
                } else if (obj instanceof CancellationException) {
                    r12 = new C31701et(13, (String) null, false);
                } else {
                    return;
                }
                r42.A0B(r12);
                return;
            case 14:
                ((C30701co) this.A00).A64(true);
                return;
            case 15:
                ((C30701co) this.A00).A09(C13700nu.A01(obj));
                return;
            case 16:
                C16750ta r05 = ((C16730tY) this.A00).A02;
                AnonymousClass00B.A06(r05);
                r05.A0I = (String) obj;
                return;
            case 17:
                Pair pair = (Pair) obj;
                ((C38331qc) this.A00).AQ4((C31701et) pair.first, (C30761cu) pair.second);
                return;
            case 18:
                ((C38331qc) this.A00).AQ3(AnonymousClass000.A1X(obj));
                return;
            case 19:
                ((C38331qc) this.A00).AQ1(C13700nu.A01(obj));
                return;
            case 20:
                ((C31681er) this.A00).A0B((Integer) obj);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                C31681er r24 = (C31681er) this.A00;
                Throwable th = (Throwable) obj;
                StringBuilder A0r2 = AnonymousClass000.A0r("mediaupload/oncancelled, request=");
                A0r2.append(r24.A07());
                A0r2.append(", this=");
                Log.i(AnonymousClass000.A0f(r24, A0r2), th);
                if (th instanceof FileNotFoundException) {
                    i2 = 7;
                } else if (th instanceof IOException) {
                    i2 = 3;
                    if (r24.A0Q.A02(th)) {
                        i2 = 18;
                    }
                } else if (th instanceof C43051zG) {
                    i2 = 5;
                } else {
                    i2 = 1;
                    if (th instanceof NoSuchAlgorithmException) {
                        i2 = 16;
                    }
                }
                r24.A0B(Integer.valueOf(i2));
                return;
            default:
                ((C18240wN) this.A00).A05(obj);
                return;
        }
    }
}
