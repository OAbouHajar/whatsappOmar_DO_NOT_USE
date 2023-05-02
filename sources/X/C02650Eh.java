package X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Eh  reason: invalid class name and case insensitive filesystem */
public abstract class C02650Eh extends AnonymousClass04B {
    public int A00;
    public int A01;
    public LayoutInflater A02;

    @Deprecated
    public C02650Eh(Context context, int i2) {
        super(context, (Cursor) null, true);
        this.A00 = i2;
        this.A01 = i2;
        this.A02 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View A01(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A02.inflate(this.A00, viewGroup, false);
    }

    public View A02(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A02.inflate(this.A01, viewGroup, false);
    }
}
