package com.obwhatsapp.yo.autoschedreply;

import X.C005602k;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.obwhatsapp.yo.yo;

public class AutoMessageView extends C005602k {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f632a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f633b;

    /* renamed from: c  reason: collision with root package name */
    public final SwitchCompat f634c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f635d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f636e;

    public AutoMessageView(View view, Auto_message auto_message) {
        super(view);
        this.f632a = (TextView) view.findViewById(yo.getID("msg_received", "id"));
        this.f633b = (TextView) view.findViewById(yo.getID("reply_message", "id"));
        this.f634c = (SwitchCompat) view.findViewById(yo.getID("img_disable_toggle", "id"));
        this.f635d = (TextView) view.findViewById(yo.getID("automsgtv_edit_item", "id"));
        this.f636e = (TextView) view.findViewById(yo.getID("automsgtv_delete_item", "id"));
    }
}
