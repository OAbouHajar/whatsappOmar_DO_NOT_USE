package X;

/* renamed from: X.42u  reason: invalid class name and case insensitive filesystem */
public enum C801642u {
    GTE(0),
    LTE(1),
    EQ(2),
    TSEQ(3),
    NE(4),
    TSNE(5),
    LT(6),
    GT(7),
    REGEX(8),
    NIN(9),
    IN(10),
    CONTAINS(11),
    ALL(12),
    SIZE(13),
    EXISTS(14),
    TYPE(15),
    MATCHES(16),
    EMPTY(17),
    SUBSETOF(18),
    ANYOF(19),
    NONEOF(20);
    
    public final String operatorString;

    /* access modifiers changed from: public */
    C801642u(int i2) {
        this.operatorString = r2;
    }

    public String toString() {
        return this.operatorString;
    }
}
