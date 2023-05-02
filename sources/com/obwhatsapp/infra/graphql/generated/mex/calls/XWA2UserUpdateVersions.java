package com.obwhatsapp.infra.graphql.generated.mex.calls;

import com.facebook.graphql.calls.GraphQlCallInput;

public final class XWA2UserUpdateVersions extends GraphQlCallInput {
    public XWA2UserUpdateVersions setStatus(XWA2StatusInput xWA2StatusInput) {
        put("status", (GraphQlCallInput) xWA2StatusInput);
        return this;
    }

    public XWA2UserUpdateVersions setUserId(String str) {
        put("user_id", str);
        return this;
    }
}
