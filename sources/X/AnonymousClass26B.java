package X;

/* renamed from: X.26B  reason: invalid class name */
public class AnonymousClass26B {
    public final Double A00;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final Double A04;
    public final Double A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public AnonymousClass26B(Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, String str, String str2, String str3) {
        this.A05 = d2;
        this.A03 = d3;
        this.A04 = d4;
        this.A01 = d5;
        this.A02 = d6;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A00 = d7;
    }

    public int A00() {
        String str;
        String str2 = this.A08;
        switch (str2.hashCode()) {
            case -1335157162:
                str = "device";
                break;
            case -1207360282:
                if (str2.equals("pin_on_map")) {
                    return 3;
                }
                break;
            case -1081415738:
                if (str2.equals("manual")) {
                    return 1;
                }
                break;
            case 1738549583:
                str = "nearest_neighborhood";
                break;
        }
        return str2.equals(str) ? 0 : 2;
    }

    public boolean A01() {
        String str = this.A08;
        return "city_default".equals(str) || "country_default".equals(str) || "manual".equals(str) || "nearest_neighborhood".equals(str);
    }

    public boolean A02() {
        String str = this.A08;
        if ("pin_on_map".equals(str)) {
            return true;
        }
        if (!"device".equals(str)) {
            return false;
        }
        Double d2 = this.A05;
        AnonymousClass00B.A06(d2);
        if (d2.doubleValue() - 800.0d <= 200.0d) {
            return true;
        }
        Double d3 = this.A00;
        return d3 != null && d3.doubleValue() <= 200.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass26B r5 = (AnonymousClass26B) obj;
        Double d2 = this.A03;
        Double d3 = r5.A03;
        if (d2 != null ? d2.equals(d3) : d3 == null) {
            Double d4 = this.A04;
            Double d5 = r5.A04;
            if (d4 != null ? d4.equals(d5) : d5 == null) {
                Double d6 = this.A01;
                Double d7 = r5.A01;
                if (d6 != null ? d6.equals(d7) : d7 == null) {
                    Double d8 = this.A02;
                    Double d9 = r5.A02;
                    if (d8 != null ? d8.equals(d9) : d9 == null) {
                        if (this.A08.equals(r5.A08)) {
                            Double d10 = this.A00;
                            Double d11 = r5.A00;
                            if (d10 != null ? d10.equals(d11) : d11 == null) {
                                String str = this.A06;
                                String str2 = r5.A06;
                                if (str == null) {
                                    return str2 == null;
                                }
                                if (str.equals(str2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        Double d2 = this.A03;
        int i2 = 0;
        int hashCode = d2 == null ? 0 : d2.hashCode() * 43;
        Double d3 = this.A04;
        int hashCode2 = hashCode + (d3 == null ? 0 : d3.hashCode() * 43);
        Double d4 = this.A01;
        int hashCode3 = hashCode2 + (d4 == null ? 0 : d4.hashCode() * 43);
        Double d5 = this.A02;
        int hashCode4 = hashCode3 + (d5 == null ? 0 : d5.hashCode() * 43) + (this.A08.hashCode() * 43);
        Double d6 = this.A00;
        int hashCode5 = hashCode4 + (d6 == null ? 0 : d6.hashCode() * 43);
        String str = this.A06;
        if (str != null) {
            i2 = str.hashCode() * 43;
        }
        return hashCode5 + i2;
    }
}
