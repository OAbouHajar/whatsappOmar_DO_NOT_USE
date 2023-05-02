package com.obwhatsapp.yo.x;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

final class dh implements AdapterView.OnItemLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ df f111a;

    dh(df dfVar) {
        this.f111a = dfVar;
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i2, long j2) {
        Toast.makeText(this.f111a.f108a, (CharSequence) this.f111a.f108a.f116e.get(i2), 1).show();
        return true;
    }
}
