package com.obwhatsapp.status.playback.fragment;

import X.AnonymousClass01V;
import X.AnonymousClass1L1;
import X.C14870pt;
import X.C17090uW;
import X.C17220uj;
import X.C41831wj;
import android.content.DialogInterface;

public class OpenLinkDialogFragment extends Hilt_OpenLinkDialogFragment {
    public C14870pt A00;
    public C17090uW A01;
    public AnonymousClass01V A02;
    public AnonymousClass1L1 A03;
    public C41831wj A04;
    public C17220uj A05;

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C41831wj r0 = this.A04;
        if (r0 != null) {
            r0.APi();
        }
    }
}
