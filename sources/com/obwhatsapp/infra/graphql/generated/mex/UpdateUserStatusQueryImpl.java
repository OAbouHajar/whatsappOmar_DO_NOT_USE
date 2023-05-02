package com.obwhatsapp.infra.graphql.generated.mex;

import X.AnonymousClass3K3;
import X.C04700No;
import X.C34641kb;
import com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusQuery;
import com.obwhatsapp.infra.graphql.generated.mex.missing.UpdateUserStatusRequest;
import java.util.List;

public final class UpdateUserStatusQueryImpl {

    public final class Builder implements UpdateUserStatusQuery.Builder {
        public boolean A00;
        public boolean A01;
        public final C04700No A02;

        public Builder() {
            this.A02 = new C04700No();
            this.A01 = false;
            this.A00 = false;
        }

        public UpdateUserStatusRequest build() {
            if (this.A01 && this.A00) {
                return new UpdateUserStatusRequest(this.A02, UpdateUserStatusResponse.class);
            }
            throw AnonymousClass3K3.A0f();
        }

        public Builder setUpdates(C34641kb r3) {
            boolean z2;
            C04700No r0 = this.A02;
            if (r3 != null) {
                r0.A00.put("updates", (List) r3);
                z2 = true;
            } else {
                z2 = false;
            }
            this.A00 = z2;
            return this;
        }

        public Builder setUsers(C34641kb r3) {
            boolean z2;
            C04700No r0 = this.A02;
            if (r3 != null) {
                r0.A00.put("users", (List) r3);
                z2 = true;
            } else {
                z2 = false;
            }
            this.A01 = z2;
            return this;
        }
    }

    public static UpdateUserStatusQuery.BuilderForUsers create() {
        return new Builder();
    }
}
