package X;

/* renamed from: X.3lA  reason: invalid class name and case insensitive filesystem */
public final class C71863lA extends AnonymousClass462 {
    public final int A00;
    public final int A01;

    public /* synthetic */ C71863lA(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C71863lA) {
                C71863lA r5 = (C71863lA) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && "product_images".equals("product_images"))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) - 275245112;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ProductImages(productImageWidth=");
        A0r.append(this.A01);
        A0r.append(", productImageHeight=");
        A0r.append(this.A00);
        A0r.append(", fieldName=");
        A0r.append("product_images");
        return AnonymousClass000.A0j(A0r);
    }
}
