package X;

/* renamed from: X.1PL  reason: invalid class name */
public class AnonymousClass1PL implements C14810pn, AnonymousClass1PM {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final C14710pd A02;
    public final AnonymousClass10F A03;

    public AnonymousClass1PL(C14710pd r2, AnonymousClass10F r3) {
        this.A03 = r3;
        this.A02 = r2;
    }

    public void A00(String str, int i2) {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(this.A02.A0E(C16620tM.A02, 2338));
            this.A00 = bool;
        }
        if (bool.booleanValue()) {
            Boolean bool2 = this.A01;
            if (bool2 == null) {
                bool2 = Boolean.valueOf(this.A02.A0E(C16620tM.A02, 2339));
                this.A01 = bool2;
            }
            boolean booleanValue = bool2.booleanValue();
            AnonymousClass10F r2 = this.A03;
            if (booleanValue) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(i2 + 1);
                str = sb.toString();
            }
            r2.A07(str);
        }
    }

    public void A01(String str, int i2) {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(this.A02.A0E(C16620tM.A02, 2338));
            this.A00 = bool;
        }
        if (bool.booleanValue()) {
            Boolean bool2 = this.A01;
            if (bool2 == null) {
                bool2 = Boolean.valueOf(this.A02.A0E(C16620tM.A02, 2339));
                this.A01 = bool2;
            }
            boolean booleanValue = bool2.booleanValue();
            AnonymousClass10F r2 = this.A03;
            if (booleanValue) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(i2 + 1);
                str = sb.toString();
            }
            r2.A08(str);
        }
    }

    public boolean AMG() {
        return false;
    }

    public boolean AMI() {
        this.A03.A07("ConversationList_onLayout");
        return false;
    }

    public void ANZ() {
        this.A03.A08("ConversationList_onLayout");
    }
}
