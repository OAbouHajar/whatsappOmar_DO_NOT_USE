package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape52S0200000_2_I0;
import com.facebook.redex.IDxCallbackShape333S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1;
import com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.conversationslist.ViewHolder;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2AH  reason: invalid class name */
public class AnonymousClass2AH extends AnonymousClass01X implements C32181fm {
    public AnonymousClass05J A00;
    public List A01 = new CopyOnWriteArrayList();
    public final int A02;
    public final Context A03;
    public final LayoutInflater A04;
    public final View.OnClickListener A05;
    public final C000900k A06;
    public final C009804r A07 = new IDxCallbackShape333S0100000_1_I0(this, 3);
    public final C001300o A08;
    public final C19980zJ A09;
    public final C25731Kx A0A;
    public final C50692aI A0B;
    public final C50702aJ A0C;
    public final C14870pt A0D;
    public final C16040sK A0E;
    public final C15900s5 A0F;
    public final AnonymousClass15Z A0G;
    public final C54602hp A0H;
    public final C17150uc A0I;
    public final AnonymousClass01Y A0J;
    public final C17230uk A0K;
    public final AnonymousClass1L3 A0L;
    public final AnonymousClass1L4 A0M;
    public final C17750va A0N;
    public final C17160ud A0O;
    public final C16000sG A0P;
    public final C16080sP A0Q;
    public final AnonymousClass2Ao A0R;
    public final C85934Qo A0S;
    public final AnonymousClass2J6 A0T;
    public final C16440t3 A0U;
    public final C16980tz A0V;
    public final C15860rz A0W;
    public final AnonymousClass013 A0X;
    public final C15810rt A0Y;
    public final C33501ig A0Z = new IDxCObserverShape72S0100000_2_I0(this, 11);
    public final AnonymousClass11A A0a;
    public final C18560wt A0b;
    public final C16070sO A0c;
    public final AnonymousClass195 A0d;
    public final C19780yz A0e;
    public final AnonymousClass15G A0f;
    public final AnonymousClass15X A0g;
    public final C19580yf A0h;
    public final C218115n A0i;
    public final C14710pd A0j;
    public final C20260zl A0k;
    public final C17240ul A0l;
    public final AnonymousClass2AP A0m;
    public final AnonymousClass2AT A0n;
    public final C217915l A0o;
    public final C16050sL A0p;
    public final C19990zK A0q;
    public final C17800vf A0r;
    public final C18090w8 A0s;
    public final C18290wS A0t;
    public final C218315p A0u;
    public final C16220sf A0v;
    public final C25781Lc A0w;
    public final C16320sq A0x;
    public final HashSet A0y = new HashSet();
    public final List A0z = new ArrayList();

    public AnonymousClass2AH(View.OnClickListener onClickListener, C000900k r5, C001300o r6, C19980zJ r7, C25731Kx r8, C50692aI r9, C50702aJ r10, C14870pt r11, C16040sK r12, C15900s5 r13, AnonymousClass15Z r14, C54602hp r15, C17150uc r16, AnonymousClass01Y r17, C17230uk r18, AnonymousClass1L3 r19, AnonymousClass1L4 r20, C17750va r21, C17160ud r22, C16000sG r23, C16080sP r24, AnonymousClass2Ao r25, AnonymousClass2J6 r26, C16440t3 r27, C16980tz r28, C15860rz r29, AnonymousClass013 r30, C15810rt r31, AnonymousClass11A r32, C18560wt r33, C16070sO r34, AnonymousClass195 r35, C19780yz r36, AnonymousClass15G r37, AnonymousClass15X r38, C19580yf r39, C218115n r40, C14710pd r41, C20260zl r42, C17240ul r43, AnonymousClass2AP r44, AnonymousClass2AT r45, C217915l r46, C16050sL r47, C19990zK r48, C17800vf r49, C18090w8 r50, C18290wS r51, C218315p r52, C16220sf r53, C25781Lc r54, C16320sq r55, int i2) {
        this.A08 = r6;
        this.A0L = r19;
        this.A0m = r44;
        this.A03 = r5;
        this.A04 = LayoutInflater.from(r5);
        this.A0U = r27;
        this.A0j = r41;
        this.A0D = r11;
        this.A05 = onClickListener;
        this.A06 = r5;
        this.A0q = r48;
        this.A0E = r12;
        this.A0V = r28;
        C16320sq r0 = r55;
        this.A0x = r0;
        this.A0Y = r31;
        this.A0F = r13;
        this.A0k = r42;
        this.A0u = r52;
        this.A09 = r7;
        this.A0O = r22;
        this.A0A = r8;
        this.A0P = r23;
        this.A0b = r33;
        this.A0X = r30;
        this.A0Q = r24;
        this.A0t = r51;
        this.A0H = r15;
        this.A0J = r17;
        this.A0l = r43;
        this.A0e = r36;
        this.A0r = r49;
        this.A0w = r54;
        this.A0v = r53;
        this.A0o = r46;
        this.A0R = r25;
        this.A0n = r45;
        this.A0i = r40;
        this.A0f = r37;
        this.A0g = r38;
        this.A0W = r29;
        this.A0K = r18;
        this.A0a = r32;
        this.A0N = r21;
        this.A0M = r20;
        this.A0d = r35;
        this.A0s = r50;
        this.A0I = r16;
        this.A0B = r9;
        this.A0c = r34;
        this.A0G = r14;
        this.A0h = r39;
        this.A0T = r26;
        this.A0C = r10;
        this.A0S = new C85934Qo(new AnonymousClass1WA(r0, true));
        this.A0p = r47;
        this.A02 = i2;
        A0B(true);
    }

    public int A0C() {
        return this.A01.size();
    }

    public long A0D(int i2) {
        List list = this.A01;
        return (long) Arrays.hashCode(new Object[]{Integer.valueOf(((AnonymousClass4UJ) list.get(i2)).A00), ((AnonymousClass4UJ) list.get(i2)).A02});
    }

    public void A0E() {
        this.A0D.A0K(new RunnableRunnableShape9S0100000_I0_8(this, 35));
    }

    public final void A0F() {
        HashSet hashSet = this.A0y;
        if (!hashSet.isEmpty()) {
            for (AnonymousClass2O2 r1 : this.A0z) {
                r1.A0H.setBackgroundResource(0);
                SelectionCheckView selectionCheckView = r1.A08;
                selectionCheckView.setVisibility(8);
                selectionCheckView.A04(false, true);
            }
            hashSet.clear();
        }
    }

    public void A0G(C15840rx r5, AnonymousClass2O2 r6) {
        C000900k r1;
        C16050sL A032 = C16050sL.A03(r5.A05());
        HashSet hashSet = this.A0y;
        if (hashSet.contains(A032)) {
            hashSet.remove(A032);
            if (hashSet.isEmpty() && this.A00 != null) {
                A0F();
                AnonymousClass05J r0 = this.A00;
                if (r0 != null) {
                    r0.A05();
                }
            }
            r6.A0H.setBackgroundResource(0);
            SelectionCheckView selectionCheckView = r6.A08;
            selectionCheckView.setVisibility(8);
            selectionCheckView.A04(false, true);
        } else {
            hashSet.add(A032);
            if (this.A00 == null && (r1 = this.A06) != null) {
                this.A00 = r1.AgA(this.A07);
            }
            r6.A0H.setBackgroundResource(R.color.color04c8);
            SelectionCheckView selectionCheckView2 = r6.A08;
            selectionCheckView2.setVisibility(0);
            selectionCheckView2.A04(true, true);
            this.A0z.add(r6);
        }
        AnonymousClass05J r02 = this.A00;
        if (r02 != null) {
            r02.A06();
        }
    }

    public void A0H(C15830rv r5) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            List list = this.A01;
            if (i2 < list.size()) {
                if (r5.equals(((AnonymousClass4UJ) list.get(i2)).A01)) {
                    arrayList.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                this.A0D.Acq(new RunnableRunnableShape8S0200000_I0_6(this, 0, arrayList));
                return;
            }
        }
    }

    public void A0I(List list) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            List list2 = this.A01;
            if (i2 < list2.size()) {
                if (list.contains(((AnonymousClass4UJ) list2.get(i2)).A01)) {
                    arrayList.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                this.A0D.Acq(new RunnableRunnableShape8S0200000_I0_6(this, 0, arrayList));
                return;
            }
        }
    }

    public void A0J(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        List list2 = this.A01;
        AnonymousClass07C A002 = AnonymousClass07B.A00(new AnonymousClass3QQ(list2, arrayList));
        list2.clear();
        list2.addAll(arrayList);
        A002.A02(this);
    }

    public int ACa(int i2) {
        while (i2 >= 0) {
            if (AIu(i2)) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public boolean AIu(int i2) {
        return getItemViewType(i2) == 3;
    }

    public void ANf(C005602k r21, int i2) {
        String str;
        int size;
        Set A18;
        View view;
        int i3;
        C005602k r11 = r21;
        int i4 = i2;
        if (r11 instanceof C64753Rn) {
            GroupJid groupJid = (GroupJid) ((AnonymousClass4UJ) this.A01.get(i4)).A02;
            C56862ok r3 = ((C64753Rn) r11).A00;
            r3.A05 = groupJid;
            r3.A02 = r3.A00.A0A(groupJid);
            r3.A00();
        }
        if (r11 instanceof C64773Rp) {
            ((C64773Rp) r11).A00.A03 = (GroupJid) ((AnonymousClass4UJ) this.A01.get(i4)).A02;
        }
        if (r11 instanceof C57692rb) {
            C57692rb r112 = (C57692rb) r11;
            C84394Kj r4 = (C84394Kj) ((AnonymousClass4UJ) this.A01.get(i4)).A02;
            C39461sW r5 = r4.A00;
            GroupJid groupJid2 = r5.A02;
            C30521cU r1 = r112.A04;
            r1.A0E(r5.A03);
            Context context = r112.A05;
            r1.A06(AnonymousClass00T.A00(context, R.color.color0507));
            ImageView imageView = r112.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(r112.A06.A00(R.string.str1dd1));
            sb.append(C16030sJ.A03(groupJid2));
            C004601z.A0n(imageView, sb.toString());
            C16010sH A0A2 = r112.A08.A0A(groupJid2);
            int i5 = 0;
            if (r5.A00 == 3) {
                imageView.setImageDrawable(r112.A0C.A00(imageView.getContext().getTheme(), imageView.getResources(), C99004tK.A00, R.drawable.avatar_announcement));
                TextEmojiLabel textEmojiLabel = r112.A03;
                textEmojiLabel.setVisibility(0);
                r112.A01.setVisibility(0);
                textEmojiLabel.setText(context.getString(R.string.str04f0));
            } else {
                r112.A09.A06(imageView, A0A2);
                r112.A03.setVisibility(8);
                r112.A01.setVisibility(8);
            }
            TextEmojiLabel textEmojiLabel2 = r112.A02;
            if (!r4.A02) {
                i5 = 8;
            }
            textEmojiLabel2.setVisibility(i5);
            r112.A0H.setOnClickListener(new ViewOnClickCListenerShape3S0300000_I1((Object) r112, (Object) groupJid2, (Object) r4, 17));
        } else if (r11 instanceof AnonymousClass3SJ) {
            AnonymousClass3SJ r113 = (AnonymousClass3SJ) r11;
            TextView textView = r113.A02;
            Resources resources = textView.getResources();
            int i6 = ((AnonymousClass4EM) ((AnonymousClass4UJ) this.A01.get(i4)).A02).A00;
            textView.setText(resources.getQuantityString(R.plurals.plurals0155, i6, new Object[]{Integer.valueOf(i6)}));
            r113.A0H.setOnClickListener(r113.A00);
        } else if (r11 instanceof C64763Ro) {
            int intValue = ((Number) ((AnonymousClass4UJ) this.A01.get(i4)).A02).intValue();
            C64323Nr r2 = ((C64763Ro) r11).A00;
            r2.A01.setText(r2.getContext().getString(intValue));
        } else if (r11 instanceof C64723Rk) {
            ((C64723Rk) r11).A00 = this.A0p;
        } else if (r11 instanceof AnonymousClass3RZ) {
            if (this.A00 != null) {
                A0F();
                AnonymousClass05J r0 = this.A00;
                if (r0 != null) {
                    r0.A05();
                }
            }
        } else if (r11 instanceof AnonymousClass2O2) {
            AnonymousClass2O2 r114 = (AnonymousClass2O2) r11;
            AnonymousClass4I0 r32 = (AnonymousClass4I0) ((AnonymousClass4UJ) this.A01.get(i4)).A02;
            AnonymousClass01D r22 = r114.A0B.A01;
            long j2 = ((SharedPreferences) r22.get()).getLong("previous_last_seen_community_activity", 0);
            long j3 = ((SharedPreferences) r22.get()).getLong("last_seen_community_activity", 0);
            C15840rx r42 = r32.A00;
            String A062 = r42.A06();
            if (TextUtils.isEmpty(A062)) {
                C16300so r52 = r114.A02;
                StringBuilder sb2 = new StringBuilder("Missing group subject for jid:");
                sb2.append(r42.A05());
                sb2.append(". type:");
                sb2.append(r42.A01);
                r52.AcB("ParentViewHolder/bind", sb2.toString(), true);
            }
            r114.A03.A0I((List) null, A062);
            C16010sH A082 = r114.A09.A08(r42.A05());
            if (A082 != null) {
                if (A082.A0J()) {
                    StringBuilder sb3 = new StringBuilder("ParentViewHolder/displayContact");
                    sb3.append(A082.A0E);
                    Log.i(sb3.toString());
                }
                r114.A0A.A06(r114.A00, A082);
            }
            boolean z2 = r32.A01;
            ImageView imageView2 = r114.A00;
            float f2 = 1.0f;
            if (z2) {
                f2 = 0.5f;
            }
            imageView2.setAlpha(f2);
            long j4 = r42.A0G;
            if (z2) {
                r114.A04.setVisibility(8);
                r114.A05.setVisibility(0);
            } else {
                if (j4 <= j2 || j4 >= j3) {
                    r114.A04.setVisibility(8);
                } else {
                    r114.A04.setVisibility(0);
                }
                r114.A05.setVisibility(8);
            }
            View view2 = r114.A0H;
            view2.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(r114, 30, r32));
            if (z2) {
                view2.setOnLongClickListener(new IDxCListenerShape52S0200000_2_I0(r32, 1, r114));
            }
        } else if (r11 instanceof AnonymousClass3S4) {
            r11.A0H.setOnClickListener(new ViewOnClickCListenerShape6S0200000_I1_1(r11, 32, ((AnonymousClass4UJ) this.A01.get(i4)).A02));
        } else if (r11 instanceof ViewHolder) {
            Context context2 = this.A03;
            ((ViewHolder) r11).A0E(this.A06, context2, (AnonymousClass2Wo) ((AnonymousClass4UJ) this.A01.get(i4)).A02, (AnonymousClass5PS) null, (AnonymousClass2XQ) null, this.A02, i4, false);
        } else if (r11 instanceof C64733Rl) {
            C16050sL r6 = (C16050sL) ((AnonymousClass4UJ) this.A01.get(i4)).A02;
            AnonymousClass2OT r53 = ((C64733Rl) r11).A00;
            r53.A08 = r6;
            C16010sH A0A3 = r53.A03.A0A(r6);
            C217915l r33 = r53.A07;
            boolean A002 = r33.A00(A0A3);
            View view3 = r53.A0E;
            if (A002) {
                view3.setVisibility(0);
                r53.A0I.setVisibility(8);
                r53.A0F.setVisibility(0);
            } else {
                view3.setVisibility(8);
                r53.A0I.setVisibility(0);
                r53.A0F.setVisibility(8);
            }
            r53.A09.Acl(new RunnableRunnableShape8S0200000_I0_6(r53, 1, A0A3));
            if (!r53.A05.A0E(r6) || r33.A00(A0A3)) {
                view = r53.A0D;
                i3 = 8;
            } else {
                view = r53.A0D;
                i3 = 0;
            }
            view.setVisibility(i3);
        } else if (r11 instanceof C64743Rm) {
            C16740tZ r54 = (C16740tZ) ((AnonymousClass4UJ) this.A01.get(i4)).A02;
            C56932pA r62 = ((C64743Rm) r11).A00;
            TextEmojiLabel textEmojiLabel3 = r62.A04;
            if (C38621r6.A0U(r62.A00, r54)) {
                AnonymousClass15Z r13 = r62.A01;
                if (r54 instanceof C39451sV) {
                    C39451sV r02 = (C39451sV) r54;
                    size = r02.A00;
                    A18 = r02.A03;
                } else if (r54 instanceof C40381u1) {
                    C40381u1 r12 = (C40381u1) r54;
                    size = r12.A18().size();
                    A18 = r12.A18();
                } else {
                    str = null;
                }
                List A022 = AnonymousClass15Z.A02(A18, 3);
                Pair A003 = AnonymousClass15Z.A00(A022, size);
                int intValue2 = ((Number) A003.first).intValue();
                if (intValue2 == 1) {
                    str = r13.A06.A00.getResources().getString(AnonymousClass15Z.A0I[1], new Object[]{A022.get(0)});
                } else if (intValue2 == 2) {
                    str = r13.A06.A00.getResources().getString(AnonymousClass15Z.A0I[2], new Object[]{A022.get(0), A022.get(1)});
                } else if (intValue2 != 3) {
                    Context context3 = r13.A06.A00;
                    if (intValue2 != 4) {
                        str = context3.getResources().getQuantityString(AnonymousClass15Z.A0I[0], size, new Object[]{Integer.valueOf(size)});
                    } else {
                        str = context3.getResources().getQuantityString(AnonymousClass15Z.A0I[3], ((Number) A003.second).intValue(), new Object[]{A022.get(0), A022.get(1), A003.second});
                    }
                } else {
                    str = r13.A06.A00.getResources().getQuantityString(AnonymousClass15Z.A0I[3], 1, new Object[]{A022.get(0), A022.get(1), 1});
                }
            } else {
                AnonymousClass00B.A08("CommunityActivityView/unexpected community activity");
                str = null;
            }
            textEmojiLabel3.A0I((List) null, str);
            r62.setOnClickListener(new ViewOnClickCListenerShape1S0200000_I1(r62, 44, r54));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (r9.A0E(r2, 2424) != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C005602k APF(android.view.ViewGroup r60, int r61) {
        /*
            r59 = this;
            r4 = 0
            r0 = r59
            r11 = r60
            switch(r61) {
                case -1: goto L_0x0017;
                case 0: goto L_0x0008;
                case 1: goto L_0x0026;
                case 2: goto L_0x0035;
                case 3: goto L_0x0046;
                case 4: goto L_0x0055;
                case 5: goto L_0x0130;
                case 6: goto L_0x0190;
                case 7: goto L_0x01a3;
                case 8: goto L_0x01be;
                case 9: goto L_0x0209;
                case 10: goto L_0x021e;
                case 11: goto L_0x0237;
                case 12: goto L_0x0246;
                case 13: goto L_0x0260;
                default: goto L_0x0008;
            }
        L_0x0008:
            android.content.Context r0 = r11.getContext()
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            X.3tJ r0 = new X.3tJ
            r0.<init>(r1)
            return r0
        L_0x0017:
            android.content.Context r0 = r11.getContext()
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            X.3tJ r0 = new X.3tJ
            r0.<init>(r1)
            return r0
        L_0x0026:
            android.content.Context r0 = r11.getContext()
            X.2ok r1 = new X.2ok
            r1.<init>(r0)
            X.3Rn r0 = new X.3Rn
            r0.<init>(r1)
            return r0
        L_0x0035:
            X.2AT r2 = r0.A0n
            android.content.Context r0 = r11.getContext()
            X.2pB r1 = new X.2pB
            r1.<init>(r0, r2)
            X.3Rp r0 = new X.3Rp
            r0.<init>(r1)
            return r0
        L_0x0046:
            android.content.Context r0 = r11.getContext()
            X.3Nr r1 = new X.3Nr
            r1.<init>(r0)
            X.3Ro r0 = new X.3Ro
            r0.<init>(r1)
            return r0
        L_0x0055:
            X.2TP r53 = X.AnonymousClass2TP.A01
            X.0t3 r1 = r0.A0U
            r33 = r1
            X.0pd r9 = r0.A0j
            X.0tM r2 = X.C16620tM.A01
            r1 = 1533(0x5fd, float:2.148E-42)
            boolean r1 = r9.A0E(r2, r1)
            if (r1 != 0) goto L_0x0070
            r1 = 2424(0x978, float:3.397E-42)
            boolean r1 = r9.A0E(r2, r1)
            r12 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r12 = 1
        L_0x0071:
            X.0zK r1 = r0.A0q
            r47 = r1
            X.0sK r1 = r0.A0E
            r58 = r1
            X.0tz r1 = r0.A0V
            r34 = r1
            X.0sq r1 = r0.A0x
            r54 = r1
            X.0rt r1 = r0.A0Y
            r37 = r1
            X.0s5 r1 = r0.A0F
            r57 = r1
            X.0zl r1 = r0.A0k
            r45 = r1
            X.15p r1 = r0.A0u
            r50 = r1
            X.0ud r1 = r0.A0O
            r56 = r1
            X.0sG r1 = r0.A0P
            r55 = r1
            X.1Kx r1 = r0.A0A
            r27 = r1
            X.0wt r1 = r0.A0b
            r26 = r1
            X.0sP r1 = r0.A0Q
            r28 = r1
            X.013 r1 = r0.A0X
            r25 = r1
            X.0wS r1 = r0.A0t
            r23 = r1
            X.01Y r1 = r0.A0J
            r24 = r1
            X.0ul r1 = r0.A0l
            r22 = r1
            X.0yz r1 = r0.A0e
            r21 = r1
            X.1Lc r1 = r0.A0w
            r20 = r1
            X.0sf r1 = r0.A0v
            r19 = r1
            X.2Ao r1 = r0.A0R
            r29 = r1
            X.15G r15 = r0.A0f
            X.15X r14 = r0.A0g
            X.0rz r8 = r0.A0W
            X.0uk r7 = r0.A0K
            X.195 r6 = r0.A0d
            X.0w8 r5 = r0.A0s
            X.0uc r4 = r0.A0I
            X.15Z r3 = r0.A0G
            X.0yf r2 = r0.A0h
            X.2J6 r1 = r0.A0T
            X.4Qo r10 = r0.A0S
            android.content.Context r17 = r11.getContext()
            r13 = 2131558898(0x7f0d01f2, float:1.8743125E38)
            if (r12 == 0) goto L_0x00eb
            r13 = 2131558899(0x7f0d01f3, float:1.8743127E38)
            int r13 = com.obwhatsapp.yo.HomeUI.isSwiRow(r13)
        L_0x00eb:
            android.content.Context r0 = r11.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r0)
            r0 = 0
            android.view.View r18 = r12.inflate(r13, r11, r0)
            r32 = 0
            com.obwhatsapp.conversationslist.ViewHolder r16 = new com.obwhatsapp.conversationslist.ViewHolder
            r30 = r10
            r31 = r1
            r35 = r8
            r36 = r25
            r38 = r26
            r39 = r6
            r40 = r21
            r41 = r15
            r42 = r14
            r43 = r2
            r44 = r9
            r46 = r22
            r48 = r5
            r49 = r23
            r51 = r19
            r52 = r20
            r19 = r27
            r20 = r58
            r21 = r57
            r22 = r3
            r23 = r4
            r25 = r7
            r26 = r56
            r27 = r55
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return r16
        L_0x0130:
            X.2aJ r3 = r0.A0C
            android.view.LayoutInflater r2 = r0.A04
            r1 = 2131559121(0x7f0d02d1, float:1.8743577E38)
            android.view.View r5 = r2.inflate(r1, r11, r4)
            X.00k r4 = r0.A06
            X.2Ao r10 = r0.A0R
            X.2hp r6 = r0.A0H
            X.1Lc r2 = r0.A0w
            X.2Yk r0 = r3.A00
            X.0sX r3 = r0.A03
            X.01J r0 = r3.ARB
            java.lang.Object r1 = r0.get()
            X.0sq r1 = (X.C16320sq) r1
            X.01J r0 = r3.A43
            java.lang.Object r12 = r0.get()
            X.0rt r12 = (X.C15810rt) r12
            X.01J r0 = r3.A4x
            java.lang.Object r8 = r0.get()
            X.0sG r8 = (X.C16000sG) r8
            X.01J r0 = r3.AQ9
            java.lang.Object r9 = r0.get()
            X.0sP r9 = (X.C16080sP) r9
            X.01J r0 = r3.AR8
            java.lang.Object r11 = r0.get()
            X.013 r11 = (X.AnonymousClass013) r11
            X.01J r0 = r3.AH2
            java.lang.Object r14 = r0.get()
            X.15n r14 = (X.C218115n) r14
            X.01J r0 = r3.A4I
            java.lang.Object r7 = r0.get()
            X.0uk r7 = (X.C17230uk) r7
            X.01J r0 = r3.ABY
            java.lang.Object r13 = r0.get()
            X.0sO r13 = (X.C16070sO) r13
            X.2rb r3 = new X.2rb
            r15 = r2
            r16 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L_0x0190:
            android.content.Context r3 = r0.A03
            android.view.LayoutInflater r2 = r0.A04
            r1 = 2131559031(0x7f0d0277, float:1.8743395E38)
            android.view.View r2 = r2.inflate(r1, r11, r4)
            android.view.View$OnClickListener r1 = r0.A05
            X.3SJ r0 = new X.3SJ
            r0.<init>(r3, r1, r2)
            return r0
        L_0x01a3:
            android.view.LayoutInflater r2 = r0.A04
            r1 = 2131559467(0x7f0d042b, float:1.8744279E38)
            android.view.View r2 = r2.inflate(r1, r11, r4)
            X.00k r1 = r0.A06
            X.0va r5 = r0.A0N
            X.15n r6 = r0.A0i
            X.0vf r7 = r0.A0r
            X.1L3 r3 = r0.A0L
            X.1L4 r4 = r0.A0M
            X.3RZ r0 = new X.3RZ
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L_0x01be:
            X.2aI r3 = r0.A0B
            android.view.LayoutInflater r2 = r0.A04
            r1 = 2131559467(0x7f0d042b, float:1.8744279E38)
            android.view.View r4 = r2.inflate(r1, r11, r4)
            X.00k r5 = r0.A06
            X.2Ao r10 = r0.A0R
            X.2Yk r1 = r3.A00
            X.0sX r3 = r1.A03
            X.01J r1 = r3.A5p
            java.lang.Object r6 = r1.get()
            X.0so r6 = (X.C16300so) r6
            X.01J r1 = r3.ARB
            java.lang.Object r2 = r1.get()
            X.0sq r2 = (X.C16320sq) r2
            X.01J r1 = r3.A4x
            java.lang.Object r9 = r1.get()
            X.0sG r9 = (X.C16000sG) r9
            X.01J r1 = r3.A4N
            java.lang.Object r8 = r1.get()
            X.1L3 r8 = (X.AnonymousClass1L3) r8
            X.01J r1 = r3.AQh
            java.lang.Object r11 = r1.get()
            X.0rz r11 = (X.C15860rz) r11
            X.01J r1 = r3.A4I
            java.lang.Object r7 = r1.get()
            X.0uk r7 = (X.C17230uk) r7
            X.2O2 r3 = new X.2O2
            r12 = r0
            r13 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x0209:
            android.view.LayoutInflater r2 = r0.A04
            r1 = 2131559733(0x7f0d0535, float:1.8744818E38)
            android.view.View r4 = r2.inflate(r1, r11, r4)
            X.00k r3 = r0.A06
            X.1L3 r2 = r0.A0L
            X.013 r1 = r0.A0X
            X.3S4 r0 = new X.3S4
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x021e:
            android.view.LayoutInflater r2 = r0.A04
            r1 = 2131558997(0x7f0d0255, float:1.8743326E38)
            android.view.View r2 = r2.inflate(r1, r11, r4)
            X.00k r1 = r0.A06
            X.0vf r6 = r0.A0r
            X.1L3 r3 = r0.A0L
            X.0va r5 = r0.A0N
            X.1L4 r4 = r0.A0M
            X.3tI r0 = new X.3tI
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0237:
            android.content.Context r0 = r11.getContext()
            X.2OT r1 = new X.2OT
            r1.<init>(r0)
            X.3Rl r0 = new X.3Rl
            r0.<init>(r1)
            return r0
        L_0x0246:
            X.0sO r4 = r0.A0c
            X.0sL r3 = r0.A0p
            android.content.Context r0 = r11.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558673(0x7f0d0111, float:1.8742668E38)
            r0 = 0
            android.view.View r1 = r2.inflate(r1, r11, r0)
            X.3Rk r0 = new X.3Rk
            r0.<init>(r1, r4, r3)
            return r0
        L_0x0260:
            X.2AP r2 = r0.A0m
            android.content.Context r0 = r11.getContext()
            X.2pA r1 = new X.2pA
            r1.<init>(r0, r2)
            X.3Rm r0 = new X.3Rm
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AH.APF(android.view.ViewGroup, int):X.02k");
    }

    public boolean AfG() {
        return true;
    }

    public int getItemViewType(int i2) {
        if (i2 < 0) {
            return -1;
        }
        List list = this.A01;
        if (i2 < list.size()) {
            return ((AnonymousClass4UJ) list.get(i2)).A00;
        }
        return -1;
    }
}
