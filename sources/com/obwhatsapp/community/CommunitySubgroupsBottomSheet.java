package com.obwhatsapp.community;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01Y;
import X.AnonymousClass04o;
import X.AnonymousClass0Fv;
import X.AnonymousClass15G;
import X.AnonymousClass15X;
import X.AnonymousClass15Z;
import X.AnonymousClass195;
import X.AnonymousClass1DY;
import X.AnonymousClass1L3;
import X.AnonymousClass2AS;
import X.AnonymousClass2Ao;
import X.AnonymousClass3FR;
import X.AnonymousClass3T9;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C020009i;
import X.C07610cB;
import X.C14710pd;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16220sf;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C17150uc;
import X.C17160ud;
import X.C17200uh;
import X.C17230uk;
import X.C17240ul;
import X.C17750va;
import X.C18090w8;
import X.C18290wS;
import X.C18550ws;
import X.C18560wt;
import X.C18570wu;
import X.C19580yf;
import X.C19780yz;
import X.C19990zK;
import X.C20260zl;
import X.C218315p;
import X.C25731Kx;
import X.C25781Lc;
import X.C50162Yf;
import X.C50712aK;
import X.C55302jH;
import X.C56102ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxFactoryShape55S0200000_2_I0;
import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import java.lang.reflect.Array;
import java.util.HashSet;

public class CommunitySubgroupsBottomSheet extends Hilt_CommunitySubgroupsBottomSheet {
    public C020009i A00;
    public C25731Kx A01;
    public C50162Yf A02;
    public C50712aK A03;
    public C14870pt A04;
    public C16040sK A05;
    public C15900s5 A06;
    public AnonymousClass15Z A07;
    public C17150uc A08;
    public AnonymousClass01Y A09;
    public C17230uk A0A;
    public AnonymousClass1L3 A0B;
    public AnonymousClass3FR A0C;
    public C17750va A0D;
    public C17160ud A0E;
    public C16000sG A0F;
    public C16080sP A0G;
    public AnonymousClass2Ao A0H;
    public C17200uh A0I;
    public C16440t3 A0J;
    public C16980tz A0K;
    public C15860rz A0L;
    public AnonymousClass013 A0M;
    public C15810rt A0N;
    public C18560wt A0O;
    public C16070sO A0P;
    public AnonymousClass195 A0Q;
    public C18550ws A0R;
    public C19780yz A0S;
    public AnonymousClass15G A0T;
    public AnonymousClass15X A0U;
    public C19580yf A0V;
    public C14710pd A0W;
    public C20260zl A0X;
    public C17240ul A0Y;
    public C19990zK A0Z;
    public C18090w8 A0a;
    public C18290wS A0b;
    public C218315p A0c;
    public AnonymousClass1DY A0d;
    public C16220sf A0e;
    public C18570wu A0f;
    public C25781Lc A0g;
    public C16320sq A0h;

    public static CommunitySubgroupsBottomSheet A01(C16050sL r4) {
        CommunitySubgroupsBottomSheet communitySubgroupsBottomSheet = new CommunitySubgroupsBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putString("extra_community_jid", r4.getRawString());
        communitySubgroupsBottomSheet.A0T(bundle);
        return communitySubgroupsBottomSheet;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout02a1, viewGroup, false);
    }

    public void A15() {
        super.A15();
        AnonymousClass2Ao r0 = this.A0H;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void A18(Bundle bundle, View view) {
        C16050sL A052 = C16050sL.A05(A04().getString("extra_community_jid"));
        AnonymousClass00B.A06(A052);
        this.A0C = this.A03.A00(A0D(), new RunnableRunnableShape4S0200000_I0_2(this, 9, A052), new RunnableRunnableShape4S0200000_I0_2(this, 10, A052));
        C004601z.A0E(view, R.id.switch_subgroup_bottom_sheet_close_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 7));
        ((TextView) C004601z.A0E(view, R.id.community_name)).setText(this.A0G.A08(this.A0F.A0A(A052)));
        this.A0H = this.A0I.A04(A02(), "add-groups-to-community");
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(view, R.id.recycler_view);
        A02();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C55302jH r3 = new C55302jH(this, A052);
        this.A00 = new C020009i(new AnonymousClass3T9(r3, this.A0N), C56102ky.class);
        recyclerView.setAdapter(r3);
        HashSet hashSet = new HashSet();
        if (this.A0A.A0C(A052)) {
            hashSet.add(new C56102ky(0, (Object) null));
        }
        hashSet.add(new C56102ky(2, (Object) null));
        C020009i r6 = this.A00;
        Class cls = r6.A08;
        Object[] array = hashSet.toArray((Object[]) Array.newInstance(cls, hashSet.size()));
        r6.A03();
        if (array.length != 0) {
            int A002 = r6.A00(array);
            int i2 = r6.A03;
            if (i2 == 0) {
                r6.A06 = array;
                r6.A03 = A002;
                r6.A05.ASG(0, A002);
            } else {
                C07610cB r1 = r6.A05;
                boolean z2 = r1 instanceof AnonymousClass0Fv;
                boolean z3 = !z2;
                if (z3) {
                    r6.A03();
                    if (!z2) {
                        AnonymousClass0Fv r0 = r6.A04;
                        if (r0 == null) {
                            r0 = new AnonymousClass0Fv(r1);
                            r6.A04 = r0;
                        }
                        r6.A05 = r0;
                    }
                }
                r6.A07 = r6.A06;
                int i3 = 0;
                r6.A02 = 0;
                r6.A01 = i2;
                r6.A06 = (Object[]) Array.newInstance(cls, i2 + A002 + 10);
                r6.A00 = 0;
                while (true) {
                    int i4 = r6.A02;
                    int i5 = r6.A01;
                    if (i4 >= i5 && i3 >= A002) {
                        break;
                    } else if (i4 == i5) {
                        int i6 = A002 - i3;
                        System.arraycopy(array, i3, r6.A06, r6.A00, i6);
                        int i7 = r6.A00 + i6;
                        r6.A00 = i7;
                        r6.A03 += i6;
                        r6.A05.ASG(i7 - i6, i6);
                        break;
                    } else if (i3 == A002) {
                        int i8 = i5 - i4;
                        System.arraycopy(r6.A07, i4, r6.A06, r6.A00, i8);
                        r6.A00 += i8;
                        break;
                    } else {
                        Object obj = r6.A07[i4];
                        Object obj2 = array[i3];
                        int compare = r6.A05.compare(obj, obj2);
                        if (compare > 0) {
                            Object[] objArr = r6.A06;
                            int i9 = r6.A00;
                            int i10 = i9 + 1;
                            r6.A00 = i10;
                            objArr[i9] = obj2;
                            r6.A03++;
                            i3++;
                            r6.A05.ASG(i10 - 1, 1);
                        } else if (compare != 0 || !r6.A05.A02(obj, obj2)) {
                            Object[] objArr2 = r6.A06;
                            int i11 = r6.A00;
                            r6.A00 = i11 + 1;
                            objArr2[i11] = obj;
                            r6.A02++;
                        } else {
                            Object[] objArr3 = r6.A06;
                            int i12 = r6.A00;
                            r6.A00 = i12 + 1;
                            objArr3[i12] = obj2;
                            i3++;
                            r6.A02++;
                            if (!r6.A05.A01(obj, obj2)) {
                                C07610cB r2 = r6.A05;
                                r2.AOI(r2.A00(obj, obj2), r6.A00 - 1, 1);
                            }
                        }
                    }
                }
                r6.A07 = null;
                if (z3) {
                    r6.A02();
                }
            }
        }
        ((AnonymousClass2AS) new C006602z((AnonymousClass04o) new IDxFactoryShape55S0200000_2_I0(A052, 1, this.A02), (C001500q) this).A01(AnonymousClass2AS.class)).A0o.A0A(this, new IDxObserverShape36S0200000_2_I0(A052, 1, this));
    }
}
