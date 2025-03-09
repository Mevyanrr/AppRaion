package com.example.login

import android.content.Context
import android.hardware.lights.Light
import android.net.Uri
import android.widget.VideoView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.request.Disposable
import com.google.ai.client.generativeai.type.content
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.math.exp

@Composable
fun PanduanBanjir(navController: NavController) {
    val navController = rememberNavController()


    // Main Background
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0XFFF5F5F5))
    ) {
        // header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
                .height(150.dp)
                .align(Alignment.TopCenter)
                .background(brush = Brush.horizontalGradient(
                    listOf(
                        Color(0XFFC41532),
                        Color(0XFF431B3B)
                    )
                ))
        ) {
            // Icons & Title
            Row(
                modifier = Modifier.fillMaxSize()
                    .offset(x = 21.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Arrow back",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    modifier = Modifier.width(55.dp).height(55.dp),
                    painter = painterResource(id = R.drawable.banjir_darurat),
                    contentDescription = "Banjir icon"
                )
                Spacer(modifier= Modifier.width(16.dp))
                Text("Panduan Menghadapi \nBanjir", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }

        // Video Container
            Column  {
            Spacer(modifier = Modifier.height(165.dp).padding(start = 10.dp, end = 10.dp))

            Box( Modifier
                .offset(x = 10.dp)
                .width(372.dp)
                .height(190.dp)
                .background(Color.Red)
            ) {
                //VideoPlayer() goes here
            }
                Spacer(modifier = Modifier.height(10.dp))
                Text("Tips Saat Terjadi Banjir", fontSize = 20.sp, fontWeight = FontWeight.SemiBold, modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp))
                Text("One Care ৹ 18 Maret 2017", modifier = Modifier.padding(start = 12.dp, end = 10.dp, top = 3.dp), fontWeight = FontWeight.Light, fontSize = 12.sp)

                // Box container for text
                Box(modifier = Modifier
                    .width(372.dp)
                    .height(368.dp)
                    .background(Color.Blue)
                    .offset(x = 10.dp)){

                }
        }
    }
}


// video player
@Composable
fun VideoPlayer() {
    val context = LocalContext.current
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            val mediaItem = MediaItem.fromUri(
                "https://www.dropbox.com/s/ndhhipard9z16io/Tips%20Saat%20terjadi%20Banjir.mp4?st=785q1t8v&raw=1"
            )
            setMediaItem(mediaItem)
            prepare()
            playWhenReady = true
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            exoPlayer.release()
        }
    }

    AndroidView(
        factory = {
            PlayerView(it).apply {
                player = exoPlayer  // Ensure this is inside the factory scope
            }
        },
        modifier = Modifier
            .width(372.dp)
            .height(190.dp)
    )
}


@Preview
@Composable
fun PanduanBanjirReview() {
    val navController = rememberNavController()
    PanduanBanjir(navController)
}