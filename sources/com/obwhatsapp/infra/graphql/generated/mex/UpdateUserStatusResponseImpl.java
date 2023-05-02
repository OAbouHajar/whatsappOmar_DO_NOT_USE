package com.obwhatsapp.infra.graphql.generated.mex;

import X.AnonymousClass0V9;
import X.C34641kb;
import com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusResponse;
import org.json.JSONObject;

public final class UpdateUserStatusResponseImpl extends AnonymousClass0V9 implements UpdateUserStatusResponse {

    public final class Xwa2UsersUpdatesSince extends AnonymousClass0V9 implements UpdateUserStatusResponse.Xwa2UsersUpdatesSince {

        public final class Updates extends AnonymousClass0V9 implements UpdateUserStatusResponse.Xwa2UsersUpdatesSince.Updates {

            public final class InlineXWA2UserStatusUpdate extends AnonymousClass0V9 implements UpdateUserStatusResponse.Xwa2UsersUpdatesSince.Updates.InlineXWA2UserStatusUpdate {
                public InlineXWA2UserStatusUpdate(JSONObject jSONObject) {
                    super(jSONObject);
                }

                public String getDhash() {
                    return getNullableString("dhash");
                }

                public String getText() {
                    return getNullableString("text");
                }
            }

            public Updates(JSONObject jSONObject) {
                super(jSONObject);
            }

            public UpdateUserStatusResponse.Xwa2UsersUpdatesSince.Updates.InlineXWA2UserStatusUpdate asInlineXWA2UserStatusUpdate() {
                JSONObject jSONObject = this.A00;
                if (jSONObject.optString("__typename").hashCode() == 1315213878 || jSONObject.has("dhash") || jSONObject.has("text")) {
                    return new InlineXWA2UserStatusUpdate(jSONObject);
                }
                return null;
            }
        }

        public Xwa2UsersUpdatesSince(JSONObject jSONObject) {
            super(jSONObject);
        }

        public String getJid() {
            return this.A00.optString("jid");
        }

        public C34641kb getUpdates() {
            return getTreeList("updates", Updates.class);
        }
    }

    public UpdateUserStatusResponseImpl(JSONObject jSONObject) {
        super(jSONObject);
    }

    public C34641kb getXwa2UsersUpdatesSince() {
        return getTreeList("xwa2_users_updates_since", Xwa2UsersUpdatesSince.class);
    }
}
