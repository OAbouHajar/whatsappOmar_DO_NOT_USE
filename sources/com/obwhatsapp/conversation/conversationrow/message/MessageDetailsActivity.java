package com.obwhatsapp.conversation.conversationrow.message;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass10X;
import X.AnonymousClass120;
import X.AnonymousClass127;
import X.AnonymousClass15P;
import X.AnonymousClass15X;
import X.AnonymousClass18R;
import X.AnonymousClass1B5;
import X.AnonymousClass1BU;
import X.AnonymousClass1HF;
import X.AnonymousClass1LB;
import X.AnonymousClass1MF;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RV;
import X.AnonymousClass1VD;
import X.AnonymousClass1YG;
import X.AnonymousClass1yL;
import X.AnonymousClass21N;
import X.AnonymousClass2Aj;
import X.AnonymousClass2Ao;
import X.AnonymousClass2IV;
import X.AnonymousClass2Rf;
import X.AnonymousClass2TM;
import X.AnonymousClass2oN;
import X.AnonymousClass3B1;
import X.AnonymousClass3IT;
import X.AnonymousClass3L7;
import X.AnonymousClass3ox;
import X.C005402i;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16060sN;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16210se;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16620tM;
import X.C16740tZ;
import X.C16760tb;
import X.C16980tz;
import X.C17140ub;
import X.C17200uh;
import X.C17250um;
import X.C18020w1;
import X.C18260wP;
import X.C18940xV;
import X.C19150xq;
import X.C19490yW;
import X.C19610yi;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C25781Lc;
import X.C28381Vw;
import X.C30001ba;
import X.C30011bb;
import X.C30921dB;
import X.C31091dS;
import X.C33481ie;
import X.C35541m6;
import X.C38701rH;
import X.C39171s2;
import X.C39191s4;
import X.C40781ug;
import X.C42681yF;
import X.C42761yd;
import X.C43331zp;
import X.C49132Rg;
import X.C50772aQ;
import X.C56752oS;
import X.C602430q;
import X.C73733oy;
import X.C795740j;
import X.C94314ki;
import X.C94654lG;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MessageDetailsActivity extends C14530pL implements C42761yd {
    public long A00;
    public BaseAdapter A01;
    public ListView A02;
    public AnonymousClass10X A03;
    public C16760tb A04;
    public AnonymousClass127 A05;
    public C16000sG A06;
    public C17140ub A07;
    public C16080sP A08;
    public AnonymousClass120 A09;
    public AnonymousClass2Ao A0A;
    public C17200uh A0B;
    public C30011bb A0C;
    public C30001ba A0D;
    public AnonymousClass1B5 A0E;
    public C19610yi A0F;
    public C16980tz A0G;
    public C16460t6 A0H;
    public C19150xq A0I;
    public AnonymousClass1HF A0J;
    public AnonymousClass15X A0K;
    public AnonymousClass18R A0L;
    public C16740tZ A0M;
    public AnonymousClass1RV A0N;
    public C16210se A0O;
    public C25781Lc A0P;
    public AnonymousClass1BU A0Q;
    public AnonymousClass1MF A0R;
    public C50772aQ A0S;
    public AnonymousClass1QZ A0T;
    public AnonymousClass1LB A0U;
    public boolean A0V;
    public final C40781ug A0W;
    public final C33481ie A0X;
    public final C18940xV A0Y;
    public final AnonymousClass1VD A0Z;
    public final Runnable A0a;
    public final ArrayList A0b;

    public MessageDetailsActivity() {
        this(0);
        this.A0b = new ArrayList();
        this.A0Y = new IDxMObserverShape73S0100000_1_I0(this, 1);
        this.A0X = new IDxCObserverShape68S0100000_2_I0(this, 15);
        this.A0W = new IDxSObserverShape63S0100000_2_I0(this, 11);
        this.A0Z = new IDxPObserverShape81S0100000_2_I0(this, 13);
        this.A0a = new RunnableRunnableShape7S0100000_I0_6(this, 36);
    }

    public MessageDetailsActivity(int i2) {
        this.A0V = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 48));
    }

    public static /* synthetic */ String A02(MessageDetailsActivity messageDetailsActivity, C39191s4 r5) {
        if (r5 == null) {
            return null;
        }
        C16010sH A0A2 = messageDetailsActivity.A06.A0A(r5.A0C());
        int i2 = 2;
        if (C16030sJ.A0L(messageDetailsActivity.A0M.A11.A00)) {
            i2 = 1;
        }
        return messageDetailsActivity.A08.A0G(A0A2, i2, false);
    }

    public static boolean A03(C795740j r1, C14710pd r2) {
        return C795740j.KEEP_IN_CHAT == r1 && r2.A0E(C16620tM.A02, 1352);
    }

    public void A1q() {
        if (!this.A0V) {
            this.A0V = true;
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
            this.A0G = (C16980tz) r1.AQB.get();
            this.A03 = (AnonymousClass10X) r1.ALc.get();
            this.A04 = (C16760tb) r1.APV.get();
            this.A0T = (AnonymousClass1QZ) r1.APn.get();
            this.A0B = (C17200uh) r1.A52.get();
            this.A06 = (C16000sG) r1.A4x.get();
            this.A0J = (AnonymousClass1HF) r1.AKj.get();
            this.A08 = (C16080sP) r1.AQ9.get();
            this.A07 = (C17140ub) r1.A4y.get();
            this.A0H = (C16460t6) r1.A5k.get();
            this.A0I = (C19150xq) r1.AFC.get();
            this.A0P = new C25781Lc();
            this.A0O = (C16210se) r1.AQr.get();
            this.A0S = (C50772aQ) r2.A02.get();
            this.A0N = (AnonymousClass1RV) r1.AF6.get();
            this.A05 = (AnonymousClass127) r1.A3z.get();
            this.A09 = (AnonymousClass120) r1.A4z.get();
            this.A0K = (AnonymousClass15X) r1.AMk.get();
            this.A0R = (AnonymousClass1MF) r1.ANa.get();
            this.A0Q = (AnonymousClass1BU) r1.ANA.get();
            this.A0E = (AnonymousClass1B5) r1.AEp.get();
            this.A0L = (AnonymousClass18R) r1.ABZ.get();
            this.A0F = (C19610yi) r1.AEq.get();
            this.A0U = (AnonymousClass1LB) r1.A7z.get();
        }
    }

    public int A1r() {
        return 154478781;
    }

    public C31091dS A1s() {
        C31091dS A1s = super.A1s();
        A1s.A03 = true;
        A1s.A00 = 8;
        A1s.A04 = true;
        return A1s;
    }

    public final void A35() {
        byte b2;
        UserJid A0C2;
        AnonymousClass21N r3;
        ArrayList arrayList = this.A0b;
        arrayList.clear();
        this.A00 = Long.MAX_VALUE;
        ConcurrentHashMap concurrentHashMap = this.A0J.A00(this.A0M).A00;
        if (concurrentHashMap.size() == 0) {
            C16740tZ r4 = this.A0M;
            C15830rv r0 = r4.A11.A00;
            if (r0 instanceof UserJid) {
                if (!C30921dB.A01(this.A01, r4)) {
                    r3 = new AnonymousClass21N(0, 0, 0);
                } else {
                    C16740tZ r42 = this.A0M;
                    boolean z2 = r42 instanceof C38701rH;
                    long j2 = r42.A0I;
                    r3 = z2 ? new AnonymousClass21N(j2, 0, j2) : new AnonymousClass21N(j2, j2, 0);
                }
                concurrentHashMap.put(r0, r3);
            }
        }
        C16740tZ r43 = this.A0M;
        if (1 == r43.A06() && r43.A1A != null && this.A0C.A0E(C16620tM.A02, 1352)) {
            C39191s4 r32 = this.A0M.A1A;
            if (r32.A11.A02) {
                C16040sK r02 = this.A01;
                r02.A0B();
                A0C2 = r02.A05;
            } else {
                A0C2 = r32.A0C();
            }
            arrayList.add(new AnonymousClass3ox(A0C2, this.A0M.A1A.A02));
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            AnonymousClass21N r33 = (AnonymousClass21N) entry.getValue();
            arrayList.add(new AnonymousClass2Aj(r33, (UserJid) entry.getKey()));
            long A012 = r33.A01(5);
            long A013 = r33.A01(13);
            long j3 = r33.A01;
            if (j3 <= 0) {
                j3 = 0;
            }
            if (A012 != 0) {
                this.A00 = Math.min(this.A00, A012);
                i2++;
            }
            if (A013 != 0) {
                this.A00 = Math.min(this.A00, A013);
                i4++;
            }
            if (j3 != 0) {
                this.A00 = Math.min(this.A00, j3);
                i3++;
            }
        }
        C16740tZ r11 = this.A0M;
        C15830rv r1 = r11.A11.A00;
        if (C16030sJ.A0L(r1) || C16030sJ.A0G(r1)) {
            int i5 = r11.A0A;
            if (i3 < i5 && (((b2 = r11.A10) == 2 && r11.A08 == 1) || C30921dB.A00(b2))) {
                arrayList.add(new C73733oy(i5 - i3, 8));
            }
            if (i4 < i5) {
                arrayList.add(new C73733oy(i5 - i4, 13));
            }
            if (i2 < i5) {
                arrayList.add(new C73733oy(i5 - i2, 5));
            }
        }
        Collections.sort(arrayList, new AnonymousClass3IT(this));
        BaseAdapter baseAdapter = this.A01;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
        }
        A36();
    }

    public final void A36() {
        ListView listView = this.A02;
        Runnable runnable = this.A0a;
        listView.removeCallbacks(runnable);
        long j2 = this.A00;
        if (j2 != Long.MAX_VALUE) {
            this.A02.postDelayed(runnable, (C42681yF.A01(j2) - System.currentTimeMillis()) + 1000);
        }
    }

    public AnonymousClass2Ao AAp() {
        return this.A0D.A01(this);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 2) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1 && intent != null) {
            List A082 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
            intent.getBooleanExtra("include_captions", false);
            C35541m6 r2 = null;
            if (AnonymousClass3B1.A01(this.A0C, A082)) {
                AnonymousClass00B.A06(intent);
                r2 = this.A0Q.A00(intent.getExtras());
            }
            this.A04.A08(this.A03, r2, this.A0M, A082, false);
            if (A082.size() != 1 || C16030sJ.A0Q((Jid) A082.get(0))) {
                Agv(A082);
            } else {
                this.A00.A07(this, new C14750ph().A0v(this, this.A06.A0A((C15830rv) A082.get(0))));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        C30011bb A022;
        BaseAdapter r3;
        String str;
        A1X(9);
        requestWindowFeature(9);
        super.onCreate(bundle);
        AKw("on_create");
        C16980tz r5 = this.A0G;
        AnonymousClass1QZ r4 = this.A0T;
        C16980tz r16 = r5;
        C43331zp r13 = new C43331zp(this.A06, this.A09, r16, this.A01, r4, C43331zp.A00(this.A05));
        C14710pd r8 = this.A0C;
        C16320sq r12 = this.A05;
        C15900s5 r42 = this.A06;
        C17200uh r52 = this.A0B;
        this.A0D = new C30001ba(AGM(), r42, r52, this.A0E, this.A0F, r8, this.A0N, this.A0R, this.A0S, r12, r13);
        AKw("get_message_key_from_intent");
        C28381Vw A023 = AnonymousClass1yL.A02(getIntent());
        if (A023 != null) {
            this.A0M = this.A0H.A0K.A03(A023);
        }
        AKv("get_message_key_from_intent");
        setTitle(R.string.str0d38);
        x().A0N(true);
        setContentView((int) R.layout.layout03e4);
        C005402i x2 = x();
        ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass00T.A00(this, R.color.color064b));
        x2.A0D(colorDrawable);
        x2.A0P(false);
        Intent intent = getIntent();
        if (intent == null) {
            str = "intent_is_null";
        } else {
            this.A0A = this.A0B.A04(this, "message-details-activity");
            if (this.A0M == null) {
                AKw("get_message_creating_message_key");
                C16460t6 r53 = this.A0H;
                this.A0M = r53.A0K.A03(new C28381Vw(C15830rv.A02(intent.getStringExtra("key_remote_jid")), intent.getStringExtra("key_id"), true));
                AKv("get_message_creating_message_key");
            }
            C16740tZ r43 = this.A0M;
            if (r43 == null) {
                str = "message_is_null";
            } else {
                StringBuilder sb = new StringBuilder("messagedetails/");
                sb.append(r43.A11);
                Log.i(sb.toString());
                this.A02 = (ListView) findViewById(16908298);
                AKw("refresh_receipts");
                A35();
                AKv("refresh_receipts");
                C16740tZ r44 = this.A0M;
                boolean z2 = r44 instanceof C39171s2;
                C30001ba r2 = this.A0D;
                if (z2) {
                    A022 = new AnonymousClass2TM(this, r2.A01(this), (AnonymousClass1YG) null, (C39171s2) r44);
                } else {
                    A022 = r2.A02(this, (AnonymousClass1YG) null, r44);
                }
                this.A0C = A022;
                A022.setOnLongClickListener((View.OnLongClickListener) null);
                C30011bb r45 = this.A0C;
                r45.A1f = new RunnableRunnableShape7S0100000_I0_6(this, 35);
                r45.A1g = new RunnableRunnableShape7S0100000_I0_6(this, 34);
                ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.layout03e8, (ViewGroup) null, false);
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.conversation_row_center);
                viewGroup2.addView(this.A0C, -1, -2);
                Point point = new Point();
                getWindowManager().getDefaultDisplay().getSize(point);
                viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(point.x, 1073741824), View.MeasureSpec.makeMeasureSpec(-2, 0));
                int i2 = point.y >> 1;
                boolean z3 = false;
                if (viewGroup2.getMeasuredHeight() > i2) {
                    z3 = true;
                    this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new C94314ki(this));
                }
                this.A02.addHeaderView(viewGroup, (Object) null, false);
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.edge_bottom);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.A02.addHeaderView(imageView, (Object) null, false);
                View view = new View(this);
                view.setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.dimen0156)));
                this.A02.addFooterView(view, (Object) null, false);
                C15830rv r6 = this.A0M.A11.A00;
                if (C16030sJ.A0L(r6) || C16030sJ.A0G(r6)) {
                    r3 = new C56752oS(this);
                    this.A01 = r3;
                } else {
                    r3 = new AnonymousClass2oN(this);
                    this.A01 = r3;
                }
                this.A02.setAdapter(r3);
                Drawable A032 = this.A0O.A03(this.A0O.A06(this, r6));
                if (A032 != null) {
                    viewGroup.setBackground(new AnonymousClass3L7(A032, viewGroup, this));
                } else {
                    viewGroup.setBackgroundResource(R.color.color018f);
                }
                this.A02.setOnScrollListener(new C94654lG(colorDrawable, viewGroup2, this, i2, z3));
                this.A0F.A06();
                this.A07.A02(this.A0X);
                this.A0I.A02(this.A0Y);
                this.A05.A02(this.A0W);
                this.A0L.A02(this.A0Z);
                new C006602z(this).A01(MessageDetailsViewModel.class);
                AKv("on_create");
                return;
            }
        }
        AL7(str);
        AKv("on_create");
        AL0(3);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0A.A00();
        C30001ba r1 = this.A0D;
        AnonymousClass2Ao r0 = r1.A00;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass1MF r02 = r1.A01;
        if (r02 != null) {
            r02.A03();
        }
        C43331zp r03 = r1.A0C;
        if (r03 != null) {
            r03.A06();
        }
        this.A0F.A06();
        this.A07.A03(this.A0X);
        this.A0I.A03(this.A0Y);
        this.A05.A03(this.A0W);
        this.A0L.A03(this.A0Z);
        this.A02.removeCallbacks(this.A0a);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A0U.A00();
        if (this.A0F.A0B()) {
            this.A0F.A03();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0F.A0B()) {
            this.A0F.A05();
        }
        C30011bb r1 = this.A0C;
        if (r1 instanceof C602430q) {
            ((C602430q) r1).A1R();
        }
    }

    public void onStart() {
        super.onStart();
        AnonymousClass2IV r3 = this.A01.A01.A01;
        C16740tZ r1 = this.A0M;
        C15830rv r0 = r1.A11.A00;
        int i2 = r1.A0A;
        if (r3 != null && (r0 instanceof C16060sN) && i2 > 0) {
            r3.A05 = Long.valueOf(i2 <= 32 ? 32 : (long) i2);
            r3.A01 = Integer.valueOf(C18020w1.A00(i2));
        }
        AW4();
    }
}
