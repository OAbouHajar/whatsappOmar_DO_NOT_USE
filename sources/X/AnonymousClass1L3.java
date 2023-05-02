package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape0S0600000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.1L3  reason: invalid class name */
public class AnonymousClass1L3 {
    public final C19980zJ A00;
    public final C14870pt A01;
    public final C17230uk A02;
    public final C17750va A03;
    public final C16000sG A04;
    public final C16080sP A05;
    public final AnonymousClass01V A06;
    public final C15810rt A07;
    public final C217915l A08;
    public final C17020u3 A09;
    public final C16320sq A0A;

    public AnonymousClass1L3(C19980zJ r1, C14870pt r2, C17230uk r3, C17750va r4, C16000sG r5, C16080sP r6, AnonymousClass01V r7, C15810rt r8, C217915l r9, C17020u3 r10, C16320sq r11) {
        this.A01 = r2;
        this.A0A = r11;
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A08 = r9;
        this.A02 = r3;
        this.A03 = r4;
        this.A09 = r10;
    }

    public void A00(Activity activity, AnonymousClass1L4 r8, C17750va r9, C17800vf r10, Integer num, List list) {
        Intent intent;
        r8.A02 = null;
        r8.A01 = 0;
        r8.A00 = 0;
        r8.A03 = false;
        String obj = UUID.randomUUID().toString();
        r8.A02 = obj;
        boolean z2 = true;
        r9.A01(1, num, (Long) null, obj);
        int A032 = this.A02.A0D.A03(C16620tM.A02, 1990);
        if (list.size() > A032) {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder("Only ");
        sb.append(A032);
        sb.append(" groups can be added to a community during creation.");
        AnonymousClass00B.A0B(sb.toString(), z2);
        if (list.size() > A032) {
            list = list.subList(0, A032);
        }
        if (!r10.A00((Object) null, "community") || num.intValue() == 6) {
            intent = new Intent();
            intent.setClassName(activity.getPackageName(), "com.obwhatsapp.community.CommunityNUXActivity");
            ArrayList arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Jid) it.next()).getRawString());
            }
            intent.putExtra("CommunityNUXActivity_groups_to_be_added", arrayList2);
        } else {
            intent = new C14750ph().A12(activity, list);
        }
        activity.startActivity(intent);
    }

    public void A01(View view, C000900k r3, GroupJid groupJid) {
        A02(view, r3.AGM(), r3, groupJid);
    }

    public void A02(View view, AnonymousClass02C r12, C001300o r13, GroupJid groupJid) {
        GroupJid groupJid2 = groupJid;
        View view2 = view;
        C001300o r6 = r13;
        if (this.A07.A0I(groupJid)) {
            A03(view, r13, view.getContext().getString(R.string.str04fa));
        } else if (C16050sL.A03(groupJid) != null) {
            if (!this.A08.A00(this.A04.A0A(groupJid))) {
                ProgressDialogFragment A012 = ProgressDialogFragment.A01(0, R.string.str13db);
                A012.A1G(r12, (String) null);
                this.A0A.Acp(new RunnableRunnableShape0S0600000_I0(this, groupJid2, A012, r6, view2, r12, 1), "checkParticipating");
                return;
            }
            Context context = view.getContext();
            this.A00.A06(context, C14750ph.A0M(context, groupJid));
        }
    }

    public final void A03(View view, C001300o r8, String str) {
        C32291fz A012 = C32291fz.A01(view, str, 0);
        A012.A07(AnonymousClass00T.A00(view.getContext(), R.color.color0735));
        C001300o r1 = r8;
        new C14700pc(r1, A012, this.A06, Collections.emptyList(), false).A01();
    }
}
