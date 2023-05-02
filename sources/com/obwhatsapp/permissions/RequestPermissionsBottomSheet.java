package com.obwhatsapp.permissions;

import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass1BN;
import X.AnonymousClass1ZW;
import X.C001000l;
import X.C004601z;
import X.C14870pt;
import X.C15860rz;
import X.C18450wi;
import X.C19980zJ;
import X.C23071Aj;
import X.C45922Bq;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S1100000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape0S1200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.util.Arrays;

public class RequestPermissionsBottomSheet extends Hilt_RequestPermissionsBottomSheet {
    public C19980zJ A00;
    public C14870pt A01;
    public C23071Aj A02;
    public AnonymousClass01V A03;
    public C15860rz A04;
    public AnonymousClass013 A05;
    public AnonymousClass1BN A06;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout048e, viewGroup, false);
    }

    public void A18(Bundle bundle, View view) {
        Bundle A042 = A04();
        int i2 = A042.getInt("message_id");
        String[] stringArray = A042.getStringArray("permissions");
        boolean z2 = this instanceof NotificationPermissionBottomSheet;
        if (z2) {
            C18450wi.A0H(view, 0);
            View A0E = C004601z.A0E(view, R.id.permission_message);
            C18450wi.A0B(A0E);
            ((TextView) A0E).setText(view.getContext().getString(i2, new Object[]{view.getContext().getString(R.string.str1bd4)}));
        } else {
            TextView textView = (TextView) C004601z.A0E(view, R.id.permission_message);
            if (i2 != 0) {
                textView.setText(i2);
            } else {
                StringBuilder sb = new StringBuilder("there is no message id for ");
                sb.append(Arrays.toString(stringArray));
                Log.e(sb.toString());
                A1C();
            }
        }
        int i3 = A042.getInt("title_id");
        if (z2) {
            C18450wi.A0H(view, 0);
            ((TextView) C004601z.A0E(view, R.id.permission_title)).setText(view.getContext().getString(i3, new Object[]{view.getContext().getString(R.string.str1bd4)}));
        } else if (i3 != 0) {
            ((TextView) C004601z.A0E(view, R.id.permission_title)).setText(i3);
        }
        int i4 = A042.getInt("nth_details_id");
        if (i4 != 0) {
            ((TextView) C004601z.A0E(view, R.id.nth_time_request)).setText(AnonymousClass1ZW.A01(A0J(i4), new Object[0]));
        }
        ImageView imageView = (ImageView) C004601z.A0E(view, R.id.permission_image);
        int i5 = A042.getInt("icon_id");
        if (i5 != 0) {
            imageView.setImageResource(i5);
            imageView.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) C004601z.A0E(view, R.id.line1_image);
        int i6 = A042.getInt("line1_icon_id");
        if (i6 != 0) {
            imageView2.setImageResource(i6);
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = (ImageView) C004601z.A0E(view, R.id.line2_image);
        int i7 = A042.getInt("line2_icon_id");
        if (i7 != 0) {
            imageView3.setImageResource(i7);
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = (ImageView) C004601z.A0E(view, R.id.line3_image);
        int i8 = A042.getInt("line3_icon_id");
        if (i8 != 0) {
            imageView4.setImageResource(i8);
            imageView4.setVisibility(0);
        }
        int i9 = A042.getInt("line1_message_id");
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(view, R.id.line1_message);
        if (i9 != 0) {
            Context A022 = A02();
            C14870pt r8 = this.A01;
            C45922Bq.A08(A022, this.A02.A00("https://www.whatsapp.com/security"), this.A00, r8, textEmojiLabel, this.A03, A0J(i9));
        }
        int i10 = A042.getInt("line2_message_id");
        TextView textView2 = (TextView) C004601z.A0E(view, R.id.line2_message);
        if (i10 != 0) {
            textView2.setText(A0J(i10));
        }
        int i11 = A042.getInt("line3_message_id");
        if (z2) {
            C18450wi.A0H(view, 0);
            View A0E2 = C004601z.A0E(view, R.id.line3_message);
            C18450wi.A0B(A0E2);
            TextView textView3 = (TextView) A0E2;
            if (i11 != 0) {
                textView3.setText(view.getContext().getString(i11, new Object[]{view.getContext().getString(R.string.str1bd4)}));
                textView3.setVisibility(0);
            }
        } else {
            TextView textView4 = (TextView) C004601z.A0E(view, R.id.line3_message);
            if (i11 != 0) {
                textView4.setText(A0J(i11));
                textView4.setVisibility(0);
            }
        }
        String[] stringArray2 = A042.getStringArray("permissions");
        String string = A042.getString("permission_requestor_screen_type");
        boolean z3 = A042.getBoolean("is_first_time_request");
        boolean z4 = A042.getBoolean("should_disable_cancel_on_outside_click");
        boolean z5 = A042.getBoolean("should_hide_cancel_button_on_1st_time");
        View A0E3 = C004601z.A0E(view, R.id.cancel);
        A0E3.setOnClickListener(new ViewOnClickCListenerShape0S1100000_I0(3, string, this));
        if (z4) {
            A1H(false);
        }
        if (z3 && z5) {
            A0E3.setVisibility(8);
        }
        View A0E4 = C004601z.A0E(view, R.id.nth_time_request);
        TextView textView5 = (TextView) C004601z.A0E(view, R.id.submit);
        if (!z3) {
            A0E4.setVisibility(0);
            textView5.setText(R.string.str11cd);
            textView5.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 23));
            return;
        }
        A0E4.setVisibility(8);
        textView5.setOnClickListener(new ViewOnClickCListenerShape0S1200000_I0(this, string, stringArray2, 1));
    }

    public void onCancel(DialogInterface dialogInterface) {
        C001000l A0C = A0C();
        if (A0C != null) {
            A0C.finish();
        }
    }
}
