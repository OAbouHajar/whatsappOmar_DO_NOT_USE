package com.whatsapp.fieldstats.extension;

import X.C29081Zz;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.ArrayList;
import java.util.List;

public final class WamCallExtended extends WamCall {
    public List fields = new ArrayList();

    public void addField(WamCallExtendedField wamCallExtendedField) {
        this.fields.add(wamCallExtendedField);
    }

    public void serialize(C29081Zz r4) {
        super.serialize(r4);
        List<WamCallExtendedField> list = this.fields;
        if (list != null) {
            for (WamCallExtendedField wamCallExtendedField : list) {
                r4.AdT(wamCallExtendedField.fieldId, wamCallExtendedField.fieldValue);
            }
        }
    }
}
