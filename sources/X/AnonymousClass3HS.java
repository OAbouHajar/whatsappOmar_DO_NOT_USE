package X;

import java.io.Serializable;

/* renamed from: X.3HS  reason: invalid class name */
public class AnonymousClass3HS implements Serializable {
    public static final long serialVersionUID = 1;
    public C798041j countryCodeSource_ = C798041j.FROM_NUMBER_WITH_PLUS_SIGN;
    public int countryCode_ = 0;
    public String extension_ = "";
    public boolean hasCountryCode;
    public boolean hasCountryCodeSource;
    public boolean hasExtension;
    public boolean hasItalianLeadingZero;
    public boolean hasNationalNumber;
    public boolean hasPreferredDomesticCarrierCode;
    public boolean hasRawInput;
    public boolean hasSecondLeadingZero;
    public boolean italianLeadingZero_ = false;
    public long nationalNumber_ = 0;
    public String preferredDomesticCarrierCode_ = "";
    public String rawInput_ = "";
    public boolean secondLeadingZero_ = false;

    public void A00(AnonymousClass3HS r4) {
        if (r4.hasCountryCode) {
            int i2 = r4.countryCode_;
            this.hasCountryCode = true;
            this.countryCode_ = i2;
        }
        if (r4.hasNationalNumber) {
            long j2 = r4.nationalNumber_;
            this.hasNationalNumber = true;
            this.nationalNumber_ = j2;
        }
        if (r4.hasExtension) {
            String str = r4.extension_;
            this.hasExtension = true;
            this.extension_ = str;
        }
        if (r4.hasItalianLeadingZero) {
            boolean z2 = r4.italianLeadingZero_;
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z2;
        }
        if (r4.hasRawInput) {
            String str2 = r4.rawInput_;
            this.hasRawInput = true;
            this.rawInput_ = str2;
        }
        if (r4.hasCountryCodeSource) {
            C798041j r1 = r4.countryCodeSource_;
            this.hasCountryCodeSource = true;
            this.countryCodeSource_ = r1;
        }
        if (r4.hasPreferredDomesticCarrierCode) {
            String str3 = r4.preferredDomesticCarrierCode_;
            this.hasPreferredDomesticCarrierCode = true;
            this.preferredDomesticCarrierCode_ = str3;
        }
        if (r4.hasSecondLeadingZero) {
            boolean z3 = r4.secondLeadingZero_;
            this.hasSecondLeadingZero = true;
            this.secondLeadingZero_ = z3;
        }
    }

    public boolean A01(AnonymousClass3HS r7) {
        if (r7 == null) {
            return false;
        }
        if (this == r7) {
            return true;
        }
        return this.countryCode_ == r7.countryCode_ && this.nationalNumber_ == r7.nationalNumber_ && this.extension_.equals(r7.extension_) && this.italianLeadingZero_ == r7.italianLeadingZero_ && this.rawInput_.equals(r7.rawInput_) && this.countryCodeSource_ == r7.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(r7.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == r7.hasPreferredDomesticCarrierCode && this.secondLeadingZero_ == r7.secondLeadingZero_;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnonymousClass3HS) && A01((AnonymousClass3HS) obj);
    }

    public int hashCode() {
        int hashCode = (((((2173 + this.countryCode_) * 53) + Long.valueOf(this.nationalNumber_).hashCode()) * 53) + this.extension_.hashCode()) * 53;
        int i2 = 1231;
        int i3 = 1237;
        if (this.italianLeadingZero_) {
            i3 = 1231;
        }
        int hashCode2 = (((((((hashCode + i3) * 53) + this.rawInput_.hashCode()) * 53) + this.countryCodeSource_.hashCode()) * 53) + this.preferredDomesticCarrierCode_.hashCode()) * 53;
        int i4 = 1237;
        if (this.hasPreferredDomesticCarrierCode) {
            i4 = 1231;
        }
        int i5 = (hashCode2 + i4) * 53;
        if (!this.secondLeadingZero_) {
            i2 = 1237;
        }
        return i5 + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Country Code: ");
        A0r.append(this.countryCode_);
        A0r.append(" National Number: ");
        A0r.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            A0r.append(" Leading Zero: true");
        }
        if (this.hasExtension) {
            A0r.append(" Extension: ");
            A0r.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            A0r.append(" Country Code Source: ");
            A0r.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            A0r.append(" Preferred Domestic Carrier Code: ");
            A0r.append(this.preferredDomesticCarrierCode_);
        }
        if (this.hasSecondLeadingZero && this.secondLeadingZero_) {
            A0r.append(" Second Leading Zero: true");
        }
        return A0r.toString();
    }
}
