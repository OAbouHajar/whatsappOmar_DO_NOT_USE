package X;

import java.util.List;

/* renamed from: X.4uL  reason: invalid class name and case insensitive filesystem */
public abstract class C99634uL implements AnonymousClass5OS {
    public void A00(Number number) {
        if (this instanceof C70213gI) {
            C70213gI r4 = (C70213gI) this;
            r4.A00 = Double.valueOf(r4.A00.doubleValue() + number.doubleValue());
        } else if (this instanceof C70233gK) {
            C70233gK r6 = (C70233gK) this;
            r6.A01 = Double.valueOf(r6.A01.doubleValue() + number.doubleValue());
            r6.A02 = Double.valueOf(r6.A02.doubleValue() + (number.doubleValue() * number.doubleValue()));
            r6.A00 = Double.valueOf(r6.A00.doubleValue() + 1.0d);
        } else if (this instanceof C70203gH) {
            C70203gH r5 = (C70203gH) this;
            if (r5.A00.doubleValue() > number.doubleValue()) {
                r5.A00 = Double.valueOf(number.doubleValue());
            }
        } else if (this instanceof C70193gG) {
            C70193gG r52 = (C70193gG) this;
            if (r52.A00.doubleValue() < number.doubleValue()) {
                r52.A00 = Double.valueOf(number.doubleValue());
            }
        } else {
            C70223gJ r42 = (C70223gJ) this;
            r42.A00 = Double.valueOf(r42.A00.doubleValue() + 1.0d);
            r42.A01 = Double.valueOf(r42.A01.doubleValue() + number.doubleValue());
        }
    }

    public Object AIZ(AnonymousClass552 r8, C89314bx r9, Object obj, String str, List list) {
        C109755Tl r1 = r9.A01.A00;
        int i2 = 0;
        if (obj instanceof List) {
            for (Object next : r1.Ago(obj)) {
                if (next instanceof Number) {
                    i2++;
                    A00((Number) next);
                }
            }
        }
        if (list != null) {
            for (Number A00 : C90454eA.A00(r9, Number.class, list)) {
                i2++;
                A00(A00);
            }
        }
        if (i2 != 0) {
            if (this instanceof C70213gI) {
                return ((C70213gI) this).A00;
            }
            if (this instanceof C70233gK) {
                C70233gK r6 = (C70233gK) this;
                double doubleValue = r6.A02.doubleValue();
                double doubleValue2 = r6.A00.doubleValue();
                double doubleValue3 = r6.A01.doubleValue();
                return Double.valueOf(Math.sqrt((doubleValue / doubleValue2) - (((doubleValue3 * doubleValue3) / doubleValue2) / doubleValue2)));
            } else if (this instanceof C70203gH) {
                return ((C70203gH) this).A00;
            } else {
                if (this instanceof C70193gG) {
                    return ((C70193gG) this).A00;
                }
                C70223gJ r62 = (C70223gJ) this;
                double doubleValue4 = r62.A00.doubleValue();
                return doubleValue4 != 0.0d ? Double.valueOf(r62.A01.doubleValue() / doubleValue4) : Double.valueOf(0.0d);
            }
        } else {
            throw new AnonymousClass5Ar("Aggregation function attempted to calculate value using empty array");
        }
    }
}
