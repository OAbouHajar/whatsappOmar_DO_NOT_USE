package com.facebook.redex;

import X.C016807y;
import X.C114385ng;
import X.C114485nq;
import X.C13680ns;
import X.C40661uU;
import com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;

public class IDxTListenerShape172S0100000_3_I1 implements C016807y {
    public Object A00;
    public final int A01;

    public IDxTListenerShape172S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean AVa(String str) {
        switch (this.A01) {
            case 0:
                IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) this.A00;
                indiaUpiBankPickerActivity.A0E = str;
                ArrayList A02 = C40661uU.A02(indiaUpiBankPickerActivity.A01, str);
                indiaUpiBankPickerActivity.A0F = A02;
                if (A02.isEmpty()) {
                    indiaUpiBankPickerActivity.A0F = null;
                }
                C114485nq r1 = indiaUpiBankPickerActivity.A0C;
                if (r1 != null) {
                    r1.A06(true);
                    indiaUpiBankPickerActivity.A0C = null;
                }
                C114485nq r12 = new C114485nq(indiaUpiBankPickerActivity, indiaUpiBankPickerActivity.A0E, indiaUpiBankPickerActivity.A0F, indiaUpiBankPickerActivity.A0B.A05);
                indiaUpiBankPickerActivity.A0C = r12;
                C13680ns.A1U(r12, indiaUpiBankPickerActivity.A05);
                return false;
            case 1:
                PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = (PaymentGroupParticipantPickerActivity) this.A00;
                ArrayList A022 = C40661uU.A02(paymentGroupParticipantPickerActivity.A01, str);
                paymentGroupParticipantPickerActivity.A0K = A022;
                if (A022.isEmpty()) {
                    paymentGroupParticipantPickerActivity.A0K = null;
                }
                C114385ng r13 = paymentGroupParticipantPickerActivity.A0E;
                if (r13 != null) {
                    r13.A06(true);
                    paymentGroupParticipantPickerActivity.A0E = null;
                }
                C114385ng r14 = new C114385ng(paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity.A0K);
                paymentGroupParticipantPickerActivity.A0E = r14;
                C13680ns.A1U(r14, paymentGroupParticipantPickerActivity.A05);
                return false;
            default:
                PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = (PaymentTransactionHistoryActivity) this.A00;
                ArrayList A023 = C40661uU.A02(paymentTransactionHistoryActivity.A05, str);
                paymentTransactionHistoryActivity.A0M = A023;
                paymentTransactionHistoryActivity.A0L = str;
                if (A023.isEmpty()) {
                    paymentTransactionHistoryActivity.A0M = null;
                }
                paymentTransactionHistoryActivity.A36();
                return false;
        }
    }

    public boolean AVb(String str) {
        return false;
    }
}
