/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.authentication.shrine.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.android.authentication.shrine.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * A ViewModel that handles splash screen-related operations.
 *
 * This ViewModel is responsible for checking if the user is signed in, either using a password or
 * passkeys.
 */
@HiltViewModel
class SplashViewModel @Inject constructor(
    private val repository: AuthRepository,
) : ViewModel() {

    /**
     * Checks if the user is signed in using a password.
     *
     * This method checks if the user is signed in by calling the `isSignedIn()` method of the
     * [AuthRepository].
     *
     * @return True if the user is signed in using a password, false otherwise.
     */
    suspend fun isSignedInThroughPassword(): Boolean {
        return repository.isSignedInThroughPassword()
    }

    /**
     * Checks if the user is signed in using passkeys.
     *
     * This method checks if the user is signed in through passkeys by calling the
     * `isSignedInThroughPasskeys()` method of the [AuthRepository].
     *
     * @return True if the user is signed in using passkeys, false otherwise.
     */
    suspend fun isSignedInThroughPasskeys(): Boolean {
        return repository.isSignedInThroughPasskeys()
    }
}
