package X;

/* renamed from: X.2NV  reason: invalid class name */
public final class AnonymousClass2NV extends C16470t7 {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public AnonymousClass2NV() {
        super(2810, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(3, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamArchiveStateDaily {");
        C16470t7.appendFieldToStringBuilder(sb, "settingsKeepChatsArchived", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "totalGroupArchivedChats", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "totalIndividualArchivedChats", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "totalUnreadGroupArchivedChats", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "totalUnreadIndividualArchivedChats", this.A04);
        sb.append("}");
        return sb.toString();
    }
}
