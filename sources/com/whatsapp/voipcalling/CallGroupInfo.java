package com.whatsapp.voipcalling;

import java.util.Arrays;

public final class CallGroupInfo {
    public final CallParticipant[] participants;
    public final int transactionId;

    public CallGroupInfo(int i2, CallParticipant[] callParticipantArr) {
        this.transactionId = i2;
        this.participants = callParticipantArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallGroupInfo{transactionId=");
        sb.append(this.transactionId);
        sb.append(", participants=");
        sb.append(Arrays.toString(this.participants));
        sb.append('}');
        return sb.toString();
    }
}
