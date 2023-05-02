package com.obwhatsapp;

import X.AnonymousClass050;
import X.AnonymousClass3MG;
import X.AnonymousClass5QV;
import X.C001000l;
import X.C100594vt;
import X.C13680ns;
import X.C16030sJ;
import X.C42821yj;
import X.C449726l;
import X.C453428a;
import X.C63393Ht;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.obwhatsapp.calling.views.JoinableEducationDialogFragment;
import com.obwhatsapp.registration.ChangeNumberNotifyContacts;
import com.obwhatsapp.registration.NotifyContactsSelector;
import com.obwhatsapp.text.ReadMoreTextView;

public class IDxTSpanShape54S0100000_2_I1 extends AnonymousClass3MG {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape54S0100000_2_I1(Context context, C63393Ht r3, int i2) {
        super(context, i2);
        this.A01 = 5;
        this.A00 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape54S0100000_2_I1(Context context, GroupCallParticipantPicker groupCallParticipantPicker) {
        super(context, R.color.color04f8);
        this.A01 = 2;
        this.A00 = groupCallParticipantPicker;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape54S0100000_2_I1(Context context, Object obj, int i2) {
        super(context);
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape54S0100000_2_I1(Runnable runnable, int i2) {
        super(i2, i2, i2);
        this.A01 = 6;
        this.A00 = runnable;
    }

    public void onClick(View view) {
        switch (this.A01) {
            case 0:
                C449726l r3 = (C449726l) this.A00;
                PostcodeChangeBottomSheet postcodeChangeBottomSheet = new PostcodeChangeBottomSheet(new C100594vt(r3), true);
                r3.A0Z = postcodeChangeBottomSheet;
                String str = (String) r3.A0b.A0A.A01();
                postcodeChangeBottomSheet.A08 = str;
                WaEditText waEditText = postcodeChangeBottomSheet.A04;
                if (waEditText != null) {
                    waEditText.setText(str);
                }
                C453428a.A01(r3.A0Z, r3.AGM());
                return;
            case 1:
                ((View.OnClickListener) this.A00).onClick(view);
                return;
            case 2:
                AnonymousClass050 A0O = C13680ns.A0O((C001000l) this.A00);
                A0O.A0C(JoinableEducationDialogFragment.A01(), (String) null);
                A0O.A02();
                return;
            case 3:
                C42821yj r2 = (C42821yj) this.A00;
                r2.A3r.A01(3);
                r2.A0p(true);
                return;
            case 4:
                ChangeNumberNotifyContacts changeNumberNotifyContacts = (ChangeNumberNotifyContacts) this.A00;
                Intent intent = new Intent(changeNumberNotifyContacts, NotifyContactsSelector.class);
                intent.putStringArrayListExtra("selected", C16030sJ.A06(changeNumberNotifyContacts.A0F));
                changeNumberNotifyContacts.startActivityForResult(intent, 1);
                return;
            case 5:
                C63393Ht r1 = (C63393Ht) this.A00;
                ReadMoreTextView readMoreTextView = r1.A04;
                AnonymousClass5QV r0 = readMoreTextView.A02;
                if (r0 == null || !r0.AOY()) {
                    readMoreTextView.setExpanded(true);
                    r1.A03 = 0;
                    r1.A01 = 0;
                    readMoreTextView.A08.removeCallbacks(readMoreTextView.A0A);
                    return;
                }
                return;
            default:
                ((Runnable) this.A00).run();
                return;
        }
    }
}
