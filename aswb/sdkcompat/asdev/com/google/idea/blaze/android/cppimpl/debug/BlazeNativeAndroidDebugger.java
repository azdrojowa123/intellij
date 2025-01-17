/*
 * Copyright 2018 The Bazel Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.idea.blaze.android.cppimpl.debug;

import com.android.tools.ndk.run.attach.AndroidNativeAttachConfiguration;

/**
 * API compat of {@link BlazeNativeAndroidDebuggerBase} with the following additions:
 *
 * <ul>
 *   <li>Creates a run-config setting using {@link BlazeAndroidNativeAttachConfiguration} instead of
 *       {@link AndroidNativeAttachConfiguration} to override counterproductive validations.
 * </ul>
 *
 * #api4.0
 */
public class BlazeNativeAndroidDebugger extends BlazeNativeAndroidDebuggerBase {}
