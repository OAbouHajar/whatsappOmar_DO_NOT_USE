package com.obwhatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass0PG;
import X.AnonymousClass2GO;
import X.AnonymousClass3Oe;
import X.C14870pt;
import X.C32241fu;
import X.C91364fn;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape0S0201000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class SingleChoiceListDialogFragment extends Hilt_SingleChoiceListDialogFragment {
    public C14870pt A00;
    public AnonymousClass2GO A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public static /* synthetic */ void A01(DialogInterface dialogInterface, Bundle bundle, SingleChoiceListDialogFragment singleChoiceListDialogFragment, int i2, int i3) {
        singleChoiceListDialogFragment.A01.AXG(bundle.getStringArray("items"), i2, i3);
        singleChoiceListDialogFragment.A02.set(true);
        dialogInterface.dismiss();
    }

    public void A16(Context context) {
        super.A16(context);
        try {
            this.A01 = (AnonymousClass2GO) context;
        } catch (ClassCastException unused) {
            StringBuilder A0o = AnonymousClass000.A0o();
            AnonymousClass000.A1I(context, A0o);
            throw new ClassCastException(AnonymousClass000.A0h(" must implement SingleChoiceListListener", A0o));
        }
    }

    public Dialog A1B(Bundle bundle) {
        String str;
        int length;
        int length2;
        Bundle bundle2 = this.A05;
        if (bundle2.containsKey("dialog_id")) {
            int i2 = bundle2.getInt("dialog_id");
            this.A02.set(false);
            C32241fu A002 = C32241fu.A00(A0C());
            A002.setTitle(bundle2.getString("title"));
            A002.setPositiveButton(R.string.str0394, (DialogInterface.OnClickListener) null);
            if (bundle2.containsKey("items") && bundle2.containsKey("multi_line_list_items_key")) {
                str = "Cannot provide both items and multi_line_list_items_key";
            } else if (bundle2.containsKey("items") || bundle2.containsKey("multi_line_list_items_key")) {
                int i3 = bundle2.getInt("selected_item_index", -1);
                if (bundle2.containsKey("items")) {
                    A002.A05(new IDxCListenerShape0S0201000_2_I1(bundle2, i2, this, 0), bundle2.getStringArray("items"), i3);
                } else if (bundle2.containsKey("multi_line_list_items_key")) {
                    ArrayList A0u = AnonymousClass000.A0u();
                    String[] stringArray = bundle2.getStringArray("multi_line_list_items_key");
                    if (stringArray != null) {
                        String[] stringArray2 = bundle2.getStringArray("multi_line_list_item_values_key");
                        boolean[] booleanArray = bundle2.getBooleanArray("list_item_enabled_key");
                        String string = bundle2.getString("disabled_item_toast_key");
                        if (stringArray2 == null || (length = stringArray.length) == (length2 = stringArray2.length)) {
                            for (int i4 = 0; i4 < stringArray.length; i4++) {
                                HashMap A0x = AnonymousClass000.A0x();
                                A0x.put("line1", stringArray[i4]);
                                A0x.put("line2", stringArray2 != null ? stringArray2[i4] : null);
                                A0u.add(A0x);
                            }
                            AnonymousClass3Oe r9 = new AnonymousClass3Oe(A0u(), this, A0u, new int[]{16908308, 16908309}, new String[]{"line1", "line2"}, stringArray, booleanArray, i3);
                            C91364fn r17 = new C91364fn(this, string, stringArray, booleanArray, i2);
                            AnonymousClass0PG r0 = A002.A01;
                            r0.A0D = r9;
                            r0.A05 = r17;
                            r0.A00 = i3;
                            r0.A0L = true;
                        } else {
                            StringBuilder A0r = AnonymousClass000.A0r("keys.length = ");
                            A0r.append(length);
                            A0r.append(" ≠ ");
                            A0r.append(length2);
                            throw AnonymousClass000.A0T(AnonymousClass000.A0h(" values.length", A0r));
                        }
                    } else {
                        throw AnonymousClass000.A0T("Must provide multi_line_list_items_key");
                    }
                }
                return A002.create();
            } else {
                str = "Must provide either items or multi_line_list_items_key";
            }
        } else {
            str = "dialog_id should be provided.";
        }
        throw AnonymousClass000.A0V(str);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Bundle bundle = this.A05;
        if (this.A01 != null && !this.A02.get() && bundle.containsKey("dialog_id")) {
            this.A01.APr(bundle.getInt("dialog_id"));
        }
    }
}
