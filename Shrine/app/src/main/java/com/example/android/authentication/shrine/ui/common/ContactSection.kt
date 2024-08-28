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
package com.example.android.authentication.shrine.ui.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.authentication.shrine.R
import com.example.android.authentication.shrine.ui.theme.ShrineTheme

/**
 * The Contact Us section of a screen, providing a button to access help resources.
 *
 * @param onHelpClicked Callback to be invoked when the "Help" button is clicked.
 * @param modifier Modifier to be applied to the Contact Us section.
 */
@Composable
fun ContactUsSection(
    onHelpClicked: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(R.string.contact),
            style = TextStyle(textAlign = TextAlign.Start),
            modifier = Modifier
                .padding(bottom = dimensionResource(R.dimen.dimen_20))
                .fillMaxWidth(),
        )
        ShrineButton(
            onClick = onHelpClicked,
            buttonText = stringResource(R.string.help),
        )
    }
}

/**
 * Preview of the Contact Us section.
 */
@Preview(showBackground = true)
@Composable
fun ContactUsScreenPreview() {
    ShrineTheme {
        ContactUsSection(
            onHelpClicked = { },
        )
    }
}
