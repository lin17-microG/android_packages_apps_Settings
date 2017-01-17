/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.enterprise;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.support.annotation.Nullable;

public class DevicePolicyManagerWrapperImpl implements DevicePolicyManagerWrapper {
    private final DevicePolicyManager mDpm;

    public DevicePolicyManagerWrapperImpl(DevicePolicyManager dpm) {
        mDpm = dpm;
    }

    @Override
    public ComponentName getDeviceOwnerComponentOnAnyUser() {
        return mDpm.getDeviceOwnerComponentOnAnyUser();
    }

    @Override
    public CharSequence getDeviceOwnerOrganizationName() {
        return mDpm.getDeviceOwnerOrganizationName();
    }

    @Override
    public int getPermissionGrantState(@Nullable ComponentName admin, String packageName,
            String permission) {
        return mDpm.getPermissionGrantState(admin, packageName, permission);
    }

    @Override
    public long getLastSecurityLogRetrievalTime() {
        return mDpm.getLastSecurityLogRetrievalTime();
    }

    @Override
    public long getLastBugReportRequestTime() {
        return mDpm.getLastBugReportRequestTime();
    }

    @Override
    public long getLastNetworkLogRetrievalTime() {
        return mDpm.getLastNetworkLogRetrievalTime();
    }
}
