package com.obwhatsapp.mentions;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass2VV;
import X.C16000sG;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16320sq;
import X.C16460t6;
import X.C17200uh;
import X.C18190wI;
import X.C19990zK;
import X.C25781Lc;
import X.C28031Ub;
import X.C30661ck;
import X.C46172Ct;
import X.C46182Cu;
import X.C55502ji;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxDObserverShape31S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.Conversation;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class MentionPickerView extends AnonymousClass2VV {
    public RecyclerView A00;
    public C16040sK A01;
    public C16000sG A02;
    public C18190wI A03;
    public C16080sP A04;
    public C17200uh A05;
    public AnonymousClass013 A06;
    public C16460t6 A07;
    public C16070sO A08;
    public C16050sL A09;
    public UserJid A0A;
    public C46172Ct A0B;
    public C19990zK A0C;
    public C55502ji A0D;
    public C25781Lc A0E;
    public C16320sq A0F;
    public boolean A0G;
    public boolean A0H;

    public MentionPickerView(Context context) {
        super(context);
        A00();
    }

    public MentionPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public MentionPickerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        A00();
    }

    public void A05() {
        ArrayList arrayList = new ArrayList();
        C16050sL r1 = this.A09;
        if (r1 != null) {
            C28031Ub it = this.A08.A07.A04(r1).A04().iterator();
            while (it.hasNext()) {
                C16040sK r0 = this.A01;
                UserJid userJid = ((C30661ck) it.next()).A03;
                if (!r0.A0I(userJid)) {
                    arrayList.add(this.A02.A0A(userJid));
                }
            }
        }
        C55502ji r02 = this.A0D;
        r02.A06 = arrayList;
        r02.A01();
    }

    public View getContentView() {
        return this.A00;
    }

    public void setVisibilityChangeListener(C46172Ct r1) {
        this.A0B = r1;
    }

    public void setup(C46182Cu r13, Bundle bundle) {
        C16050sL A052 = C16050sL.A05(bundle.getString("ARG_GID"));
        boolean z2 = bundle.getBoolean("ARG_IS_DARK_THEME");
        boolean z3 = bundle.getBoolean("ARG_HIDE_END_DIVIDER");
        boolean z4 = bundle.getBoolean("ARG_WITH_BACKGROUND");
        this.A09 = A052;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        this.A00 = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        setVisibility(8);
        if (z4) {
            if (!z2) {
                Conversation.mentionPanelBK(this, R.drawable.ib_new_expanded_top);
            } else {
                setBackgroundColor(AnonymousClass00T.A00(getContext(), R.color.color054c));
            }
        }
        C16040sK r0 = this.A01;
        AnonymousClass00B.A06(r0);
        r0.A0B();
        this.A0A = r0.A05;
        Context context = getContext();
        C19990zK r8 = this.A0C;
        C16040sK r2 = this.A01;
        C17200uh r5 = this.A05;
        this.A0D = new C55502ji(context, r2, this.A03, this.A04, r5, this.A06, r13, r8, this.A0E, z2, z3);
        A05();
        this.A0D.A01.registerObserver(new IDxDObserverShape31S0100000_2_I0(this, 2));
        this.A00.setAdapter(this.A0D);
    }
}
