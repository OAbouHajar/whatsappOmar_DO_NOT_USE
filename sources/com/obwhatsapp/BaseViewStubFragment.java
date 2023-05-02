package com.obwhatsapp;

import X.AnonymousClass013;
import X.C14710pd;
import X.C16620tM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

public abstract class BaseViewStubFragment extends Hilt_BaseViewStubFragment {
    public ViewStub A00;
    public AnonymousClass013 A01;
    public C14710pd A02;
    public boolean A03 = false;

    public void A0k() {
        super.A0k();
        this.A03 = false;
    }

    public void A0o(boolean z2) {
        ViewStub viewStub;
        super.A0o(z2);
        if (z2 && (viewStub = this.A00) != null && !this.A03) {
            viewStub.inflate();
            this.A03 = true;
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout02a9, viewGroup, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.fragmentViewStub);
        this.A00 = viewStub;
        viewStub.setLayoutResource(R.layout.layout00e7);
        if (!this.A03 && (this.A0j || !this.A02.A0E(C16620tM.A02, 128))) {
            this.A00.inflate();
            this.A03 = true;
        }
        return inflate;
    }
}
