package X;

import android.util.Pair;
import android.view.ViewGroup;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.obwhatsapp.yo.SS;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.36e  reason: invalid class name and case insensitive filesystem */
public class C608036e extends C16690tT {
    public int A00;
    public final C16460t6 A01;
    public final AnonymousClass128 A02;
    public final AnonymousClass184 A03;
    public final AnonymousClass11G A04;
    public final UserJid A05;
    public final C28381Vw A06;
    public final AnonymousClass1RV A07;
    public final C23631Ct A08;
    public final AnonymousClass01D A09;
    public final AnonymousClass01D A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C608036e(C16460t6 r2, AnonymousClass128 r3, AnonymousClass184 r4, AnonymousClass11G r5, UserJid userJid, C28381Vw r7, AnonymousClass1RV r8, StatusPlaybackContactFragment statusPlaybackContactFragment, C23631Ct r10, AnonymousClass01D r11, AnonymousClass01D r12, boolean z2, boolean z3) {
        super(statusPlaybackContactFragment, true);
        this.A04 = r5;
        this.A08 = r10;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A09 = r11;
        this.A0A = r12;
        this.A07 = r8;
        this.A06 = r7;
        this.A0B = z2;
        this.A05 = userJid;
        this.A0C = z3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass11G r0 = this.A04;
        UserJid userJid = this.A05;
        C30991dI A062 = r0.A06(userJid);
        List A012 = this.A02.A01(userJid);
        if (A062 != null) {
            C28381Vw r1 = this.A06;
            if (r1 != null) {
                C16740tZ A002 = C16460t6.A00(this.A01, r1);
                if (A002 != null) {
                    Iterator it = A012.iterator();
                    while (it.hasNext()) {
                        if (C13680ns.A0V(it).A0I < A002.A0I) {
                            this.A00++;
                        }
                    }
                }
            } else if (this.A0B) {
                Iterator it2 = A012.iterator();
                while (it2.hasNext()) {
                    if (!A062.A0D(C13680ns.A0V(it2))) {
                        this.A00++;
                    }
                }
            }
            HashMap A0x = AnonymousClass000.A0x();
            Iterator it3 = A012.iterator();
            while (it3.hasNext()) {
                C16740tZ A0V = C13680ns.A0V(it3);
                if (C16030sJ.A0P(userJid)) {
                    A0x.put(Long.valueOf(A0V.A13), this.A03.A00(A0V));
                }
            }
            if (this.A0C) {
                Iterator it4 = A012.iterator();
                while (it4.hasNext()) {
                    C16740tZ A0V2 = C13680ns.A0V(it4);
                    if (A0V2.A10 == 2) {
                        this.A07.A00(A0V2);
                    }
                }
            }
            return C13690nt.A0I(A012, A0x);
        }
        return C13690nt.A0I(Collections.emptyList(), Collections.emptyMap());
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) A04(StatusPlaybackContactFragment.class);
        if (statusPlaybackContactFragment != null) {
            List list = (List) pair.first;
            int i2 = this.A00;
            StringBuilder A0r = AnonymousClass000.A0r("playbackFragment/onMessagesLoaded ");
            C13700nu.A0b(A0r, list);
            A0r.append(" messages; ");
            A0r.append(statusPlaybackContactFragment);
            C13680ns.A1V(A0r);
            AnonymousClass2B0 r2 = statusPlaybackContactFragment.A03;
            AnonymousClass00B.A07(r2, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
            statusPlaybackContactFragment.A0k = list;
            SS.collectStories(list, statusPlaybackContactFragment);
            statusPlaybackContactFragment.A0l = (Map) pair.second;
            statusPlaybackContactFragment.A1M();
            if (!list.isEmpty()) {
                if (i2 < list.size()) {
                    statusPlaybackContactFragment.A00 = i2;
                }
                C41821wi A1K = statusPlaybackContactFragment.A1K((C16740tZ) list.get(statusPlaybackContactFragment.A00));
                ViewGroup viewGroup = r2.A07;
                viewGroup.removeAllViews();
                viewGroup.addView(A1K.A00);
                r2.A02.setVisibility(8);
                if (statusPlaybackContactFragment.A00) {
                    if (statusPlaybackContactFragment.A0k != null) {
                        int i3 = statusPlaybackContactFragment.A00;
                        statusPlaybackContactFragment.A00 = -1;
                        if (i3 == -1) {
                            i3 = 0;
                        }
                        statusPlaybackContactFragment.A1N(i3);
                    }
                    statusPlaybackContactFragment.A1Q(statusPlaybackContactFragment.A1J(), 0, statusPlaybackContactFragment.A01);
                    return;
                }
                return;
            }
            C43211zc r22 = (C43211zc) statusPlaybackContactFragment.A0C();
            if (r22 != null) {
                ((StatusPlaybackActivity) r22).A37(0, statusPlaybackContactFragment.A0S.getRawString(), 0);
            }
        }
    }
}
