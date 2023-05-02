package com.obwhatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass1V8;
import X.AnonymousClass39D;
import X.AnonymousClass3MF;
import X.AnonymousClass5PE;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15810rt;
import X.C15830rv;
import X.C16010sH;
import X.C16050sL;
import X.C16060sN;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C17110uY;
import X.C17230uk;
import X.C17240ul;
import X.C34911l4;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LinkExistingGroups extends AnonymousClass1V8 implements AnonymousClass5PE {
    public View A00;
    public C17230uk A01;
    public C15810rt A02;
    public C16070sO A03;
    public C17240ul A04;
    public C16050sL A05;
    public C17110uY A06;
    public boolean A07;

    public LinkExistingGroups() {
        this(0);
    }

    public LinkExistingGroups(int i2) {
        this.A07 = false;
        C13680ns.A1G(this, 39);
    }

    public void A1q() {
        if (!this.A07) {
            this.A07 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, this), this);
            this.A06 = C16150sX.A1A(r1);
            this.A02 = C16150sX.A0c(r1);
            this.A04 = C16150sX.A0o(r1);
            this.A03 = C16150sX.A0e(r1);
            this.A01 = (C17230uk) r1.A4I.get();
        }
    }

    public void A3Q(int i2) {
        int i3;
        long j2;
        Object[] A1Z;
        if (x() == null) {
            Log.e("LinkExistingGroups/updateTitle/getSupportActionBar is null");
            return;
        }
        int A39 = A39();
        C005402i x2 = x();
        AnonymousClass013 r4 = this.A0S;
        if (A39 == Integer.MAX_VALUE) {
            i3 = R.plurals.plurals00db;
            j2 = (long) i2;
            A1Z = new Object[1];
            AnonymousClass000.A1M(A1Z, i2, 0);
        } else {
            i3 = R.plurals.plurals00e0;
            j2 = (long) i2;
            A1Z = C13690nt.A1Z();
            AnonymousClass000.A1M(A1Z, i2, 0);
            AnonymousClass000.A1M(A1Z, A39, 1);
        }
        x2.A0I(r4.A0J(A1Z, i3, j2));
    }

    public void A3V(AnonymousClass39D r6, C16010sH r7) {
        TextEmojiLabel textEmojiLabel = r6.A02;
        textEmojiLabel.setSingleLine(false);
        textEmojiLabel.setMaxLines(2);
        C34911l4 r1 = r7.A0G;
        if (!r7.A0J() || r1 == null) {
            super.A3V(r6, r7);
            return;
        }
        int i2 = r1.A00;
        if (i2 == 0) {
            textEmojiLabel.setVisibility(0);
            C16080sP r2 = this.A0L;
            textEmojiLabel.A0I((List) null, (String) r2.A0D.get(r7.A08(C16060sN.class)));
            r6.A01(r7.A0g);
        } else if (i2 == 2) {
            String str = null;
            C16050sL r12 = r1.A01;
            if (r12 != null) {
                C16010sH A0A = this.A0J.A0A(r12);
                str = C13680ns.A0d(this, this.A0L.A0C(A0A), C13680ns.A1b(), 0, R.string.str0c25);
            }
            r6.A00(str, false);
        }
    }

    public void A3b(List list) {
        if (list.isEmpty()) {
            setResult(-10);
            finish();
            return;
        }
        super.A3b(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C34911l4 r0 = C13680ns.A0U(it).A0G;
            if (r0 != null && r0.A00 == 0) {
                return;
            }
        }
        TextView A0L = C13680ns.A0L(A3E(), R.id.disclaimer_warning_text);
        A0L.setText(this.A06.A06(new RunnableRunnableShape17S0100000_I1((Object) this, 42), getString(R.string.str0613), "create_new_group"));
        A0L.setMovementMethod(new AnonymousClass3MF());
    }

    public void AP1() {
        List unmodifiableList = Collections.unmodifiableList(this.A0g);
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = unmodifiableList.iterator();
        while (it.hasNext()) {
            C15830rv r0 = C13680ns.A0U(it).A0E;
            if (r0 != null) {
                A0u.add(r0.getRawString());
            }
        }
        Intent A09 = C13680ns.A09();
        A09.putStringArrayListExtra("selected_jids", C13680ns.A0n(A0u));
        C13680ns.A0r(this, A09);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 150) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 != -1) {
            Log.i("LinkExistingGroups/permissions denied");
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && !this.A0I.A00()) {
            RequestPermissionActivity.A0D(this, R.string.str11b4, R.string.str11b3);
        }
        this.A05 = C16050sL.A05(getIntent().getStringExtra("parent_group_jid"));
    }
}
