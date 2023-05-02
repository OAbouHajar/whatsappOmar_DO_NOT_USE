package com.obwhatsapp.status.playback;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass05J;
import X.AnonymousClass10B;
import X.AnonymousClass10G;
import X.AnonymousClass10X;
import X.AnonymousClass11G;
import X.AnonymousClass128;
import X.AnonymousClass12W;
import X.AnonymousClass15P;
import X.AnonymousClass177;
import X.AnonymousClass1AF;
import X.AnonymousClass1AM;
import X.AnonymousClass1BQ;
import X.AnonymousClass1HE;
import X.AnonymousClass1HF;
import X.AnonymousClass1L1;
import X.AnonymousClass1VA;
import X.AnonymousClass1yL;
import X.AnonymousClass2B4;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SQ;
import X.AnonymousClass2SX;
import X.AnonymousClass2ZI;
import X.AnonymousClass3AJ;
import X.AnonymousClass47T;
import X.AnonymousClass47W;
import X.AnonymousClass4FD;
import X.AnonymousClass4FL;
import X.C005402i;
import X.C009804r;
import X.C05230Pu;
import X.C1035151r;
import X.C1036352d;
import X.C14670pZ;
import X.C14700pc;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15450qv;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15910s6;
import X.C15960sC;
import X.C16000sG;
import X.C16030sJ;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16340ss;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16620tM;
import X.C16690tT;
import X.C16740tZ;
import X.C16760tb;
import X.C17010u2;
import X.C17020u3;
import X.C17030uP;
import X.C17250um;
import X.C17270uo;
import X.C17980vx;
import X.C18030w2;
import X.C18260wP;
import X.C18930xU;
import X.C18940xV;
import X.C19150xq;
import X.C19410yO;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C19990zK;
import X.C20260zl;
import X.C20270zm;
import X.C206711d;
import X.C209212c;
import X.C23061Ai;
import X.C23071Aj;
import X.C23611Cq;
import X.C23621Cr;
import X.C23631Ct;
import X.C25791Ld;
import X.C28381Vw;
import X.C32291fz;
import X.C32301g2;
import X.C34771kq;
import X.C35541m6;
import X.C42681yF;
import X.C434920f;
import X.C45762Aw;
import X.C47482Jd;
import X.C49132Rg;
import X.C49892Wl;
import X.C50402Zi;
import X.C50442Zm;
import X.C51072av;
import X.C56522nn;
import X.C73753p0;
import X.C78763ye;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape300S0100000_2_I0;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxSCallbackShape221S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.conversation.conversationrow.message.selection.IDxMCallbackShape71S0100000_1_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.obwhatsapp.status.StatusExpirationLifecycleOwner;
import com.obwhatsapp.yo.HomeUI;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.IDxCListenerShape106S0100000_1_I0;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyStatusesActivity extends AnonymousClass1VA implements C14670pZ {
    public C009804r A00;
    public AnonymousClass05J A01;
    public C05230Pu A02;
    public C50442Zm A03;
    public C51072av A04;
    public AnonymousClass10X A05;
    public C16760tb A06;
    public C50402Zi A07;
    public C18930xU A08;
    public C16000sG A09;
    public C17030uP A0A;
    public C16080sP A0B;
    public C20270zm A0C;
    public AnonymousClass12W A0D;
    public C17010u2 A0E;
    public C16260sj A0F;
    public AnonymousClass013 A0G;
    public AnonymousClass177 A0H;
    public C16460t6 A0I;
    public AnonymousClass10B A0J;
    public C19150xq A0K;
    public AnonymousClass1HF A0L;
    public AnonymousClass10G A0M;
    public AnonymousClass128 A0N;
    public AnonymousClass11G A0O;
    public C19410yO A0P;
    public C18030w2 A0Q;
    public C206711d A0R;
    public AnonymousClass1BQ A0S;
    public C20260zl A0T;
    public C16490t9 A0U;
    public AnonymousClass1HE A0V;
    public C209212c A0W;
    public C19990zK A0X;
    public C17020u3 A0Y;
    public C16740tZ A0Z;
    public AnonymousClass47T A0a;
    public C14700pc A0b;
    public AnonymousClass1AM A0c;
    public StatusExpirationLifecycleOwner A0d;
    public C49892Wl A0e;
    public C23621Cr A0f;
    public C23611Cq A0g;
    public C17980vx A0h;
    public AnonymousClass1L1 A0i;
    public C45762Aw A0j;
    public AnonymousClass2B4 A0k;
    public AnonymousClass2ZI A0l;
    public C1036352d A0m;
    public AnonymousClass4FL A0n;
    public C25791Ld A0o;
    public AnonymousClass1AF A0p;
    public C23631Ct A0q;
    public AnonymousClass01D A0r;
    public AnonymousClass01D A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public final Handler A0w;
    public final View.OnClickListener A0x;
    public final View.OnClickListener A0y;
    public final C32301g2 A0z;
    public final C18940xV A10;
    public final AnonymousClass4FD A11;
    public final Runnable A12;
    public final Runnable A13;
    public final HashMap A14;
    public final HashMap A15;
    public final List A16;
    public final Map A17;
    public final Set A18;

    public MyStatusesActivity() {
        this(0);
        this.A17 = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        this.A18 = hashSet;
        this.A12 = new RunnableRunnableShape1S0100000_I0((Object) hashSet, 28);
        this.A0w = new Handler(Looper.getMainLooper());
        this.A14 = new HashMap();
        this.A15 = new HashMap();
        this.A11 = new AnonymousClass4FD(this);
        this.A10 = new IDxMObserverShape73S0100000_1_I0(this, 7);
        this.A13 = new RunnableRunnableShape14S0100000_I0_13((Object) this, 49);
        this.A16 = new ArrayList();
        this.A0v = false;
        this.A0z = new IDxSCallbackShape221S0100000_2_I0(this, 7);
        this.A0y = new ViewOnClickCListenerShape2S0100000_I0_2(this, 45);
        this.A0x = new ViewOnClickCListenerShape2S0100000_I0_2(this, 46);
    }

    public MyStatusesActivity(int i2) {
        this.A0u = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 97));
    }

    public static /* synthetic */ void A02(C16740tZ r5, MyStatusesActivity myStatusesActivity, boolean z2) {
        HashMap hashMap = myStatusesActivity.A15;
        C28381Vw r3 = r5.A11;
        C16690tT r1 = (C16690tT) hashMap.remove(r3);
        if (r1 != null) {
            if (z2) {
                r1.A06(true);
            } else {
                return;
            }
        }
        C78763ye r2 = new C78763ye(r5, myStatusesActivity);
        hashMap.put(r3, r2);
        myStatusesActivity.A05.Ack(r2, new Void[0]);
    }

    public void A1q() {
        if (!this.A0u) {
            this.A0u = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A00 = new AnonymousClass2SX();
            this.A0X = (C19990zK) r2.AEZ.get();
            this.A0a = new AnonymousClass47T();
            this.A05 = (AnonymousClass10X) r2.ALc.get();
            this.A0U = (C16490t9) r2.AQz.get();
            this.A0E = new C17010u2();
            this.A0O = (AnonymousClass11G) r2.ANN.get();
            this.A08 = (C18930xU) r2.AOL.get();
            this.A06 = (C16760tb) r2.APV.get();
            this.A0T = r1.A0I();
            this.A0R = (C206711d) r2.AKp.get();
            this.A0q = (C23631Ct) r2.ART.get();
            this.A09 = (C16000sG) r2.A4x.get();
            this.A0Q = (C18030w2) r2.A6W.get();
            this.A0L = (AnonymousClass1HF) r2.AKj.get();
            this.A0B = (C16080sP) r2.AQ9.get();
            this.A0G = (AnonymousClass013) r2.AR8.get();
            this.A07 = (C50402Zi) r1.A1Z.get();
            this.A0I = (C16460t6) r2.A5k.get();
            this.A0K = (C19150xq) r2.AFC.get();
            this.A0J = (AnonymousClass10B) r2.AD5.get();
            this.A0D = (AnonymousClass12W) r2.AEM.get();
            this.A0o = (C25791Ld) r2.AFY.get();
            Context context = r2.AS2.A00;
            C16340ss.A01(context);
            this.A0n = new AnonymousClass4FL(context);
            this.A0N = (AnonymousClass128) r2.AND.get();
            this.A0c = (AnonymousClass1AM) r2.AQj.get();
            this.A0f = (C23621Cr) r2.AKs.get();
            this.A0M = (AnonymousClass10G) r2.AN1.get();
            this.A0A = (C17030uP) r2.APp.get();
            this.A0S = (AnonymousClass1BQ) r2.A7f.get();
            this.A0F = (C16260sj) r2.AQe.get();
            this.A0W = (C209212c) r2.AE1.get();
            this.A0g = (C23611Cq) r2.ANM.get();
            this.A0i = (AnonymousClass1L1) r2.ANR.get();
            this.A0P = (C19410yO) r2.A4T.get();
            this.A0p = (AnonymousClass1AF) r2.ARN.get();
            this.A0V = (AnonymousClass1HE) r2.ALb.get();
            this.A0h = C16150sX.A17(r2);
            this.A0Y = (C17020u3) r2.AMG.get();
            this.A0H = (AnonymousClass177) r2.A0q.get();
            this.A0r = C17270uo.A00(r2.A5z);
            this.A0C = (C20270zm) r2.A5v.get();
            this.A0s = C17270uo.A00(r2.ARU);
            this.A0l = r1.A0e();
            this.A03 = (C50442Zm) r1.A0R.get();
            this.A04 = (C51072av) r1.A1H.get();
        }
    }

    public final void A36() {
        if (this.A0h.A00()) {
            this.A0i.A05();
        }
        if (RequestPermissionActivity.A0T(this, this.A0F, 33) && this.A0D.A04(this.A0z)) {
            int i2 = (this.A06.A01() > ((long) ((this.A06.A02(C15910s6.A1f) << 10) << 10)) ? 1 : (this.A06.A01() == ((long) ((this.A06.A02(C15910s6.A1f) << 10) << 10)) ? 0 : -1));
            startActivity(C14750ph.A0f(this, C34771kq.A00.getRawString(), 4));
        }
    }

    public final void A37() {
        C14870pt r0 = this.A05;
        Runnable runnable = this.A13;
        r0.A0J(runnable);
        if (!this.A0k.isEmpty()) {
            AnonymousClass2B4 r1 = this.A0k;
            this.A05.A0L(runnable, (C42681yF.A01(r1.A00.isEmpty() ? 0 : ((C16740tZ) r1.A00.get(0)).A0I) - System.currentTimeMillis()) + 1000);
        }
    }

    public void A38(View view, C16740tZ r7) {
        int i2;
        Map map = this.A17;
        C28381Vw r4 = r7.A11;
        if (map.containsKey(r4)) {
            map.remove(r4);
            i2 = 0;
        } else {
            map.put(r4, r7);
            i2 = R.color.color04c8;
        }
        view.setBackgroundResource(i2);
        boolean isEmpty = map.isEmpty();
        AnonymousClass05J r3 = this.A01;
        if (!isEmpty) {
            if (r3 == null) {
                r3 = AgA(this.A00);
                this.A01 = r3;
            }
            r3.A0B(this.A0G.A0K().format((long) map.size()));
            this.A01.A06();
        } else if (r3 != null) {
            r3.A05();
        }
        this.A18.add(r4);
        Handler handler = this.A0w;
        Runnable runnable = this.A12;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        this.A0k.notifyDataSetChanged();
    }

    public void A39(List list, boolean z2) {
        C47482Jd r0;
        this.A0t = z2;
        C23611Cq r1 = this.A0g;
        if (!(z2 ? r1.A02(this, (AnonymousClass01A) null, r1.A02, list) : r1.A02(this, (AnonymousClass01A) null, r1.A03, list)) && !this.A0g.A00.A0B() && (r0 = this.A0i.A00) != null) {
            r0.A01 = 4;
        }
    }

    public String ACg() {
        return "my_status_activity";
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public C14700pc AG9(int i2, int i3, boolean z2) {
        View view = this.A00;
        ArrayList arrayList = new ArrayList();
        arrayList.add(findViewById(R.id.fab));
        arrayList.add(findViewById(R.id.fab_second));
        C14700pc r3 = new C14700pc(this, C32291fz.A00(view, R.string.str06b9, 2000), this.A08, arrayList, false);
        this.A0b = r3;
        r3.A03(new RunnableRunnableShape14S0100000_I0_13((Object) this, 48));
        return this.A0b;
    }

    public void AYX(AnonymousClass05J r2) {
        super.AYX(r2);
        C434920f.A03(this, R.color.color064b);
    }

    public void AYY(AnonymousClass05J r2) {
        super.AYY(r2);
        C434920f.A03(this, R.color.right_side);
    }

    public void FABStatusSplit(View view) {
        yo.statusSplitter(this);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        AnonymousClass05J r0;
        C47482Jd r02;
        super.onActivityResult(i2, i3, intent);
        yo.MyStatusesActivity_onActivityResult(i2, i3, intent, this);
        if (i2 != 2) {
            if (i2 != 33) {
                if (i2 == 35) {
                    if (i3 == -1 && (r0 = this.A01) != null) {
                        r0.A05();
                    }
                    if (this.A0t) {
                        this.A0g.A00(intent);
                    }
                } else if (i2 != 151) {
                } else {
                    if (i3 == -1) {
                        Map map = this.A17;
                        if (!map.isEmpty()) {
                            ArrayList arrayList = new ArrayList(map.values());
                            map.clear();
                            A39(arrayList, this.A0t);
                        }
                    } else if (i3 == 0 && (r02 = this.A0i.A00) != null) {
                        r02.A01 = 4;
                    }
                }
            } else if (i3 == -1) {
                A36();
            }
        } else if (i3 == -1 && intent != null) {
            ArrayList arrayList2 = new ArrayList();
            Map map2 = this.A17;
            if (!map2.isEmpty()) {
                arrayList2.addAll(map2.values());
            } else {
                C16740tZ r03 = this.A0Z;
                if (r03 != null) {
                    arrayList2.add(r03);
                }
            }
            if (!arrayList2.isEmpty()) {
                List A082 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                ArrayList arrayList3 = new ArrayList(arrayList2);
                Collections.sort(arrayList3, new IDxComparatorShape19S0000000_2_I0(36));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    this.A06.A08(this.A05, (C35541m6) null, (C16740tZ) it.next(), A082, booleanExtra);
                }
                if (A082.size() != 1 || C16030sJ.A0Q((Jid) A082.get(0))) {
                    Agv(A082);
                } else {
                    this.A00.A07(this, new C14750ph().A0v(this, this.A09.A0A((C15830rv) A082.get(0))));
                }
            } else {
                Log.w("mystatuses/forward/failed");
                this.A05.A09(R.string.str0d39, 0);
            }
            AnonymousClass05J r04 = this.A01;
            if (r04 != null) {
                r04.A05();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Log.i("myStatusesActivity/onCreate");
        if (C15450qv.A03()) {
            getWindow().addFlags(Integer.MIN_VALUE);
        }
        super.onCreate(bundle);
        C14710pd r3 = this.A0C;
        C16620tM r1 = C16620tM.A01;
        this.A0v = r3.A0E(r1, 1875);
        setTitle(R.string.str0dac);
        A2R();
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        setContentView((int) R.layout.layout03f9);
        HomeUI.paintHomeFAB(this);
        findViewById(R.id.root_view).setSystemUiVisibility(1280);
        this.A01.setFitsSystemWindows(true);
        C14870pt r10 = this.A05;
        C16320sq r13 = this.A05;
        this.A0d = new StatusExpirationLifecycleOwner(this, r10, this.A0N, this.A0O, r13);
        this.A0e = this.A03.A00(1, false);
        AnonymousClass47T r15 = this.A0a;
        C16000sG r102 = this.A09;
        C16080sP r11 = this.A0B;
        AnonymousClass013 r14 = this.A0G;
        C49132Rg r6 = this.A04.A00.A01;
        this.A00 = new IDxMCallbackShape71S0100000_1_I0(this, r102, r11, new C73753p0((AnonymousClass2SQ) r6.A0l.get(), this, r6.A0e()), this.A0l, r14, r15, this, 3);
        this.A0m = new C1036352d(this);
        this.A0k = new AnonymousClass2B4(this);
        ListView ADA = ADA();
        ADA.setFastScrollEnabled(false);
        View inflate = getLayoutInflater().inflate(R.layout.layout01f4, ADA, false);
        inflate.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.dimen02a6));
        ADA.addFooterView(inflate, (Object) null, false);
        ((TextView) inflate.findViewById(R.id.conversations_row_tip_tv)).setText(getString(R.string.str1684, new Object[]{24}));
        ADA.setAdapter(this.A0k);
        ADA.setOnItemClickListener(new IDxCListenerShape106S0100000_1_I0(this.A05, this, 1));
        ADA.setOnItemLongClickListener(new IDxCListenerShape300S0100000_2_I0(this, 1));
        TextView textView = (TextView) findViewById(16908292);
        String string = getString(R.string.str1b91);
        textView.setText(C56522nn.A01(textView.getPaint(), AnonymousClass00T.A04(this, R.drawable.ic_new_status_tip), string, "%s"));
        View findViewById = findViewById(R.id.fab);
        ImageView imageView = (ImageView) findViewById(R.id.fab_second);
        if (this.A01.A0G()) {
            findViewById.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            findViewById.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 43));
            imageView.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 44));
            if (this.A0C.A0E(r1, 1874)) {
                new AnonymousClass3AJ(imageView, this.A0E, this.A09).A00();
            }
        }
        AnonymousClass00T.A05(this, R.id.progress).setVisibility(0);
        C45762Aw r0 = this.A0j;
        if (r0 != null) {
            r0.A06(true);
        }
        C45762Aw r32 = new C45762Aw(this);
        this.A0j = r32;
        this.A05.Ack(r32, new Void[0]);
        this.A0K.A02(this.A10);
        this.A0c.A00(this);
        this.A0r.get();
        if (this.A0h.A00() && bundle != null) {
            this.A0i.A0A(Boolean.TRUE);
        }
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 == 13) {
            Map map = this.A17;
            if (map.isEmpty()) {
                Log.e("mediagallery/dialog/delete no messages");
            } else {
                StringBuilder sb = new StringBuilder("mediagallery/dialog/delete/");
                sb.append(map.size());
                Log.i(sb.toString());
                HashSet hashSet = new HashSet(map.values());
                return AnonymousClass47W.A00(this, this.A05, this.A06, this.A0B, new C1035151r(this, hashSet), hashSet);
            }
        } else if (i2 == 26 || i2 == 27) {
            AnonymousClass00B.A08("MyStatusActivity/invalid dialog invoke");
            return null;
        }
        return super.onCreateDialog(i2);
    }

    public void onDestroy() {
        Log.i("myStatusesActivity/onDestroy");
        super.onDestroy();
        this.A0K.A03(this.A10);
        this.A0c.A00.remove("my_status_activity");
        C45762Aw r0 = this.A0j;
        if (r0 != null) {
            r0.A06(true);
        }
        HashMap hashMap = this.A15;
        for (C16690tT A062 : hashMap.values()) {
            A062.A06(true);
        }
        List<Uri> list = this.A16;
        for (Uri revokeUriPermission : list) {
            revokeUriPermission(revokeUriPermission, 1);
        }
        list.clear();
        hashMap.clear();
        this.A05.A0J(this.A13);
    }

    public void onPause() {
        Log.i("myStatusesActivity/onPause");
        this.A0g.A04.A04(this);
        super.onPause();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            List<C28381Vw> A042 = AnonymousClass1yL.A04(bundle);
            if (A042 != null) {
                Map map = this.A17;
                map.clear();
                for (C28381Vw r1 : A042) {
                    map.put(r1, this.A0I.A0K.A03(r1));
                }
                AnonymousClass05J r3 = this.A01;
                if (r3 == null) {
                    r3 = AgA(this.A00);
                    this.A01 = r3;
                }
                r3.A0B(this.A0G.A0K().format((long) map.size()));
                this.A01.A06();
                this.A0k.notifyDataSetChanged();
            }
            C28381Vw A032 = AnonymousClass1yL.A03(bundle, "");
            if (A032 != null) {
                this.A0Z = this.A0I.A0K.A03(A032);
            }
        }
    }

    public void onResume() {
        Log.i("myStatusesActivity/onResume");
        super.onResume();
        this.A0g.A04.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 62));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Map map = this.A17;
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C16740tZ r0 : map.values()) {
                arrayList.add(r0.A11);
            }
            AnonymousClass1yL.A0A(bundle, arrayList);
        }
        C16740tZ r02 = this.A0Z;
        if (r02 != null) {
            AnonymousClass1yL.A09(bundle, r02.A11, "");
        }
    }

    public void onStart() {
        Log.i("myStatusesActivity/onStart");
        super.onStart();
        A37();
    }

    public void onStop() {
        Log.i("myStatusesActivity/onStop");
        super.onStop();
    }
}
