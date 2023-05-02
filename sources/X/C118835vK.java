package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: X.5vK  reason: invalid class name and case insensitive filesystem */
public class C118835vK {
    public Bitmap A00;
    public Rect A01;
    public Rect A02;
    public C118895va A03;
    public C119185wg A04;
    public Boolean A05;
    public Float A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public Long A0F;
    public byte[] A0G;
    public byte[] A0H;
    public final int A0I;
    public final int A0J;
    public final Rect A0K;

    public C118835vK(Rect rect, Rect rect2, int i2, int i3) {
        this.A01 = rect;
        this.A0K = rect2;
        this.A0J = i2;
        this.A0I = i3;
    }

    public Object A00(C115885qT r3) {
        int i2 = r3.A00;
        if (i2 == 0) {
            return this.A0G;
        }
        if (i2 == 1) {
            return this.A03;
        }
        if (i2 == 2) {
            return this.A02;
        }
        switch (i2) {
            case 7:
                return this.A0E;
            case 8:
                return this.A0A;
            case 9:
                return this.A06;
            case 10:
                return this.A08;
            case 11:
                return this.A07;
            case 12:
                return this.A0F;
            case 13:
                return null;
            case 14:
                return this.A04;
            case 15:
                return this.A0B;
            case 16:
                return this.A0D;
            case 17:
                return this.A05;
            case 18:
                return this.A0C;
            case 19:
                return this.A0H;
            default:
                throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Failed to get photo capture value: "));
        }
    }

    public void A01(C115885qT r3, Object obj) {
        int i2 = r3.A00;
        if (i2 == 0) {
            this.A0G = (byte[]) obj;
        } else if (i2 == 1) {
            this.A03 = (C118895va) obj;
        } else if (i2 != 2) {
            switch (i2) {
                case 7:
                    this.A0E = (Long) obj;
                    return;
                case 8:
                    this.A0A = (Integer) obj;
                    return;
                case 9:
                    this.A06 = (Float) obj;
                    return;
                case 10:
                    this.A08 = (Integer) obj;
                    return;
                case 11:
                    this.A07 = (Float) obj;
                    return;
                case 12:
                    this.A0F = (Long) obj;
                    return;
                case 13:
                    return;
                case 14:
                    this.A04 = (C119185wg) obj;
                    return;
                case 15:
                    this.A0B = (Integer) obj;
                    return;
                case 16:
                    this.A0D = (Integer) obj;
                    return;
                case 17:
                    this.A05 = (Boolean) obj;
                    return;
                case 18:
                    this.A0C = (Integer) obj;
                    return;
                case 19:
                    this.A0H = (byte[]) obj;
                    return;
                case 20:
                    this.A09 = (Integer) obj;
                    return;
                default:
                    throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Failed to set photo capture value: "));
            }
        } else {
            this.A02 = (Rect) obj;
        }
    }
}
