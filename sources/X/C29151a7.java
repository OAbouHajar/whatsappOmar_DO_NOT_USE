package X;

/* renamed from: X.1a7  reason: invalid class name and case insensitive filesystem */
public final class C29151a7 extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;

    public C29151a7() {
        super(2896, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public static void A00(C29151a7 r1, int i2) {
        r1.A0B = Integer.valueOf(i2);
    }

    public static void A01(C29151a7 r1, int i2, int i3, long j2) {
        r1.A0S = Long.valueOf(j2);
        r1.A06 = Integer.valueOf(i2);
        r1.A04 = Integer.valueOf(i3);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(40, this.A01);
        r3.AdT(41, this.A02);
        r3.AdT(20, this.A0W);
        r3.AdT(42, this.A03);
        r3.AdT(21, this.A04);
        r3.AdT(38, this.A05);
        r3.AdT(39, this.A00);
        r3.AdT(34, this.A0X);
        r3.AdT(35, this.A0Y);
        r3.AdT(36, this.A0Z);
        r3.AdT(2, this.A06);
        r3.AdT(43, this.A07);
        r3.AdT(44, this.A08);
        r3.AdT(29, this.A0G);
        r3.AdT(30, this.A0H);
        r3.AdT(22, this.A0I);
        r3.AdT(23, this.A0J);
        r3.AdT(24, this.A0K);
        r3.AdT(31, this.A0L);
        r3.AdT(25, this.A0M);
        r3.AdT(26, this.A0N);
        r3.AdT(3, this.A09);
        r3.AdT(17, this.A0A);
        r3.AdT(4, this.A0B);
        r3.AdT(16, this.A0C);
        r3.AdT(32, this.A0O);
        r3.AdT(33, this.A0D);
        r3.AdT(1, this.A0a);
        r3.AdT(10, this.A0P);
        r3.AdT(27, this.A0Q);
        r3.AdT(8, this.A0R);
        r3.AdT(9, this.A0S);
        r3.AdT(5, this.A0E);
        r3.AdT(14, this.A0T);
        r3.AdT(28, this.A0U);
        r3.AdT(11, this.A0V);
        r3.AdT(6, this.A0b);
        r3.AdT(18, this.A0F);
        r3.AdT(15, this.A0c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamDirectoryBusinessSearchConsumerClient {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "catalogPreviewStatus", num == null ? null : num.toString());
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "clickLocation", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "directoryBackendRankingLogicVer", this.A0W);
        Integer num3 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "directoryBusinessBrowsingViewType", num3 == null ? null : num3.toString());
        Integer num4 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "directoryBusinessListScreenSource", num4 == null ? null : num4.toString());
        Integer num5 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "directoryBusinessListScreenType", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "directoryFilterByDistance", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "directoryFilterCatalog", this.A0X);
        C16470t7.appendFieldToStringBuilder(sb, "directoryFilterOpeningHours", this.A0Y);
        C16470t7.appendFieldToStringBuilder(sb, "directoryFilterSelectedSubcategories", this.A0Z);
        Integer num6 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "directoryLocationType", num6 == null ? null : num6.toString());
        Integer num7 = this.A07;
        C16470t7.appendFieldToStringBuilder(sb, "directoryMapViewEvents", num7 == null ? null : num7.toString());
        Integer num8 = this.A08;
        C16470t7.appendFieldToStringBuilder(sb, "directoryMapViewMarkerType", num8 == null ? null : num8.toString());
        C16470t7.appendFieldToStringBuilder(sb, "directoryQuerySearchLengthOfQuery", this.A0G);
        C16470t7.appendFieldToStringBuilder(sb, "directoryQuerySearchNumberOfEmptyBusinessSearches", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "directoryQuerySearchNumberOfEmptySearches", this.A0I);
        C16470t7.appendFieldToStringBuilder(sb, "directoryQuerySearchNumberOfFoundCategories", this.A0J);
        C16470t7.appendFieldToStringBuilder(sb, "directoryQuerySearchNumberOfRenders", this.A0K);
        C16470t7.appendFieldToStringBuilder(sb, "directoryQuerySearchNumberOfWords", this.A0L);
        C16470t7.appendFieldToStringBuilder(sb, "directoryQuerySearchRankOfSelectedCategory", this.A0M);
        C16470t7.appendFieldToStringBuilder(sb, "directoryQuerySearchVersion", this.A0N);
        Integer num9 = this.A09;
        C16470t7.appendFieldToStringBuilder(sb, "directorySearchEntryPoint", num9 == null ? null : num9.toString());
        Integer num10 = this.A0A;
        C16470t7.appendFieldToStringBuilder(sb, "directorySearchErrorType", num10 == null ? null : num10.toString());
        Integer num11 = this.A0B;
        C16470t7.appendFieldToStringBuilder(sb, "directorySearchEventType", num11 == null ? null : num11.toString());
        Integer num12 = this.A0C;
        C16470t7.appendFieldToStringBuilder(sb, "directorySearchLocationState", num12 == null ? null : num12.toString());
        C16470t7.appendFieldToStringBuilder(sb, "directorySearchLoggingVersion", this.A0O);
        Integer num13 = this.A0D;
        C16470t7.appendFieldToStringBuilder(sb, "directorySelectedSubCategorySource", num13 == null ? null : num13.toString());
        C16470t7.appendFieldToStringBuilder(sb, "directorySessionId", this.A0a);
        C16470t7.appendFieldToStringBuilder(sb, "numberOfBusiness", this.A0P);
        C16470t7.appendFieldToStringBuilder(sb, "numberOfRecentSearches", this.A0Q);
        C16470t7.appendFieldToStringBuilder(sb, "numberOfRootCategory", this.A0R);
        C16470t7.appendFieldToStringBuilder(sb, "numberOfSubCategory", this.A0S);
        Integer num14 = this.A0E;
        C16470t7.appendFieldToStringBuilder(sb, "popupAllowLocationSourceScreen", num14 == null ? null : num14.toString());
        C16470t7.appendFieldToStringBuilder(sb, "rankOfSelectedBusiness", this.A0T);
        C16470t7.appendFieldToStringBuilder(sb, "rankOfSelectedRecentSearchItem", this.A0U);
        C16470t7.appendFieldToStringBuilder(sb, "rankOfSelectedRootCategory", this.A0V);
        C16470t7.appendFieldToStringBuilder(sb, "selectedRootCategory", this.A0b);
        Integer num15 = this.A0F;
        C16470t7.appendFieldToStringBuilder(sb, "setLocationSource", num15 == null ? null : num15.toString());
        C16470t7.appendFieldToStringBuilder(sb, "subCategoryFilters", this.A0c);
        sb.append("}");
        return sb.toString();
    }
}
