package X;

import com.obwhatsapp.R;

/* renamed from: X.4Zr  reason: invalid class name and case insensitive filesystem */
public class C88044Zr {
    public final int A00;
    public final int A01;
    public final int A02;

    public C88044Zr(int i2, int i3, int i4) {
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public static C88044Zr A00(C16740tZ r3, boolean z2) {
        int i2;
        int i3;
        int i4;
        if (C30921dB.A00(r3.A10)) {
            i2 = R.string.str0d3e;
            if (z2) {
                i2 = R.string.str0d3d;
            }
            i3 = R.drawable.msg_status_ephemeral_ring;
            i4 = R.color.color07d0;
        } else {
            int i5 = R.string.str0d43;
            if (z2) {
                i5 = R.string.str0d42;
            }
            i3 = R.drawable.msg_status_mic;
            i4 = R.color.color0559;
        }
        return new C88044Zr(i2, i3, i4);
    }
}
