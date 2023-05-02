package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass15U;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C17220uj;
import X.C19980zJ;
import X.C24961Hy;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.Random;

public class ChatWithBusinessInDirectoryDialogFragment extends Hilt_ChatWithBusinessInDirectoryDialogFragment implements View.OnClickListener {
    public C19980zJ A00;
    public C24961Hy A01;
    public AnonymousClass15U A02;
    public C17220uj A03;
    public boolean A04;

    public static ChatWithBusinessInDirectoryDialogFragment A01(boolean z2) {
        ChatWithBusinessInDirectoryDialogFragment chatWithBusinessInDirectoryDialogFragment = new ChatWithBusinessInDirectoryDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putBoolean("arg_conversation_stared_by_me", z2);
        chatWithBusinessInDirectoryDialogFragment.A0T(A0D);
        return chatWithBusinessInDirectoryDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        this.A04 = A04().getBoolean("arg_conversation_stared_by_me");
        View inflate = View.inflate(A02(), R.layout.layout037c, (ViewGroup) null);
        boolean z2 = this.A04;
        int i2 = R.string.str0195;
        if (z2) {
            i2 = R.string.str053c;
        }
        C13680ns.A0L(inflate, R.id.message).setText(i2);
        View A0E = C004601z.A0E(inflate, R.id.title);
        if (this.A04) {
            A0E.setVisibility(8);
        }
        View A0E2 = C004601z.A0E(inflate, R.id.btn_negative_vertical);
        View A0E3 = C004601z.A0E(inflate, R.id.btn_negative_horizontal);
        View A0E4 = C004601z.A0E(inflate, R.id.btn_positive);
        if (this.A04) {
            A0E2.setVisibility(8);
        } else {
            A0E3.setVisibility(4);
        }
        A0E4.setOnClickListener(this);
        A0E3.setOnClickListener(this);
        A0E2.setOnClickListener(this);
        C32241fu A002 = C32241fu.A00(A02());
        A002.setView(inflate);
        A002.A07(true);
        return A002.create();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_negative_horizontal) {
            this.A00.Act(A02(), this.A03.A05("security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby"));
        } else if (id == R.id.btn_negative_vertical) {
            C24961Hy r1 = this.A01;
            r1.A00 = 9;
            Random random = r1.A01;
            if (random == null) {
                random = new Random();
                r1.A01 = random;
            }
            random.nextLong();
            A02();
            A02();
            throw C13680ns.A0m();
        }
        A1C();
    }
}
