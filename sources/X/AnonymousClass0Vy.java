package X;

import java.util.List;

/* renamed from: X.0Vy  reason: invalid class name */
public final class AnonymousClass0Vy {
    public final float[] A00;
    public final int[] A01;

    public AnonymousClass0Vy(int i2, int i3) {
        this.A01 = new int[]{i2, i3};
        this.A00 = new float[]{0.0f, 1.0f};
    }

    public AnonymousClass0Vy(int i2, int i3, int i4) {
        this.A01 = new int[]{i2, i3, i4};
        this.A00 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public AnonymousClass0Vy(List list, List list2) {
        int size = list.size();
        this.A01 = new int[size];
        this.A00 = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.A01[i2] = AnonymousClass000.A0D(list.get(i2));
            this.A00[i2] = AnonymousClass000.A04(list2.get(i2));
        }
    }
}
