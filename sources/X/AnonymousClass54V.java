package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;

/* renamed from: X.54V  reason: invalid class name */
public class AnonymousClass54V implements Externalizable {
    public static final long serialVersionUID = 1;
    public int countryCode_ = 0;
    public AnonymousClass54T emergency_ = null;
    public AnonymousClass54T fixedLine_ = null;
    public AnonymousClass54T generalDesc_ = null;
    public boolean hasCountryCode;
    public boolean hasEmergency;
    public boolean hasFixedLine;
    public boolean hasGeneralDesc;
    public boolean hasId;
    public boolean hasInternationalPrefix;
    public boolean hasLeadingDigits;
    public boolean hasLeadingZeroPossible;
    public boolean hasMainCountryForCode;
    public boolean hasMobile;
    public boolean hasNationalPrefix;
    public boolean hasNationalPrefixForParsing;
    public boolean hasNationalPrefixTransformRule;
    public boolean hasNoInternationalDialling;
    public boolean hasPager;
    public boolean hasPersonalNumber;
    public boolean hasPreferredExtnPrefix;
    public boolean hasPreferredInternationalPrefix;
    public boolean hasPremiumRate;
    public boolean hasSameMobileAndFixedLinePattern;
    public boolean hasSharedCost;
    public boolean hasTollFree;
    public boolean hasUan;
    public boolean hasVoicemail;
    public boolean hasVoip;
    public String id_ = "";
    public String internationalPrefix_ = "";
    public List intlNumberFormat_ = AnonymousClass000.A0u();
    public String leadingDigits_ = "";
    public boolean leadingZeroPossible_ = false;
    public boolean mainCountryForCode_ = false;
    public AnonymousClass54T mobile_ = null;
    public String nationalPrefixForParsing_ = "";
    public String nationalPrefixTransformRule_ = "";
    public String nationalPrefix_ = "";
    public AnonymousClass54T noInternationalDialling_ = null;
    public List numberFormat_ = AnonymousClass000.A0u();
    public AnonymousClass54T pager_ = null;
    public AnonymousClass54T personalNumber_ = null;
    public String preferredExtnPrefix_ = "";
    public String preferredInternationalPrefix_ = "";
    public AnonymousClass54T premiumRate_ = null;
    public boolean sameMobileAndFixedLinePattern_ = false;
    public AnonymousClass54T sharedCost_ = null;
    public AnonymousClass54T tollFree_ = null;
    public AnonymousClass54T uan_ = null;
    public AnonymousClass54T voicemail_ = null;
    public AnonymousClass54T voip_ = null;

    public static AnonymousClass54T A00(ObjectInput objectInput) {
        AnonymousClass54T r0 = new AnonymousClass54T();
        r0.readExternal(objectInput);
        return r0;
    }

    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            AnonymousClass54T A00 = A00(objectInput);
            this.hasGeneralDesc = true;
            this.generalDesc_ = A00;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A002 = A00(objectInput);
            this.hasFixedLine = true;
            this.fixedLine_ = A002;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A003 = A00(objectInput);
            this.hasMobile = true;
            this.mobile_ = A003;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A004 = A00(objectInput);
            this.hasTollFree = true;
            this.tollFree_ = A004;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A005 = A00(objectInput);
            this.hasPremiumRate = true;
            this.premiumRate_ = A005;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A006 = A00(objectInput);
            this.hasSharedCost = true;
            this.sharedCost_ = A006;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A007 = A00(objectInput);
            this.hasPersonalNumber = true;
            this.personalNumber_ = A007;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A008 = A00(objectInput);
            this.hasVoip = true;
            this.voip_ = A008;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A009 = A00(objectInput);
            this.hasPager = true;
            this.pager_ = A009;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A0010 = A00(objectInput);
            this.hasUan = true;
            this.uan_ = A0010;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A0011 = A00(objectInput);
            this.hasVoicemail = true;
            this.voicemail_ = A0011;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A0012 = A00(objectInput);
            this.hasEmergency = true;
            this.emergency_ = A0012;
        }
        if (objectInput.readBoolean()) {
            AnonymousClass54T A0013 = A00(objectInput);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = A0013;
        }
        String readUTF = objectInput.readUTF();
        this.hasId = true;
        this.id_ = readUTF;
        int readInt = objectInput.readInt();
        this.hasCountryCode = true;
        this.countryCode_ = readInt;
        String readUTF2 = objectInput.readUTF();
        this.hasInternationalPrefix = true;
        this.internationalPrefix_ = readUTF2;
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = readUTF5;
        }
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = readUTF6;
        }
        if (objectInput.readBoolean()) {
            String readUTF7 = objectInput.readUTF();
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = readUTF7;
        }
        boolean readBoolean = objectInput.readBoolean();
        this.hasSameMobileAndFixedLinePattern = true;
        this.sameMobileAndFixedLinePattern_ = readBoolean;
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            AnonymousClass54U r1 = new AnonymousClass54U();
            r1.readExternal(objectInput);
            this.numberFormat_.add(r1);
        }
        int readInt3 = objectInput.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            AnonymousClass54U r12 = new AnonymousClass54U();
            r12.readExternal(objectInput);
            this.intlNumberFormat_.add(r12);
        }
        boolean readBoolean2 = objectInput.readBoolean();
        this.hasMainCountryForCode = true;
        this.mainCountryForCode_ = readBoolean2;
        if (objectInput.readBoolean()) {
            String readUTF8 = objectInput.readUTF();
            this.hasLeadingDigits = true;
            this.leadingDigits_ = readUTF8;
        }
        boolean readBoolean3 = objectInput.readBoolean();
        this.hasLeadingZeroPossible = true;
        this.leadingZeroPossible_ = readBoolean3;
    }

    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        int size = this.numberFormat_.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((AnonymousClass54U) this.numberFormat_.get(i2)).writeExternal(objectOutput);
        }
        int size2 = this.intlNumberFormat_.size();
        objectOutput.writeInt(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            ((AnonymousClass54U) this.intlNumberFormat_.get(i3)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.leadingZeroPossible_);
    }
}
