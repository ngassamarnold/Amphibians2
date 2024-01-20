@file:OptIn(ExperimentalMaterial3Api::class)

package com.trainning.amphibians.ui

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.trainning.amphibians.R
import com.trainning.amphibians.data.amphibians
import com.trainning.amphibians.ui.screens.AmphibianCard

@Composable
fun AmphibiansApp() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { AmphibiansAppBar(scrollBehavior = scrollBehavior) }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            // viewModel
            AmphibianCard(
                amphibian = amphibians[0],
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .aspectRatio(0.9f),
            )
        }
    }
}

@Composable
fun AmphibiansAppBar(scrollBehavior: TopAppBarScrollBehavior, modifier: Modifier = Modifier) {
    TopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineSmall
            )
        },
        modifier = modifier
    )
}