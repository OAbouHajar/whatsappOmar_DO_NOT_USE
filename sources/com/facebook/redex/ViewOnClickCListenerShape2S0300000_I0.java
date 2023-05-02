package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass1L3;
import X.AnonymousClass1V8;
import X.AnonymousClass1Vt;
import X.AnonymousClass29T;
import X.AnonymousClass2B0;
import X.AnonymousClass2DF;
import X.AnonymousClass2JC;
import X.AnonymousClass39D;
import X.AnonymousClass3oS;
import X.C001000l;
import X.C13680ns;
import X.C14550pN;
import X.C14570pP;
import X.C14600pS;
import X.C14670pZ;
import X.C15830rv;
import X.C16010sH;
import X.C16030sJ;
import X.C16050sL;
import X.C16490t9;
import X.C16740tZ;
import X.C16760tb;
import X.C18020w1;
import X.C18030w2;
import X.C18040w3;
import X.C19980zJ;
import X.C228919r;
import X.C28381Vw;
import X.C38621r6;
import X.C45752Au;
import X.C48962Qc;
import X.C49182Rm;
import X.C55632k4;
import X.C75323ry;
import X.C84914Mj;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.community.CommunitySubgroupsBottomSheet;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ViewOnClickCListenerShape2S0300000_I0 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickCListenerShape2S0300000_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                ((C49182Rm) this.A00).A03.A1g(((C16010sH) this.A01).A09(), ((AnonymousClass3oS) this.A02).A00);
                return;
            case 1:
                AnonymousClass1V8 r4 = (AnonymousClass1V8) this.A00;
                C16010sH r3 = (C16010sH) this.A01;
                AnonymousClass39D r2 = (AnonymousClass39D) this.A02;
                if (!r4.A3e(r3) || r3.A0g) {
                    if (r4.A3e(r3) && r3.A0g) {
                        r2.A00(r4.getString(R.string.str178d), true);
                    }
                    r4.A3W(r3);
                    return;
                }
                r4.A3X(r3);
                return;
            case 2:
                AnonymousClass1L3 r1 = ((C48962Qc) this.A00).A0C;
                C16050sL r22 = (C16050sL) ((C16010sH) this.A02).A08(C16050sL.class);
                AnonymousClass02C AGM = ((C001000l) this.A01).AGM();
                r1.A03.A00(r22, 1);
                CommunitySubgroupsBottomSheet A012 = CommunitySubgroupsBottomSheet.A01(r22);
                AnonymousClass050 r12 = new AnonymousClass050(AGM);
                r12.A0C(A012, "SUBGROUP_PICKER_TAG");
                r12.A02();
                return;
            case 3:
                AnonymousClass2DF r42 = (AnonymousClass2DF) this.A00;
                Object obj = this.A01;
                Set set = (Set) this.A02;
                ((C14570pP) r42.A0G).A05.Aco(new RunnableRunnableShape5S0200000_I0_3(r42, 18, obj));
                C16490t9 r32 = r42.A0W;
                C18030w2 r5 = r42.A0U;
                C18040w3 r6 = r42.A0X;
                if (!set.isEmpty()) {
                    Iterator it = set.iterator();
                    C16740tZ r43 = null;
                    C16740tZ r9 = null;
                    byte b2 = -1;
                    while (true) {
                        if (it.hasNext()) {
                            C16740tZ r0 = (C16740tZ) it.next();
                            if (b2 == -1) {
                                b2 = r0.A10;
                                r9 = r0;
                            }
                            if (b2 != r0.A10) {
                            }
                        } else {
                            r43 = r9;
                        }
                    }
                    Iterator it2 = set.iterator();
                    C15830rv r7 = null;
                    while (it2.hasNext()) {
                        C28381Vw r02 = C13680ns.A0V(it2).A11;
                        if (r7 == null) {
                            r7 = r02.A00;
                        } else if (!r7.equals(r02.A00)) {
                            return;
                        }
                    }
                    if (r7 != null) {
                        C75323ry r23 = new C75323ry();
                        r23.A00 = Boolean.valueOf(C16030sJ.A0L(r7));
                        r23.A03 = Long.valueOf((long) set.size());
                        r23.A02 = 1;
                        r23.A04 = r6.A03(r7.getRawString());
                        if (r43 != null) {
                            r23.A01 = Integer.valueOf(C18020w1.A02(r5, r43));
                        }
                        r32.A06(r23);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AnonymousClass2JC r72 = (AnonymousClass2JC) this.A00;
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                Object obj2 = this.A02;
                Iterator it3 = abstractCollection.iterator();
                while (it3.hasNext()) {
                    r72.A0L.A1L.A04((C15830rv) it3.next(), 0, false);
                }
                r72.A0L.A2M.Acl(new RunnableRunnableShape0S0300000_I0(r72, abstractCollection, obj2, 46));
                return;
            case 5:
                Context context = ((View) this.A00).getContext();
                ((C228919r) this.A01).ALy(context, (C14600pS) C19980zJ.A01(context, C14550pN.class), (AnonymousClass1Vt) this.A02);
                return;
            case 6:
                return;
            case 7:
                AnonymousClass29T.A00((Activity) this.A00, 130);
                ((Runnable) this.A01).run();
                return;
            case 10:
                Set<C16740tZ> set2 = (Set) this.A01;
                set2.size();
                ((C14670pZ) this.A02).AG9(R.string.str06b9, 2000, false).A01();
                C16760tb r52 = ((C45752Au) this.A00).A02;
                if (r52.A1S.A00()) {
                    for (C16740tZ r33 : set2) {
                        if (!C38621r6.A0o(r33)) {
                            C28381Vw r13 = r33.A11;
                            if (r13.A02 && C16030sJ.A0Q(r13.A00)) {
                                r52.A1T.A0D.A02(r33, (Long) null, (String) null, 20);
                            }
                        }
                    }
                }
                r52.A0W(set2, true);
                return;
            case 11:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = ((C55632k4) this.A00).A01;
                viewSharedContactArrayActivity.A02.A01(viewSharedContactArrayActivity, (C16010sH) this.A02, 15, false);
                return;
            case 12:
                Object obj3 = this.A02;
                ViewSharedContactArrayActivity viewSharedContactArrayActivity2 = ((C55632k4) this.A00).A01;
                viewSharedContactArrayActivity2.A04.A01(viewSharedContactArrayActivity2, (UserJid) this.A01, ((C84914Mj) obj3).A03);
                return;
            case 13:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                CallInfo callInfo = (CallInfo) this.A02;
                View view2 = voipActivityV2.A0K;
                AnonymousClass00B.A04(view2);
                view2.setVisibility(8);
                Log.i("VoipActivityV2 vm call back onclick");
                ArrayList arrayList = new ArrayList();
                for (C15830rv A08 : (List) this.A01) {
                    C16010sH A082 = voipActivityV2.A1E.A08(A08);
                    if (A082 != null) {
                        arrayList.add(A082);
                    }
                }
                if (!arrayList.isEmpty()) {
                    voipActivityV2.A11.A03(voipActivityV2, callInfo.groupJid, arrayList, 30, callInfo.videoEnabled);
                    return;
                }
                return;
            default:
                ((StatusPlaybackContactFragment) this.A00).A1O((C16010sH) this.A02, (AnonymousClass2B0) this.A01);
                return;
        }
    }
}
