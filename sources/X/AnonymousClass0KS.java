package X;

/* renamed from: X.0KS  reason: invalid class name */
public enum AnonymousClass0KS {
    PRIMARY(0.1f, 0, 0, true),
    PRIMARY_FALLBACK(0.2f, 1, 0, false),
    ELEVATED(1.0f, 2, 5, false),
    PERSISTENT(0.6f, 3, 5, false);
    
    public final float colorAlphaMultiplierDark;
    public final float colorAlphaMultiplierLight;
    public final float cornerRadiusDp;
    public final boolean hasFoaStroke;
    public final int shadowColorDark;
    public final int shadowColorLight;
    public final float shadowSizeDp;
    public final int verticalOffsetDp;

    /* access modifiers changed from: public */
    AnonymousClass0KS(float f2, int i2, int i3, boolean z2) {
        this.cornerRadiusDp = 4.0f;
        this.shadowSizeDp = 12.0f;
        this.colorAlphaMultiplierLight = r6;
        this.colorAlphaMultiplierDark = f2;
        this.shadowColorLight = -13350828;
        this.shadowColorDark = -14931149;
        this.hasFoaStroke = z2;
        this.verticalOffsetDp = i3;
    }
}
