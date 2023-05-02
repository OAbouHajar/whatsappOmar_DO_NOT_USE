package X;

import android.graphics.Paint;

/* renamed from: X.0KT  reason: invalid class name */
public enum AnonymousClass0KT {
    ;

    public Paint.Join A00() {
        switch (ordinal()) {
            case 0:
                return Paint.Join.MITER;
            case 1:
                return Paint.Join.ROUND;
            case 2:
                return Paint.Join.BEVEL;
            default:
                return null;
        }
    }
}
