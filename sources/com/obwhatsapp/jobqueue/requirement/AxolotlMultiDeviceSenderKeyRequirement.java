package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass16V;
import X.C16040sK;
import X.C16060sN;
import X.C16070sO;
import java.util.Set;

public class AxolotlMultiDeviceSenderKeyRequirement extends AxolotlMultiDeviceSessionRequirement {
    public transient C16040sK A00;
    public transient C16070sO A01;
    public transient AnonymousClass16V A02;
    public final String groupParticipantHash;
    public final boolean useLidForEncryption;

    public AxolotlMultiDeviceSenderKeyRequirement(C16060sN r7, Boolean bool, String str, String str2, Set set, int i2, boolean z2) {
        super(r7, bool, str, set, i2);
        this.groupParticipantHash = str2;
        this.useLidForEncryption = z2;
    }
}
