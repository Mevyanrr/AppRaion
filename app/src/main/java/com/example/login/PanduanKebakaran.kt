package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun PanduanKebakaran(navController: NavController) {
    val navController = rememberNavController()
    val scrollState = rememberScrollState()


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
                    painter = painterResource(id = R.drawable.kebakaran_darurat),
                    contentDescription = "Banjir icon"
                )
                Spacer(modifier= Modifier.width(16.dp))
                Text("Panduan Menghadapi \nKebakaran", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }

        // Video Container
        Column (
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-40).dp)
        ) {
            Spacer(modifier = Modifier.height(165.dp))

            Box( Modifier
                .width(372.dp)
                .height(190.dp)
                .background(Color.Red)
            ) {
                //VideoPlayer() goes here

            }
            Spacer(modifier = Modifier.height(10.dp))
            Text("Apa Yang Harus Dilakukan Saat \nTerjadi Kebakaran?", fontSize = 20.sp, fontWeight = FontWeight.SemiBold, modifier = Modifier
                .padding(start = 5.dp, end = 5.dp))
            Spacer(modifier = Modifier.height(5.dp))
            Text("BPBD Kabupaten Bogor   ৹   08 September 2021", modifier = Modifier.padding(start = 5.dp, end = 5.dp), fontWeight = FontWeight.Light, fontSize = 12.sp)

            Spacer(modifier = Modifier.height(10.dp))
            Column(
                Modifier
                    .width(372.dp)
                    .height(368.dp)
                    .shadow(elevation = 4.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
                    .border(width = 1.dp, color = Color(0xFFD7D7D7), shape = RoundedCornerShape(size = 20.dp))
                    .background(color = Color(0xFFF5F5F5), shape = RoundedCornerShape(size = 20.dp)))
            // Box container for text
            {
                Text("Kebakaran adalah bencana yang dapat terjadi kapan saja dan di mana saja, dan dapat mengancam keselamatan jiwa serta harta benda. Oleh karena itu, penting untuk mengetahui langkah-langkah yang harus diambil saat menghadapi situasi darurat ini.",
                    Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp), fontWeight = FontWeight(400), fontSize = 11.sp)
                Spacer(modifier = Modifier.height(10.dp))
                Text("Langkah-Langkah yang Harus Diambil", Modifier
                    .padding(start = 10.dp, end = 10.dp),
                    fontWeight = FontWeight.Bold, fontSize = 12.sp )
                Spacer(modifier = Modifier.height (10.dp))
                Text("""
                        1. Tetap Tenang: Jangan panik. Kepanikan dapat memperburuk situasi. Cobalah untuk tetap tenang dan berpikir jernih.
                        2. Matikan Peralatan Listrik: Jika aman untuk melakukannya, segera matikan arus listrik untuk mencegah kebakaran semakin meluas.
                        3. Lindungi Saluran Pernapasan: Gunakan masker atau kain untuk menutupi hidung dan mulut agar terhindar dari asap berbahaya.
                        4. Gunakan Alat Pemadam Api: Jika api masih kecil dan dapat dijangkau, gunakan alat pemadam api untuk memadamkannya. Pastikan Anda tahu cara menggunakannya.
                        5. Hubungi Petugas Pemadam Kebakaran: Segera hubungi dinas pemadam kebakaran. Berikan informasi yang jelas tentang lokasi dan situasi kebakaran.
                        6. Ikuti Petunjuk Petugas: Saat petugas tiba, ikuti instruksi mereka untuk memastikan keselamatan Anda dan orang lain.
                        7. Hindari Kerumunan: Jangan berkumpul di satu tempat, karena ini dapat menghambat tim penyelamat dan meningkatkan risiko bahaya.
                        8. Jaga Diri dan Sesama: Dalam situasi darurat, saling menjaga dan membantu satu sama lain sangat penting.
                    """.trimIndent(), Modifier.padding(start = 10.dp, end = 10.dp), fontSize = 11.sp, textAlign = TextAlign.Justify)
                Spacer(modifier = Modifier.height(10.dp))


            }
        }
    }
    // Bottom dashboard
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .offset(y = 770.dp)

    ) {
        // Bottom navigation bar background
        Image(
            painter = painterResource(id = R.drawable.rectangle_bottom_dashboard_colored),
            contentDescription = "Dashboard navigation bottom",
            modifier = Modifier
                .width(412.dp)
                .height(100.dp)
                .offset(y = 10.dp)
        )

        // Row for navigation icons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(82.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .offset(
                        y = (-15).dp, x = (-75).dp
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.home_gray_png),
                    contentDescription = "Home button",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .offset(x = 15.dp, y = 25.dp)
                )
                androidx.compose.material3.Text(
                    "Beranda",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF616161),
                    modifier = Modifier
                        .offset(x = 15.dp, y = 25.dp)
                )
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .offset(y = (-25).dp, x = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.note_gray),
                    contentDescription = "Edit button",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .offset(y = 38.dp, x = (-41).dp)
                )
                androidx.compose.material3.Text(
                    "Lapor",
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF616161),
                    fontSize = 13.sp,
                    modifier = Modifier
                        .offset(x = (-40).dp, y = 35.dp)
                )
            }

            // Floating button for calls
            Column(
                modifier = Modifier
                    .offset(y = (-5).dp),
                Arrangement.Center
            ) {
                Button(modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF431B3B)),
                    onClick = {
                        TODO()
                    }
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.phone_call_white),
                        contentDescription = "Call SIGMA",
                        modifier = Modifier
                            .width(34.dp)
                            .height(33.dp)
                            .offset(y = (-2).dp),
                        Alignment.Center
                    )
                }
                androidx.compose.material3.Text(
                    text = "Darurat",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0XFF616161),
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .offset(x = 10.dp)
                )
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .offset(y = (-15).dp, x = (-10).dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.book_gray),
                    contentDescription = "Book button",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .offset(y = 30.dp, x = 27.dp)
                )
                androidx.compose.material3.Text(
                    "Berita",
                    fontSize = 13.sp,
                    color = Color(0xFF616161),
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .offset(y = 25.dp, x = 28.dp)
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.offset(y = (-20).dp, x = 70.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.user_circle),
                    contentDescription = "Profile button",
                    modifier = Modifier
                        .width(36.dp)
                        .height(36.dp)
                        .offset(x = (-20).dp, y = (30.dp))
                )
                androidx.compose.material3.Text(
                    text = "Profil",
                    color = Color(0xFF616161),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .offset(x = (-20).dp, y = 30.dp)
                )
            }


        }
    }
}



// video player
@Composable
fun VideoPlayerKebakaran() {
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
fun PanduanKebakaranPreview() {
    val navController = rememberNavController()
    PanduanKebakaran(navController)
}
