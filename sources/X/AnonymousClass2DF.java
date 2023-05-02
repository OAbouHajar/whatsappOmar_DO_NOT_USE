package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.redex.IDxCListenerShape21S0300000_2_I0;
import com.facebook.redex.IDxCListenerShape378S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape266S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2DF  reason: invalid class name */
public class AnonymousClass2DF implements AnonymousClass1YG, AnonymousClass1yU {
    public PopupWindow.OnDismissListener A00 = new IDxDListenerShape266S0100000_2_I0(this, 0);
    public AnonymousClass05J A01;
    public C16570tH A02;
    public C16760tb A03;
    public C17150uc A04;
    public C18930xU A05;
    public AnonymousClass19Y A06;
    public C16000sG A07;
    public AnonymousClass1L6 A08;
    public C16080sP A09;
    public AnonymousClass120 A0A;
    public C17200uh A0B;
    public AnonymousClass1LA A0C;
    public C613738q A0D;
    public AnonymousClass1L8 A0E;
    public C30001ba A0F;
    public AnonymousClass1yT A0G;
    public C56962pX A0H;
    public AnonymousClass1B5 A0I;
    public C19610yi A0J;
    public C86144Rj A0K;
    public C16980tz A0L;
    public C16260sj A0M;
    public C16460t6 A0N;
    public C16070sO A0O;
    public AnonymousClass10B A0P;
    public C25701Ku A0Q;
    public C18550ws A0R;
    public C19150xq A0S;
    public AnonymousClass10G A0T;
    public C18030w2 A0U;
    public AnonymousClass1BQ A0V;
    public C16490t9 A0W;
    public C18040w3 A0X;
    public C17240ul A0Y;
    public AnonymousClass15W A0Z;
    public AnonymousClass1HE A0a;
    public C209212c A0b;
    public C19990zK A0c;
    public C27661Sq A0d;
    public AnonymousClass1L9 A0e;
    public C18090w8 A0f;
    public C18290wS A0g;
    public C16740tZ A0h;
    public AnonymousClass1RV A0i;
    public ReactionsTrayViewModel A0j;
    public C18570wu A0k;
    public C25781Lc A0l;
    public AnonymousClass47T A0m;
    public C14700pc A0n;
    public AnonymousClass1MF A0o;
    public C50772aQ A0p;
    public C17220uj A0q;
    public C25681Ks A0r;
    public C17110uY A0s;
    public AnonymousClass1QZ A0t;
    public AnonymousClass1LB A0u;
    public HashMap A0v;
    public HashSet A0w = new HashSet();
    public C39701sv A0x;
    public final C86374Sl A0y = new C86374Sl();

    public void A00() {
        if (this.A01 != null) {
            C86144Rj r1 = this.A0K;
            if (r1 == null || r1.A04.size() == 0) {
                A96();
                return;
            }
            if (r1.A04.size() > 1 && this.A0G.AJX()) {
                ReactionsTrayViewModel reactionsTrayViewModel = this.A0j;
                AnonymousClass00B.A06(reactionsTrayViewModel);
                reactionsTrayViewModel.A05(0);
            }
            this.A01.A06();
        }
    }

    public /* synthetic */ void A4o(Drawable drawable, View view) {
    }

    public void A96() {
        AnonymousClass05J r0 = this.A01;
        if (r0 != null) {
            r0.A05();
        }
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0j;
        if (reactionsTrayViewModel != null) {
            reactionsTrayViewModel.A05(0);
        }
    }

    public void A9J(C16740tZ r9) {
        int i2;
        A96();
        this.A0h = r9;
        AnonymousClass391 r3 = new AnonymousClass391((Context) this.A0G);
        boolean z2 = true;
        r3.A05 = true;
        C28381Vw r5 = r9.A11;
        r3.A01 = r5.A00;
        r3.A0S = Collections.singletonList(r5);
        byte b2 = r9.A10;
        r3.A0R = new ArrayList(Collections.singleton(Integer.valueOf(Byte.valueOf(b2).intValue())));
        r3.A0L = Long.valueOf(r9 instanceof C38711rI ? ((long) ((C16730tY) r9).A00) * 1000 : 0);
        if (b2 == 0) {
            String A0I2 = r9.A0I();
            AnonymousClass00B.A06(A0I2);
            i2 = A0I2.length();
        } else {
            i2 = 0;
        }
        r3.A0J = Integer.valueOf(i2);
        r3.A0H = Integer.valueOf(C38621r6.A0u(r9) ? 1 : 0);
        r3.A08 = Boolean.valueOf(r9.A10(1));
        r3.A06 = Boolean.valueOf(r9.A10(1024));
        boolean z3 = false;
        if (r9.A05 >= 127) {
            z3 = true;
        }
        r3.A07 = Boolean.valueOf(z3);
        if (!(r9 instanceof C38701rH) || r9.A08 != 1 || !r5.A02) {
            z2 = false;
        }
        r3.A09 = Boolean.valueOf(z2);
        ((C001100m) this.A0G).startActivityForResult(r3.A00(), 2);
    }

    public /* synthetic */ int AAs() {
        return 0;
    }

    public Object AAy(Class cls) {
        if (cls == C86374Sl.class) {
            return this.A0y;
        }
        if (cls == C613738q.class) {
            return this.A0D;
        }
        return null;
    }

    public C616339r AAz() {
        return this.A0E.A02;
    }

    public /* synthetic */ ArrayList AFm() {
        return null;
    }

    public int AGW(C16740tZ r4) {
        Number number;
        HashMap hashMap = this.A0v;
        if (hashMap == null || (number = (Number) hashMap.get(r4.A11)) == null) {
            return 0;
        }
        return number.intValue();
    }

    public boolean AHi() {
        return this.A0K != null;
    }

    public /* synthetic */ boolean AJH() {
        return false;
    }

    public boolean AJI(C16740tZ r3) {
        C86144Rj r0 = this.A0K;
        if (r0 != null) {
            return r0.A04.containsKey(r3.A11);
        }
    }

    public /* synthetic */ boolean AJU() {
        return false;
    }

    public /* synthetic */ boolean AJn(C16740tZ r2) {
        return false;
    }

    public /* synthetic */ void AW7(C16740tZ r1, boolean z2) {
    }

    public void Ad8(C16740tZ r3) {
        C14550pN r1 = (C14550pN) this.A0G;
        GoogleSearchDialogFragment.A01(r1, r1.A06, r3);
    }

    public /* synthetic */ void AeT(C16740tZ r1) {
    }

    public void Aec(List list, boolean z2) {
        if (this.A0K != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C16740tZ r2 = (C16740tZ) it.next();
                C86144Rj r0 = this.A0K;
                C28381Vw r1 = r2.A11;
                HashMap hashMap = r0.A04;
                if (z2) {
                    hashMap.put(r1, r2);
                } else {
                    hashMap.remove(r1);
                }
            }
            A00();
        }
    }

    public void Aeq(C16740tZ r4, int i2) {
        HashMap hashMap = this.A0v;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.A0v = hashMap;
        }
        hashMap.put(r4.A11, Integer.valueOf(i2));
    }

    public /* synthetic */ boolean AfN() {
        return false;
    }

    public void AfX(Bitmap bitmap, C39701sv r6) {
        this.A0x = r6;
        C32241fu r3 = new C32241fu((Context) this.A0G);
        r3.A01(R.string.str00a7);
        r3.setPositiveButton(R.string.str0dd2, new IDxCListenerShape21S0300000_2_I0(bitmap, r6, this, 2));
        r3.setNegativeButton(R.string.str087a, new IDxCListenerShape21S0300000_2_I0(bitmap, r6, this, 1));
        r3.create().show();
    }

    public /* synthetic */ boolean Afe() {
        return false;
    }

    public void Afs(View view, C16740tZ r16, int i2, boolean z2) {
        String str;
        String A002;
        boolean z3;
        if (this.A0j == null) {
            ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) new C006602z((C001100m) this.A0G).A01(ReactionsTrayViewModel.class);
            this.A0j = reactionsTrayViewModel;
            reactionsTrayViewModel.A0A.A0A((C001200n) this.A0G, new IDxObserverShape36S0200000_2_I0(reactionsTrayViewModel, 3, this));
            AnonymousClass2OJ r5 = reactionsTrayViewModel.A09;
            AnonymousClass1yT r4 = this.A0G;
            r5.A0A((C001200n) r4, new IDxObserverShape115S0100000_2_I0((Object) r4, 151));
        }
        ReactionsTrayViewModel reactionsTrayViewModel2 = this.A0j;
        C16740tZ r11 = r16;
        AnonymousClass23T r9 = r11.A0W;
        if (r9 != null) {
            C16040sK r0 = reactionsTrayViewModel2.A05;
            r0.A0B();
            AnonymousClass1ZT r8 = r0.A05;
            AnonymousClass00B.A06(r8);
            long j2 = r11.A13;
            synchronized (r9) {
                Iterator A032 = r9.A03();
                while (true) {
                    if (!A032.hasNext()) {
                        str = null;
                        break;
                    }
                    C55792kN r02 = (C55792kN) ((AnonymousClass23U) A032.next()).A03.get(new Pair(r8, Long.valueOf(j2)));
                    if (r02 != null) {
                        str = r02.A05;
                        break;
                    }
                }
            }
        } else {
            str = null;
        }
        reactionsTrayViewModel2.A02 = r11;
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass00B.A06(str);
            if (!C37941pz.A02(str)) {
                str2 = "□";
            }
        }
        reactionsTrayViewModel2.A0A.A0B(new C56082kw(str2, str2, false));
        if (TextUtils.isEmpty(str)) {
            A002 = null;
            z3 = false;
        } else {
            AnonymousClass00B.A06(str);
            A002 = C37781pj.A00(C62153Bw.A07(new C37781pj(str).A00));
            z3 = true;
        }
        List<String> list = ReactionsTrayViewModel.A0C;
        reactionsTrayViewModel2.A03 = new ArrayList(list.size() + 1);
        for (String str3 : list) {
            if (str3.equals(A002)) {
                reactionsTrayViewModel2.A03.add(str);
                z3 = false;
            } else {
                int[] iArr = new C37781pj(str3).A00;
                if (C62153Bw.A03(iArr)) {
                    C17020u3 r6 = reactionsTrayViewModel2.A07;
                    if (r6.A00("emoji_modifiers").contains(C61953Bb.A00(iArr))) {
                        reactionsTrayViewModel2.A03.add(new C37781pj(C61953Bb.A04(r6, iArr)).toString());
                    }
                }
                reactionsTrayViewModel2.A03.add(str3);
            }
        }
        if (z3) {
            reactionsTrayViewModel2.A03.add(str);
        }
        AnonymousClass1yT r92 = this.A0G;
        View view2 = view;
        this.A0H = new C56962pX(view2, (C14550pN) r92, ((C14570pP) r92).A01, r11, this.A0j, z2);
        ReactionsTrayViewModel reactionsTrayViewModel3 = this.A0j;
        C16740tZ r2 = reactionsTrayViewModel3.A02;
        if (r2 != null) {
            reactionsTrayViewModel3.A00 = i2;
            C27641So r03 = reactionsTrayViewModel3.A08;
            r03.A01.A06(C27641So.A00(C18020w1.A02(r03.A00, r2), C18020w1.A06(r2), 1));
            reactionsTrayViewModel3.A09.A0B(1);
        }
    }

    public void Ag8(C16740tZ r7) {
        AnonymousClass1yT r5 = this.A0G;
        C14870pt r4 = ((C14550pN) r5).A05;
        C19150xq r3 = this.A0S;
        C86144Rj r0 = new C86144Rj(r4, new IDxCListenerShape378S0100000_2_I0(r5, 0), this.A0K, r3);
        this.A0K = r0;
        r0.A04.put(r7.A11, r7);
        this.A0G.AWw();
        A00();
    }

    public boolean Agy(C16740tZ r5) {
        C86144Rj r0 = this.A0K;
        boolean z2 = false;
        if (r0 != null) {
            C28381Vw r2 = r5.A11;
            boolean containsKey = r0.A04.containsKey(r2);
            HashMap hashMap = this.A0K.A04;
            if (containsKey) {
                hashMap.remove(r2);
            } else {
                hashMap.put(r2, r5);
                z2 = true;
            }
            A00();
        }
        return z2;
    }

    public void Ahb(C16740tZ r3) {
        this.A0w.add(r3.A11);
    }
}
